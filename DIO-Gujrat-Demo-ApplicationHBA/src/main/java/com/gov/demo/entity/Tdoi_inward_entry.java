package com.gov.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gov.demo.entity.Tdoi_hba_Claim_Entry;
import com.sun.istack.NotNull;

@Entity
@Table(name = "TDOI_INWARD_ENTRY", schema = "DOI")
public class Tdoi_inward_entry {
	
	@OneToMany(mappedBy = "inward_id")
	private Set<Tdoi_hba_Claim_Entry> s1= new HashSet<>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "INWARD_ID")
	private long inward_id;
	
	

	@NotNull
	@Column(name = "INWARD_NO")
	private String inward_no;

	@NotNull
	@Column(name = "INWARD_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate inward_dt;

	@NotNull
	@Column(name = "LETTER_TYPE_ID")
	private long letter_type_id;

	@Column(name = "LETTER_TYPE", length = 20)
	private String letter_type;

	@Column(name = "LETTER_NO", length = 20)
	private String letter_no ;

	@NotNull
	@Column(name = "LETTER_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate letter_dt;

	@Column(name = "LETTER_DETAILS", length = 100)
	private String letter_details ;

	@Column(name = "FROM_WHERE_DETAILS", length = 100)
	private String from_where_details ;

	@Column(name = "DOI_BRANCH_ID")
	private long doi_branch_id;

	@Column(name = "DOI_EMPLOYEE_ID")
	private long doi_employee_id;

	@Column(name = "DOI_EMPLOYEE_NAME", length = 100)
	private String doi_employee_name;

	@Column(name = "REFERENCE_NO", length = 30)
	private String reference_no;

	@Column(name = "REFERENCE_DT")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime reference_dt;

	@NotNull
	@Column(name = "ACTIVE_STATUS")
	private short active_status;

	@NotNull
	@Column(name = "CREATED_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime created_date;

	@NotNull
	@Column(name = "CREATED_BY")
	private long created_by;

	@NotNull
	@Column(name = "CREATED_BY_POST")
	private long created_by_post;

	@NotNull
	@Column(name = "UPDATED_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime updated_date;

	@NotNull
	@Column(name = "UPDATED_BY")
	private long updated_by;

	@NotNull
	@Column(name = "UPDATED_BY_POST")
	private long updated_by_post;

	@Override
	public String toString() {
		return "Tdoi_inward_entry [inward_id=" + inward_id + ", inward_no=" + inward_no + ", inward_dt=" + inward_dt
				+ ", letter_type_id=" + letter_type_id + ", letter_type=" + letter_type + ", letter_no=" + letter_no
				+ ", letter_dt=" + letter_dt + ", letter_details=" + letter_details + ", from_where_details="
				+ from_where_details + ", doi_branch_id=" + doi_branch_id + ", doi_employee_id=" + doi_employee_id
				+ ", doi_employee_name=" + doi_employee_name + ", reference_no=" + reference_no + ", reference_dt="
				+ reference_dt + ", active_status=" + active_status + ", created_date=" + created_date + ", created_by="
				+ created_by + ", created_by_post=" + created_by_post + ", updated_date=" + updated_date
				+ ", updated_by=" + updated_by + ", updated_by_post=" + updated_by_post + "]";
	}

	public Tdoi_inward_entry() {
		super();
	}

	public Tdoi_inward_entry(long inward_id, String inward_no, LocalDate inward_dt, long letter_type_id,
			String letter_type, String letter_no, LocalDate letter_dt, String letter_details, String from_where_details,
			long doi_branch_id, long doi_employee_id, String doi_employee_name, String reference_no,
			LocalDateTime reference_dt, short active_status, LocalDateTime created_date, long created_by,
			long created_by_post, LocalDateTime updated_date, long updated_by, long updated_by_post) {
		super();
		this.inward_id = inward_id;
		this.inward_no = inward_no;
		this.inward_dt = inward_dt;
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
	}

	public long getInward_id() {
		return inward_id;
	}

	public void setInward_id(long inward_id) {
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

}
