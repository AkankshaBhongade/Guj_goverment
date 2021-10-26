package com.gov.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name = "TDOI_HBA_PROPOSAL",schema = "DOI")
public class TdioHBAProposal {
	
	@OneToMany(mappedBy = "hba_proposal_id")
	private Set<Tdoi_hba_Claim_Entry> hba_proposal = new HashSet<>();
	
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HBA_PROPOSAL_ID")
	private long hba_proposal_id;
	
	@NotNull
	@Column(name = "DPPF_TAKEN_LOAN")
	private long dppf_taken_loan;
	
	@NotNull
	@Column(name = "LOAN_ACCOUNT_NO")
	private String loan_account_no;
	
	@NotNull
	@Column(name = "LOAN_AMOUNT")
	private Double loan_amount;
	
	@Column(name = "EMPLOYEE_NO")
	private String employee_no ="xxxxx";
	
	@NotNull
	@Column(name = "EMPLOYEE_NAME")
	private String employee_name="xxxxx";
	
	@NotNull
	@Column(name = "DESIGNATION")
	private String designation ="xxxxx";
	
	@NotNull
	@Column(name = "OFFICE_NAME")
	private String office_name ="xxxxx";
	
	@NotNull
	@Size(min = 1, message = "officer address field cannot be empty")
	@Column(name = "OFFICE_ADDRESS")
	private String office_address ="xxxxx";
	
	@Column(name = "HOUSE_ADDRESS")
	private String house_address="xxxxx";
	
	@Column(name = "HOUSE_NO")
	private String house_no="xxxxx";
	
	@Column(name = "SURVEY_NO")
	private String survey_no="xxxxx";
	
	@Column(name = "DISTRICT_ID")
	private long district_id = 0;
	
	@Column(name = "TALUKA_ID")
	private long taluka_id = 0;
	
	@Column(name = "VILLAGE_ID")
	private long village_id = 0;
	
	@Column(name = "PINCODE")
	private long pincode = 0;
		
	@Column(name = "AADHAR_NUM")
	private long aadhar_num = 0;
	
	@Column(name = "MOBILE_NUM")
	private long mobile_num = 0;
	
	@Column(name = "HOUSE_TYPE_ID")
	private long house_type_id = 0;
	
	@Column(name = "WALL_TYPE_ID")
	private long wall_type_id = 0;
	
	@Column(name = "CEILING_TYPE_ID")
	private long ceiling_type_id = 0;
	
	@Column(name = "SUM_INSURED")
	private double sum_insured = 0.0;
	
	@Column(name = "TERM_INS_YRS")
	private Short term_ins_yrs = 0;
	
	@Column(name = "INSRNC_PREMIUM")
	private double insernc_premium = 0.0;
	
	@Column(name = "PAYMENT_MODE_ID")
	private long payment_mode_id = 0;
	
	@Column(name = "CHEQUE_DD_NO")
	private String cheque_dd_no="xxxxx";

