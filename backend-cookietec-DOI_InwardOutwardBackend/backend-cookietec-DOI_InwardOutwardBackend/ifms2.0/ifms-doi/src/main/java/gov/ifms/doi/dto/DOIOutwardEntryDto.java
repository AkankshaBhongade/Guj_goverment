package gov.ifms.doi.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DOIOutwardEntryDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String outward_id;
	private String outward_no;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate outward_dt;

	private String from_branch_or_unit;
	private String frm_branch_id; // np

	private String inward_letter_no;
	private String sent_to_details;

	private String outward_mode; // np
	private String outward_mode_id; // np
	private double outward_amt;
	private String remarks;
	private String reference_no;

	public DOIOutwardEntryDto() {
		super();
	}

	public DOIOutwardEntryDto(String outward_id, String outward_no, LocalDate outward_dt, String from_branch_or_unit,
			String frm_branch_id, String inward_letter_no, String sent_to_details, String outward_mode,
			String outward_mode_id, double outward_amt, String remarks, String reference_no) {
		super();
		this.outward_id = outward_id;
		this.outward_no = outward_no;
		this.outward_dt = outward_dt;
		this.from_branch_or_unit = from_branch_or_unit;
		this.frm_branch_id = frm_branch_id;
		this.inward_letter_no = inward_letter_no;
		this.sent_to_details = sent_to_details;
		this.outward_mode = outward_mode;
		this.outward_mode_id = outward_mode_id;
		this.outward_amt = outward_amt;
		this.remarks = remarks;
		this.reference_no = reference_no;
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

	public String getFrom_branch_or_unit() {
		return from_branch_or_unit;
	}

	public void setFrom_branch_or_unit(String from_branch_or_unit) {
		this.from_branch_or_unit = from_branch_or_unit;
	}

	public String getFrm_branch_id() {
		return frm_branch_id;
	}

	public void setFrm_branch_id(String frm_branch_id) {
		this.frm_branch_id = frm_branch_id;
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

	public String getOutward_mode() {
		return outward_mode;
	}

	public void setOutward_mode(String outward_mode) {
		this.outward_mode = outward_mode;
	}

	public String getOutward_mode_id() {
		return outward_mode_id;
	}

	public void setOutward_mode_id(String outward_mode_id) {
		this.outward_mode_id = outward_mode_id;
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

	public String getReference_no() {
		return reference_no;
	}

	public void setReference_no(String reference_no) {
		this.reference_no = reference_no;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
