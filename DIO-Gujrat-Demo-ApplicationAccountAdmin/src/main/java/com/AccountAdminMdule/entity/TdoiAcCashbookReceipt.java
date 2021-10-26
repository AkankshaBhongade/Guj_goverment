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
@Table(name = "TDOI_AC_CASHBOOK_RECEIPT",schema = "DOI")
public class TdoiAcCashbookReceipt {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CB_RECEIPT_ID")
	private long cb_receipt_id;
	
	@Column(name = "REFERENCE_NO")
	private String reference_no="xxxxx";
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@Column(name = "REFERENCE_DT")
	private LocalDateTime reference_dt=LocalDateTime.now();
	
    @NotNull
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@Column(name = "PAYMENT_DT")
	private LocalDateTime payment_dt=LocalDateTime.now();
	
	
	@Column(name = "BILL_RECEIPT_SRNO")
	private long bill_receipt_srno= 0;
	
	@Column(name = "RECEIVE_FROM_NAME")
	private String receive_from_name="xxxxx";

	
	@Column(name = "CHEQUE_DD_NO")
	private long cheque_dd_no= 0;
	
	@Column(name = "GOVT_ACC_RECEIPT")
	private String govt_acc_receipt="xxxxx";
	
	@Column(name = "ALLOWANCE_PAY")
	private double ALLOWANCE_PAY= 0.0;
	
	@Column(name = "ADVANCE")
	private double advance= 0.0;
	
	@Column(name = "TOT_ALLOWANCE")
	private double tot_allowance= 0.0;
	
	@Column(name = "TOTAL_AMT")
	private double total_amt= 0.0;
	
	@Column(name = "PERM_ADV_RECOUP")
	private double perm_adv_recoup= 0.0;
	
	@Column(name = "DRAWN_AMT_TYPE_ID")
	private long drawn_amt_type_id= 0;
	
	@Column(name = "DRAWN_BILL_AMT")
	private double drawn_bill_amt= 0.0;
	
	@Column(name = "MISC_AMT")
	private double misc_amt= 0.0;
	
	@Column(name = "MAJORHEAD_ID")
	private long majorhead_id= 0;
	
	@Column(name = "SUBMAJORHEAD_ID")
	private long submajorhead_id= 0;
	
	@Column(name = "MINORHEAD_ID")
	private long minorhead_id= 0;
	
	@Column(name = "SUBHEAD_ID")
	private long subhead_id= 0;
	
	@NotNull
	@Column(name = "ACTIVE_STATUS")
	private short active_status= 0;
	
	@NotNull
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@Column(name = "CREATED_DATE")
	private LocalDateTime  created_date=LocalDateTime.now();
	
	@NotNull
	@Column(name = "CREATED_BY")
	private long created_by = 0;
	
	@NotNull
	@Column(name = "CREATED_BY_POST")
	private long created_by_post = 0;
	
	@NotNull
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@Column(name = "UPDATED_DATE")
	private LocalDateTime updated_date=LocalDateTime.now();
	
	@NotNull
	@Column(name = "UPDATED_BY")
	private long updated_by = 0;
	
	@NotNull
	@Column(name = "UPDATED_BY_POST")
	private long updated_by_post = 0;
	
	@Column(name = "CHALLAN_AMOUNT")
	private double challan_amount= 0.0;
	
	@Column(name = "CHALLAN_NO")
	private int challan_no;

	public TdoiAcCashbookReceipt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TdoiAcCashbookReceipt(long cb_receipt_id, String reference_no, LocalDateTime reference_dt,
			LocalDateTime payment_dt, long bill_receipt_srno, String receive_from_name, long cheque_dd_no,
			String govt_acc_receipt, double aLLOWANCE_PAY, double advance, double tot_allowance, double total_amt,
			double perm_adv_recoup, long drawn_amt_type_id, double drawn_bill_amt, double misc_amt, long majorhead_id,
			long submajorhead_id, long minorhead_id, long subhead_id, short active_status, LocalDateTime created_date,
			long created_by, long created_by_post, LocalDateTime updated_date, long updated_by, long updated_by_post,
			double challan_amount, int challan_no) {
		super();
		this.cb_receipt_id = cb_receipt_id;
		this.reference_no = reference_no;
		this.reference_dt = reference_dt;
		this.payment_dt = payment_dt;
		this.bill_receipt_srno = bill_receipt_srno;
		this.receive_from_name = receive_from_name;
		this.cheque_dd_no = cheque_dd_no;
		this.govt_acc_receipt = govt_acc_receipt;
		ALLOWANCE_PAY = aLLOWANCE_PAY;
		this.advance = advance;
		this.tot_allowance = tot_allowance;
		this.total_amt = total_amt;
		this.perm_adv_recoup = perm_adv_recoup;
		this.drawn_amt_type_id = drawn_amt_type_id;
		this.drawn_bill_amt = drawn_bill_amt;
		this.misc_amt = misc_amt;
		this.majorhead_id = majorhead_id;
		this.submajorhead_id = submajorhead_id;
		this.minorhead_id = minorhead_id;
		this.subhead_id = subhead_id;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
		this.challan_amount = challan_amount;
		this.challan_no = challan_no;
	}

