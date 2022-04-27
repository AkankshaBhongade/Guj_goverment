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
@Table(name = "TDOI_INWARD_ENTRY", schema = "DOI")
public class DOIInwardEntryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "INWARD_ID")
	private Long inward_id;

	@Column(name = "INWARD_NO")
	private String inward_no = "xxxxx";

	@Column(name = "INWARD_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate inward_dt = LocalDate.now();

	@Column(name = "INWARD_TYPE", length = 10)
	private String inward_type = "xxxxx";

	@Column(name = "LETTER_TYPE_ID")
	private long letter_type_id = 0;

	@Column(name = "LETTER_TYPE", length = 20)
	private String letter_type = "xxxxx";

	@Column(name = "LETTER_NO", length = 20)
	private String letter_no = "xxxxx";

	@Column(name = "LETTER_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate letter_dt = LocalDate.now();

	@Column(name = "LETTER_DETAILS", length = 100)
	private String letter_details = "xxxxx";

	@Column(name = "FROM_WHERE_DETAILS", length = 100)
	private String from_where_details = "xxxxx";

	@Column(name = "DOI_BRANCH_ID")
	private long doi_branch_id = 0;

	@Column(name = "DOI_EMPLOYEE_ID")
	private long doi_employee_id = 0;

	@Column(name = "DOI_EMPLOYEE_NAME", length = 100)
	private String doi_employee_name = "xxxxx";

	@Column(name = "REFERENCE_NO", length = 30)
	private String reference_no = "xxxxx";

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
	private LocalDateTime updated_date = LocalDateTime.now();

	@Column(name = "UPDATED_BY")
	private long updated_by = 0;

	@Column(name = "UPDATED_BY_POST")
	private long updated_by_post = 0;

	@Column(name = "CHEQUE_NO")
	private long cheque_no = 0;

	@Column(name = "CHEQUE_TYPE")
	private String cheque_type = "xxxxxx";

	@Column(name = "AMOUNT")
	private Double amount = 0.0;

	@Column(name = "CHEQUE_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate cheque_dt = LocalDate.now();

	@Column(name = "BANK_NAME")
	private String bank_name = "xxxx";

	@Column(name = "BANK_BRANCH_NAME")
	private String bank_branch_name = "xxxx";

	@Override
	public String toString() {
		return "Tdoi_inward_entry [inward_id=" + inward_id + ", inward_no=" + inward_no + ", inward_dt=" + inward_dt
				+ ", letter_type_id=" + letter_type_id + ", letter_type=" + letter_type + ", letter_no=" + letter_no
				+ ", letter_dt=" + letter_dt + ", letter_details=" + letter_details + ", from_where_details="
				+ from_where_details + ", doi_branch_id=" + doi_branch_id + ", doi_employee_id=" + doi_employee_id
				+ ", doi_employee_name=" + doi_employee_name + ", reference_no=" + reference_no + ", reference_dt="
				+ reference_dt + ", active_status=" + active_status + ", created_date=" + created_date + ", created_by="
				+ created_by + ", created_by_post=" + created_by_post + ", updated_date=" + updated_date
				+ ", updated_by=" + updated_by + ", updated_by_post=" + updated_by_post + ", cheque_no=" + cheque_no
				+ ", cheque_type=" + cheque_type + ", amount=" + amount + ", cheque_dt=" + cheque_dt + ", bank_name="
				+ bank_name + ", bank_branch_name=" + bank_branch_name + "]";
	}

	public DOIInwardEntryEntity() {
		super();
	}

	public DOIInwardEntryEntity(Long inward_id, String inward_no, LocalDate inward_dt, String inward_type,
			long letter_type_id, String letter_type, String letter_no, LocalDate letter_dt, String letter_details,
			String from_where_details, long doi_branch_id, long doi_employee_id, String doi_employee_name,
			String reference_no, LocalDateTime reference_dt, short active_status, LocalDateTime created_date,
			long created_by, long created_by_post, LocalDateTime updated_date, long updated_by, long updated_by_post,
			long cheque_no, String cheque_type, Double amount, LocalDate cheque_dt, String bank_name,
			String bank_branch_name) {
		super();
		this.inward_id = inward_id;
		this.inward_no = inward_no;
		this.inward_dt = inward_dt;
		this.inward_type = inward_type;
		this.letter_type_id = letter_type_id;
		this.letter_type = letter_type;
		this.letter_no = letter_no;
		this.letter_dt = letter_dt;
		this.letter_details = letter_details;
		this.from_where_details = from_where_details;
		this.doi_branch_id = doi_branch_id;
		this.doi_employee_id = doi_employee_id;
		this.doi_employee_name = doi_employee_name;
		this.reference_no = reference_no;
		this.reference_dt = reference_dt;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
		this.cheque_no = cheque_no;
		this.cheque_type = cheque_type;
		this.amount = amount;
		this.cheque_dt = cheque_dt;
		this.bank_name = bank_name;
		this.bank_branch_name = bank_branch_name;
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

	public String getInward_type() {
		return inward_type;
	}

	public void setInward_type(String inward_type) {
		this.inward_type = inward_type;
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

	public long getDoi_branch_id() {
		return doi_branch_id;
	}

	public void setDoi_branch_id(long doi_branch_id) {
		this.doi_branch_id = doi_branch_id;
	}

	public long getDoi_employee_id() {
		return doi_employee_id;
	}

	public void setDoi_employee_id(long doi_employee_id) {
		this.doi_employee_id = doi_employee_id;
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

	public long getCheque_no() {
		return cheque_no;
	}

	public void setCheque_no(long cheque_no) {
		this.cheque_no = cheque_no;
	}

	public String getCheque_type() {
		return cheque_type;
	}

	public void setCheque_type(String cheque_type) {
		this.cheque_type = cheque_type;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
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

}
