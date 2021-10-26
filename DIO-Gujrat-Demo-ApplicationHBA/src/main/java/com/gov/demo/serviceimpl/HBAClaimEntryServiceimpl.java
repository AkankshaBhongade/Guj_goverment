package com.gov.demo.serviceimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gov.demo.dto.claimdtoforfilter;
import com.gov.demo.entity.TdioHBAProposal;
import com.gov.demo.entity.Tdoi_hba_Claim_Entry;
import com.gov.demo.entity.Tdoi_inward_entry;
import com.gov.demo.repository.HbaClaimEntryRepository;
import com.gov.demo.service.HBAClaimEntryService;

@Service
@CrossOrigin(origins = "*")
@Transactional
public class HBAClaimEntryServiceimpl implements HBAClaimEntryService {


	HbaClaimEntryRepository hbaClaimEntryRepository;;
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public HBAClaimEntryServiceimpl(HbaClaimEntryRepository hbaClaimEntryRepository, JdbcTemplate jdbcTemplate) {
		super();
		this.hbaClaimEntryRepository = hbaClaimEntryRepository;
		this.jdbcTemplate = jdbcTemplate;

	}

	public Collection<Object> distictid(long DISTRICT_ID) {

		try {
			System.out.println("try");
			Collection<Object> hba_Claim_distict = this.hbaClaimEntryRepository.getBydistictid(DISTRICT_ID);
			System.out.println(hba_Claim_distict);
			// System.out.println();

			return hba_Claim_distict;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("in cath");
			return null;
		}

	}
	
