package com.gov.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gov.demo.entity.TdioHBAProposal;
import com.gov.demo.entity.Tdoi_surveyor_bill_dtls;
import com.gov.demo.entity.Tdoi_surveyor_dtl;
import com.gov.demo.repository.HBAProposalRepository;
import com.gov.demo.repository.SurveyorMasterRepository;
import com.gov.demo.service.SurveyorMasterService;

@Service
@CrossOrigin(origins = "*")
@Transactional
public class SurveyorMasterServiceimpl implements SurveyorMasterService {


	
	private SurveyorMasterRepository surveyorMasterRepository;
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public SurveyorMasterServiceimpl(SurveyorMasterRepository surveyorMasterRepository, JdbcTemplate jdbcTemplate) {
		super();
		this.surveyorMasterRepository = surveyorMasterRepository;
		this.jdbcTemplate = jdbcTemplate;
	
	}
	
	@Override
	public List<Tdoi_surveyor_dtl> filterSurveyorMaster(Map<String, String> surveyorMasterListingdto){
		String query = "SELECT * FROM DOI.TDOI_SURVEYOR_DTL i ";

		for (Map.Entry<String, String> entry : surveyorMasterListingdto.entrySet()) {
			query += (query.contains("WHERE"))
					? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
					: "WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
		}
		System.out.println(query);
		List<Tdoi_surveyor_dtl> fetchedsurveyorEntry = new ArrayList<>();

		try {
			fetchedsurveyorEntry = jdbcTemplate.query(query, (rs, rowNum) -> new Tdoi_surveyor_dtl(
					rs.getLong("SURVEYOR_ID"), rs.getString("SURVEYOR_NAME"), rs.getString("SURVEY_FIRM_NAME"),
					rs.getString("FIRM_ADDRESS"), rs.getLong("DISTRICT_ID"), rs.getLong("TALUKA_ID"),
					rs.getString("CITY"), rs.getLong("PINCODE"), rs.getString("CONTACT_NUMBER"),
					rs.getString("EMAIL_ID"), rs.getLong("AADHAR_NUM"), rs.getString("PAN_NUM"),
				    rs.getLong("BANK_ID"), rs.getLong("BRANCH_ID"), 
					rs.getString("IFSC_CODE"), rs.getLong("ACCOUNT_NO"), rs.getLong("PAYMENT_MODE_ID"), 
					rs.getString("REFERENCE_NO"), rs.getTimestamp("REFERENCE_DT").toLocalDateTime(),
					rs.getShort("ACTIVE_STATUS"), rs.getTimestamp("CREATED_DATE").toLocalDateTime(),
					rs.getLong("CREATED_BY"), rs.getLong("CREATED_BY_POST"), rs.getTimestamp("UPDATED_DATE").toLocalDateTime(),
					rs.getLong("UPDATED_BY"), rs.getLong("UPDATED_BY_POST")
					));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(fetchedsurveyorEntry);
		return fetchedsurveyorEntry;
	
}

	// getall
	public List<Tdoi_surveyor_dtl> getAll() {
		List<Tdoi_surveyor_dtl> surveyor_dtl = new ArrayList<>();
		System.out.println(surveyorMasterRepository.findAll());
		surveyorMasterRepository.findAll().forEach(surveyor_dtl::add);
		return surveyor_dtl;
	}

	// get by id
	public Tdoi_surveyor_dtl getSurveyordtlById(Long id) {
		return surveyorMasterRepository.findByid(id);
	}

	//save
			public List<Tdoi_surveyor_dtl> addSurveyordtl(List<Tdoi_surveyor_dtl> tdoi_surveyor_dtl) {

				List<Tdoi_surveyor_dtl> savedSurveyorDtls = new ArrayList<>();
				try {
				
					System.out.println(tdoi_surveyor_dtl);
					tdoi_surveyor_dtl.forEach(dtl -> {
						savedSurveyorDtls.add((Tdoi_surveyor_dtl) surveyorMasterRepository.save(dtl));
					});
					return savedSurveyorDtls;
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
			}



	   public Tdoi_surveyor_dtl deleteTdoi_surveyor_dtl( Long id) {
		Tdoi_surveyor_dtl tdoi_surveyor_dtl=surveyorMasterRepository.findById(id).get();
		System.out.println(tdoi_surveyor_dtl);
		 surveyorMasterRepository.deleteById(id);
		return tdoi_surveyor_dtl;
	}
	
	
	@Override
	public Tdoi_surveyor_dtl updateTdoi_surveyor_dtl(Tdoi_surveyor_dtl tdoi_surveyor_dtl) {
		Tdoi_surveyor_dtl tdoi_surveyor = surveyorMasterRepository.findByid(tdoi_surveyor_dtl.getid());
		System.out.println(tdoi_surveyor);

		if (tdoi_surveyor_dtl.getid() != 0) {
			tdoi_surveyor.setid(tdoi_surveyor_dtl.getid());
		}

		if (tdoi_surveyor_dtl.getSurveyor_name() != null) {
			tdoi_surveyor.setSurveyor_name(tdoi_surveyor_dtl.getSurveyor_name());
		}

		if (tdoi_surveyor_dtl.getSurveyor_firm_name() != null) {
			tdoi_surveyor.setSurveyor_firm_name(tdoi_surveyor_dtl.getSurveyor_firm_name());
		}

		if (tdoi_surveyor_dtl.getFirm_address() !=null) {
			tdoi_surveyor.setFirm_address(tdoi_surveyor_dtl.getFirm_address());
		}

		if (tdoi_surveyor_dtl.getDistrict_id() != 0) {
			tdoi_surveyor.setDistrict_id(tdoi_surveyor_dtl.getDistrict_id());
		}

		if (tdoi_surveyor_dtl.getCity() != null) {
			tdoi_surveyor.setCity(tdoi_surveyor_dtl.getCity());
		}

		if (tdoi_surveyor_dtl.getPincode() != 0) {
			tdoi_surveyor.setPincode(tdoi_surveyor_dtl.getPincode());
		}

		if (tdoi_surveyor_dtl.getContact_number() != null) {
			tdoi_surveyor.setContact_number(tdoi_surveyor_dtl.getContact_number());
		}

		if (tdoi_surveyor_dtl.getEmail_id() != null) {
			tdoi_surveyor.setEmail_id(tdoi_surveyor_dtl.getEmail_id());
		}

		if (tdoi_surveyor_dtl.getAadhar_num() != 0) {
			tdoi_surveyor.setAadhar_num(tdoi_surveyor_dtl.getAadhar_num());
		}

		if (tdoi_surveyor_dtl.getPan_num() != null) {
			tdoi_surveyor.setPan_num(tdoi_surveyor_dtl.getPan_num());
		}

		if (tdoi_surveyor_dtl.getBank_id() != 0) {
			tdoi_surveyor.setBank_id(tdoi_surveyor_dtl.getBank_id());
		}

		if (tdoi_surveyor_dtl.getBranch_id() != 0) {
			tdoi_surveyor.setBranch_id(tdoi_surveyor_dtl.getBranch_id());
		}

		if (tdoi_surveyor_dtl.getIfsc_code() != null) {
			tdoi_surveyor.setIfsc_code(tdoi_surveyor_dtl.getIfsc_code());
		}

		if (tdoi_surveyor_dtl.getAccount_no() != 0) {
			tdoi_surveyor.setAccount_no(tdoi_surveyor_dtl.getAccount_no());
		}

		if (tdoi_surveyor_dtl.getPayment_mode_id() != 0) {
			tdoi_surveyor.setPayment_mode_id(tdoi_surveyor_dtl.getPayment_mode_id());
		}

		if (tdoi_surveyor_dtl.getReference_no() != null) {
			tdoi_surveyor.setReference_no(tdoi_surveyor_dtl.getReference_no());
		}

		if (tdoi_surveyor_dtl.getCreated_date() != null) {
			tdoi_surveyor.setCreated_date(tdoi_surveyor_dtl.getCreated_date());
		}

		if (tdoi_surveyor_dtl.getCreated_by() != 0) {
			tdoi_surveyor.setCreated_by(tdoi_surveyor_dtl.getCreated_by());
		}

		if (tdoi_surveyor_dtl.getCreated_by_post() != 0) {
			tdoi_surveyor.setCreated_by_post(tdoi_surveyor_dtl.getCreated_by_post());
		}

		if (tdoi_surveyor_dtl.getUpdated_date() != null) {
			tdoi_surveyor.setUpdated_date(tdoi_surveyor_dtl.getUpdated_date());
		}


		if (tdoi_surveyor_dtl.getUpdated_by() != 0) {
			tdoi_surveyor.setUpdated_by(tdoi_surveyor_dtl.getUpdated_by());
		}

		if (tdoi_surveyor_dtl.getUpdated_by_post() != 0) {
			tdoi_surveyor.setUpdated_by_post(tdoi_surveyor_dtl.getUpdated_by_post());
		}

		Tdoi_surveyor_dtl tdoi_surveyor_dtl1 = surveyorMasterRepository.save(tdoi_surveyor);

		return tdoi_surveyor_dtl1;
	}


	}

