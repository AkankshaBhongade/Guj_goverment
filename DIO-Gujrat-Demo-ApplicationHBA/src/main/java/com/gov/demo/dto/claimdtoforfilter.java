package com.gov.demo.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ibm.db2.cmx.annotation.Column;
import com.sun.istack.NotNull;

public class claimdtoforfilter {
	
	private String Claim_id;
	private String Policy_no;
	private String Employee_name;
	private String office_name;
	private String risk_covered_id;
	private String house_address;
	private String inward_no;
//	private String District;
//	private String Taluka;
//	private String Month;
//	private String Year;
//	
	//private String created_date;
	//private String updated_date;
	private String active_status;
	
//	@Column(name = "ACTIVE_STATUS")
//	@NotNull
//	private short active_status = 0;

	@Column(name = "CREATED_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@NotNull
	private LocalDateTime created_date = LocalDateTime.now();

	@Column(name = "UPDATED_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@NotNull
	private LocalDateTime updated_date = LocalDateTime.now();

	
	public claimdtoforfilter() {
		super();
		// TODO Auto-generated constructor stub
	}


	public claimdtoforfilter(String claim_id, String policy_no, String employee_name, String office_name,
			String risk_covered_id, String house_address, String inward_no, String active_status,
			LocalDateTime created_date, LocalDateTime updated_date) {
		super();
		Claim_id = claim_id;
		Policy_no = policy_no;
		Employee_name = employee_name;
		this.office_name = office_name;
		this.risk_covered_id = risk_covered_id;
		this.house_address = house_address;
		this.inward_no = inward_no;
		this.active_status = active_status;
		this.created_date = created_date;
		this.updated_date = updated_date;
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


	public String getOffice_name() {
		return office_name;
	}


	public void setOffice_name(String office_name) {
		this.office_name = office_name;
	}


	public String getRisk_covered_id() {
		return risk_covered_id;
	}


	public void setRisk_covered_id(String risk_covered_id) {
		this.risk_covered_id = risk_covered_id;
	}


	public String getHouse_address() {
		return house_address;
	}


	public void setHouse_address(String house_address) {
		this.house_address = house_address;
	}


	public String getInward_no() {
		return inward_no;
	}


	public void setInward_no(String inward_no) {
		this.inward_no = inward_no;
	}


	public String getActive_status() {
		return active_status;
	}


	public void setActive_status(String active_status) {
		this.active_status = active_status;
	}


	public LocalDateTime getCreated_date() {
		return created_date;
	}


	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}


	public LocalDateTime getUpdated_date() {
		return updated_date;
	}


	public void setUpdated_date(LocalDateTime updated_date) {
		this.updated_date = updated_date;
	}
	
	
	
}
