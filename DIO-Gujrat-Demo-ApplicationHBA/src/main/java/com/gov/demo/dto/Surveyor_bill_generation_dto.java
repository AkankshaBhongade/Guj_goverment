package com.gov.demo.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Surveyor_bill_generation_dto {

	private String transaction_no ;
	
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate transaction_date;
	
	private String surveyor_name;
	
	private String surveyor_appointment_for_branch;
	
	private String claim_no;
	
	private String surveyor_bill_no;
	
	private LocalDate bill_date;
	
	private String amount;

	
	
	public Surveyor_bill_generation_dto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Surveyor_bill_generation_dto(String transaction_no, LocalDate transaction_date, String surveyor_name,
			String surveyor_appointment_for_branch, String claim_no, String surveyor_bill_no, LocalDate bill_date,
			String amount) {
		super();
		this.transaction_no = transaction_no;
		this.transaction_date = transaction_date;
		this.surveyor_name = surveyor_name;
		this.surveyor_appointment_for_branch = surveyor_appointment_for_branch;
		this.claim_no = claim_no;
		this.surveyor_bill_no = surveyor_bill_no;
		this.bill_date = bill_date;
		this.amount = amount;
	}



	public String getTransaction_no() {
		return transaction_no;
	}



	public void setTransaction_no(String transaction_no) {
		this.transaction_no = transaction_no;
	}



	public LocalDate getTransaction_date() {
		return transaction_date;
	}



	public void setTransaction_date(LocalDate transaction_date) {
		this.transaction_date = transaction_date;
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



	public LocalDate getBill_date() {
		return bill_date;
	}



	public void setBill_date(LocalDate bill_date) {
		this.bill_date = bill_date;
	}



	public String getAmount() {
		return amount;
	}



	public void setAmount(String amount) {
		this.amount = amount;
	}

	
	

}
