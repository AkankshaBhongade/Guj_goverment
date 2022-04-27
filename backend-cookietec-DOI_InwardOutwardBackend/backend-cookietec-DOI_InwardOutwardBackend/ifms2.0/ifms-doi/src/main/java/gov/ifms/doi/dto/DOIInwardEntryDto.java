package gov.ifms.doi.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DOIInwardEntryDto implements Serializable {

	private static final long serialVersionUID = 1L;

//	private String inward_id;
	private String inward_no;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate inward_dt;
	private String inward_type;
	private String branch_name;
	private String doi_branch_id;
	private String letter_type;
	private String letter_no;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate letter_dt;
	private String letter_details;
	private String cheque_no;
	private String cheque_type;
	private String amount;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate cheque_dt;
	private String bank_name;
	private String bank_branch_name;
	private String from_where_details;
	private String doi_employee_name;
	private String reference_no;

	public DOIInwardEntryDto() {
		super();
	}

	@Override
	public String toString() {
		return "DOIInwardEntryDto [inward_no=" + inward_no + ", inward_dt=" + inward_dt + ", inward_type=" + inward_type
				+ ", branch_name=" + branch_name + ", doi_branch_id=" + doi_branch_id + ", letter_type=" + letter_type
				+ ", letter_no=" + letter_no + ", letter_dt=" + letter_dt + ", letter_details=" + letter_details
				+ ", cheque_no=" + cheque_no + ", cheque_type=" + cheque_type + ", amount=" + amount + ", cheque_dt="
				+ cheque_dt + ", bank_name=" + bank_name + ", bank_branch_name=" + bank_branch_name
				+ ", from_where_details=" + from_where_details + ", doi_employee_name=" + doi_employee_name
				+ ", reference_no=" + reference_no + "]";
	}

	public DOIInwardEntryDto(String inward_no, LocalDate inward_dt, String inward_type, String branch_name,
			String doi_branch_id, String letter_type, String letter_no, LocalDate letter_dt, String letter_details,
			String cheque_no, String cheque_type, String amount, LocalDate cheque_dt, String bank_name,
			String bank_branch_name, String from_where_details, String doi_employee_name, String reference_no) {
		super();
		this.inward_no = inward_no;
		this.inward_dt = inward_dt;
		this.inward_type = inward_type;
		this.branch_name = branch_name;
		this.doi_branch_id = doi_branch_id;
		this.letter_type = letter_type;
		this.letter_no = letter_no;
		this.letter_dt = letter_dt;
		this.letter_details = letter_details;
		this.cheque_no = cheque_no;
		this.cheque_type = cheque_type;
		this.amount = amount;
		this.cheque_dt = cheque_dt;
		this.bank_name = bank_name;
		this.bank_branch_name = bank_branch_name;
		this.from_where_details = from_where_details;
		this.doi_employee_name = doi_employee_name;
		this.reference_no = reference_no;
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

	public String getInward_type() {
		return inward_type;
	}

	public void setInward_type(String inward_type) {
		this.inward_type = inward_type;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getDoi_branch_id() {
		return doi_branch_id;
	}

	public void setDoi_branch_id(String doi_branch_id) {
		this.doi_branch_id = doi_branch_id;
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

	public String getCheque_no() {
		return cheque_no;
	}

	public void setCheque_no(String cheque_no) {
		this.cheque_no = cheque_no;
	}

	public String getCheque_type() {
		return cheque_type;
	}

	public void setCheque_type(String cheque_type) {
		this.cheque_type = cheque_type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public LocalDate getCheque_dt() {
		return cheque_dt;
	}

	public void setCheque_dt(LocalDate cheque_dt) {
		this.cheque_dt = cheque_dt;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBank_branch_name() {
		return bank_branch_name;
	}

	public void setBank_branch_name(String bank_branch_name) {
		this.bank_branch_name = bank_branch_name;
	}

	public String getFrom_where_details() {
		return from_where_details;
	}

	public void setFrom_where_details(String from_where_details) {
		this.from_where_details = from_where_details;
	}

	public String getDoi_employee_name() {
		return doi_employee_name;
	}

	public void setDoi_employee_name(String doi_employee_name) {
		this.doi_employee_name = doi_employee_name;
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
