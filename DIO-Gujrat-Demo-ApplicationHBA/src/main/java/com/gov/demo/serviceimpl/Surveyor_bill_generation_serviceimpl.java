package com.gov.demo.serviceimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gov.demo.entity.TdioHBAProposal;
import com.gov.demo.entity.Tdoi_surveyor_bill_dtls;
import com.gov.demo.entity.Tdoi_surveyor_dtl;
import com.gov.demo.repository.HBAProposalRepository;
import com.gov.demo.repository.SurveyorBillGenerationRepository;
import com.gov.demo.service.Surveyor_bill_generation_service;

@Service
@CrossOrigin(origins = "*")
@Transactional
public class Surveyor_bill_generation_serviceimpl implements Surveyor_bill_generation_service {


	
	private SurveyorBillGenerationRepository surveyorBillGenerationRepository; 
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public Surveyor_bill_generation_serviceimpl(SurveyorBillGenerationRepository surveyorBillGenerationRepository, JdbcTemplate jdbcTemplate) {
		super();
		this.surveyorBillGenerationRepository = surveyorBillGenerationRepository;
		this.jdbcTemplate = jdbcTemplate;
	
	}
	
	
	public List<Tdoi_surveyor_bill_dtls> filterSurveyorbilldtls(Map<String, String> surveyor_bill_generation_listing){
	
		 String query = "SELECT * FROM DIO.TDOI_SURVEYOR_BILL_DTLS i ";

		for (Map.Entry<String, String> entry : surveyor_bill_generation_listing.entrySet()) {
			query += (query.contains("WHERE"))
					? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
					: "WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
		}
		System.out.println(query);
		
		List<Tdoi_surveyor_bill_dtls> fetchedSurveyorbilldtlsEntry = new ArrayList<>();
		try {
				fetchedSurveyorbilldtlsEntry = jdbcTemplate.query(query, (rs, rowNum) -> new Tdoi_surveyor_bill_dtls(
						rs.getLong("SURVEYOR_BILL_ID"), rs.getObject("SURVEYOR_ID", Tdoi_surveyor_dtl.class), rs.getString("SURVEYOR_NAME"),
						rs.getString("SURVEYR_APPOINT_FOR"), rs.getString("CLAIM_NO"), rs.getString("SURVEY_BILL_NO"),
						rs.getDate("SURVEY_BILL_DT").toLocalDate(), rs.getString("TRANSACTION_NO"),rs.getDate("TRANSACTION_DT").toLocalDate(),
						rs.getString("SURVEY_BRANCH"), rs.getDouble("SURVEY_BILL_AMT"), rs.getLong("WORKFLOW_STATUS_ID"),
						rs.getString("REFERENCE_NO"), rs.getTimestamp("REFERENCE_DT").toLocalDateTime(),
						rs.getShort("ACTIVE_STATUS"), rs.getTimestamp("CREATED_DATE").toLocalDateTime(),
						rs.getLong("CREATED_BY"), rs.getLong("CREATED_BY_POST"),
						rs.getTimestamp("UPDATED_DATE").toLocalDateTime(), rs.getLong("UPDATED_BY"),
						rs.getLong("UPDATED_BY_POST")
				));
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return fetchedSurveyorbilldtlsEntry;
	}

	public List<Tdoi_surveyor_bill_dtls> getAll() {
		List<Tdoi_surveyor_bill_dtls> surveyor_bill_dtls = new ArrayList<>();
		System.out.println(surveyorBillGenerationRepository.findAll());
		surveyorBillGenerationRepository.findAll().forEach(surveyor_bill_dtls::add);
		return surveyor_bill_dtls;
	}
	
	
	//get by id
		public Tdoi_surveyor_bill_dtls getSurveyorbilldtlsById(Long id) {
			return surveyorBillGenerationRepository.findById(id).get();
		}

		//delete
	public Tdoi_surveyor_bill_dtls deletesurveyorbilldtls(Long id){
		Tdoi_surveyor_bill_dtls tdoi_surveyor_bill_dtls=surveyorBillGenerationRepository.findById(id).get();
		System.out.println(tdoi_surveyor_bill_dtls);
		 surveyorBillGenerationRepository.deleteById(id);
		return tdoi_surveyor_bill_dtls;
		}
		
		
		
	// save
	public Tdoi_surveyor_bill_dtls addSurveyorbilldtls(Tdoi_surveyor_bill_dtls tdoi_surveyor_bill_dtls) {	
		try {

				Tdoi_surveyor_bill_dtls saveSurveyorbilldtls =surveyorBillGenerationRepository.save(tdoi_surveyor_bill_dtls);
		if (saveSurveyorbilldtls !=null) {
			return saveSurveyorbilldtls ;	
		}
		else {
			
			return null;
		}
		} catch (Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}

	

		@Override
		public Tdoi_surveyor_bill_dtls updateTdoi_surveyor_bill_dtl(Tdoi_surveyor_bill_dtls tdoi_surveyor_bill_dtl) {
			Tdoi_surveyor_bill_dtls tdoi_surveyor_bill = surveyorBillGenerationRepository.findById(tdoi_surveyor_bill_dtl.getSurveyor_bill_id()).get();		
			System.out.println(tdoi_surveyor_bill);

			if (tdoi_surveyor_bill_dtl.getSurveyor_bill_id() != 0) {
				tdoi_surveyor_bill.setSurveyor_bill_id(tdoi_surveyor_bill_dtl.getSurveyor_bill_id());
			}
			
			if (tdoi_surveyor_bill_dtl.getSurveyor_name() != null) {
				tdoi_surveyor_bill.setSurveyor_name(tdoi_surveyor_bill_dtl.getSurveyor_name());
			}
			
			if (tdoi_surveyor_bill_dtl.getSurveyor_appoint_for() != null) {
				tdoi_surveyor_bill.setSurveyor_appoint_for(tdoi_surveyor_bill_dtl.getSurveyor_appoint_for());
			}
			
			if (tdoi_surveyor_bill_dtl.getClaim_no() != null) {
				tdoi_surveyor_bill.setClaim_no(tdoi_surveyor_bill_dtl.getClaim_no());
			}
			
			if (tdoi_surveyor_bill_dtl.getSurvey_bill_no() != null) {
				tdoi_surveyor_bill.setSurvey_bill_no(tdoi_surveyor_bill_dtl.getSurvey_bill_no());
			}
			
			if (tdoi_surveyor_bill_dtl.getSurvey_bill_dt() != null) {
				tdoi_surveyor_bill.setSurvey_bill_dt(tdoi_surveyor_bill_dtl.getSurvey_bill_dt());
			}
			
			if (tdoi_surveyor_bill_dtl.getTransaction_no() != null) {
				tdoi_surveyor_bill.setTransaction_no(tdoi_surveyor_bill_dtl.getTransaction_no());
			}
			
			if (tdoi_surveyor_bill_dtl.getTransaction_dt() != null) {
				tdoi_surveyor_bill.setTransaction_dt(tdoi_surveyor_bill_dtl.getTransaction_dt());
			}
			
			if (tdoi_surveyor_bill_dtl.getSurvey_branch() != null) {
				tdoi_surveyor_bill.setSurvey_branch(tdoi_surveyor_bill_dtl.getSurvey_branch());
			}
			
			if (tdoi_surveyor_bill_dtl.getSurvey_bill_amt() != 0) {
				tdoi_surveyor_bill.setSurvey_bill_amt(tdoi_surveyor_bill_dtl.getSurvey_bill_amt());
			}
			
			if (tdoi_surveyor_bill_dtl.getWorkflow_status_id() != 0) {
				tdoi_surveyor_bill.setWorkflow_status_id(tdoi_surveyor_bill_dtl.getWorkflow_status_id());
			}
			
			if (tdoi_surveyor_bill_dtl.getReference_no() != null) {
				tdoi_surveyor_bill.setReference_no(tdoi_surveyor_bill_dtl.getReference_no());
			}
			
			if (tdoi_surveyor_bill_dtl.getReference_dt() != null) {
				tdoi_surveyor_bill.setReference_dt(tdoi_surveyor_bill_dtl.getReference_dt());
			}
			
			if (tdoi_surveyor_bill_dtl.getActive_status() != 0) {
				tdoi_surveyor_bill.setActive_status(tdoi_surveyor_bill_dtl.getActive_status());
			}
			
			if (tdoi_surveyor_bill_dtl.getCreated_date() != null) {
				tdoi_surveyor_bill.setCreated_date(tdoi_surveyor_bill_dtl.getCreated_date());
			}
			
			if (tdoi_surveyor_bill_dtl.getCreated_by() != 0) {
				tdoi_surveyor_bill.setCreated_by(tdoi_surveyor_bill_dtl.getCreated_by());
			}
			
			if (tdoi_surveyor_bill_dtl.getCreated_by_post() != 0) {
				tdoi_surveyor_bill.setCreated_by_post(tdoi_surveyor_bill_dtl.getCreated_by_post());
			}
			
			if (tdoi_surveyor_bill_dtl.getUpdated_date() != null) {
				tdoi_surveyor_bill.setUpdated_date(tdoi_surveyor_bill_dtl.getUpdated_date());
			}
			
			if (tdoi_surveyor_bill_dtl.getUpdated_by() != 0) {
				tdoi_surveyor_bill.setUpdated_by(tdoi_surveyor_bill_dtl.getUpdated_by());
			}
			
			if (tdoi_surveyor_bill_dtl.getUpdated_by_post() != 0) {
				tdoi_surveyor_bill.setUpdated_by_post(tdoi_surveyor_bill_dtl.getUpdated_by_post());
			}
			
			
			
			
			Tdoi_surveyor_bill_dtls tdoi_surveyor_bill_dtl1= surveyorBillGenerationRepository.save(tdoi_surveyor_bill);
					 
			
			return tdoi_surveyor_bill_dtl1;
		}
	
	




}

