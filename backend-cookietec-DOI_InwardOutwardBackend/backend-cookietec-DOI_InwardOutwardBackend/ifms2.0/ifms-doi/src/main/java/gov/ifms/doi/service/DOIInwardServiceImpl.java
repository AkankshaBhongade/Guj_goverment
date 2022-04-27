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

import antlr.collections.impl.LList;
import gov.ifms.doi.converter.DOIInwardEntryConverter;
import gov.ifms.doi.converter.DOIInwardListingConverter;
import gov.ifms.doi.dto.DOIInwardEntryDto;
import gov.ifms.doi.dto.DOIInwardListingDto;
import gov.ifms.doi.dto.DOIInwardUpdateEntryDto;
import gov.ifms.doi.entity.DOIInwardEntryEntity;
import gov.ifms.doi.repository.DOIInwardRepository;
import gov.ifms.doi.repository.DOILuLookUpInfoRepository;

@Service
@CrossOrigin(origins = "*")
@Transactional
public class DOIInwardServiceImpl implements DOIInwardService {
	private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	private DOIInwardRepository inwardRepository;
	private DOILuLookUpInfoRepository lookUpInfoRepository;
	private ModelMapper mapper;
	private JdbcTemplate jdbcTemplate;
	private DOIInwardEntryConverter doiInwardEntryConverter;
	private DOIInwardListingConverter doiInwardListingConverter;

	@Autowired
	public DOIInwardServiceImpl(DOIInwardRepository inwardRepository, ModelMapper mapper, JdbcTemplate jdbcTemplate,
			DOIInwardEntryConverter doiInwardEntryConverter, DOIInwardListingConverter doiInwardListingConverter,
			DOILuLookUpInfoRepository lookUpInfoRepository) {
		this.lookUpInfoRepository = lookUpInfoRepository;
		this.inwardRepository = inwardRepository;
		this.mapper = mapper;
		this.jdbcTemplate = jdbcTemplate;
		this.doiInwardEntryConverter = doiInwardEntryConverter;
		this.doiInwardListingConverter = doiInwardListingConverter;
	}

	@Override
	public DOIInwardEntryEntity getInwardEntryById(long id) {
		return inwardRepository.findById(id).get();
	}

	@Override
	public List<DOIInwardListingDto> getAll() {
		List<DOIInwardListingDto> inwardListingResponseDto = new ArrayList<>();

		inwardRepository.findAll().forEach(r -> {
			inwardListingResponseDto.add(this.doiInwardListingConverter.toDTO(r));
		});
		return inwardListingResponseDto;
	}

	@Override
	public List<String> getLatestInwardNumber() {
		return inwardRepository.getLatestInwardNumber();
	}

