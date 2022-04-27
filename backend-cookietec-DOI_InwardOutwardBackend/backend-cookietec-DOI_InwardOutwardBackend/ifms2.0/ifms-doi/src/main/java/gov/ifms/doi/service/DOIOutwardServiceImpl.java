package gov.ifms.doi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import gov.ifms.doi.converter.DOIOutwardEntryConverter;
import gov.ifms.doi.converter.DOIOutwardListingConverter;
import gov.ifms.doi.dto.DOIOutwardEntryDto;
import gov.ifms.doi.dto.DOIOutwardListingDto;
import gov.ifms.doi.dto.DOIOutwardUpdateEntryDto;
import gov.ifms.doi.entity.DOIOutwardEntryEntity;
import gov.ifms.doi.repository.DOIInwardRepository;
import gov.ifms.doi.repository.DOILuLookUpInfoRepository;
import gov.ifms.doi.repository.DOIOutwardRepository;

@Service
@CrossOrigin(origins = "*")
@Transactional
public class DOIOutwardServiceImpl implements DOIOutwardService {

	private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	private DOIOutwardRepository outwardRepository;
	private DOILuLookUpInfoRepository lookUpInfoRepository;
	private ModelMapper mapper;
	private JdbcTemplate jdbcTemplate;
	private DOIOutwardEntryConverter doiOutwardEntryConverter;
	private DOIOutwardListingConverter doiOutwardListingConverter;

	@Autowired
	public DOIOutwardServiceImpl(DOIOutwardRepository outwardRepository, ModelMapper mapper, JdbcTemplate jdbcTemplate,
			DOIOutwardEntryConverter doiOutwardEntryConverter, DOIOutwardListingConverter doiOutwardListingConverter,
			DOILuLookUpInfoRepository lookUpInfoRepository) {
		this.lookUpInfoRepository = lookUpInfoRepository;
		this.jdbcTemplate = jdbcTemplate;
		this.outwardRepository = outwardRepository;
		this.mapper = mapper;
		this.doiOutwardEntryConverter = doiOutwardEntryConverter;
		this.doiOutwardListingConverter = doiOutwardListingConverter;
	}

	@Override
	public DOIOutwardEntryEntity getOutwardEntryById(long id) {
		return outwardRepository.findById(id).get();
	}

	@Override
	public List<DOIOutwardListingDto> getAll() {
		List<DOIOutwardListingDto> outwardListingResponseDto = new ArrayList<>();

		outwardRepository.findAll().forEach(r -> {
			outwardListingResponseDto.add(this.doiOutwardListingConverter.toDTO(r));
		});
		return outwardListingResponseDto;
	}

	@Override
	public List<String> getLatestOutwardNumber() {
		return outwardRepository.getLatestOutwardNumber();
	}

	@Override
	public List<DOIOutwardListingDto> getOutwardEntryByFieldName(Map<String, String> outwardEntry) {

		String query = "SELECT * FROM DOI.TDOI_OUTWARD_ENTRY o ";
		if (outwardEntry.containsKey("from_dt")) {
			query += "WHERE o.OUTWARD_DT = '" + outwardEntry.get("from_dt") + "'";
		} else {
			for (Map.Entry<String, String> entry : outwardEntry.entrySet()) {
				query += (query.contains("WHERE"))
						? " AND o." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
						: " WHERE o." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
			}
		}

		System.out.println(query);

		List<DOIOutwardEntryEntity> fetchedOutwardEntry = new ArrayList<>();
		fetchedOutwardEntry = jdbcTemplate.query(query,
				(rs, rowNum) -> new DOIOutwardEntryEntity(rs.getLong("OUTWARD_ID"), rs.getString("OUTWARD_NO"),
						rs.getDate("OUTWARD_DT").toLocalDate(), rs.getLong("LETTER_TYPE_ID"),
						rs.getString("LETTER_TYPE"), rs.getString("INWARD_LETTER_NO"), rs.getString("LETTER_DETAILS"),
						rs.getString("SENT_TO_DETAILS"), rs.getLong("FRM_BRANCH_ID"), rs.getLong("OUTWARD_MODE_ID"),
						rs.getDouble("OUTWARD_AMT"), rs.getString("REMARKS"), rs.getString("REFERENCE_NO"),
						rs.getTimestamp("REFERENCE_DT").toLocalDateTime(), rs.getShort("ACTIVE_STATUS"),
						rs.getTimestamp("CREATED_DATE").toLocalDateTime(), rs.getLong("CREATED_BY"),
						rs.getLong("CREATED_BY_POST"), rs.getTimestamp("UPDATED_DATE").toLocalDateTime(),
						rs.getLong("UPDATED_BY"), rs.getLong("UPDATED_BY_POST")));

		System.out.println(fetchedOutwardEntry);

		List<DOIOutwardListingDto> outwardDtoList = fetchedOutwardEntry.stream()
				.map(d -> this.doiOutwardListingConverter.toDTO(d)).collect(Collectors.toCollection(ArrayList::new));

		return outwardDtoList;
	}

	@Override
	public List<DOIOutwardEntryEntity> addOutwardEntry(List<DOIOutwardEntryDto> outwardEntryDtoList) {
		List<DOIOutwardEntryEntity> outward = new ArrayList<>();
		outwardEntryDtoList.forEach(d -> {
			d.setFrm_branch_id(
					this.lookUpInfoRepository.getByParentLookUpNameForBranchId(d.getFrom_branch_or_unit()).toString());
			d.setOutward_mode_id(
					this.lookUpInfoRepository.getByParentLookUpNameForOutwradModeId(d.getOutward_mode()).toString());
			
			DOIOutwardEntryEntity entity = outwardRepository.save(doiOutwardEntryConverter.toEntity(d));
			outward.add(entity);
		});
		return outward;
	}

	@Override
	public DOIOutwardEntryEntity updateOutwardEntry(DOIOutwardUpdateEntryDto outwardUpdateEntryDto) {
		DOIOutwardEntryEntity outwardEntry = this
				.getOutwardEntryById(Long.parseLong(outwardUpdateEntryDto.getOutward_id()));
		outwardEntry = this.convertDtoToEntityForUpdate(outwardUpdateEntryDto, outwardEntry);
		DOIOutwardEntryEntity entity = outwardRepository.save(outwardEntry);
		return entity;
	}

	@Override
	public void deleteOutwardEntry(long id) {
		outwardRepository.deleteById(id);
	}

	DOIOutwardEntryEntity convertDtoToEntityForUpdate(DOIOutwardUpdateEntryDto outwardUpdateEntryDTO,
			DOIOutwardEntryEntity todiOutwardEntry) {
		DOIOutwardEntryEntity outwardEntry = mapper.map(outwardUpdateEntryDTO, todiOutwardEntry.getClass());
		return outwardEntry;
	}

}
