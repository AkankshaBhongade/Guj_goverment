package com.gov.demo.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InwardEntryDTO {

	private Long inward_id;
	private String inward_no;

	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate inward_dt;

	private String letter_type;
	private String letter_no;

	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate letter_dt;

	private String letter_details;
	private String from_where_details;
	private String branch_name;
	private String doi_employee_name;

	public InwardEntryDTO() {
		super();
	}

	@Override
	public String toString() {
		return "InwardEntryDTO [inward_no=" + inward_no + ", inward_dt=" + inward_dt + ", letter_type=" + letter_type
				+ ", letter_no=" + letter_no + ", letter_dt=" + letter_dt + ", letter_details=" + letter_details
				+ ", from_where_details=" + from_where_details + ", branch_name=" + branch_name + ", doi_employee_name="
				+ doi_employee_name + "]";
	}

	public InwardEntryDTO(Long inward_id, String inward_no, LocalDate inward_dt, String letter_type, String letter_no,
			LocalDate letter_dt, String letter_details, String from_where_details, String branch_name,
			String doi_employee_name) {
		super();
		this.inward_id = inward_id;
		this.inward_no = inward_no;
		this.inward_dt = inward_dt;
		this.letter_type = letter_type;
		this.letter_no = letter_no;
		this.letter_dt = letter_dt;
		this.letter_details = letter_details;
		this.from_where_details = from_where_details;
		this.branch_name = branch_name;
		this.doi_employee_name = doi_employee_name;
	}

	public Long getInward_id() {
		return inward_id;
	}

	public void setInward_id(Long inward_id) {
		this.inward_id = inward_id;
	}

	public String getInward_no() {
		return inward_no;
	}

	public void setInward_no(String inward_no) {
		this.inward_no = inward_no;
	}

	public LocalDate getInward_dt() {
		return inward_dt;
	}

	public void setInward_dt(LocalDate inward_dt) {
		this.inward_dt = inward_dt;
	}

	public String getLetter_type() {
		return letter_type;
	}

	public void setLetter_type(String letter_type) {
		this.letter_type = letter_type;
	}

	public String getLetter_no() {
		return letter_no;
	}

	public void setLetter_no(String letter_no) {
		this.letter_no = letter_no;
	}

	public LocalDate getLetter_dt() {
		return letter_dt;
	}

	public void setLetter_dt(LocalDate letter_dt) {
		this.letter_dt = letter_dt;
	}

	public String getLetter_details() {
		return letter_details;
	}

	public void setLetter_details(String letter_details) {
		this.letter_details = letter_details;
	}

	public String getFrom_where_details() {
		return from_where_details;
	}

	public void setFrom_where_details(String from_where_details) {
		this.from_where_details = from_where_details;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getDoi_employee_name() {
		return doi_employee_name;
	}

	public void setDoi_employee_name(String doi_employee_name) {
		this.doi_employee_name = doi_employee_name;
	}

}
