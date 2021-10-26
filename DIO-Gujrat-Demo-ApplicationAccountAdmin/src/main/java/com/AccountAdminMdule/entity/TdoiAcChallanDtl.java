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
@Table(name = "TDOI_AC_CHALLAN_DTL", schema = "DOI")
public class TdoiAcChallanDtl {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CHALLAN_DTL_ID")
	@NotNull
	private long challan_dtl_id;
	
	@Column(name = "REFERENCE_NO")
	private String reference_no;
	
	@Column(name = "REFERENCE_DT")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime reference_dt = LocalDateTime.now();

	@Column(name = "CHALLAN_NO")
	private String challan_no;
	
	@Column(name = "BTR_RECEIPT_NO")
	private long btr_receipt_no;
	
	@Column(name = "CHEQUE_DD_NO")
	private long cheque_dd_no;
	
	@Column(name = "CHEQUE_DD_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate cheque_dd_dt = LocalDate.now();

	@Column(name = "CHEQUE_DD_AMT")
	private double cheque_dd_amt;

	@Column(name = "CHEQUE_AMT_IN_WORDS")
	private String cheque_amt_in_word;
	
	@Column(name = "PARTY_NAME")
	private String party_name;
	
	@Column(name = "PARTY_DESC")
	private String party_desc;
	
	@Column(name = "MAJORHEAD_ID")
	private long majorhead_id;
	
	@Column(name = "SUBMAJORHEAD_ID")
	private long submajorhead_id;
	
	@Column(name = "MINORHEAD_ID")
	private long minorhead_id;
	
	@Column(name = "SUBHEAD_ID")
	private long subhead_id;
	
	@Column(name = "DETAIL_HEAD_ID")
	private long detail_head_id;
	
	@Column(name = "MOBILE_NO")
	private long mobile_no;
	
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
	
	@Column(name = "CHALLAN_DESC")
	private String challan_desc;

	@Column(name = "CHALLAN_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate challan_dt = LocalDate.now();

	public TdoiAcChallanDtl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TdoiAcChallanDtl(long challan_dtl_id, String reference_no, LocalDateTime reference_dt, String challan_no,
			long btr_receipt_no, long cheque_dd_no, LocalDate cheque_dd_dt, double cheque_dd_amt,
			String cheque_amt_in_word, String party_name, String party_desc, long majorhead_id, long submajorhead_id,
			long minorhead_id, long subhead_id, long detail_head_id, long mobile_no, short active_status,
			LocalDateTime created_date, long created_by, long created_by_post, LocalDateTime updated_date,
			long updated_by, long updated_by_post, String challan_desc, LocalDate challan_dt) {
		super();
		this.challan_dtl_id = challan_dtl_id;
		this.reference_no = reference_no;
		this.reference_dt = reference_dt;
		this.challan_no = challan_no;
		this.btr_receipt_no = btr_receipt_no;
		this.cheque_dd_no = cheque_dd_no;
		this.cheque_dd_dt = cheque_dd_dt;
		this.cheque_dd_amt = cheque_dd_amt;
		this.cheque_amt_in_word = cheque_amt_in_word;
		this.party_name = party_name;
		this.party_desc = party_desc;
		this.majorhead_id = majorhead_id;
		this.submajorhead_id = submajorhead_id;
		this.minorhead_id = minorhead_id;
		this.subhead_id = subhead_id;
		this.detail_head_id = detail_head_id;
		this.mobile_no = mobile_no;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
		this.challan_desc = challan_desc;
		this.challan_dt = challan_dt;
	}

	@Override
	public String toString() {
		return "TdoiAcChallanDtl [challan_dtl_id=" + challan_dtl_id + ", reference_no=" + reference_no
				+ ", reference_dt=" + reference_dt + ", challan_no=" + challan_no + ", btr_receipt_no=" + btr_receipt_no
				+ ", cheque_dd_no=" + cheque_dd_no + ", cheque_dd_dt=" + cheque_dd_dt + ", cheque_dd_amt="
				+ cheque_dd_amt + ", cheque_amt_in_word=" + cheque_amt_in_word + ", party_name=" + party_name
				+ ", party_desc=" + party_desc + ", majorhead_id=" + majorhead_id + ", submajorhead_id="
				+ submajorhead_id + ", minorhead_id=" + minorhead_id + ", subhead_id=" + subhead_id
				+ ", detail_head_id=" + detail_head_id + ", mobile_no=" + mobile_no + ", active_status=" + active_status
				+ ", created_date=" + created_date + ", created_by=" + created_by + ", created_by_post="
				+ created_by_post + ", updated_date=" + updated_date + ", updated_by=" + updated_by
				+ ", updated_by_post=" + updated_by_post + ", challan_desc=" + challan_desc + ", challan_dt="
				+ challan_dt + "]";
	}

	public long getChallan_dtl_id() {
		return challan_dtl_id;
	}

	public void setChallan_dtl_id(long challan_dtl_id) {
		this.challan_dtl_id = challan_dtl_id;
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

	public String getChallan_no() {
		return challan_no;
	}

	public void setChallan_no(String challan_no) {
		this.challan_no = challan_no;
	}

	public long getBtr_receipt_no() {
		return btr_receipt_no;
	}

	public void setBtr_receipt_no(long btr_receipt_no) {
		this.btr_receipt_no = btr_receipt_no;
	}

	public long getCheque_dd_no() {
		return cheque_dd_no;
	}

	public void setCheque_dd_no(long cheque_dd_no) {
		this.cheque_dd_no = cheque_dd_no;
	}

	public LocalDate getCheque_dd_dt() {
		return cheque_dd_dt;
	}

	public void setCheque_dd_dt(LocalDate cheque_dd_dt) {
		this.cheque_dd_dt = cheque_dd_dt;
	}

	public double getCheque_dd_amt() {
		return cheque_dd_amt;
	}

	public void setCheque_dd_amt(double cheque_dd_amt) {
		this.cheque_dd_amt = cheque_dd_amt;
	}

	public String getCheque_amt_in_word() {
		return cheque_amt_in_word;
	}

	public void setCheque_amt_in_word(String cheque_amt_in_word) {
		this.cheque_amt_in_word = cheque_amt_in_word;
	}

	public String getParty_name() {
		return party_name;
	}

	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}

	public String getParty_desc() {
		return party_desc;
	}

	public void setParty_desc(String party_desc) {
		this.party_desc = party_desc;
	}

	public long getMajorhead_id() {
		return majorhead_id;
	}

	public void setMajorhead_id(long majorhead_id) {
		this.majorhead_id = majorhead_id;
	}

	public long getSubmajorhead_id() {
		return submajorhead_id;
	}

	public void setSubmajorhead_id(long submajorhead_id) {
		this.submajorhead_id = submajorhead_id;
	}

	public long getMinorhead_id() {
		return minorhead_id;
	}

	public void setMinorhead_id(long minorhead_id) {
		this.minorhead_id = minorhead_id;
	}

	public long getSubhead_id() {
		return subhead_id;
	}

	public void setSubhead_id(long subhead_id) {
		this.subhead_id = subhead_id;
	}

	public long getDetail_head_id() {
		return detail_head_id;
	}

	public void setDetail_head_id(long detail_head_id) {
		this.detail_head_id = detail_head_id;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
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

	public String getChallan_desc() {
		return challan_desc;
	}

	public void setChallan_desc(String challan_desc) {
		this.challan_desc = challan_desc;
	}

	public LocalDate getChallan_dt() {
		return challan_dt;
	}

	public void setChallan_dt(LocalDate challan_dt) {
		this.challan_dt = challan_dt;
	}

	

}