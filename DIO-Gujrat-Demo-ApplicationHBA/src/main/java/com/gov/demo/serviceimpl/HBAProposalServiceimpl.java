package com.gov.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gov.demo.entity.DppfNo;
import com.gov.demo.entity.TdioHBAProposal;
import com.gov.demo.repository.HBAProposalRepository;
import com.gov.demo.service.HBAProposalService;

@Service
@CrossOrigin(origins = "*")
@Transactional
public class HBAProposalServiceimpl implements HBAProposalService {



	private HBAProposalRepository hBAProposalRepository;
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public HBAProposalServiceimpl(HBAProposalRepository hBAProposalRepository, JdbcTemplate jdbcTemplate) {
		super();
		this.hBAProposalRepository = hBAProposalRepository;
		this.jdbcTemplate = jdbcTemplate;

	}

//dppf filter
	public Map<String, String> filterDppf(String hBA_MCA_ACC_NUM) {
		try {
			Map<String, String> dppfNoList = this.hBAProposalRepository.getByHbaMcaAccNum(hBA_MCA_ACC_NUM);
			System.out.println(dppfNoList);
			//System.out.println("try");
			return dppfNoList;
		} catch (Exception e) {
			//System.out.println("catch");
			e.printStackTrace();
			return null;
		}
	}

	/*
	 * public PagebleDTO<EdpURMHeaderView> getUserRoleMappings(PageDetails
	 * pageDetail) throws CustomException { try { Map<String, Object> map =
	 * EDPUtility.populateArgumentsWfList(pageDetail, 7); String procName =
	 * Constant.EDP_SCHEMA.concat(Constant.DOT.concat(Constant.
	 * SP_ROLE_USER_MAPPING_LIST)); List<Object[]> objectSp =
	 * this.repository.callStoredProcedure(procName, map); int totalPages =
	 * objectSp.size(); return new PagebleDTO<>(pageDetail.getPageElement(),
	 * totalPages, totalPages, NativeQueryResultsMapper.map(objectSp,
	 * EdpURMHeaderView.class)); } catch (Exception e) {
	 * logger.error(e.getMessage(),e); throw new
	 * CustomException(ErrorResponse.ERROR_WHILE_FATCHING); }
	 * 
	 * }
	 * 
	 */

//	private List<DppfNo> getByHbaMcaAccNum(String hBA_MCA_ACC_NUM) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	
//	public List<DppfNo> filterDppf(String HBA_MCA_ACC_NUM){
//	
//		//List<DppfNo> dppfNo = new ArrayList<>();
//		//System.out.println(hBA_MCA_ACC_NUM);
//		System.out.println("hi");
//		//return hBAProposalRepository.getByHbaMcaAccNum(HBA_MCA_ACC_NUM);
//		  return hBAProposalRepository.getByHbaMcaAccNum(HBA_MCA_ACC_NUM);
//		
//		
//	}
//	

	public List<TdioHBAProposal> getAll() {
		List<TdioHBAProposal> tdioHBAProposal = new ArrayList<>();
		System.out.println(hBAProposalRepository.findAll());
		hBAProposalRepository.findAll().forEach(tdioHBAProposal::add);
		return tdioHBAProposal;
	}

	public TdioHBAProposal getHbaProposalById(Long id) {
		return hBAProposalRepository.findById(id).get();
	}

	public TdioHBAProposal deleteTdioHBAProposal(Long id) {
		TdioHBAProposal tdioHBAProposal = hBAProposalRepository.findById(id).get();
		System.out.println(tdioHBAProposal);
		hBAProposalRepository.deleteById(id);
		return tdioHBAProposal;
	}

