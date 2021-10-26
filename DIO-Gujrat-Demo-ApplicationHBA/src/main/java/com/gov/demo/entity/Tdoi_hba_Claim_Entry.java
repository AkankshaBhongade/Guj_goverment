package com.gov.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;

import org.hibernate.annotations.ForeignKey;

import com.fasterxml.jackson.annotation.JsonFormat;
//import com.gov.demo.entity.Tdoi_inward_entry;
import com.ibm.db2.cmx.annotation.Column;
import com.sun.istack.NotNull;

//import gov.ifms.doi.model.Tdoi_inward_entry;

//import gov.ifms.doi.model.Tdoi_inward_entry;

@Entity
@Table(name = "TDOI_HBA_CLAIM_ENTRY", schema = "DOI")
public class Tdoi_hba_Claim_Entry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HBA_CLAIM_ID")
	@NotNull
	private long hba_claim_id = 0;

	
	@Column(name = "CLAIM_NO")
	@NotNull
	private String claim_no = "xxxxx";

	@JoinColumn(name = "INWARD_ID")
	@ForeignKey(name = "FK_TDOI_HBA_CLAIM_ENTRY_TDOI_INWARD_ENTRY")
	@ManyToOne
	private Tdoi_inward_entry inward_id;

	@Column(name = "INWARD_NO")
	private String inward_no = "xxxxx";

	@Column(name = "INWARD_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate inward_dt = LocalDate.now();
	

	@Column(name = "INWARD_ACCEPT_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate inward_accept_dt = LocalDate.now();
	

	@NotNull
	@ForeignKey(name = "FK_TDOI_HBA_CLAIM_ENTRY_TDOI_HBA_PROPOSAL")
	@JoinColumn(name = "HBA_PROPOSAL_ID")
	@ManyToOne
	private TdioHBAProposal hba_proposal_id;


	@Column(name = "HBA_POLICY_NO")
	private String hba_policy_no = "xxxxx";

	@Column(name = "POLICY_START_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate policy_start_dt = LocalDate.now();

	@Column(name = "POLICY_END_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate policy_end_dt = LocalDate.now();

	@Column(name = "SUM_INSURED")
	private double sum_insured = 0.0;

	@Column(name = "INSURED_NAME")
	private String insured_name = "xxxxx";

	@Column(name = "INSURED_ADDRESS")
	private String insured_address = "xxxxx";

	@Column(name = "AADHAR_NUM")
	@NotNull
	private long aadhar_num = 0;

	@Column(name = "MOBILE_NUM")
	private long mobile_num = 0;

	@Email
	@Column(name = "EMAIL_ADDRESS")
	private String email_address;

	@Column(name = "INSUR_OTHER_COMPANY")
	private short insur_other_company = 0;

	@Column(name = "LOSS_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate loss_date = LocalDate.now();

	@Column(name = "LOSS_TIME")
	private String loss_time = "xxxxx";

	@Column(name = "CAUSE_OF_LOSS")
	private String cause_of_loss = "xxxxx";

	@Column(name = "EXTENT_OF_LOSS")
	private String extent_of_loss = "xxxxx";

	@Column(name = "IS_SURVEYOR_ASSGN")
	@NotNull
	private short is_surveyor_assgn = 0;

	@Column(name = "SURVEYOR_ID")
	private long surveyor_id = 0;

	@Column(name = "SURVEYOR_NAME")
	private String surveyor_name = "xxxxx";

	@Column(name = "SURV_BILL_NO")
	private String surv_bill_no = "xxxxx";

	@Column(name = "SURV_BILL_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate surv_bill_dt = LocalDate.now();

	@Column(name = "SURV_FEE_AMOUNT")
	private double surv_fee_amount = 0.0;

	@Column(name = "CLAIM_AMOUNT")
	private double claim_amount = 0.0;

	@Column(name = "CLAIM_MONTH_ID")
	private long claim_month_id = 0;

	@Column(name = "CLAIM_YEAR_ID")
	private long claim_year_id = 0;

	@Column(name = "CLAIM_GENRATE_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate claim_generate_dt = LocalDate.now();

	@Column(name = "CLAIM_STATUS_ID")
	private long claim_status_id = 0;

	@Column(name = "CLAIM_STATUS")
	private String claim_status = "xxxxx";

	@Column(name = "CLAIM_ACCEPT_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate claim_accept_dt = LocalDate.now();

	@Column(name = "CLAIM_ACCEPT_BY_ID")
	private long claim_accept_by_id = 0;

	@Column(name = "CLAIM_ENTRY_STATUS")
	private String claim_entry_status = "xxxxx";

	@Column(name = "REJECT_REASON")
	private String reject_reason = "xxxxx";

	@Column(name = "REJECTION_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate rejection_dt = LocalDate.now();

	@Column(name = "REJECTED_BY")
	private long rejected_by = 0;

	@Column(name = "IS_SENT_FOR_PAY")
	@NotNull
	private short is_sent_for_pay = 0;

	@Column(name = "IS_PAYMENT_DONE")
	@NotNull
	private short is_payment_done = 0;

	@Column(name = "TRANSACTION_ID")
	private String transaction_id = "xxxxx";

	@Column(name = "CHEQUE_NUM")
	private long cheque_num = 0;

	@Column(name = "PAYMENT_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate payment_dt = LocalDate.now();

	@Column(name = "PAID_AMOUNT")
	private double paid_amount = 0.0;

	@Column(name = "SURVEYOR_PAYMENT")
	private double surveyor_payment = 0.0;

	@Column(name = "REFERENCE_NO")
	private String reference_no = "xxxxx";

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
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@NotNull
	private LocalDateTime updated_date = LocalDateTime.now();

	@Column(name = "UPDATED_BY")
	@NotNull
	private long updated_by = 0;

	@Column(name = "UPDATED_BY_POST")
	@NotNull
	private long updated_by_post = 0;

	public Tdoi_hba_Claim_Entry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tdoi_hba_Claim_Entry(long hba_claim_id, String claim_no, Tdoi_inward_entry inward_id, String inward_no,
			LocalDate inward_dt, LocalDate inward_accept_dt, TdioHBAProposal hba_proposal_id, String hba_policy_no,
			LocalDate policy_start_dt, LocalDate policy_end_dt, double sum_insured, String insured_name,
			String insured_address, long aadhar_num, long mobile_num, String email_address, short insur_other_company,
			LocalDate loss_date, String loss_time, String cause_of_loss, String extent_of_loss, short is_surveyor_assgn,
			long surveyor_id, String surveyor_name, String surv_bill_no, LocalDate surv_bill_dt, double surv_fee_amount,
			double claim_amount, long claim_month_id, long claim_year_id, LocalDate claim_generate_dt,
			long claim_status_id, String claim_status, LocalDate claim_accept_dt, long claim_accept_by_id,
			String claim_entry_status, String reject_reason, LocalDate rejection_dt, long rejected_by,
			short is_sent_for_pay, short is_payment_done, String transaction_id, long cheque_num, LocalDate payment_dt,
			double paid_amount, double surveyor_payment, String reference_no, LocalDateTime reference_dt,
			short active_status, LocalDateTime created_date, long created_by, long created_by_post,
			LocalDateTime updated_date, long updated_by, long updated_by_post) {
		super();
		this.hba_claim_id = hba_claim_id;
		this.claim_no = claim_no;
		this.inward_id = inward_id;
		this.inward_no = inward_no;
		this.inward_dt = inward_dt;
		this.inward_accept_dt = inward_accept_dt;
		this.hba_proposal_id = hba_proposal_id;
		this.hba_policy_no = hba_policy_no;
		this.policy_start_dt = policy_start_dt;
		this.policy_end_dt = policy_end_dt;
		this.sum_insured = sum_insured;
		this.insured_name = insured_name;
		this.insured_address = insured_address;
		this.aadhar_num = aadhar_num;
		this.mobile_num = mobile_num;
		this.email_address = email_address;
		this.insur_other_company = insur_other_company;
		this.loss_date = loss_date;
		this.loss_time = loss_time;
		this.cause_of_loss = cause_of_loss;
		this.extent_of_loss = extent_of_loss;
		this.is_surveyor_assgn = is_surveyor_assgn;
		this.surveyor_id = surveyor_id;
		this.surveyor_name = surveyor_name;
		this.surv_bill_no = surv_bill_no;
		this.surv_bill_dt = surv_bill_dt;
		this.surv_fee_amount = surv_fee_amount;
		this.claim_amount = claim_amount;
		this.claim_month_id = claim_month_id;
		this.claim_year_id = claim_year_id;
		this.claim_generate_dt = claim_generate_dt;
		this.claim_status_id = claim_status_id;
		this.claim_status = claim_status;
		this.claim_accept_dt = claim_accept_dt;
		this.claim_accept_by_id = claim_accept_by_id;
		this.claim_entry_status = claim_entry_status;
		this.reject_reason = reject_reason;
		this.rejection_dt = rejection_dt;
		this.rejected_by = rejected_by;
		this.is_sent_for_pay = is_sent_for_pay;
		this.is_payment_done = is_payment_done;
		this.transaction_id = transaction_id;
		this.cheque_num = cheque_num;
		this.payment_dt = payment_dt;
		this.paid_amount = paid_amount;
		this.surveyor_payment = surveyor_payment;
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

	//@Override
//	public String toString() {
//		return "Tdoi_hba_Claim_Entry [hba_claim_id=" + hba_claim_id + ", claim_no=" + claim_no + ", inward_id="
//				+ inward_id + ", inward_no=" + inward_no + ", inward_dt=" + inward_dt + ", inward_accept_dt="
//				+ inward_accept_dt + ", hba_proposal_id=" + hba_proposal_id + ", hba_policy_no=" + hba_policy_no
//				+ ", policy_start_dt=" + policy_start_dt + ", policy_end_dt=" + policy_end_dt + ", sum_insured="
//				+ sum_insured + ", insured_name=" + insured_name + ", insured_address=" + insured_address
//				+ ", aadhar_num=" + aadhar_num + ", mobile_num=" + mobile_num + ", email_address=" + email_address
//				+ ", insur_other_company=" + insur_other_company + ", loss_date=" + loss_date + ", loss_time="
//				+ loss_time + ", cause_of_loss=" + cause_of_loss + ", extent_of_loss=" + extent_of_loss
//				+ ", is_surveyor_assgn=" + is_surveyor_assgn + ", surveyor_id=" + surveyor_id + ", surveyor_name="
//				+ surveyor_name + ", surv_bill_no=" + surv_bill_no + ", surv_bill_dt=" + surv_bill_dt
//				+ ", surv_fee_amount=" + surv_fee_amount + ", claim_amount=" + claim_amount + ", claim_month_id="
//				+ claim_month_id + ", claim_year_id=" + claim_year_id + ", claim_generate_dt=" + claim_generate_dt
//				+ ", claim_status_id=" + claim_status_id + ", claim_status=" + claim_status + ", claim_accept_dt="
//				+ claim_accept_dt + ", claim_accept_by_id=" + claim_accept_by_id + ", claim_entry_status="
//				+ claim_entry_status + ", reject_reason=" + reject_reason + ", rejection_dt=" + rejection_dt
//				+ ", rejected_by=" + rejected_by + ", is_sent_for_pay=" + is_sent_for_pay + ", is_payment_done="
//				+ is_payment_done + ", transaction_id=" + transaction_id + ", cheque_num=" + cheque_num
//				+ ", payment_dt=" + payment_dt + ", paid_amount=" + paid_amount + ", surveyor_payment="
//				+ surveyor_payment + ", reference_no=" + reference_no + ", reference_dt=" + reference_dt
//				+ ", active_status=" + active_status + ", created_date=" + created_date + ", created_by=" + created_by
//				+ ", created_by_post=" + created_by_post + ", updated_date=" + updated_date + ", updated_by="
//				+ updated_by + ", updated_by_post=" + updated_by_post + "]";
//	}

	public long getHba_claim_id() {
		return hba_claim_id;
	}

	public void setHba_claim_id(long hba_claim_id) {
		this.hba_claim_id = hba_claim_id;
	}

	public String getClaim_no() {
		return claim_no;
	}

	public void setClaim_no(String claim_no) {
		this.claim_no = claim_no;
	}

	public Tdoi_inward_entry getInward_id() {
		return inward_id;
	}

	public void setInward_id(Tdoi_inward_entry inward_id) {
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

	public LocalDate getInward_accept_dt() {
		return inward_accept_dt;
	}

	public void setInward_accept_dt(LocalDate inward_accept_dt) {
		this.inward_accept_dt = inward_accept_dt;
	}

	public TdioHBAProposal getHba_proposal_id() {
		return hba_proposal_id;
	}

	public void setHba_proposal_id(TdioHBAProposal hba_proposal_id) {
		this.hba_proposal_id = hba_proposal_id;
	}

	public String getHba_policy_no() {
		return hba_policy_no;
	}

	public void setHba_policy_no(String hba_policy_no) {
		this.hba_policy_no = hba_policy_no;
	}

	public LocalDate getPolicy_start_dt() {
		return policy_start_dt;
	}

	public void setPolicy_start_dt(LocalDate policy_start_dt) {
		this.policy_start_dt = policy_start_dt;
	}

	public LocalDate getPolicy_end_dt() {
		return policy_end_dt;
	}

	public void setPolicy_end_dt(LocalDate policy_end_dt) {
		this.policy_end_dt = policy_end_dt;
	}

	public double getSum_insured() {
		return sum_insured;
	}

	public void setSum_insured(double sum_insured) {
		this.sum_insured = sum_insured;
	}

	public String getInsured_name() {
		return insured_name;
	}

	public void setInsured_name(String insured_name) {
		this.insured_name = insured_name;
	}

	public String getInsured_address() {
		return insured_address;
	}

	public void setInsured_address(String insured_address) {
		this.insured_address = insured_address;
	}

	public long getAadhar_num() {
		return aadhar_num;
	}

	public void setAadhar_num(long aadhar_num) {
		this.aadhar_num = aadhar_num;
	}

	public long getMobile_num() {
		return mobile_num;
	}

	public void setMobile_num(long mobile_num) {
		this.mobile_num = mobile_num;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public short getInsur_other_company() {
		return insur_other_company;
	}

	public void setInsur_other_company(short insur_other_company) {
		this.insur_other_company = insur_other_company;
	}

	public LocalDate getLoss_date() {
		return loss_date;
	}

	public void setLoss_date(LocalDate loss_date) {
		this.loss_date = loss_date;
	}

	public String getLoss_time() {
		return loss_time;
	}

	public void setLoss_time(String loss_time) {
		this.loss_time = loss_time;
	}

	public String getCause_of_loss() {
		return cause_of_loss;
	}

	public void setCause_of_loss(String cause_of_loss) {
		this.cause_of_loss = cause_of_loss;
	}

	public String getExtent_of_loss() {
		return extent_of_loss;
	}

	public void setExtent_of_loss(String extent_of_loss) {
		this.extent_of_loss = extent_of_loss;
	}

	public short getIs_surveyor_assgn() {
		return is_surveyor_assgn;
	}

	public void setIs_surveyor_assgn(short is_surveyor_assgn) {
		this.is_surveyor_assgn = is_surveyor_assgn;
	}

	public long getSurveyor_id() {
		return surveyor_id;
	}

	public void setSurveyor_id(long surveyor_id) {
		this.surveyor_id = surveyor_id;
	}

	public String getSurveyor_name() {
		return surveyor_name;
	}

	public void setSurveyor_name(String surveyor_name) {
		this.surveyor_name = surveyor_name;
	}

	public String getSurv_bill_no() {
		return surv_bill_no;
	}

	public void setSurv_bill_no(String surv_bill_no) {
		this.surv_bill_no = surv_bill_no;
	}

	public LocalDate getSurv_bill_dt() {
		return surv_bill_dt;
	}

	public void setSurv_bill_dt(LocalDate surv_bill_dt) {
		this.surv_bill_dt = surv_bill_dt;
	}

	public double getSurv_fee_amount() {
		return surv_fee_amount;
	}

	public void setSurv_fee_amount(double surv_fee_amount) {
		this.surv_fee_amount = surv_fee_amount;
	}

	public double getClaim_amount() {
		return claim_amount;
	}

	public void setClaim_amount(double claim_amount) {
		this.claim_amount = claim_amount;
	}

	public long getClaim_month_id() {
		return claim_month_id;
	}

	public void setClaim_month_id(long claim_month_id) {
		this.claim_month_id = claim_month_id;
	}

	public long getClaim_year_id() {
		return claim_year_id;
	}

	public void setClaim_year_id(long claim_year_id) {
		this.claim_year_id = claim_year_id;
	}

	public LocalDate getClaim_generate_dt() {
		return claim_generate_dt;
	}

	public void setClaim_generate_dt(LocalDate claim_generate_dt) {
		this.claim_generate_dt = claim_generate_dt;
	}

	public long getClaim_status_id() {
		return claim_status_id;
	}

	public void setClaim_status_id(long claim_status_id) {
		this.claim_status_id = claim_status_id;
	}

	public String getClaim_status() {
		return claim_status;
	}

	public void setClaim_status(String claim_status) {
		this.claim_status = claim_status;
	}

	public LocalDate getClaim_accept_dt() {
		return claim_accept_dt;
	}

	public void setClaim_accept_dt(LocalDate claim_accept_dt) {
		this.claim_accept_dt = claim_accept_dt;
	}

	public long getClaim_accept_by_id() {
		return claim_accept_by_id;
	}

	public void setClaim_accept_by_id(long claim_accept_by_id) {
		this.claim_accept_by_id = claim_accept_by_id;
	}

	public String getClaim_entry_status() {
		return claim_entry_status;
	}

	public void setClaim_entry_status(String claim_entry_status) {
		this.claim_entry_status = claim_entry_status;
	}

	public String getReject_reason() {
		return reject_reason;
	}

	public void setReject_reason(String reject_reason) {
		this.reject_reason = reject_reason;
	}

	public LocalDate getRejection_dt() {
		return rejection_dt;
	}

	public void setRejection_dt(LocalDate rejection_dt) {
		this.rejection_dt = rejection_dt;
	}

	public long getRejected_by() {
		return rejected_by;
	}

	public void setRejected_by(long rejected_by) {
		this.rejected_by = rejected_by;
	}

	public short getIs_sent_for_pay() {
		return is_sent_for_pay;
	}

	public void setIs_sent_for_pay(short is_sent_for_pay) {
		this.is_sent_for_pay = is_sent_for_pay;
	}

	public short getIs_payment_done() {
		return is_payment_done;
	}

	public void setIs_payment_done(short is_payment_done) {
		this.is_payment_done = is_payment_done;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public long getCheque_num() {
		return cheque_num;
	}

	public void setCheque_num(long cheque_num) {
		this.cheque_num = cheque_num;
	}

	public LocalDate getPayment_dt() {
		return payment_dt;
	}

	public void setPayment_dt(LocalDate payment_dt) {
		this.payment_dt = payment_dt;
	}

	public double getPaid_amount() {
		return paid_amount;
	}

	public void setPaid_amount(double paid_amount) {
		this.paid_amount = paid_amount;
	}

	public double getSurveyor_payment() {
		return surveyor_payment;
	}

	public void setSurveyor_payment(double surveyor_payment) {
		this.surveyor_payment = surveyor_payment;
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
	
	
	@Transient
	private String hbaproposalid;
	
	@Transient
	private String  inwardid;

	public String getHbaproposalid() {
		return hbaproposalid;
	}

	public void setHbaproposalid(String hbaproposalid) {
		this.hbaproposalid = hbaproposalid;
	}

	public String getInwardid() {
		return inwardid;
	}

	public void setInwardid(String inwardid) {
		this.inwardid = inwardid;
	}

	@Transient
	private Long disticid;

	public Long getDisticid() {
		return disticid;
	}

	public void setDisticid(Long disticid) {
		this.disticid = disticid;
	}
	
	
	
	
}