package com.gov.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HBA_policy_Proposal {
	private String dppf_taken_loan;
	private String loan_account_no;
	private Boolean loan_amount;
	private String employee_no;
	private String employee_name;
	private String designation;
	private String office_name;
	private String officer_address;
	private String house_address;
	private String house_no;
	private String survey_no;
	private String district_id;
	private String taluka_id;
	private String village_id;
	private String pincode;
	private String aadhar_num;
	private String mobile_num;
	private String house_type_id;
	private String wall_type_id;
	private String ceiling_type_id;
	private Boolean sum_insured;
	private Short teem_ins_yrs;
	private String insernc_premium;
	private String payment_mode_id;
	private String cheque_dd_no;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate cheque_dd_dt = LocalDate.now();
	private String bank_id;
	
	private String bank_name;
	
	private String branch_id;
	
	private String branch_name;
	
	private String challan_no;
	
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate challan_dt = LocalDate.now();

	
	private Boolean challan_amount;
	
	private String btr5_receipt_no;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate btr5_receipt_dt = LocalDate.now();

	private String policy_type_id;
	
	private String policy_no;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate policy_genr_dt = LocalDate.now();

	private String policy_genr_by;
	
	private String policy_refference_no;
	
	@Column(name = "ENDORSEMENT_NO")
	private String endorsement_no;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate policy_start_dt = LocalDate.now();

		
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate policy_end_dt = LocalDate.now();

		
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate policy_renew_dt = LocalDate.now();

	
	
	private String risk_covered_id;
	
	private String reference_no;
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime referance_dt = LocalDateTime.now();
	
	private Short active_status;
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime created_date = LocalDateTime.now();
	
	private String created_by;
	
	private String created_by_post;
	
	private LocalDateTime updated_date = LocalDateTime.now();
	
	
	private String updated_by;
	
	private String updated_by_post;

	public HBA_policy_Proposal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HBA_policy_Proposal(String dppf_taken_loan, String loan_account_no, Boolean loan_amount, String employee_no,
			String employee_name, String designation, String office_name, String officer_address, String house_address,
			String house_no, String survey_no, String district_id, String taluka_id, String village_id, String pincode,
			String aadhar_num, String mobile_num, String house_type_id, String wall_type_id, String ceiling_type_id,
			Boolean sum_insured, Short teem_ins_yrs, String insernc_premium, String payment_mode_id,
			String cheque_dd_no, LocalDate cheque_dd_dt, String bank_id, String bank_name, String branch_id,
			String branch_name, String challan_no, LocalDate challan_dt, Boolean challan_amount, String btr5_receipt_no,
			LocalDate btr5_receipt_dt, String policy_type_id, String policy_no, LocalDate policy_genr_dt,
			String policy_genr_by, String policy_refference_no, String endorsement_no, LocalDate policy_start_dt,
			LocalDate policy_end_dt, LocalDate policy_renew_dt, String risk_covered_id, String reference_no,
			LocalDateTime referance_dt, Short active_status, LocalDateTime created_date, String created_by,
			String created_by_post, LocalDateTime updated_date, String updated_by, String updated_by_post) {
		super();
		this.dppf_taken_loan = dppf_taken_loan;
		this.loan_account_no = loan_account_no;
		this.loan_amount = loan_amount;
		this.employee_no = employee_no;
		this.employee_name = employee_name;
		this.designation = designation;
		this.office_name = office_name;
		this.officer_address = officer_address;
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
		this.teem_ins_yrs = teem_ins_yrs;
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
		this.referance_dt = referance_dt;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
	}

	@Override
	public String toString() {
		return "HBA_policy_Proposal [dppf_taken_loan=" + dppf_taken_loan + ", loan_account_no=" + loan_account_no
				+ ", loan_amount=" + loan_amount + ", employee_no=" + employee_no + ", employee_name=" + employee_name
				+ ", designation=" + designation + ", office_name=" + office_name + ", officer_address="
				+ officer_address + ", house_address=" + house_address + ", house_no=" + house_no + ", survey_no="
				+ survey_no + ", district_id=" + district_id + ", taluka_id=" + taluka_id + ", village_id=" + village_id
				+ ", pincode=" + pincode + ", aadhar_num=" + aadhar_num + ", mobile_num=" + mobile_num
				+ ", house_type_id=" + house_type_id + ", wall_type_id=" + wall_type_id + ", ceiling_type_id="
				+ ceiling_type_id + ", sum_insured=" + sum_insured + ", teem_ins_yrs=" + teem_ins_yrs
				+ ", insernc_premium=" + insernc_premium + ", payment_mode_id=" + payment_mode_id + ", cheque_dd_no="
				+ cheque_dd_no + ", cheque_dd_dt=" + cheque_dd_dt + ", bank_id=" + bank_id + ", bank_name=" + bank_name
				+ ", branch_id=" + branch_id + ", branch_name=" + branch_name + ", challan_no=" + challan_no
				+ ", challan_dt=" + challan_dt + ", challan_amount=" + challan_amount + ", btr5_receipt_no="
				+ btr5_receipt_no + ", btr5_receipt_dt=" + btr5_receipt_dt + ", policy_type_id=" + policy_type_id
				+ ", policy_no=" + policy_no + ", policy_genr_dt=" + policy_genr_dt + ", policy_genr_by="
				+ policy_genr_by + ", policy_refference_no=" + policy_refference_no + ", endorsement_no="
				+ endorsement_no + ", policy_start_dt=" + policy_start_dt + ", policy_end_dt=" + policy_end_dt
				+ ", policy_renew_dt=" + policy_renew_dt + ", risk_covered_id=" + risk_covered_id + ", reference_no="
				+ reference_no + ", referance_dt=" + referance_dt + ", active_status=" + active_status
				+ ", created_date=" + created_date + ", created_by=" + created_by + ", created_by_post="
				+ created_by_post + ", updated_date=" + updated_date + ", updated_by=" + updated_by
				+ ", updated_by_post=" + updated_by_post + "]";
	}

	public String getDppf_taken_loan() {
		return dppf_taken_loan;
	}

	public void setDppf_taken_loan(String dppf_taken_loan) {
		this.dppf_taken_loan = dppf_taken_loan;
	}

	public String getLoan_account_no() {
		return loan_account_no;
	}

	public void setLoan_account_no(String loan_account_no) {
		this.loan_account_no = loan_account_no;
	}

	public Boolean getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(Boolean loan_amount) {
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

	public String getOfficer_address() {
		return officer_address;
	}

	public void setOfficer_address(String officer_address) {
		this.officer_address = officer_address;
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

	public String getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(String district_id) {
		this.district_id = district_id;
	}

	public String getTaluka_id() {
		return taluka_id;
	}

	public void setTaluka_id(String taluka_id) {
		this.taluka_id = taluka_id;
	}

	public String getVillage_id() {
		return village_id;
	}

	public void setVillage_id(String village_id) {
		this.village_id = village_id;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getAadhar_num() {
		return aadhar_num;
	}

	public void setAadhar_num(String aadhar_num) {
		this.aadhar_num = aadhar_num;
	}

	public String getMobile_num() {
		return mobile_num;
	}

	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}

	public String getHouse_type_id() {
		return house_type_id;
	}

	public void setHouse_type_id(String house_type_id) {
		this.house_type_id = house_type_id;
	}

	public String getWall_type_id() {
		return wall_type_id;
	}

	public void setWall_type_id(String wall_type_id) {
		this.wall_type_id = wall_type_id;
	}

	public String getCeiling_type_id() {
		return ceiling_type_id;
	}

	public void setCeiling_type_id(String ceiling_type_id) {
		this.ceiling_type_id = ceiling_type_id;
	}

	public Boolean getSum_insured() {
		return sum_insured;
	}

	public void setSum_insured(Boolean sum_insured) {
		this.sum_insured = sum_insured;
	}

	public Short getTeem_ins_yrs() {
		return teem_ins_yrs;
	}

	public void setTeem_ins_yrs(Short teem_ins_yrs) {
		this.teem_ins_yrs = teem_ins_yrs;
	}

	public String getInsernc_premium() {
		return insernc_premium;
	}

	public void setInsernc_premium(String insernc_premium) {
		this.insernc_premium = insernc_premium;
	}

	public String getPayment_mode_id() {
		return payment_mode_id;
	}

	public void setPayment_mode_id(String payment_mode_id) {
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

	public String getBank_id() {
		return bank_id;
	}

	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(String branch_id) {
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

	public Boolean getChallan_amount() {
		return challan_amount;
	}

	public void setChallan_amount(Boolean challan_amount) {
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

	public String getPolicy_type_id() {
		return policy_type_id;
	}

	public void setPolicy_type_id(String policy_type_id) {
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

	public String getRisk_covered_id() {
		return risk_covered_id;
	}

	public void setRisk_covered_id(String risk_covered_id) {
		this.risk_covered_id = risk_covered_id;
	}

	public String getReference_no() {
		return reference_no;
	}

	public void setReference_no(String reference_no) {
		this.reference_no = reference_no;
	}

	public LocalDateTime getReferance_dt() {
		return referance_dt;
	}

	public void setReferance_dt(LocalDateTime referance_dt) {
		this.referance_dt = referance_dt;
	}

	public Short getActive_status() {
		return active_status;
	}

	public void setActive_status(Short active_status) {
		this.active_status = active_status;
	}

	public LocalDateTime getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getCreated_by_post() {
		return created_by_post;
	}

	public void setCreated_by_post(String created_by_post) {
		this.created_by_post = created_by_post;
	}

	public LocalDateTime getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(LocalDateTime updated_date) {
		this.updated_date = updated_date;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public String getUpdated_by_post() {
		return updated_by_post;
	}

	public void setUpdated_by_post(String updated_by_post) {
		this.updated_by_post = updated_by_post;
	}
	

}
