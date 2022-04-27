package gov.ifms.doi.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DOIOutwardListingDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String outward_id;
	private String outward_no;

	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate outward_dt;

	private String letter_type;
	private String letter_no; // np

	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate letter_dt; // np

	private String inward_letter_no;
	private String sent_to_details;
	private String frm_branch_id; // np
	private String outward_mode; // np
	private double outward_amt;
	private String remarks;

	public DOIOutwardListingDto() {
		super();
	}

	public DOIOutwardListingDto(String outward_id, String outward_no, LocalDate outward_dt, String letter_type,
			String letter_no, LocalDate letter_dt, String inward_letter_no, String sent_to_details,
			String frm_branch_id, String outward_mode, double outward_amt, String remarks) {
		super();
		this.outward_id = outward_id;
		this.outward_no = outward_no;
		this.outward_dt = outward_dt;
		this.letter_type = letter_type;
		this.letter_no = letter_no;
		this.letter_dt = letter_dt;
		this.inward_letter_no = inward_letter_no;
		this.sent_to_details = sent_to_details;
		this.frm_branch_id = frm_branch_id;
		this.outward_mode = outward_mode;
		this.outward_amt = outward_amt;
		this.remarks = remarks;
	}

	public String getOutward_id() {
		return outward_id;
	}

	public void setOutward_id(String outward_id) {
		this.outward_id = outward_id;
	}

	public String getOutward_no() {
		return outward_no;
	}

	public void setOutward_no(String outward_no) {
		this.outward_no = outward_no;
	}

	public LocalDate getOutward_dt() {
		return outward_dt;
	}

	public void setOutward_dt(LocalDate outward_dt) {
		this.outward_dt = outward_dt;
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

	public String getInward_letter_no() {
		return inward_letter_no;
	}

	public void setInward_letter_no(String inward_letter_no) {
		this.inward_letter_no = inward_letter_no;
	}

	public String getSent_to_details() {
		return sent_to_details;
	}

	public void setSent_to_details(String sent_to_details) {
		this.sent_to_details = sent_to_details;
	}

	public String getFrm_branch_id() {
		return frm_branch_id;
	}

	public void setFrm_branch_id(String frm_branch_id) {
		this.frm_branch_id = frm_branch_id;
	}

	public String getOutward_mode() {
		return outward_mode;
	}

	public void setOutward_mode(String outward_mode) {
		this.outward_mode = outward_mode;
	}

	public double getOutward_amt() {
		return outward_amt;
	}

	public void setOutward_amt(double outward_amt) {
		this.outward_amt = outward_amt;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
//http://localhost:4200/#/doi/inward/inward-entry