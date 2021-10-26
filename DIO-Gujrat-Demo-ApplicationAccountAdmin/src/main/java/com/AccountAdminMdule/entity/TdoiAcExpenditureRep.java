package com.AccountAdminMdule.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name = "TDOI_AC_EXPENDITURE_REP", schema = "DOI")
public class TdoiAcExpenditureRep {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EXPEND_REP_ID")
	@NotNull
	private long expend_rep_id;

	@Column(name = "REFERENCE_NO")
	private String reference_no;
	
	@Column(name = "REFERENCE_DT")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime reference_dt = LocalDateTime.now();

	@Column(name = "FROM_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate from_dt = LocalDate.now();

	@Column(name = "TO_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate to_dt = LocalDate.now();

	
	@Column(name = "MAJORHEAD_ID")
	private long majorhead_id;

	@Column(name = "MAJORHEAD_DESC")
	private String majorhead_desc;

	@Column(name = "SUBHEAD_ID")
	private long subhead_id;

	@Column(name = "SUBHEAD_DESC")
	private String subhead_desc;

	@Column(name = "EXPEND_TYPE_ID")
	private long expend_type_id;

	@Column(name = "EXPEND_TYPE_DESC")
	private String expend_type_desc;

	@Column(name = "CHEQUE_NO")
	private long cheque_no;
	
	@Column(name = "CHEQUE_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate cheque_dt = LocalDate.now();

	@Column(name = "STAUS_ID")
	private long staus_id;

	@Column(name = "STATUS_DESC")
	private String status_desc;
	
	@Column(name = "ACTIVE_STATUS")
	@NotNull
	private short active_status;

	@Column(name = "CREATED_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@NotNull
	private LocalDateTime created_date = LocalDateTime.now();

	@Column(name = "CREATED_BY")
	@NotNull
	private long created_by;

	@Column(name = "CREATED_BY_POST")
	@NotNull
	private long created_by_post;

	@Column(name = "UPDATED_DATE")
	@NotNull
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime updated_date = LocalDateTime.now();

	@Column(name = "UPDATED_BY")
	@NotNull
	private long updated_by;

	@Column(name = "UPDATED_BY_POST")
	@NotNull
	private long updated_by_post;

	public TdoiAcExpenditureRep() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TdoiAcExpenditureRep(long expend_rep_id, String reference_no, LocalDateTime reference_dt, LocalDate from_dt,
			LocalDate to_dt, long majorhead_id, String majorhead_desc, long subhead_id, String subhead_desc,
			long expend_type_id, String expend_type_desc, long cheque_no, LocalDate cheque_dt, long staus_id,
			String status_desc, short active_status, LocalDateTime created_date, long created_by, long created_by_post,
			LocalDateTime updated_date, long updated_by, long updated_by_post) {
		super();
		this.expend_rep_id = expend_rep_id;
		this.reference_no = reference_no;
		this.reference_dt = reference_dt;
		this.from_dt = from_dt;
		this.to_dt = to_dt;
		this.majorhead_id = majorhead_id;
		this.majorhead_desc = majorhead_desc;
		this.subhead_id = subhead_id;
		this.subhead_desc = subhead_desc;
		this.expend_type_id = expend_type_id;
		this.expend_type_desc = expend_type_desc;
		this.cheque_no = cheque_no;
		this.cheque_dt = cheque_dt;
		this.staus_id = staus_id;
		this.status_desc = status_desc;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
	}

	@Override
	public String toString() {
		return "TdoiAcExpenditureRep [expend_rep_id=" + expend_rep_id + ", reference_no=" + reference_no
				+ ", reference_dt=" + reference_dt + ", from_dt=" + from_dt + ", to_dt=" + to_dt + ", majorhead_id="
				+ majorhead_id + ", majorhead_desc=" + majorhead_desc + ", subhead_id=" + subhead_id + ", subhead_desc="
				+ subhead_desc + ", expend_type_id=" + expend_type_id + ", expend_type_desc=" + expend_type_desc
				+ ", cheque_no=" + cheque_no + ", cheque_dt=" + cheque_dt + ", staus_id=" + staus_id + ", status_desc="
				+ status_desc + ", active_status=" + active_status + ", created_date=" + created_date + ", created_by="
				+ created_by + ", created_by_post=" + created_by_post + ", updated_date=" + updated_date
				+ ", updated_by=" + updated_by + ", updated_by_post=" + updated_by_post + "]";
	}

	public long getExpend_rep_id() {
		return expend_rep_id;
	}

	public void setExpend_rep_id(long expend_rep_id) {
		this.expend_rep_id = expend_rep_id;
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

	public LocalDate getFrom_dt() {
		return from_dt;
	}

	public void setFrom_dt(LocalDate from_dt) {
		this.from_dt = from_dt;
	}

	public LocalDate getTo_dt() {
		return to_dt;
	}

	public void setTo_dt(LocalDate to_dt) {
		this.to_dt = to_dt;
	}

	public long getMajorhead_id() {
		return majorhead_id;
	}

	public void setMajorhead_id(long majorhead_id) {
		this.majorhead_id = majorhead_id;
	}

	public String getMajorhead_desc() {
		return majorhead_desc;
	}

	public void setMajorhead_desc(String majorhead_desc) {
		this.majorhead_desc = majorhead_desc;
	}

	public long getSubhead_id() {
		return subhead_id;
	}

	public void setSubhead_id(long subhead_id) {
		this.subhead_id = subhead_id;
	}

	public String getSubhead_desc() {
		return subhead_desc;
	}

	public void setSubhead_desc(String subhead_desc) {
		this.subhead_desc = subhead_desc;
	}

	public long getExpend_type_id() {
		return expend_type_id;
	}

	public void setExpend_type_id(long expend_type_id) {
		this.expend_type_id = expend_type_id;
	}

	public String getExpend_type_desc() {
		return expend_type_desc;
	}

	public void setExpend_type_desc(String expend_type_desc) {
		this.expend_type_desc = expend_type_desc;
	}

	public long getCheque_no() {
		return cheque_no;
	}

	public void setCheque_no(long cheque_no) {
		this.cheque_no = cheque_no;
	}

	public LocalDate getCheque_dt() {
		return cheque_dt;
	}

	public void setCheque_dt(LocalDate cheque_dt) {
		this.cheque_dt = cheque_dt;
	}

	public long getStaus_id() {
		return staus_id;
	}

	public void setStaus_id(long staus_id) {
		this.staus_id = staus_id;
	}

	public String getStatus_desc() {
		return status_desc;
	}

	public void setStatus_desc(String status_desc) {
		this.status_desc = status_desc;
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
