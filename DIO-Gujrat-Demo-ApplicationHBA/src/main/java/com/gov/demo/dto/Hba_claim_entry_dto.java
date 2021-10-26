package com.gov.demo.dto;

import java.time.LocalDate;

public class Hba_claim_entry_dto {
	private String Claim_id;
	private LocalDate Claim_date;
	private String Claim_no;
	private String Inward_no;
	private LocalDate Inward_date;
	private String Policy_no;
	private LocalDate Policy_start_date;
	private LocalDate Policy_end_date;
	private String	Sum_insured;

	private String	Name;
	private String	Address;
	private String	Aadhar_card_no;
	private String	Mobile_no;
	private String	Email_iD;

	private String	Any_other_company_insurance;

	private LocalDate Date_of_loss;
	private LocalDate	Time ;//(HH:MM)
	private String	Cause_of_loss;
	private String	Extend_of_loss_or_damage;
	private String	Ite_no_of_Policy;
	private String	Item_affected ;
	private String	Actual_value;
	private String	Value_at_the_time_of_loss;
	private String	Deduction_for_value_of_salvage;
	private String	Amount_claim;
	private String	Action;

	private String	Surveyor_name;
	private String	Approved_claim_amount;
	public Hba_claim_entry_dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hba_claim_entry_dto(String claim_id, LocalDate claim_date, String claim_no, String inward_no,
			LocalDate inward_date, String policy_no, LocalDate policy_start_date, LocalDate policy_end_date,
			String sum_insured, String name, String address, String aadhar_card_no, String mobile_no, String email_iD,
			String any_other_company_insurance, LocalDate date_of_loss, LocalDate time, String cause_of_loss,
			String extend_of_loss_or_damage, String ite_no_of_Policy, String item_affected, String actual_value,
			String value_at_the_time_of_loss, String deduction_for_value_of_salvage, String amount_claim, String action,
			String surveyor_name, String approved_claim_amount) {
		super();
		Claim_id = claim_id;
		Claim_date = claim_date;
		Claim_no = claim_no;
		Inward_no = inward_no;
		Inward_date = inward_date;
		Policy_no = policy_no;
		Policy_start_date = policy_start_date;
		Policy_end_date = policy_end_date;
		Sum_insured = sum_insured;
		Name = name;
		Address = address;
		Aadhar_card_no = aadhar_card_no;
		Mobile_no = mobile_no;
		Email_iD = email_iD;
		Any_other_company_insurance = any_other_company_insurance;
		Date_of_loss = date_of_loss;
		Time = time;
		Cause_of_loss = cause_of_loss;
		Extend_of_loss_or_damage = extend_of_loss_or_damage;
		Ite_no_of_Policy = ite_no_of_Policy;
		Item_affected = item_affected;
		Actual_value = actual_value;
		Value_at_the_time_of_loss = value_at_the_time_of_loss;
		Deduction_for_value_of_salvage = deduction_for_value_of_salvage;
		Amount_claim = amount_claim;
		Action = action;
		Surveyor_name = surveyor_name;
		Approved_claim_amount = approved_claim_amount;
	}
	public String getClaim_id() {
		return Claim_id;
	}
	public void setClaim_id(String claim_id) {
		Claim_id = claim_id;
	}
	public LocalDate getClaim_date() {
		return Claim_date;
	}
	public void setClaim_date(LocalDate claim_date) {
		Claim_date = claim_date;
	}
	public String getClaim_no() {
		return Claim_no;
	}
	public void setClaim_no(String claim_no) {
		Claim_no = claim_no;
	}
	public String getInward_no() {
		return Inward_no;
	}
	public void setInward_no(String inward_no) {
		Inward_no = inward_no;
	}
	public LocalDate getInward_date() {
		return Inward_date;
	}
	public void setInward_date(LocalDate inward_date) {
		Inward_date = inward_date;
	}
	public String getPolicy_no() {
		return Policy_no;
	}
	public void setPolicy_no(String policy_no) {
		Policy_no = policy_no;
	}
	public LocalDate getPolicy_start_date() {
		return Policy_start_date;
	}
	public void setPolicy_start_date(LocalDate policy_start_date) {
		Policy_start_date = policy_start_date;
	}
	public LocalDate getPolicy_end_date() {
		return Policy_end_date;
	}
	public void setPolicy_end_date(LocalDate policy_end_date) {
		Policy_end_date = policy_end_date;
	}
	public String getSum_insured() {
		return Sum_insured;
	}
	public void setSum_insured(String sum_insured) {
		Sum_insured = sum_insured;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getAadhar_card_no() {
		return Aadhar_card_no;
	}
	public void setAadhar_card_no(String aadhar_card_no) {
		Aadhar_card_no = aadhar_card_no;
	}
	public String getMobile_no() {
		return Mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		Mobile_no = mobile_no;
	}
	public String getEmail_iD() {
		return Email_iD;
	}
	public void setEmail_iD(String email_iD) {
		Email_iD = email_iD;
	}
	public String getAny_other_company_insurance() {
		return Any_other_company_insurance;
	}
	public void setAny_other_company_insurance(String any_other_company_insurance) {
		Any_other_company_insurance = any_other_company_insurance;
	}
	public LocalDate getDate_of_loss() {
		return Date_of_loss;
	}
	public void setDate_of_loss(LocalDate date_of_loss) {
		Date_of_loss = date_of_loss;
	}
	public LocalDate getTime() {
		return Time;
	}
	public void setTime(LocalDate time) {
		Time = time;
	}
	public String getCause_of_loss() {
		return Cause_of_loss;
	}
	public void setCause_of_loss(String cause_of_loss) {
		Cause_of_loss = cause_of_loss;
	}
	public String getExtend_of_loss_or_damage() {
		return Extend_of_loss_or_damage;
	}
	public void setExtend_of_loss_or_damage(String extend_of_loss_or_damage) {
		Extend_of_loss_or_damage = extend_of_loss_or_damage;
	}
	public String getIte_no_of_Policy() {
		return Ite_no_of_Policy;
	}
	public void setIte_no_of_Policy(String ite_no_of_Policy) {
		Ite_no_of_Policy = ite_no_of_Policy;
	}
	public String getItem_affected() {
		return Item_affected;
	}
	public void setItem_affected(String item_affected) {
		Item_affected = item_affected;
	}
	public String getActual_value() {
		return Actual_value;
	}
	public void setActual_value(String actual_value) {
		Actual_value = actual_value;
	}
	public String getValue_at_the_time_of_loss() {
		return Value_at_the_time_of_loss;
	}
	public void setValue_at_the_time_of_loss(String value_at_the_time_of_loss) {
		Value_at_the_time_of_loss = value_at_the_time_of_loss;
	}
	public String getDeduction_for_value_of_salvage() {
		return Deduction_for_value_of_salvage;
	}
	public void setDeduction_for_value_of_salvage(String deduction_for_value_of_salvage) {
		Deduction_for_value_of_salvage = deduction_for_value_of_salvage;
	}
	public String getAmount_claim() {
		return Amount_claim;
	}
	public void setAmount_claim(String amount_claim) {
		Amount_claim = amount_claim;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	public String getSurveyor_name() {
		return Surveyor_name;
	}
	public void setSurveyor_name(String surveyor_name) {
		Surveyor_name = surveyor_name;
	}
	public String getApproved_claim_amount() {
		return Approved_claim_amount;
	}
	public void setApproved_claim_amount(String approved_claim_amount) {
		Approved_claim_amount = approved_claim_amount;
	}


	
}
