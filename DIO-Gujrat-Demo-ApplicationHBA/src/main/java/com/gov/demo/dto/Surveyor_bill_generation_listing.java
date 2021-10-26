package com.gov.demo.dto;

public class Surveyor_bill_generation_listing {
	
	private String surveyor_name;
	private String surveyor_appointment_for_branch;
	private String claim_no;
	private String surveyor_bill_no;
	private String workflow_status;
	
	
	
	public Surveyor_bill_generation_listing() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Surveyor_bill_generation_listing(String surveyor_name, String surveyor_appointment_for_branch,
			String claim_no, String surveyor_bill_no, String workflow_status) {
		super();
		this.surveyor_name = surveyor_name;
		this.surveyor_appointment_for_branch = surveyor_appointment_for_branch;
		this.claim_no = claim_no;
		this.surveyor_bill_no = surveyor_bill_no;
		this.workflow_status = workflow_status;
	}



	public String getSurveyor_name() {
		return surveyor_name;
	}



	public void setSurveyor_name(String surveyor_name) {
		this.surveyor_name = surveyor_name;
	}



	public String getSurveyor_appointment_for_branch() {
		return surveyor_appointment_for_branch;
	}



	public void setSurveyor_appointment_for_branch(String surveyor_appointment_for_branch) {
		this.surveyor_appointment_for_branch = surveyor_appointment_for_branch;
	}



	public String getClaim_no() {
		return claim_no;
	}



	public void setClaim_no(String claim_no) {
		this.claim_no = claim_no;
	}



	public String getSurveyor_bill_no() {
		return surveyor_bill_no;
	}



	public void setSurveyor_bill_no(String surveyor_bill_no) {
		this.surveyor_bill_no = surveyor_bill_no;
	}



	public String getWorkflow_status() {
		return workflow_status;
	}



	public void setWorkflow_status(String workflow_status) {
		this.workflow_status = workflow_status;
	}




}