	@Column(name = "CHEQUE_DD_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate cheque_dd_dt = LocalDate.now();

	@Column(name = "BANK_ID")
	private long bank_id = 0;
	
	@Column(name = "BANK_NAME")
	private String bank_name ="xxxxx";
	
	@Column(name = "BRANCH_ID")
	private long branch_id = 0;
	
	@Column(name = "BRANCH_NAME")
	private String branch_name="xxxxx";
	
	@Column(name = "CHALLAN_NO")
	private String challan_no="xxxxx";

	@NotNull
	@Column(name = "CHALLAN_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate challan_dt = LocalDate.now();

	
	@Column(name = "CHALLAN_AMOUNT")
	private double challan_amount = 0.0;
	
	@Column(name = "BTR5_RECEIPT_NO")
	private String btr5_receipt_no="xxxxx";
	
	
	@Column(name = "BTR5_RECEIPT_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate btr5_receipt_dt = LocalDate.now();

	@Column(name = "POLICY_TYPE_ID")
	private long policy_type_id = 0;
	
	@Column(name = "POLICY_NO")
	private String policy_no="xxxxx";

	@NotNull
	@Column(name = "POLICY_GENR_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate policy_genr_dt = LocalDate.now();

	@Column(name = "POLICY_GENR_BY")
	private String policy_genr_by="xxxxx";
	
	@Column(name = "POLICY_REFRENCE_NO")
	private String policy_refference_no="xxxxx";
	
	@Column(name = "ENDORSEMENT_NO")
	private String endorsement_no="xxxxx";
		
	
	@Column(name = "POLICY_START_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate policy_start_dt = LocalDate.now();

		
	@Column(name = "POLICY_END_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate policy_end_dt = LocalDate.now();


	@Column(name = "POLICY_RENEW_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate policy_renew_dt = LocalDate.now();

	@Column(name = "RISK_COVERED_ID")
	private long risk_covered_id = 0;
	
	@Column(name = "REFERENCE_NO")
	private String reference_no="xxxxx";
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@Column(name = "REFERENCE_DT")
	private LocalDateTime reference_dt=LocalDateTime.now();
	
	@NotNull
	@Column(name = "ACTIVE_STATUS")
	private short active_status= 0;
	
	@NotNull
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@Column(name = "CREATED_DATE")
	private LocalDateTime  created_date=LocalDateTime.now();
	
	@NotNull
	@Column(name = "CREATED_BY")
	private long created_by = 0;
	
	@NotNull
	@Column(name = "CREATED_BY_POST")
	private long created_by_post = 0;
	
	@NotNull
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@Column(name = "UPDATED_DATE")
	private LocalDateTime updated_date=LocalDateTime.now();
	
	@NotNull
	@Column(name = "UPDATED_BY")
	private long updated_by = 0;
	
	@NotNull
	@Column(name = "UPDATED_BY_POST")
	private long updated_by_post = 0;
	
	@Column(name = "IS_TERRORISM_AOC")
	private char is_terrorism_aoc ='x';
	
	@Column(name = "TERROR_SUM_ASSURD")
	private double terror_sum_assurd = 0.0;
	
	@Column(name = "TERROR_INS_TERM")
	private int terror_ins_term = 0;
	
	@Column(name = "TERROR_RATE")
	private double terror_rate = 0.0;
	
	@Column(name = "TERROR_INS_PREM")
	private double terror_ins_prem = 0.0;
	
	@Column(name = "IS_EARTHQUAKE_AOC")
	private char is_earthquake_aoc='x';
	
	@Column(name = "EARTHQ_SUM_ASSURD")
	private double earth_sun_assurd = 0.0;
	
	@Column(name = "EARTHQ_INS_TERM")
	private int earthq_ins_term = 0;
	
	@Column(name = "EARTHQ_RATE")
	private double earthq_rate = 0.0;
	
	@Column(name = "EARTHQ_INS_PREM")
	private double earthq_ins_prem = 0.0;
	
	@Column(name = "OTHER_AOC_DESC")
	private String other_aoc_desc="xxxxx";
	
	@Column(name = "PREMIUM_ROI")
	private double premium_roi= 0.0;
	
	@Column(name = "PREM_DISC_PC")
	private double prem_disc_pc = 0.0;
	
	@Column(name = "PREM_DISC_AMT")
	private double prem_disc_amt = 0.0;
	
	@Column(name = "LOADING_CHRG_AMT")
	private double loading_chrg_amt = 0.0;
	
	@Column(name = "TOT_ADDON_PREM")
	private double tot_addon_prem = 0.0;
	
	@Column(name = "TOT_PREM_AMT")
	private double tot_prem_amt = 0.0;
	
	@Column(name = "PREM_GST_PC")
	private double prem_gst_pc = 0.0;
	
	@Column(name = "PREM_GST_AMT")
	private double prem_gst_amt = 0.0;
	
	@Column(name = "PAYABLE_PREM_AMT")
	private double payable_prem_amt = 0.0;

	public TdioHBAProposal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TdioHBAProposal(long hba_proposal_id, long dppf_taken_loan, String loan_account_no, Double loan_amount,
			String employee_no, String employee_name, String designation, String office_name, String officer_address,
			String house_address, String house_no, String survey_no, long district_id, long taluka_id, long village_id,
			long pincode, long aadhar_num, long mobile_num, long house_type_id, long wall_type_id, long ceiling_type_id,
			double sum_insured, Short teem_ins_yrs, double insernc_premium, long payment_mode_id, String cheque_dd_no,
			LocalDate cheque_dd_dt, long bank_id, String bank_name, long branch_id, String branch_name,
			String challan_no, LocalDate challan_dt, double challan_amount, String btr5_receipt_no,
			LocalDate btr5_receipt_dt, long policy_type_id, String policy_no, LocalDate policy_genr_dt,
			String policy_genr_by, String policy_refference_no, String endorsement_no, LocalDate policy_start_dt,
			LocalDate policy_end_dt, LocalDate policy_renew_dt, long risk_covered_id, String reference_no,
			LocalDateTime reference_dt, short active_status, LocalDateTime created_date, long created_by,
			long created_by_post, LocalDateTime updated_date, long updated_by, long updated_by_post,
			char is_terrorism_aoc, double terror_sum_assurd, int terror_ins_term, double terror_rate,
			double terror_ins_prem, char is_earthquake_aoc, double earth_sun_assurd, int earthq_ins_term,
			double earthq_rate, double earthq_ins_prem, String other_aoc_desc, double premium_roi, double prem_disc_pc,
			double prem_disc_amt, double loading_chrg_amt, double tot_addon_prem, double tot_prem_amt,
			double prem_gst_pc, double prem_gst_amt, double payable_prem_amt) {
		super();
		this.hba_proposal_id = hba_proposal_id;
		this.dppf_taken_loan = dppf_taken_loan;
		this.loan_account_no = loan_account_no;
		this.loan_amount = loan_amount;
		this.employee_no = employee_no;
		this.employee_name = employee_name;
		this.designation = designation;
		this.office_name = office_name;
		this.office_address = office_address;
		this.house_address = house_address;
		this.house_no = house_no;
		this.survey_no = survey_no;
		this.district_id = district_id;
		this.taluka_id = taluka_id;
		this.village_id = village_id;
		this.pincode = pincode;
		this.aadhar_num = aadhar_num;
		this.mobile_num = mobile_num;
		this.house_type_id = house_type_id;
		this.wall_type_id = wall_type_id;
		this.ceiling_type_id = ceiling_type_id;
		this.sum_insured = sum_insured;
		this.term_ins_yrs = term_ins_yrs;
		this.insernc_premium = insernc_premium;
		this.payment_mode_id = payment_mode_id;
		this.cheque_dd_no = cheque_dd_no;
		this.cheque_dd_dt = cheque_dd_dt;
		this.bank_id = bank_id;
		this.bank_name = bank_name;
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.challan_no = challan_no;
		this.challan_dt = challan_dt;
		this.challan_amount = challan_amount;
		this.btr5_receipt_no = btr5_receipt_no;
		this.btr5_receipt_dt = btr5_receipt_dt;
		this.policy_type_id = policy_type_id;
		this.policy_no = policy_no;
		this.policy_genr_dt = policy_genr_dt;
		this.policy_genr_by = policy_genr_by;
		this.policy_refference_no = policy_refference_no;
		this.endorsement_no = endorsement_no;
		this.policy_start_dt = policy_start_dt;
		this.policy_end_dt = policy_end_dt;
		this.policy_renew_dt = policy_renew_dt;
		this.risk_covered_id = risk_covered_id;
		this.reference_no = reference_no;
		this.reference_dt = reference_dt;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
		this.is_terrorism_aoc = is_terrorism_aoc;
		this.terror_sum_assurd = terror_sum_assurd;
		this.terror_ins_term = terror_ins_term;
		this.terror_rate = terror_rate;
		this.terror_ins_prem = terror_ins_prem;
		this.is_earthquake_aoc = is_earthquake_aoc;
		this.earth_sun_assurd = earth_sun_assurd;
		this.earthq_ins_term = earthq_ins_term;
		this.earthq_rate = earthq_rate;
		this.earthq_ins_prem = earthq_ins_prem;
		this.other_aoc_desc = other_aoc_desc;
		this.premium_roi = premium_roi;
		this.prem_disc_pc = prem_disc_pc;
		this.prem_disc_amt = prem_disc_amt;
		this.loading_chrg_amt = loading_chrg_amt;
		this.tot_addon_prem = tot_addon_prem;
		this.tot_prem_amt = tot_prem_amt;
		this.prem_gst_pc = prem_gst_pc;
		this.prem_gst_amt = prem_gst_amt;
		this.payable_prem_amt = payable_prem_amt;
	}

	

	@Override
	public String toString() {
		return "TdioHBAProposal [hba_proposal=" + hba_proposal + ", hba_proposal_id=" + hba_proposal_id
				+ ", dppf_taken_loan=" + dppf_taken_loan + ", loan_account_no=" + loan_account_no + ", loan_amount="
				+ loan_amount + ", employee_no=" + employee_no + ", employee_name=" + employee_name + ", designation="
				+ designation + ", office_name=" + office_name + ", officer_address=" + office_address
				+ ", house_address=" + house_address + ", house_no=" + house_no + ", survey_no=" + survey_no
				+ ", district_id=" + district_id + ", taluka_id=" + taluka_id + ", village_id=" + village_id
				+ ", pincode=" + pincode + ", aadhar_num=" + aadhar_num + ", mobile_num=" + mobile_num
				+ ", house_type_id=" + house_type_id + ", wall_type_id=" + wall_type_id + ", ceiling_type_id="
				+ ceiling_type_id + ", sum_insured=" + sum_insured + ", teem_ins_yrs=" + term_ins_yrs
				+ ", insernc_premium=" + insernc_premium + ", payment_mode_id=" + payment_mode_id + ", cheque_dd_no="
				+ cheque_dd_no + ", cheque_dd_dt=" + cheque_dd_dt + ", bank_id=" + bank_id + ", bank_name=" + bank_name
				+ ", branch_id=" + branch_id + ", branch_name=" + branch_name + ", challan_no=" + challan_no
				+ ", challan_dt=" + challan_dt + ", challan_amount=" + challan_amount + ", btr5_receipt_no="
				+ btr5_receipt_no + ", btr5_receipt_dt=" + btr5_receipt_dt + ", policy_type_id=" + policy_type_id
				+ ", policy_no=" + policy_no + ", policy_genr_dt=" + policy_genr_dt + ", policy_genr_by="
				+ policy_genr_by + ", policy_refference_no=" + policy_refference_no + ", endorsement_no="
				+ endorsement_no + ", policy_start_dt=" + policy_start_dt + ", policy_end_dt=" + policy_end_dt
				+ ", policy_renew_dt=" + policy_renew_dt + ", risk_covered_id=" + risk_covered_id + ", reference_no="
				+ reference_no + ", reference_dt=" + reference_dt + ", active_status=" + active_status
				+ ", created_date=" + created_date + ", created_by=" + created_by + ", created_by_post="
				+ created_by_post + ", updated_date=" + updated_date + ", updated_by=" + updated_by
				+ ", updated_by_post=" + updated_by_post + ", is_terrorism_aoc=" + is_terrorism_aoc
				+ ", terror_sum_assurd=" + terror_sum_assurd + ", terror_ins_term=" + terror_ins_term + ", terror_rate="
				+ terror_rate + ", terror_ins_prem=" + terror_ins_prem + ", is_earthquake_aoc=" + is_earthquake_aoc
				+ ", earth_sun_assurd=" + earth_sun_assurd + ", earthq_ins_term=" + earthq_ins_term + ", earthq_rate="
				+ earthq_rate + ", earthq_ins_prem=" + earthq_ins_prem + ", other_aoc_desc=" + other_aoc_desc
				+ ", premium_roi=" + premium_roi + ", prem_disc_pc=" + prem_disc_pc + ", prem_disc_amt=" + prem_disc_amt
				+ ", loading_chrg_amt=" + loading_chrg_amt + ", tot_addon_prem=" + tot_addon_prem + ", tot_prem_amt="
				+ tot_prem_amt + ", prem_gst_pc=" + prem_gst_pc + ", prem_gst_amt=" + prem_gst_amt
				+ ", payable_prem_amt=" + payable_prem_amt + "]";
	}

	public long getHba_proposal_id() {
		return hba_proposal_id;
	}

	public void setHba_proposal_id(long hba_proposal_id) {
		this.hba_proposal_id = hba_proposal_id;
	}

	public long getDppf_taken_loan() {
		return dppf_taken_loan;
	}

	public void setDppf_taken_loan(long dppf_taken_loan) {
		this.dppf_taken_loan = dppf_taken_loan;
	}

	public String getLoan_account_no() {
		return loan_account_no;
	}

	public void setLoan_account_no(String loan_account_no) {
		this.loan_account_no = loan_account_no;
	}

	public Double getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(Double loan_amount) {
		this.loan_amount = loan_amount;
	}

	public String getEmployee_no() {
		return employee_no;
	}

	public void setEmployee_no(String employee_no) {
		this.employee_no = employee_no;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getOffice_name() {
		return office_name;
	}

	public void setOffice_name(String office_name) {
		this.office_name = office_name;
	}

	public String getOffice_address() {
		return office_address;
	}

	public void setOffice_address(String officer_address) {
		this.office_address = officer_address;
	}

	public String getHouse_address() {
		return house_address;
	}

	public void setHouse_address(String house_address) {
		this.house_address = house_address;
	}

	public String getHouse_no() {
		return house_no;
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	public String getSurvey_no() {
		return survey_no;
	}

	public void setSurvey_no(String survey_no) {
		this.survey_no = survey_no;
	}

	public long getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(long district_id) {
		this.district_id = district_id;
	}

	public long getTaluka_id() {
		return taluka_id;
	}

	public void setTaluka_id(long taluka_id) {
		this.taluka_id = taluka_id;
	}

	public long getVillage_id() {
		return village_id;
	}

	public void setVillage_id(long village_id) {
		this.village_id = village_id;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public long getAadhar_num() {
		return aadhar_num;
	}

	public void setAadhar_num(long aadhar_num) {
		this.aadhar_num = aadhar_num;
	}

	public long getMobile_num() {
		return mobile_num;
	}

	public void setMobile_num(long mobile_num) {
		this.mobile_num = mobile_num;
	}

	public long getHouse_type_id() {
		return house_type_id;
	}

	public void setHouse_type_id(long house_type_id) {
		this.house_type_id = house_type_id;
	}

	public long getWall_type_id() {
		return wall_type_id;
	}

	public void setWall_type_id(long wall_type_id) {
		this.wall_type_id = wall_type_id;
	}

	public long getCeiling_type_id() {
		return ceiling_type_id;
	}

	public void setCeiling_type_id(long ceiling_type_id) {
		this.ceiling_type_id = ceiling_type_id;
	}

	public double getSum_insured() {
		return sum_insured;
	}

	public void setSum_insured(double sum_insured) {
		this.sum_insured = sum_insured;
	}

	public Short getTeem_ins_yrs() {
		return term_ins_yrs;
	}

	public void setTeem_ins_yrs(Short teem_ins_yrs) {
		this.term_ins_yrs = teem_ins_yrs;
	}

	public double getInsernc_premium() {
		return insernc_premium;
	}

	public void setInsernc_premium(double insernc_premium) {
		this.insernc_premium = insernc_premium;
	}

	public long getPayment_mode_id() {
		return payment_mode_id;
	}

	public void setPayment_mode_id(long payment_mode_id) {
		this.payment_mode_id = payment_mode_id;
	}

	public String getCheque_dd_no() {
		return cheque_dd_no;
	}

	public void setCheque_dd_no(String cheque_dd_no) {
		this.cheque_dd_no = cheque_dd_no;
	}

	public LocalDate getCheque_dd_dt() {
		return cheque_dd_dt;
	}

	public void setCheque_dd_dt(LocalDate cheque_dd_dt) {
		this.cheque_dd_dt = cheque_dd_dt;
	}

	public long getBank_id() {
		return bank_id;
	}

	public void setBank_id(long bank_id) {
		this.bank_id = bank_id;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public long getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(long branch_id) {
		this.branch_id = branch_id;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getChallan_no() {
		return challan_no;
	}

	public void setChallan_no(String challan_no) {
		this.challan_no = challan_no;
	}

	public LocalDate getChallan_dt() {
		return challan_dt;
	}

	public void setChallan_dt(LocalDate challan_dt) {
		this.challan_dt = challan_dt;
	}

	public double getChallan_amount() {
		return challan_amount;
	}

	public void setChallan_amount(double challan_amount) {
		this.challan_amount = challan_amount;
	}

	public String getBtr5_receipt_no() {
		return btr5_receipt_no;
	}

	public void setBtr5_receipt_no(String btr5_receipt_no) {
		this.btr5_receipt_no = btr5_receipt_no;
	}

	public LocalDate getBtr5_receipt_dt() {
		return btr5_receipt_dt;
	}

	public void setBtr5_receipt_dt(LocalDate btr5_receipt_dt) {
		this.btr5_receipt_dt = btr5_receipt_dt;
	}

	public long getPolicy_type_id() {
		return policy_type_id;
	}

	public void setPolicy_type_id(long policy_type_id) {
		this.policy_type_id = policy_type_id;
	}

	public String getPolicy_no() {
		return policy_no;
	}

	public void setPolicy_no(String policy_no) {
		this.policy_no = policy_no;
	}

	public LocalDate getPolicy_genr_dt() {
		return policy_genr_dt;
	}

	public void setPolicy_genr_dt(LocalDate policy_genr_dt) {
		this.policy_genr_dt = policy_genr_dt;
	}

	public String getPolicy_genr_by() {
		return policy_genr_by;
	}

	public void setPolicy_genr_by(String policy_genr_by) {
		this.policy_genr_by = policy_genr_by;
	}

	public String getPolicy_refference_no() {
		return policy_refference_no;
	}

	public void setPolicy_refference_no(String policy_refference_no) {
		this.policy_refference_no = policy_refference_no;
	}

	public String getEndorsement_no() {
		return endorsement_no;
	}

	public void setEndorsement_no(String endorsement_no) {
		this.endorsement_no = endorsement_no;
	}

	public LocalDate getPolicy_start_dt() {
		return policy_start_dt;
	}

	public void setPolicy_start_dt(LocalDate policy_start_dt) {
		this.policy_start_dt = policy_start_dt;
	}

	public LocalDate getPolicy_end_dt() {
		return policy_end_dt;
	}

	public void setPolicy_end_dt(LocalDate policy_end_dt) {
		this.policy_end_dt = policy_end_dt;
	}

	public LocalDate getPolicy_renew_dt() {
		return policy_renew_dt;
	}

	public void setPolicy_renew_dt(LocalDate policy_renew_dt) {
		this.policy_renew_dt = policy_renew_dt;
	}

	public long getRisk_covered_id() {
		return risk_covered_id;
	}

	public void setRisk_covered_id(long risk_covered_id) {
		this.risk_covered_id = risk_covered_id;
	}

	public String getReference_no() {
		return reference_no;
	}

	public void setReference_no(String reference_no) {
		this.reference_no = reference_no;
	}

	public LocalDateTime getReference_dt() {
		return reference_dt;
	}

	public void setReference_dt(LocalDateTime reference_dt) {
		this.reference_dt = reference_dt;
	}

	public short getActive_status() {
		return active_status;
	}

	public void setActive_status(short active_status) {
		this.active_status = active_status;
	}

	public LocalDateTime getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}

	public long getCreated_by() {
		return created_by;
	}

	public void setCreated_by(long created_by) {
		this.created_by = created_by;
	}

	public long getCreated_by_post() {
		return created_by_post;
	}

	public void setCreated_by_post(long created_by_post) {
		this.created_by_post = created_by_post;
	}

	public LocalDateTime getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(LocalDateTime updated_date) {
		this.updated_date = updated_date;
	}

	public long getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(long updated_by) {
		this.updated_by = updated_by;
	}

	public long getUpdated_by_post() {
		return updated_by_post;
	}

	public void setUpdated_by_post(long updated_by_post) {
		this.updated_by_post = updated_by_post;
	}

	public char getIs_terrorism_aoc() {
		return is_terrorism_aoc;
	}

	public void setIs_terrorism_aoc(char is_terrorism_aoc) {
		this.is_terrorism_aoc = is_terrorism_aoc;
	}

	public double getTerror_sum_assurd() {
		return terror_sum_assurd;
	}

	public void setTerror_sum_assurd(double terror_sum_assurd) {
		this.terror_sum_assurd = terror_sum_assurd;
	}

	public int getTerror_ins_term() {
		return terror_ins_term;
	}

	public void setTerror_ins_term(int terror_ins_term) {
		this.terror_ins_term = terror_ins_term;
	}

	public double getTerror_rate() {
		return terror_rate;
	}

	public void setTerror_rate(double terror_rate) {
		this.terror_rate = terror_rate;
	}

	public double getTerror_ins_prem() {
		return terror_ins_prem;
	}

	public void setTerror_ins_prem(double terror_ins_prem) {
		this.terror_ins_prem = terror_ins_prem;
	}

	public char getIs_earthquake_aoc() {
		return is_earthquake_aoc;
	}

	public void setIs_earthquake_aoc(char is_earthquake_aoc) {
		this.is_earthquake_aoc = is_earthquake_aoc;
	}

	public double getEarth_sun_assurd() {
		return earth_sun_assurd;
	}

	public void setEarth_sun_assurd(double earth_sun_assurd) {
		this.earth_sun_assurd = earth_sun_assurd;
	}

	public int getEarthq_ins_term() {
		return earthq_ins_term;
	}

	public void setEarthq_ins_term(int earthq_ins_term) {
		this.earthq_ins_term = earthq_ins_term;
	}

	public double getEarthq_rate() {
		return earthq_rate;
	}

	public void setEarthq_rate(double earthq_rate) {
		this.earthq_rate = earthq_rate;
	}

	public double getEarthq_ins_prem() {
		return earthq_ins_prem;
	}

	public void setEarthq_ins_prem(double earthq_ins_prem) {
		this.earthq_ins_prem = earthq_ins_prem;
	}

	public String getOther_aoc_desc() {
		return other_aoc_desc;
	}

	public void setOther_aoc_desc(String other_aoc_desc) {
		this.other_aoc_desc = other_aoc_desc;
	}

	public double getPremium_roi() {
		return premium_roi;
	}

	public void setPremium_roi(double premium_roi) {
		this.premium_roi = premium_roi;
	}

	public double getPrem_disc_pc() {
		return prem_disc_pc;
	}

	public void setPrem_disc_pc(double prem_disc_pc) {
		this.prem_disc_pc = prem_disc_pc;
	}

	public double getPrem_disc_amt() {
		return prem_disc_amt;
	}

	public void setPrem_disc_amt(double prem_disc_amt) {
		this.prem_disc_amt = prem_disc_amt;
	}

	public double getLoading_chrg_amt() {
		return loading_chrg_amt;
	}

	public void setLoading_chrg_amt(double loading_chrg_amt) {
		this.loading_chrg_amt = loading_chrg_amt;
	}

	public double getTot_addon_prem() {
		return tot_addon_prem;
	}

	public void setTot_addon_prem(double tot_addon_prem) {
		this.tot_addon_prem = tot_addon_prem;
	}

	public double getTot_prem_amt() {
		return tot_prem_amt;
	}

	public void setTot_prem_amt(double tot_prem_amt) {
		this.tot_prem_amt = tot_prem_amt;
	}

	public double getPrem_gst_pc() {
		return prem_gst_pc;
	}

	public void setPrem_gst_pc(double prem_gst_pc) {
		this.prem_gst_pc = prem_gst_pc;
	}

	public double getPrem_gst_amt() {
		return prem_gst_amt;
	}

	public void setPrem_gst_amt(double prem_gst_amt) {
		this.prem_gst_amt = prem_gst_amt;
	}

	public double getPayable_prem_amt() {
		return payable_prem_amt;
	}

	public void setPayable_prem_amt(double payable_prem_amt) {
		this.payable_prem_amt = payable_prem_amt;
	}

	
	
}