	@Override
	public List<DOIInwardListingDto> getInwardEntryByFieldName(Map<String, String> inwardEntry) {

		System.out.println("Called getInwardEntryByFieldName");
		String query = "SELECT * FROM DOI.TDOI_INWARD_ENTRY i ";
		String date_type = Optional.ofNullable(inwardEntry.get("date_type")).orElse("empty");
		switch (date_type) {
		case "empty":
			;
		case "Inward Date":
			inwardEntry.remove("date_type");
			if (inwardEntry.containsKey("from_dt") && inwardEntry.containsKey("end_dt")) {
				query += "WHERE i.INWARD_DT BETWEEN '" + inwardEntry.get("from_dt") + "' AND '"
						+ inwardEntry.get("end_dt") + "'";
				inwardEntry.remove("from_dt");
				inwardEntry.remove("end_dt");
			} else if (inwardEntry.containsKey("from_dt")) {
				query += "WHERE i.INWARD_DT = '" + inwardEntry.get("from_dt") + "'";
				inwardEntry.remove("from_dt");
			} else if (inwardEntry.containsKey("end_dt")) {
				query += "WHERE i.INWARD_DT = '" + inwardEntry.get("end_dt") + "'";
				inwardEntry.remove("end_dt");
			}

			for (Map.Entry<String, String> entry : inwardEntry.entrySet()) {
				query += (query.contains("WHERE"))
						? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
						: "WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
			}

			break;

		case "Letter/Cheque Date":
			inwardEntry.remove("date_type");
			String inward_type = Optional.ofNullable(inwardEntry.get("inward_type")).orElse("empty");
			switch (inward_type) {
			case "empty":
				break;
			case "Letter":
				if (inwardEntry.containsKey("from_dt") && inwardEntry.containsKey("end_dt")) {
					query += "WHERE i.LETTER_DT BETWEEN '" + inwardEntry.get("from_dt") + "' AND '"
							+ inwardEntry.get("end_dt") + "'";
					inwardEntry.remove("from_dt");
					inwardEntry.remove("end_dt");
				} else if (inwardEntry.containsKey("from_dt")) {
					inwardEntry.remove("date_type");
					query += "WHERE i.LETTER_DT = '" + inwardEntry.get("from_dt") + "'";
					inwardEntry.remove("from_dt");
				} else if (inwardEntry.containsKey("end_dt")) {
					inwardEntry.remove("date_type");
					query += "WHERE i.LETTER_DT = '" + inwardEntry.get("end_dt") + "'";
					inwardEntry.remove("end_dt");
				}

				for (Map.Entry<String, String> entry : inwardEntry.entrySet()) {
					query += (query.contains("WHERE"))
							? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
							: " WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
				}
				break;

			case "Cheque":
				if (inwardEntry.containsKey("from_dt") && inwardEntry.containsKey("end_dt")) {
					query += "WHERE i.CHEQUE_DT BETWEEN '" + inwardEntry.get("from_dt") + "' AND '"
							+ inwardEntry.get("end_dt") + "'";
					inwardEntry.remove("from_dt");
					inwardEntry.remove("end_dt");
				} else if (inwardEntry.containsKey("from_dt")) {
					inwardEntry.remove("date_type");
					query += "WHERE i.CHEQUE_DT = '" + inwardEntry.get("from_dt") + "'";
					inwardEntry.remove("from_dt");
				} else if (inwardEntry.containsKey("end_dt")) {
					inwardEntry.remove("date_type");
					query += "WHERE i.CHEQUE_DT = '" + inwardEntry.get("end_dt") + "'";
					inwardEntry.remove("end_dt");
				}

				for (Map.Entry<String, String> entry : inwardEntry.entrySet()) {
					query += (query.contains("WHERE"))
							? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
							: " WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
				}
				break;
			}
			break;
		}

		System.out.println(query);

		List<DOIInwardEntryEntity> fetchedInwardEntry = new ArrayList<>();
		try {
			fetchedInwardEntry = jdbcTemplate.query(query,
					(rs, rowNum) -> new DOIInwardEntryEntity(rs.getLong("INWARD_ID"), rs.getString("INWARD_NO"),
							rs.getDate("INWARD_DT").toLocalDate(), rs.getString("INWARD_TYPE"),
							rs.getLong("LETTER_TYPE_ID"), rs.getString("LETTER_TYPE"), rs.getString("LETTER_NO"),
							rs.getDate("LETTER_DT").toLocalDate(), rs.getString("LETTER_DETAILS"),
							rs.getString("FROM_WHERE_DETAILS"), rs.getLong("DOI_BRANCH_ID"),
							rs.getLong("DOI_EMPLOYEE_ID"), rs.getString("DOI_EMPLOYEE_NAME"),
							rs.getString("REFERENCE_NO"), rs.getTimestamp("REFERENCE_DT").toLocalDateTime(),
							rs.getShort("ACTIVE_STATUS"), rs.getTimestamp("CREATED_DATE").toLocalDateTime(),
							rs.getLong("CREATED_BY"), rs.getLong("CREATED_BY_POST"),
							rs.getTimestamp("UPDATED_DATE").toLocalDateTime(), rs.getLong("UPDATED_BY"),
							rs.getLong("UPDATED_BY_POST"), rs.getLong("CHEQUE_NO"), rs.getString("CHEQUE_TYPE"),
							rs.getDouble("AMOUNT"), rs.getDate("CHEQUE_DT").toLocalDate(), rs.getString("BANK_NAME"),
							rs.getString("BANK_BRANCH_NAME")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(fetchedInwardEntry);

		List<DOIInwardListingDto> inwardDtoList = fetchedInwardEntry.stream().map(d -> {
			DOIInwardListingDto listingDto = this.doiInwardListingConverter.toDTO(d);
			listingDto.setBranch_name(this.lookUpInfoRepository.getLookUpInfoNameByLookUpInfoId(d.getDoi_branch_id()));
			return listingDto;
		}).collect(Collectors.toCollection(ArrayList::new));

		return inwardDtoList;
	}

	@Override
	public List<DOIInwardEntryEntity> addInwardEntry(List<DOIInwardEntryDto> inwardEntryDtoList) {
		List<DOIInwardEntryEntity> inward = new ArrayList<>();

		inwardEntryDtoList.forEach(d -> {
			switch (d.getInward_type()) {
			case "Letter":
				d.setDoi_branch_id(
						this.lookUpInfoRepository.getByParentLookUpNameForBranchId(d.getBranch_name()).toString());
				break;

			case "Cheque":
				d.setDoi_branch_id("0");
			}

			DOIInwardEntryEntity entity = inwardRepository.save(doiInwardEntryConverter.toEntity(d));
			inward.add(entity);
		});
		return inward;
	}

	@Override
	public DOIInwardEntryEntity updateInwardEntry(DOIInwardUpdateEntryDto inwardUpdateEntryDTO) {
		DOIInwardEntryEntity inwardEntry = this.getInwardEntryById(Long.parseLong(inwardUpdateEntryDTO.getInward_id()));
		inwardEntry = this.convertDtoToEntityForUpdate(inwardUpdateEntryDTO, inwardEntry);
		DOIInwardEntryEntity entity = inwardRepository.save(inwardEntry);
		return entity;
	}

	@Override
	public void deleteInwardEntry(long id) {
		inwardRepository.deleteById(id);
	}

	DOIInwardEntryEntity convertDtoToEntityForUpdate(DOIInwardUpdateEntryDto inwardUpdateEntryDTO,
			DOIInwardEntryEntity todiInwardEntry) {
		DOIInwardEntryEntity inwardEntry = mapper.map(inwardUpdateEntryDTO, todiInwardEntry.getClass());
		return inwardEntry;
	}

}
