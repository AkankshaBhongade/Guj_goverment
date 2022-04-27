package gov.ifms.doi.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "TDOI_OUTWARD_ENTRY", schema = "DOI")
public class DOIOutwardEntryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "OUTWARD_ID")
	private long outward_id = 0;

	@Column(name = "OUTWARD_NO")
	private String outward_no = "xxxx";

	@Column(name = "OUTWARD_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate outward_dt = LocalDate.now();

	@Column(name = "LETTER_TYPE_ID")
	private long letter_type_id = 0;

	@Column(name = "LETTER_TYPE", length = 20)
	private String letter_type = "xxxx";

	@Column(name = "INWARD_LETTER_NO", length = 20)
	private String inward_letter_no = "xxxx";

	@Column(name = "LETTER_DETAILS", length = 100)
	private String letter_details = "xxxx";

	@Column(name = "SENT_TO_DETAILS", length = 100)
	private String sent_to_details = "xxxx";

	@Column(name = "FRM_BRANCH_ID")
	private long frm_branch_id = 0;

	@Column(name = "OUTWARD_MODE_ID")
	private long outward_mode_id = 0;

	@Column(name = "OUTWARD_AMT")
	private double outward_amt = 0.0;

	@Column(name = "REMARKS ", length = 200)
	private String remarks = "xxxx";

	@Column(name = "REFERENCE_NO", length = 30)
	private String reference_no = "xxxx";

	@Column(name = "REFERENCE_DT")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime reference_dt = LocalDateTime.now();

	@Column(name = "ACTIVE_STATUS")
	private short active_status = 0;

	@Column(name = "CREATED_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime created_date = LocalDateTime.now();

	@Column(name = "CREATED_BY")
	private long created_by = 0;

	@Column(name = "CREATED_BY_POST")

	private long created_by_post = 0;

	@Column(name = "UPDATED_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime updated_date = LocalDateTime.now();

	@Column(name = "UPDATED_BY")
	private long updated_by = 0;

	@Column(name = "UPDATED_BY_POST")
	private long updated_by_post = 0;

	public DOIOutwardEntryEntity() {
		super();
	}

	public DOIOutwardEntryEntity(long outward_id, String outward_no, LocalDate outward_dt, long letter_type_id,
			String letter_type, String inward_letter_no, String letter_details, String sent_to_details,
			long frm_branch_id, long outward_mode_id, double outward_amt, String remarks, String reference_no,
			LocalDateTime reference_dt, short active_status, LocalDateTime created_date, long created_by,
			long created_by_post, LocalDateTime updated_date, long updated_by, long updated_by_post) {
		super();
		this.outward_id = outward_id;
		this.outward_no = outward_no;
		this.outward_dt = outward_dt;
		this.letter_type_id = letter_type_id;
		this.letter_type = letter_type;
		this.inward_letter_no = inward_letter_no;
		this.letter_details = letter_details;
		this.sent_to_details = sent_to_details;
		this.frm_branch_id = frm_branch_id;
		this.outward_mode_id = outward_mode_id;
		this.outward_amt = outward_amt;
		this.remarks = remarks;
		this.reference_no = reference_no;
		this.reference_dt = reference_dt;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
	}

	public long getOutward_id() {
		return outward_id;
	}

	public void setOutward_id(long outward_id) {
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

	public long getLetter_type_id() {
		return letter_type_id;
	}

	public void setLetter_type_id(long letter_type_id) {
		this.letter_type_id = letter_type_id;
	}

	public String getLetter_type() {
		return letter_type;
	}

	public void setLetter_type(String letter_type) {
		this.letter_type = letter_type;
	}

	public String getInward_letter_no() {
		return inward_letter_no;
	}

	public void setInward_letter_no(String inward_letter_no) {
		this.inward_letter_no = inward_letter_no;
	}

	public String getLetter_details() {
		return letter_details;
	}

	public void setLetter_details(String letter_details) {
		this.letter_details = letter_details;
	}

	public String getSent_to_details() {
		return sent_to_details;
	}

	public void setSent_to_details(String sent_to_details) {
		this.sent_to_details = sent_to_details;
	}

	public long getFrm_branch_id() {
		return frm_branch_id;
	}

	public void setFrm_branch_id(long frm_branch_id) {
		this.frm_branch_id = frm_branch_id;
	}

	public long getOutward_mode_id() {
		return outward_mode_id;
	}

	public void setOutward_mode_id(long outward_mode_id) {
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

	public LocalDateTime getReference_dt() {
		return reference_dt;
	}

	public void setReference_dt(LocalDateTime reference_dt) {
		this.reference_dt = reference_dt;
	}

	public short getActive_status() {
		return active_status;
	}

	public void setActive_status(short active_status) {
		this.active_status = active_status;
	}

	public LocalDateTime getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}

	public long getCreated_by() {
		return created_by;
	}

	public void setCreated_by(long created_by) {
		this.created_by = created_by;
	}

	public long getCreated_by_post() {
		return created_by_post;
	}

	public void setCreated_by_post(long created_by_post) {
		this.created_by_post = created_by_post;
	}

	public LocalDateTime getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(LocalDateTime updated_date) {
		this.updated_date = updated_date;
	}

	public long getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(long updated_by) {
		this.updated_by = updated_by;
	}

	public long getUpdated_by_post() {
		return updated_by_post;
	}

	public void setUpdated_by_post(long updated_by_post) {
		this.updated_by_post = updated_by_post;
	}

}