	@Override
	public List<TdioHBAProposal> addHBAProposal(List<TdioHBAProposal> tdioHBAProposal) {
		List<TdioHBAProposal> savedHBAProposal = new ArrayList<>();
		try {
			System.out.println(tdioHBAProposal);
			tdioHBAProposal.forEach(dtl -> {
				savedHBAProposal.add((TdioHBAProposal) hBAProposalRepository.save(dtl));
			});
			return savedHBAProposal;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public TdioHBAProposal updateTdioHBAProposal(TdioHBAProposal tdioHBAProposal) {
		TdioHBAProposal tdioProposal = hBAProposalRepository.findById(tdioHBAProposal.getHba_proposal_id()).get();
		System.out.println(tdioProposal);

		if (tdioHBAProposal.getHba_proposal_id() != 0) {
			tdioProposal.setHba_proposal_id(tdioHBAProposal.getHba_proposal_id());
		}

		if (tdioHBAProposal.getDppf_taken_loan() != 0) {
			tdioProposal.setDppf_taken_loan(tdioHBAProposal.getDppf_taken_loan());
		}

		if (tdioHBAProposal.getLoan_account_no() != null) {
			tdioProposal.setLoan_account_no(tdioHBAProposal.getLoan_account_no());
		}

		if (tdioHBAProposal.getLoan_amount() != null) {
			tdioProposal.setLoan_amount(tdioHBAProposal.getLoan_amount());
		}

		if (tdioHBAProposal.getEmployee_no() != null) {
			tdioProposal.setEmployee_no(tdioHBAProposal.getEmployee_no());
		}

		if (tdioHBAProposal.getEmployee_name() != null) {
			tdioProposal.setEmployee_name(tdioHBAProposal.getEmployee_name());
		}

		if (tdioHBAProposal.getDesignation() != null) {
			tdioProposal.setDesignation(tdioHBAProposal.getDesignation());
		}

		if (tdioHBAProposal.getOffice_name() != null) {
			tdioProposal.setOffice_name(tdioHBAProposal.getOffice_name());
		}

		if (tdioHBAProposal.getOffice_address() != null) {
			tdioProposal.setOffice_address(tdioHBAProposal.getOffice_address());
		}

		if (tdioHBAProposal.getHouse_address() != null) {
			tdioProposal.setHouse_address(tdioHBAProposal.getHouse_address());
		}

		if (tdioHBAProposal.getHouse_no() != null) {
			tdioProposal.setHouse_no(tdioHBAProposal.getHouse_no());
		}

		if (tdioHBAProposal.getSurvey_no() != null) {
			tdioProposal.setSurvey_no(tdioHBAProposal.getSurvey_no());
		}

		if (tdioHBAProposal.getDistrict_id() != 0) {
			tdioProposal.setDistrict_id(tdioHBAProposal.getDistrict_id());
		}

		if (tdioHBAProposal.getTaluka_id() != 0) {
			tdioProposal.setTaluka_id(tdioHBAProposal.getTaluka_id());
		}
		if (tdioHBAProposal.getVillage_id() != 0) {
			tdioProposal.setVillage_id(tdioHBAProposal.getVillage_id());
		}

		if (tdioHBAProposal.getPincode() != 0) {
			tdioProposal.setPincode(tdioHBAProposal.getPincode());
		}

		if (tdioHBAProposal.getAadhar_num() != 0) {
			tdioProposal.setAadhar_num(tdioHBAProposal.getAadhar_num());
		}

		if (tdioHBAProposal.getMobile_num() != 0) {
			tdioProposal.setMobile_num(tdioHBAProposal.getMobile_num());
		}

		if (tdioHBAProposal.getHouse_type_id() != 0) {
			tdioProposal.setHouse_type_id(tdioHBAProposal.getHouse_type_id());
		}
		if (tdioHBAProposal.getWall_type_id() != 0) {
			tdioProposal.setWall_type_id(tdioHBAProposal.getWall_type_id());
		}

		if (tdioHBAProposal.getCeiling_type_id() != 0) {
			tdioProposal.setCeiling_type_id(tdioHBAProposal.getCeiling_type_id());
		}
		if (tdioHBAProposal.getSum_insured() != 0) {
			tdioProposal.setSum_insured(tdioHBAProposal.getSum_insured());
		}
		if (tdioHBAProposal.getTeem_ins_yrs() != 0) {
			tdioProposal.setTeem_ins_yrs(tdioHBAProposal.getTeem_ins_yrs());
		}
		if (tdioHBAProposal.getInsernc_premium() != 0) {
			tdioProposal.setInsernc_premium(tdioHBAProposal.getInsernc_premium());
		}
		if (tdioHBAProposal.getPayment_mode_id() != 0) {
			tdioProposal.setPayment_mode_id(tdioHBAProposal.getPayment_mode_id());
		}
		if (tdioHBAProposal.getCheque_dd_no() != null) {
			tdioProposal.setCheque_dd_no(tdioHBAProposal.getCheque_dd_no());
		}
		if (tdioHBAProposal.getCheque_dd_dt() != null) {
			tdioProposal.setCheque_dd_dt(tdioHBAProposal.getCheque_dd_dt());
		}
		if (tdioHBAProposal.getBank_id() != 0) {
			tdioProposal.setBank_id(tdioHBAProposal.getBank_id());
		}
		if (tdioHBAProposal.getBank_name() != null) {
			tdioProposal.setBank_name(tdioHBAProposal.getBank_name());
		}
		if (tdioHBAProposal.getBranch_id() != 0) {
			tdioProposal.setBranch_id(tdioHBAProposal.getBranch_id());
		}
		if (tdioHBAProposal.getBranch_name() != null) {
			tdioProposal.setBranch_name(tdioHBAProposal.getBranch_name());
		}
		if (tdioHBAProposal.getChallan_no() != null) {
			tdioProposal.setChallan_no(tdioHBAProposal.getChallan_no());
		}
		if (tdioHBAProposal.getChallan_dt() != null) {
			tdioProposal.setChallan_dt(tdioHBAProposal.getChallan_dt());
		}
		if (tdioHBAProposal.getChallan_amount() != 0) {
			tdioProposal.setChallan_amount(tdioHBAProposal.getChallan_amount());
		}
		if (tdioHBAProposal.getBtr5_receipt_no() != null) {
			tdioProposal.setBtr5_receipt_no(tdioHBAProposal.getBtr5_receipt_no());
		}
		if (tdioHBAProposal.getBtr5_receipt_dt() != null) {
			tdioProposal.setBtr5_receipt_dt(tdioHBAProposal.getBtr5_receipt_dt());
		}

		if (tdioHBAProposal.getPolicy_type_id() != 0) {
			tdioProposal.setPolicy_type_id(tdioHBAProposal.getPolicy_type_id());
		}

		if (tdioHBAProposal.getPolicy_no() != null) {
			tdioProposal.setPolicy_no(tdioHBAProposal.getPolicy_no());
		}

		if (tdioHBAProposal.getPolicy_genr_dt() != null) {
			tdioProposal.setPolicy_genr_dt(tdioHBAProposal.getPolicy_genr_dt());
		}

		if (tdioHBAProposal.getPolicy_genr_by() != null) {
			tdioProposal.setPolicy_genr_by(tdioHBAProposal.getPolicy_genr_by());
		}

		if (tdioHBAProposal.getPolicy_refference_no() != null) {
			tdioProposal.setPolicy_refference_no(tdioHBAProposal.getPolicy_refference_no());
		}

		if (tdioHBAProposal.getEndorsement_no() != null) {
			tdioProposal.setEndorsement_no(tdioHBAProposal.getEndorsement_no());
		}

		if (tdioHBAProposal.getPolicy_start_dt() != null) {
			tdioProposal.setPolicy_start_dt(tdioHBAProposal.getPolicy_start_dt());
		}
		if (tdioHBAProposal.getPolicy_end_dt() != null) {
			tdioProposal.setPolicy_end_dt(tdioHBAProposal.getPolicy_end_dt());
		}
		if (tdioHBAProposal.getPolicy_renew_dt() != null) {
			tdioProposal.setPolicy_renew_dt(tdioHBAProposal.getPolicy_renew_dt());
		}
		if (tdioHBAProposal.getRisk_covered_id() != 0) {
			tdioProposal.setRisk_covered_id(tdioHBAProposal.getRisk_covered_id());
		}
		if (tdioHBAProposal.getReference_no() != null) {
			tdioProposal.setReference_no(tdioHBAProposal.getReference_no());
		}
		if (tdioHBAProposal.getReference_dt() != null) {
			tdioProposal.setReference_dt(tdioHBAProposal.getReference_dt());
		}
		if (tdioHBAProposal.getActive_status() != 0) {
			tdioProposal.setActive_status(tdioHBAProposal.getActive_status());
		}
		if (tdioHBAProposal.getCreated_date() != null) {
			tdioProposal.setCreated_date(tdioHBAProposal.getCreated_date());
		}
		if (tdioHBAProposal.getCreated_by() != 0) {
			tdioProposal.setCreated_by(tdioHBAProposal.getCreated_by());
		}
		if (tdioHBAProposal.getCreated_by_post() != 0) {
			tdioProposal.setCreated_by_post(tdioHBAProposal.getCreated_by_post());
		}
		if (tdioHBAProposal.getUpdated_date() != null) {
			tdioProposal.setUpdated_date(tdioHBAProposal.getUpdated_date());
		}
		if (tdioHBAProposal.getUpdated_by() != 0) {
			tdioProposal.setUpdated_by(tdioHBAProposal.getUpdated_by());
		}

		if (tdioHBAProposal.getUpdated_by_post() != 0) {
			tdioProposal.setUpdated_by_post(tdioHBAProposal.getUpdated_by_post());
		}

		if (tdioHBAProposal.getIs_terrorism_aoc() != '0') {
			tdioProposal.setIs_terrorism_aoc(tdioHBAProposal.getIs_terrorism_aoc());
		}

		if (tdioHBAProposal.getTerror_ins_term() != 0) {
			tdioProposal.setTerror_ins_term(tdioHBAProposal.getTerror_ins_term());
		}

		if (tdioHBAProposal.getTerror_rate() != 0) {
			tdioProposal.setTerror_rate(tdioHBAProposal.getTerror_rate());
		}
		if (tdioHBAProposal.getTerror_ins_prem() != 0) {
			tdioProposal.setTerror_ins_prem(tdioHBAProposal.getTerror_ins_prem());
		}
		if (tdioHBAProposal.getIs_earthquake_aoc() != '0') {
			tdioProposal.setIs_earthquake_aoc(tdioHBAProposal.getIs_earthquake_aoc());
		}
		if (tdioHBAProposal.getEarth_sun_assurd() != 0) {
			tdioProposal.setEarth_sun_assurd(tdioHBAProposal.getEarth_sun_assurd());
		}
		if (tdioHBAProposal.getEarthq_ins_term() != 0) {
			tdioProposal.setEarthq_ins_term(tdioHBAProposal.getEarthq_ins_term());
		}
		if (tdioHBAProposal.getEarthq_rate() != 0) {
			tdioProposal.setEarthq_rate(tdioHBAProposal.getEarthq_rate());
		}
		if (tdioHBAProposal.getEarthq_ins_prem() != 0) {
			tdioProposal.setEarthq_ins_prem(tdioHBAProposal.getEarthq_ins_prem());
		}
		if (tdioHBAProposal.getOther_aoc_desc() != null) {
			tdioProposal.setOther_aoc_desc(tdioHBAProposal.getOther_aoc_desc());
		}
		if (tdioHBAProposal.getPremium_roi() != 0) {
			tdioProposal.setPremium_roi(tdioHBAProposal.getPremium_roi());
		}
		if (tdioHBAProposal.getPrem_disc_pc() != 0) {
			tdioProposal.setPrem_disc_pc(tdioHBAProposal.getPrem_disc_pc());
		}
		if (tdioHBAProposal.getPrem_disc_amt() != 0) {
			tdioProposal.setPrem_disc_amt(tdioHBAProposal.getPrem_disc_amt());
		}
		if (tdioHBAProposal.getLoading_chrg_amt() != 0) {
			tdioProposal.setLoading_chrg_amt(tdioHBAProposal.getLoading_chrg_amt());
		}
		if (tdioHBAProposal.getTot_addon_prem() != 0) {
			tdioProposal.setTot_addon_prem(tdioHBAProposal.getTot_addon_prem());
		}
		if (tdioHBAProposal.getTot_prem_amt() != 0) {
			tdioProposal.setTot_prem_amt(tdioHBAProposal.getTot_prem_amt());
		}
		if (tdioHBAProposal.getPrem_gst_pc() != 0) {
			tdioProposal.setPrem_gst_pc(tdioHBAProposal.getPrem_gst_pc());
		}
		if (tdioHBAProposal.getPrem_gst_amt() != 0) {
			tdioProposal.setPrem_gst_amt(tdioHBAProposal.getPrem_gst_amt());
		}
		if (tdioHBAProposal.getPayable_prem_amt() != 0) {
			tdioProposal.setPayable_prem_amt(tdioHBAProposal.getPayable_prem_amt());
		}

		TdioHBAProposal tdioHBAProposal1 = hBAProposalRepository.save(tdioHBAProposal);

		return tdioHBAProposal1;
	}

//
//	@Override
//	public String filterHbaProposal(Map<String, String> hbaProposalListing) {
//		String query = "SELECT * FROM TDOI_HBA_PROPOSAL i ";
//
//		for (Map.Entry<String, String> entry : hbaProposalListing.entrySet()) {
//			System.out.println(query);
//			query += (query.contains("WHERE"))
//					? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
//					: "WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
//			System.out.println(query);
//		}
//
//		return query;
//	}

	@Override
	public List<TdioHBAProposal> filterHbaProposal(Map<String, String> hbaProposalListing) {
		String query = "SELECT * FROM DOI.TDOI_HBA_PROPOSAL i ";

		for (Map.Entry<String, String> entry : hbaProposalListing.entrySet()) {
			query += (query.contains("WHERE"))
					? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
					: "WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
		}
		System.out.println(query);

		List<TdioHBAProposal> fetchedProposalEntry = new ArrayList<>();
		try {
			fetchedProposalEntry = jdbcTemplate.query(query, (rs, rowNum) -> new TdioHBAProposal(
					rs.getLong("HBA_PROPOSAL_ID"), rs.getLong("DPPF_TAKEN_LOAN"), rs.getString("LOAN_ACCOUNT_NO"),
					rs.getDouble("LOAN_AMOUNT"), rs.getString("EMPLOYEE_NO"), rs.getString("EMPLOYEE_NAME"),
					rs.getString("DESIGNATION"), rs.getString("OFFICE_NAME"), rs.getString("OFFICE_ADDRESS"),
					rs.getString("HOUSE_ADDRESS"), rs.getString("HOUSE_NO"), rs.getString("SURVEY_NO"),
					rs.getLong("DISTRICT_ID"), rs.getLong("TALUKA_ID"), rs.getLong("VILLAGE_ID"), rs.getLong("PINCODE"),
					rs.getLong("AADHAR_NUM"), rs.getLong("MOBILE_NUM"), rs.getLong("HOUSE_TYPE_ID"),
					rs.getLong("WALL_TYPE_ID"), rs.getLong("CEILING_TYPE_ID"), rs.getDouble("SUM_INSURED"),
					rs.getShort("TERM_INS_YRS"), rs.getDouble("INSRNC_PREMIUM"), rs.getLong("PAYMENT_MODE_ID"),
					rs.getString("CHEQUE_DD_NO"), rs.getDate("CHEQUE_DD_DT").toLocalDate(), rs.getLong("BANK_ID"),
					rs.getString("BANK_NAME"), rs.getLong("BRANCH_ID"), rs.getString("BRANCH_NAME"),
					rs.getString("CHALLAN_NO"), rs.getDate("CHALLAN_DT").toLocalDate(), rs.getDouble("CHALLAN_AMOUNT"),
					rs.getString("BTR5_RECEIPT_NO"), rs.getDate("BTR5_RECEIPT_DT").toLocalDate(),
					rs.getLong("POLICY_TYPE_ID"), rs.getString("POLICY_NO"), rs.getDate("POLICY_GENR_DT").toLocalDate(),
					rs.getString("POLICY_GENR_BY"), rs.getString("POLICY_REFRENCE_NO"), rs.getString("ENDORSEMENT_NO"),
					rs.getDate("POLICY_START_DT").toLocalDate(), rs.getDate("POLICY_END_DT").toLocalDate(),
					rs.getDate("POLICY_RENEW_DT").toLocalDate(), rs.getLong("RISK_COVERED_ID"),
					rs.getString("REFERENCE_NO"), rs.getTimestamp("REFERENCE_DT").toLocalDateTime(),
					rs.getShort("ACTIVE_STATUS"), rs.getTimestamp("CREATED_DATE").toLocalDateTime(),
					rs.getLong("CREATED_BY"), rs.getLong("CREATED_BY_POST"),
					rs.getTimestamp("UPDATED_DATE").toLocalDateTime(), rs.getLong("UPDATED_BY"),
					rs.getLong("UPDATED_BY_POST"), rs.getString("IS_TERRORISM_AOC").charAt(0),
					rs.getDouble("TERROR_SUM_ASSURD"), rs.getInt("TERROR_INS_TERM"), rs.getDouble("TERROR_RATE"),
					rs.getDouble("TERROR_INS_PREM"), rs.getString("IS_EARTHQUAKE_AOC").charAt(0),
					rs.getDouble("EARTHQ_SUM_ASSURD"), rs.getInt("EARTHQ_INS_TERM"), rs.getDouble("EARTHQ_RATE"),
					rs.getDouble("EARTHQ_INS_PREM"), rs.getString("OTHER_AOC_DESC"), rs.getDouble("PREMIUM_ROI"),
					rs.getDouble("PREM_DISC_PC"), rs.getDouble("PREM_DISC_AMT"), rs.getDouble("LOADING_CHRG_AMT"),
					rs.getDouble("TOT_ADDON_PREM"), rs.getDouble("TOT_PREM_AMT"), rs.getDouble("PREM_GST_PC"),
					rs.getDouble("PREM_GST_AMT"), rs.getDouble("PAYABLE_PREM_AMT")));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fetchedProposalEntry;
	}

}
