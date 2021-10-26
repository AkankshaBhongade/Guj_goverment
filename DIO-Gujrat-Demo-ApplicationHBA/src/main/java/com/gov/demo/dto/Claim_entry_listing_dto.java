package com.gov.demo.dto;

public class Claim_entry_listing_dto {

	private String Claim_id;
	private String Policy_no;
	private String Employee_name;
	private String District;
	private String Taluka;
	private String Month;
	private String Year;
	

	public Claim_entry_listing_dto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Claim_entry_listing_dto(String claim_id, String policy_no, String employee_name, String district,
			String taluka, String month, String year) {
		super();
		Claim_id = claim_id;
		Policy_no = policy_no;
		Employee_name = employee_name;
		District = district;
		Taluka = taluka;
		Month = month;
		Year = year;
	}


	public String getClaim_id() {
		return Claim_id;
	}


	public void setClaim_id(String claim_id) {
		Claim_id = claim_id;
	}


	public String getPolicy_no() {
		return Policy_no;
	}


	public void setPolicy_no(String policy_no) {
		Policy_no = policy_no;
	}


	public String getEmployee_name() {
		return Employee_name;
	}


	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}


	public String getDistrict() {
		return District;
	}


	public void setDistrict(String district) {
		District = district;
	}


	public String getTaluka() {
		return Taluka;
	}


	public void setTaluka(String taluka) {
		Taluka = taluka;
	}


	public String getMonth() {
		return Month;
	}


	public void setMonth(String month) {
		Month = month;
	}


	public String getYear() {
		return Year;
	}


	public void setYear(String year) {
		Year = year;
	}
	
	
}
