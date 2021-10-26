package com.gov.demo.dto;

public class PolicyMasterListingdto {

	private String policy_type;
	private String policy_name;
	private String employe_name;
	private String risk_covered;
	private String district;
	private String taluka;
	private String month;
	private String year;
	public PolicyMasterListingdto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HBAPolicyMasterListingdto [policy_type=" + policy_type + ", policy_name=" + policy_name
				+ ", employe_name=" + employe_name + ", risk_covered=" + risk_covered + ", district=" + district
				+ ", taluka=" + taluka + ", month=" + month + ", year=" + year + "]";
	}
	public PolicyMasterListingdto(String policy_type, String policy_name, String employe_name, String risk_covered,
			String district, String taluka, String month, String year) {
		super();
		this.policy_type = policy_type;
		this.policy_name = policy_name;
		this.employe_name = employe_name;
		this.risk_covered = risk_covered;
		this.district = district;
		this.taluka = taluka;
		this.month = month;
		this.year = year;
	}
	public String getPolicy_type() {
		return policy_type;
	}
	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}
	public String getPolicy_name() {
		return policy_name;
	}
	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}
	public String getEmploye_name() {
		return employe_name;
	}
	public void setEmploye_name(String employe_name) {
		this.employe_name = employe_name;
	}
	public String getRisk_covered() {
		return risk_covered;
	}
	public void setRisk_covered(String risk_covered) {
		this.risk_covered = risk_covered;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
}
