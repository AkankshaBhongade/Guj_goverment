package com.gov.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InwardListingResponseDTO {

	private long inward_id;
	private long inward_no;

	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate inward_dt;

	private String letter_type;
	private String letter_no;

	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate letter_dt;

	private String from_where_details;
	private String doi_branch_id;
	private String doi_employee_name;

	@JsonFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private LocalDateTime created_date;

	@JsonFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private LocalDateTime updated_date;

	private short active_status;

	public InwardListingResponseDTO() {
		super();
	}

	public InwardListingResponseDTO(long inward_id, long inward_no, LocalDate inward_dt, String letter_type,
			String letter_no, LocalDate letter_dt, String from_where_details, String doi_branch_id,
			String doi_employee_name, LocalDateTime created_date, LocalDateTime updated_date, short active_status) {
		super();
		this.inward_id = inward_id;
		this.inward_no = inward_no;
		this.inward_dt = inward_dt;
		this.letter_type = letter_type;
		this.letter_no = letter_no;
		this.letter_dt = letter_dt;
		this.from_where_details = from_where_details;
		this.doi_branch_id = doi_branch_id;
		this.doi_employee_name = doi_employee_name;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.active_status = active_status;
	}

	public long getInward_id() {
		return inward_id;
	}

	public void setInward_id(long inward_id) {
		this.inward_id = inward_id;
	}

	public long getInward_no() {
		return inward_no;
	}

	public void setInward_no(long inward_no) {
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

	public String getFrom_where_details() {
		return from_where_details;
	}

	public void setFrom_where_details(String from_where_details) {
		this.from_where_details = from_where_details;
	}

	public String getDoi_branch_id() {
		return doi_branch_id;
	}

	public void setDoi_branch_id(String doi_branch_id) {
		this.doi_branch_id = doi_branch_id;
	}

	public String getDoi_employee_name() {
		return doi_employee_name;
	}

	public void setDoi_employee_name(String doi_employee_name) {
		this.doi_employee_name = doi_employee_name;
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

	public short getActive_status() {
		return active_status;
	}

	public void setActive_status(short active_status) {
		this.active_status = active_status;
	}

}
