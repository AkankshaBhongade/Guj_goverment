package com.gov.demo.dto;

public class PolicyProposalListingdto {

	private String proposal_no;
	private String dppf_loan_no;
	private String employe_no;
	private String employe_name;
	private String district;
	private String taluka;
	public PolicyProposalListingdto() {
		super();
	}
	@Override
	public String toString() {
		return "HBAPolicyProposalListingdto [proposal_no=" + proposal_no + ", dppf_loan_no=" + dppf_loan_no
				+ ", employe_no=" + employe_no + ", employe_name=" + employe_name + ", district=" + district
				+ ", taluka=" + taluka + "]";
	}
	public PolicyProposalListingdto(String proposal_no, String dppf_loan_no, String employe_no, String employe_name,
			String district, String taluka) {
		super();
		this.proposal_no = proposal_no;
		this.dppf_loan_no = dppf_loan_no;
		this.employe_no = employe_no;
		this.employe_name = employe_name;
		this.district = district;
		this.taluka = taluka;
	}
	public String getProposal_no() {
		return proposal_no;
	}
	public void setProposal_no(String proposal_no) {
		this.proposal_no = proposal_no;
	}
	public String getDppf_loan_no() {
		return dppf_loan_no;
	}
	public void setDppf_loan_no(String dppf_loan_no) {
		this.dppf_loan_no = dppf_loan_no;
	}
	public String getEmploye_no() {
		return employe_no;
	}
	public void setEmploye_no(String employe_no) {
		this.employe_no = employe_no;
	}
	public String getEmploye_name() {
		return employe_name;
	}
	public void setEmploye_name(String employe_name) {
		this.employe_name = employe_name;
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
	
	
}