	@Override
	public String toString() {
		return "TdoiAcCashbookReceipt [cb_receipt_id=" + cb_receipt_id + ", reference_no=" + reference_no
				+ ", reference_dt=" + reference_dt + ", payment_dt=" + payment_dt + ", bill_receipt_srno="
				+ bill_receipt_srno + ", receive_from_name=" + receive_from_name + ", cheque_dd_no=" + cheque_dd_no
				+ ", govt_acc_receipt=" + govt_acc_receipt + ", ALLOWANCE_PAY=" + ALLOWANCE_PAY + ", advance=" + advance
				+ ", tot_allowance=" + tot_allowance + ", total_amt=" + total_amt + ", perm_adv_recoup="
				+ perm_adv_recoup + ", drawn_amt_type_id=" + drawn_amt_type_id + ", drawn_bill_amt=" + drawn_bill_amt
				+ ", misc_amt=" + misc_amt + ", majorhead_id=" + majorhead_id + ", submajorhead_id=" + submajorhead_id
				+ ", minorhead_id=" + minorhead_id + ", subhead_id=" + subhead_id + ", active_status=" + active_status
				+ ", created_date=" + created_date + ", created_by=" + created_by + ", created_by_post="
				+ created_by_post + ", updated_date=" + updated_date + ", updated_by=" + updated_by
				+ ", updated_by_post=" + updated_by_post + ", challan_amount=" + challan_amount + ", challan_no="
				+ challan_no + "]";
	}

	public long getCb_receipt_id() {
		return cb_receipt_id;
	}

	public void setCb_receipt_id(long cb_receipt_id) {
		this.cb_receipt_id = cb_receipt_id;
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

	public LocalDateTime getPayment_dt() {
		return payment_dt;
	}

	public void setPayment_dt(LocalDateTime payment_dt) {
		this.payment_dt = payment_dt;
	}

	public long getBill_receipt_srno() {
		return bill_receipt_srno;
	}

	public void setBill_receipt_srno(long bill_receipt_srno) {
		this.bill_receipt_srno = bill_receipt_srno;
	}

	public String getReceive_from_name() {
		return receive_from_name;
	}

	public void setReceive_from_name(String receive_from_name) {
		this.receive_from_name = receive_from_name;
	}

	public long getCheque_dd_no() {
		return cheque_dd_no;
	}

	public void setCheque_dd_no(long cheque_dd_no) {
		this.cheque_dd_no = cheque_dd_no;
	}

	public String getGovt_acc_receipt() {
		return govt_acc_receipt;
	}

	public void setGovt_acc_receipt(String govt_acc_receipt) {
		this.govt_acc_receipt = govt_acc_receipt;
	}

	public double getALLOWANCE_PAY() {
		return ALLOWANCE_PAY;
	}

	public void setALLOWANCE_PAY(double aLLOWANCE_PAY) {
		ALLOWANCE_PAY = aLLOWANCE_PAY;
	}

	public double getAdvance() {
		return advance;
	}

	public void setAdvance(double advance) {
		this.advance = advance;
	}

	public double getTot_allowance() {
		return tot_allowance;
	}

	public void setTot_allowance(double tot_allowance) {
		this.tot_allowance = tot_allowance;
	}

	public double getTotal_amt() {
		return total_amt;
	}

	public void setTotal_amt(double total_amt) {
		this.total_amt = total_amt;
	}

	public double getPerm_adv_recoup() {
		return perm_adv_recoup;
	}

	public void setPerm_adv_recoup(double perm_adv_recoup) {
		this.perm_adv_recoup = perm_adv_recoup;
	}

	public long getDrawn_amt_type_id() {
		return drawn_amt_type_id;
	}

	public void setDrawn_amt_type_id(long drawn_amt_type_id) {
		this.drawn_amt_type_id = drawn_amt_type_id;
	}

	public double getDrawn_bill_amt() {
		return drawn_bill_amt;
	}

	public void setDrawn_bill_amt(double drawn_bill_amt) {
		this.drawn_bill_amt = drawn_bill_amt;
	}

	public double getMisc_amt() {
		return misc_amt;
	}

	public void setMisc_amt(double misc_amt) {
		this.misc_amt = misc_amt;
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

	public double getChallan_amount() {
		return challan_amount;
	}

	public void setChallan_amount(double challan_amount) {
		this.challan_amount = challan_amount;
	}

	public int getChallan_no() {
		return challan_no;
	}

	public void setChallan_no(int challan_no) {
		this.challan_no = challan_no;
	}



}
