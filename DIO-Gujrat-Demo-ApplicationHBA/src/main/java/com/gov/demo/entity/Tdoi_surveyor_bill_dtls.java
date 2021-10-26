package com.gov.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import org.hibernate.annotations.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name = "TDOI_SURVEYOR_BILL_DTLS", schema = "DOI")
public class Tdoi_surveyor_bill_dtls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SURVEYOR_BILL_ID")
	@NotNull
	private long surveyor_bill_id;

	@ManyToOne
	@JoinColumn(name = "SURVEYOR_ID")
	@ForeignKey(name = " FK_TDOI_SURVEYOR_BILL_DTLS_TDOI_SURVEYOR_DTL")
	@NotNull
	private Tdoi_surveyor_dtl surveyor_id; 

	@Column(name = "SURVEYOR_NAME")
	@NotNull
	private String surveyor_name ="xxxxx";

	@Column(name = "SURVEYR_APPOINT_FOR")
	private String surveyor_appoint_for ="xxxxx";

	@Column(name = "CLAIM_NO")
	private String claim_no="xxxxx";

	@Column(name = "SURVEY_BILL_NO")
	private String survey_bill_no= "xxxxx";

	@Column(name = "SURVEY_BILL_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate survey_bill_dt = LocalDate.now();

	@Column(name = "TRANSACTION_NO")
	private String transaction_no="xxxxx";

	@Column(name = "TRANSACTION_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate transaction_dt = LocalDate.now();

	@Column(name = "SURVEY_BRANCH")
	private String survey_branch="xxxxx";

	@Column(name = "SURVEY_BILL_AMT")
	private double survey_bill_amt = 0.0;

	@Column(name = "WORKFLOW_STATUS_ID")
	private long workflow_status_id = 0;

	@Column(name = "REFERENCE_NO")
	private String reference_no ="xxxxx";

	@Column(name = "REFERENCE_DT")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime reference_dt = LocalDateTime.now();

	@Column(name = "ACTIVE_STATUS")
	@NotNull
	private short active_status = 0;

	@Column(name = "CREATED_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@NotNull
	private LocalDateTime created_date = LocalDateTime.now();

	@Column(name = "CREATED_BY")
	@NotNull
	private long created_by = 0;

	@Column(name = "CREATED_BY_POST")
	@NotNull
	private long created_by_post = 0;

	@Column(name = "UPDATED_DATE")
	@NotNull
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime updated_date = LocalDateTime.now();

	@Column(name = "UPDATED_BY")
	@NotNull
	private long updated_by = 0;

	@Column(name = "UPDATED_BY_POST")
	@NotNull
	private long updated_by_post = 0;

	public Tdoi_surveyor_bill_dtls() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tdoi_surveyor_bill_dtls(long surveyor_bill_id, Tdoi_surveyor_dtl surveyor_id, String surveyor_name,
			String surveyor_appoint_for, String claim_no, String survey_bill_no, LocalDate survey_bill_dt,
			String transaction_no, LocalDate transaction_dt, String survey_branch, double survey_bill_amt,
			long workflow_status_id, String reference_no, LocalDateTime reference_dt, short active_status,
			LocalDateTime created_date, long created_by, long created_by_post, LocalDateTime updated_date,
			long updated_by, long updated_by_post) {
		super();
		this.surveyor_bill_id = surveyor_bill_id;
		this.surveyor_id = surveyor_id;
		this.surveyor_name = surveyor_name;
		this.surveyor_appoint_for = surveyor_appoint_for;
		this.claim_no = claim_no;
		this.survey_bill_no = survey_bill_no;
		this.survey_bill_dt = survey_bill_dt;
		this.transaction_no = transaction_no;
		this.transaction_dt = transaction_dt;
		this.survey_branch = survey_branch;
		this.survey_bill_amt = survey_bill_amt;
		this.workflow_status_id = workflow_status_id;
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

	public long getSurveyor_bill_id() {
		return surveyor_bill_id;
	}

	public void setSurveyor_bill_id(long surveyor_bill_id) {
		this.surveyor_bill_id = surveyor_bill_id;
	}

//	public Tdoi_surveyor_dtl getSurveyor_id() {
//		return surveyor_id;
//	}

	public void setSurveyor_id(Tdoi_surveyor_dtl surveyor_id) {
		this.surveyor_id = surveyor_id;
	}

	public String getSurveyor_name() {
		return surveyor_name;
	}

	public void setSurveyor_name(String surveyor_name) {
		this.surveyor_name = surveyor_name;
	}

	public String getSurveyor_appoint_for() {
		return surveyor_appoint_for;
	}

	public void setSurveyor_appoint_for(String surveyor_appoint_for) {
		this.surveyor_appoint_for = surveyor_appoint_for;
	}

	public String getClaim_no() {
		return claim_no;
	}

	public void setClaim_no(String claim_no) {
		this.claim_no = claim_no;
	}

	public String getSurvey_bill_no() {
		return survey_bill_no;
	}

	public void setSurvey_bill_no(String survey_bill_no) {
		this.survey_bill_no = survey_bill_no;
	}

	public LocalDate getSurvey_bill_dt() {
		return survey_bill_dt;
	}

	public void setSurvey_bill_dt(LocalDate survey_bill_dt) {
		this.survey_bill_dt = survey_bill_dt;
	}

	public String getTransaction_no() {
		return transaction_no;
	}

	public void setTransaction_no(String transaction_no) {
		this.transaction_no = transaction_no;
	}

	public LocalDate getTransaction_dt() {
		return transaction_dt;
	}

	public void setTransaction_dt(LocalDate transaction_dt) {
		this.transaction_dt = transaction_dt;
	}

	public String getSurvey_branch() {
		return survey_branch;
	}

	public void setSurvey_branch(String survey_branch) {
		this.survey_branch = survey_branch;
	}

	public double getSurvey_bill_amt() {
		return survey_bill_amt;
	}

	public void setSurvey_bill_amt(double survey_bill_amt) {
		this.survey_bill_amt = survey_bill_amt;
	}

	public long getWorkflow_status_id() {
		return workflow_status_id;
	}

	public void setWorkflow_status_id(long workflow_status_id) {
		this.workflow_status_id = workflow_status_id;
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