	public List<claimdtoforfilter> clamnewfilter(Map<String, String> claimdtoforfilter){

		String query = "SELECT i.HBA_CLAIM_ID, i.HBA_POLICY_NO, j.EMPLOYEE_NAME, j.OFFICE_NAME, j.RISK_COVERED_ID, j.HOUSE_ADDRESS, i.INWARD_NO,i.CREATED_DATE, i.UPDATED_DATE, i.ACTIVE_STATUS FROM  Tdoi_hba_Claim_Entry i RIGHT JOIN TDOI_HBA_PROPOSAL j ON j.HBA_PROPOSAL_ID = i.HBA_PROPOSAL_ID ";
		for (Map.Entry<String, String> entry : claimdtoforfilter.entrySet()) {
			query += (query.contains("WHERE"))
					? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
					: "WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
		}
		System.out.println(query);

		List<claimdtoforfilter> fetchedClaimEntry = new ArrayList<>();
		
		
		try {
			fetchedClaimEntry = jdbcTemplate.query(query,
					(rs, rowNum) -> new claimdtoforfilter(rs.getString("HBA_CLAIM_ID"), rs.getString("HBA_POLICY_NO"),
							rs.getString("EMPLOYEE_NAME"),rs.getString("OFFICE_NAME"),rs.getString("RISK_COVERED_ID"),
							rs.getString("HOUSE_ADDRESS"),rs.getString("INWARD_NO"),rs.getString("ACTIVE_STATUS"),
							rs.getTimestamp("CREATED_DATE").toLocalDateTime(), rs.getTimestamp("UPDATED_DATE").toLocalDateTime()
							));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fetchedClaimEntry;
		
	}
	
	

//	@Override
//	public List<Tdoi_hba_Claim_Entry> filterhbaClaimEntry(Map<String, String> Claim_entry_listing_dto) {
//
//		//String query = "SELECT i.HBA_CLAIM_ID, i.HBA_POLICY_NO, j.EMPLOYEE_NAME, j.OFFICE_NAME, j.RISK_COVERED_ID, j.HOUSE_ADDRESS, i.INWARD_NO,i.CREATED_DATE, i.UPDATED_DATE, i.ACTIVE_STATUS "
//				//+ "FROM  Tdoi_hba_Claim_Entry i RIGHT JOIN TDOI_HBA_PROPOSAL j ON i.HBA_PROPOSAL_ID = j.HBA_PROPOSAL_ID";
//
//		 String query = "SELECT * FROM Tdoi_hba_Claim_Entry i ";
//
//		for (Map.Entry<String, String> entry : Claim_entry_listing_dto.entrySet()) {
//			query += (query.contains("WHERE"))
//					? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
//					: "WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
//		}
//		System.out.println(query);
//
//		List<Tdoi_hba_Claim_Entry> fetchedClaimEntryEntry = new ArrayList<>();
//		try {
//			fetchedClaimEntryEntry = jdbcTemplate.query(query,
//					(rs, rowNum) -> new Tdoi_hba_Claim_Entry(rs.getLong("HBA_CLAIM_ID"), rs.getString("CLAIM_NO"),
//							rs.getObject("INWARD_ID", Tdoi_inward_entry.class), rs.getString("INWARD_NO"),
//							rs.getDate("INWARD_DT").toLocalDate(), rs.getDate("INWARD_ACCEPT_DT").toLocalDate(),
//							rs.getObject("HBA_PROPOSAL_ID", TdioHBAProposal.class), rs.getString("HBA_POLICY_NO"),
//							rs.getDate("POLICY_START_DT").toLocalDate(), rs.getDate("POLICY_END_DT").toLocalDate(),
//							rs.getDouble("SUM_INSURED"), rs.getString("INSURED_NAME"), rs.getString("INSURED_ADDRESS"),
//							rs.getLong("AADHAR_NUM"), rs.getLong("MOBILE_NUM"), rs.getString("EMAIL_ADDRESS"),
//							rs.getShort("INSUR_OTHER_COMPANY"), rs.getDate("LOSS_DATE").toLocalDate(),
//							rs.getString("LOSS_TIME"), rs.getString("CAUSE_OF_LOSS"), rs.getString("EXTENT_OF_LOSS"),
//							rs.getShort("IS_SURVEYOR_ASSGN"), rs.getLong("SURVEYOR_ID"), rs.getString("SURVEYOR_NAME"),
//							rs.getString("SURV_BILL_NO"), rs.getDate("SURV_BILL_DT").toLocalDate(),
//							rs.getDouble("SURV_FEE_AMOUNT"), rs.getDouble("CLAIM_AMOUNT"), rs.getLong("CLAIM_MONTH_ID"),
//							rs.getLong("CLAIM_YEAR_ID"), rs.getDate("CLAIM_GENRATE_DT").toLocalDate(),
//							rs.getLong("CLAIM_STATUS_ID"), rs.getString("CLAIM_STATUS"),
//							rs.getDate("CLAIM_ACCEPT_DT").toLocalDate(), rs.getLong("CLAIM_ACCEPT_BY_ID"),
//							rs.getString("CLAIM_ENTRY_STATUS"), rs.getString("REJECT_REASON"),
//							rs.getDate("REJECTION_DT").toLocalDate(), rs.getLong("REJECTED_BY"),
//							rs.getShort("IS_SENT_FOR_PAY"), rs.getShort("IS_PAYMENT_DONE"),
//							rs.getString("TRANSACTION_ID"), rs.getLong("CHEQUE_NUM"),
//							rs.getDate("PAYMENT_DT").toLocalDate(), rs.getDouble("PAID_AMOUNT"),
//							rs.getDouble("SURVEYOR_PAYMENT"), rs.getString("REFERENCE_NO"),
//							rs.getTimestamp("REFERENCE_DT").toLocalDateTime(), rs.getShort("ACTIVE_STATUS"),
//							rs.getTimestamp("CREATED_DATE").toLocalDateTime(), rs.getLong("CREATED_BY"),
//							rs.getLong("CREATED_BY_POST"), rs.getTimestamp("UPDATED_DATE").toLocalDateTime(),
//							rs.getLong("UPDATED_BY"), rs.getLong("UPDATED_BY_POST")));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return fetchedClaimEntryEntry;
//
//	}

	// getall
	public List<Tdoi_hba_Claim_Entry> getAll() {
		List<Tdoi_hba_Claim_Entry> hba_Claim_Entry = new ArrayList<>();
		System.out.println(hbaClaimEntryRepository.findAll());
		hbaClaimEntryRepository.findAll().forEach(hba_Claim_Entry::add);
		return hba_Claim_Entry;
	}

	// getbyid
	public Tdoi_hba_Claim_Entry getHBAClaimEntryById(Long id) {
		return hbaClaimEntryRepository.findById(id).get();
	}

	// save

	public List<Tdoi_hba_Claim_Entry> addhbaClaimEntry(List<Tdoi_hba_Claim_Entry> tdoi_hba_Claim_Entry) {

		List<Tdoi_hba_Claim_Entry> savedhbaClaimEntry = new ArrayList<>();
		try {

			System.out.println(tdoi_hba_Claim_Entry);
			tdoi_hba_Claim_Entry.forEach(dtl -> {
				savedhbaClaimEntry.add((Tdoi_hba_Claim_Entry) hbaClaimEntryRepository.save(dtl));
			});
			return savedhbaClaimEntry;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// delete
	public void deleteTdoi_hba_Claim_Entry(Long id) {
		hbaClaimEntryRepository.deleteById(id);
	}

	// update

	@Override
	public Tdoi_hba_Claim_Entry updateTdoi_hba_Claim_Entry(Tdoi_hba_Claim_Entry tdoi_hba_Claim_Entry) {
		Tdoi_hba_Claim_Entry tdoi_hba_Claim = hbaClaimEntryRepository.findById(tdoi_hba_Claim_Entry.getHba_claim_id())
				.get();
		System.out.println(tdoi_hba_Claim);

		if (tdoi_hba_Claim_Entry.getHba_claim_id() != 0) {
			tdoi_hba_Claim.setHba_claim_id(tdoi_hba_Claim_Entry.getHba_claim_id());
		}

		if (tdoi_hba_Claim_Entry.getClaim_no() != null) {
			tdoi_hba_Claim.setClaim_no(tdoi_hba_Claim_Entry.getClaim_no());
		}

		if (tdoi_hba_Claim_Entry.getInward_no() != null) {
			tdoi_hba_Claim.setInward_no(tdoi_hba_Claim_Entry.getInward_no());
		}

		if (tdoi_hba_Claim_Entry.getInward_dt() != null) {
			tdoi_hba_Claim.setInward_dt(tdoi_hba_Claim_Entry.getInward_dt());
		}

		if (tdoi_hba_Claim_Entry.getInward_accept_dt() != null) {
			tdoi_hba_Claim.setInward_accept_dt(tdoi_hba_Claim_Entry.getInward_accept_dt());
		}

		if (tdoi_hba_Claim_Entry.getHba_policy_no() != null) {
			tdoi_hba_Claim.setHba_policy_no(tdoi_hba_Claim_Entry.getHba_policy_no());
		}

		if (tdoi_hba_Claim_Entry.getPolicy_start_dt() != null) {
			tdoi_hba_Claim.setPolicy_start_dt(tdoi_hba_Claim_Entry.getPolicy_start_dt());
		}

		if (tdoi_hba_Claim_Entry.getPolicy_end_dt() != null) {
			tdoi_hba_Claim.setPolicy_end_dt(tdoi_hba_Claim_Entry.getPolicy_end_dt());
		}

		if (tdoi_hba_Claim_Entry.getSum_insured() != 0) {
			tdoi_hba_Claim.setSum_insured(tdoi_hba_Claim_Entry.getSum_insured());
		}

		if (tdoi_hba_Claim_Entry.getInsured_name() != null) {
			tdoi_hba_Claim.setInsured_name(tdoi_hba_Claim_Entry.getInsured_name());
		}

		if (tdoi_hba_Claim_Entry.getInsured_address() != null) {
			tdoi_hba_Claim.setInsured_address(tdoi_hba_Claim_Entry.getInsured_address());
		}

		if (tdoi_hba_Claim_Entry.getAadhar_num() != 0) {
			tdoi_hba_Claim.setAadhar_num(tdoi_hba_Claim_Entry.getAadhar_num());
		}

		if (tdoi_hba_Claim_Entry.getMobile_num() != 0) {
			tdoi_hba_Claim.setMobile_num(tdoi_hba_Claim_Entry.getMobile_num());
		}

		if (tdoi_hba_Claim_Entry.getEmail_address() != null) {
			tdoi_hba_Claim.setEmail_address(tdoi_hba_Claim_Entry.getEmail_address());
		}

		if (tdoi_hba_Claim_Entry.getInsur_other_company() != 0) {
			tdoi_hba_Claim.setInsur_other_company(tdoi_hba_Claim_Entry.getInsur_other_company());
		}

		if (tdoi_hba_Claim_Entry.getLoss_date() != null) {
			tdoi_hba_Claim.setLoss_date(tdoi_hba_Claim_Entry.getLoss_date());
		}

		if (tdoi_hba_Claim_Entry.getLoss_time() != null) {
			tdoi_hba_Claim.setLoss_time(tdoi_hba_Claim_Entry.getLoss_time());
		}

		if (tdoi_hba_Claim_Entry.getCause_of_loss() != null) {
			tdoi_hba_Claim.setCause_of_loss(tdoi_hba_Claim_Entry.getCause_of_loss());
		}

		if (tdoi_hba_Claim_Entry.getExtent_of_loss() != null) {
			tdoi_hba_Claim.setExtent_of_loss(tdoi_hba_Claim_Entry.getExtent_of_loss());
		}

		if (tdoi_hba_Claim_Entry.getIs_surveyor_assgn() != 0) {
			tdoi_hba_Claim.setIs_surveyor_assgn(tdoi_hba_Claim_Entry.getIs_surveyor_assgn());
		}

		if (tdoi_hba_Claim_Entry.getSurveyor_id() != 0) {
			tdoi_hba_Claim.setSurveyor_id(tdoi_hba_Claim_Entry.getSurveyor_id());
		}

		if (tdoi_hba_Claim_Entry.getSurveyor_name() != null) {
			tdoi_hba_Claim.setSurveyor_name(tdoi_hba_Claim_Entry.getSurveyor_name());
		}

		if (tdoi_hba_Claim_Entry.getSurv_bill_no() != null) {
			tdoi_hba_Claim.setSurv_bill_no(tdoi_hba_Claim_Entry.getSurv_bill_no());
		}

		if (tdoi_hba_Claim_Entry.getSurv_bill_dt() != null) {
			tdoi_hba_Claim.setSurv_bill_dt(tdoi_hba_Claim_Entry.getSurv_bill_dt());
		}

		if (tdoi_hba_Claim_Entry.getSurv_fee_amount() != 0) {
			tdoi_hba_Claim.setSurv_fee_amount(tdoi_hba_Claim_Entry.getSurv_fee_amount());
		}

		if (tdoi_hba_Claim_Entry.getClaim_amount() != 0) {
			tdoi_hba_Claim.setClaim_amount(tdoi_hba_Claim_Entry.getClaim_amount());
		}

		if (tdoi_hba_Claim_Entry.getClaim_month_id() != 0) {
			tdoi_hba_Claim.setClaim_month_id(tdoi_hba_Claim_Entry.getClaim_month_id());
		}

		if (tdoi_hba_Claim_Entry.getClaim_year_id() != 0) {
			tdoi_hba_Claim.setClaim_year_id(tdoi_hba_Claim_Entry.getClaim_year_id());
		}

		if (tdoi_hba_Claim_Entry.getClaim_generate_dt() != null) {
			tdoi_hba_Claim.setClaim_generate_dt(tdoi_hba_Claim_Entry.getClaim_generate_dt());
		}

		if (tdoi_hba_Claim_Entry.getClaim_status_id() != 0) {
			tdoi_hba_Claim.setClaim_status_id(tdoi_hba_Claim_Entry.getClaim_status_id());
		}

		if (tdoi_hba_Claim_Entry.getClaim_status() != null) {
			tdoi_hba_Claim.setClaim_status(tdoi_hba_Claim_Entry.getClaim_status());
		}

		if (tdoi_hba_Claim_Entry.getClaim_accept_dt() != null) {
			tdoi_hba_Claim.setClaim_accept_dt(tdoi_hba_Claim_Entry.getClaim_accept_dt());
		}

		if (tdoi_hba_Claim_Entry.getClaim_accept_by_id() != 0) {
			tdoi_hba_Claim.setClaim_accept_by_id(tdoi_hba_Claim_Entry.getClaim_accept_by_id());
		}

		if (tdoi_hba_Claim_Entry.getClaim_entry_status() != null) {
			tdoi_hba_Claim.setClaim_entry_status(tdoi_hba_Claim_Entry.getClaim_entry_status());
		}

		if (tdoi_hba_Claim_Entry.getReject_reason() != null) {
			tdoi_hba_Claim.setReject_reason(tdoi_hba_Claim_Entry.getReject_reason());
		}

		if (tdoi_hba_Claim_Entry.getRejection_dt() != null) {
			tdoi_hba_Claim.setRejection_dt(tdoi_hba_Claim_Entry.getRejection_dt());
		}

		if (tdoi_hba_Claim_Entry.getRejected_by() != 0) {
			tdoi_hba_Claim.setRejected_by(tdoi_hba_Claim_Entry.getRejected_by());
		}

		if (tdoi_hba_Claim_Entry.getIs_sent_for_pay() != 0) {
			tdoi_hba_Claim.setIs_sent_for_pay(tdoi_hba_Claim_Entry.getIs_sent_for_pay());
		}
		if (tdoi_hba_Claim_Entry.getIs_payment_done() != 0) {
			tdoi_hba_Claim.setSurv_fee_amount(tdoi_hba_Claim_Entry.getSurv_fee_amount());
		}
		if (tdoi_hba_Claim_Entry.getTransaction_id() != null) {
			tdoi_hba_Claim.setTransaction_id(tdoi_hba_Claim_Entry.getTransaction_id());
		}
		if (tdoi_hba_Claim_Entry.getCheque_num() != 0) {
			tdoi_hba_Claim.setCheque_num(tdoi_hba_Claim_Entry.getCheque_num());
		}
		if (tdoi_hba_Claim_Entry.getPayment_dt() != null) {
			tdoi_hba_Claim.setPayment_dt(tdoi_hba_Claim_Entry.getPayment_dt());
		}
		if (tdoi_hba_Claim_Entry.getPaid_amount() != 0) {
			tdoi_hba_Claim.setPaid_amount(tdoi_hba_Claim_Entry.getPaid_amount());
		}
		if (tdoi_hba_Claim_Entry.getSurveyor_payment() != 0) {
			tdoi_hba_Claim.setSurveyor_payment(tdoi_hba_Claim_Entry.getSurveyor_payment());
		}
		if (tdoi_hba_Claim_Entry.getReference_no() != null) {
			tdoi_hba_Claim.setReference_no(tdoi_hba_Claim_Entry.getReference_no());
		}
		if (tdoi_hba_Claim_Entry.getReference_dt() != null) {
			tdoi_hba_Claim.setReference_dt(tdoi_hba_Claim_Entry.getReference_dt());
		}
		if (tdoi_hba_Claim_Entry.getActive_status() != 0) {
			tdoi_hba_Claim.setActive_status(tdoi_hba_Claim_Entry.getActive_status());
		}
		if (tdoi_hba_Claim_Entry.getCreated_date() != null) {
			tdoi_hba_Claim.setCreated_date(tdoi_hba_Claim_Entry.getCreated_date());
		}
		if (tdoi_hba_Claim_Entry.getCreated_by() != 0) {
			tdoi_hba_Claim.setCreated_by(tdoi_hba_Claim_Entry.getCreated_by());
		}
		if (tdoi_hba_Claim_Entry.getCreated_by_post() != 0) {
			tdoi_hba_Claim.setCreated_by_post(tdoi_hba_Claim_Entry.getCreated_by_post());
		}

		if (tdoi_hba_Claim_Entry.getUpdated_date() != null) {
			tdoi_hba_Claim.setUpdated_date(tdoi_hba_Claim_Entry.getUpdated_date());
		}

		if (tdoi_hba_Claim_Entry.getUpdated_by() != 0) {
			tdoi_hba_Claim.setUpdated_by(tdoi_hba_Claim_Entry.getUpdated_by());
		}

		if (tdoi_hba_Claim_Entry.getUpdated_by_post() != 0) {
			tdoi_hba_Claim.setUpdated_by_post(tdoi_hba_Claim_Entry.getUpdated_by_post());
		}

		Tdoi_hba_Claim_Entry tdoi_hba_Claim_Entry1 = hbaClaimEntryRepository.save(tdoi_hba_Claim);

		return tdoi_hba_Claim_Entry1;
	}

}
