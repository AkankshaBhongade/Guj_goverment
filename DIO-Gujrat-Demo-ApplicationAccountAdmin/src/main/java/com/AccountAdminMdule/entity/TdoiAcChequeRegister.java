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
@Table(name = "TDOI_AC_CHEQUE_REGISTER", schema = "DOI")
public class TdoiAcChequeRegister {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CHEQUE_REG_ID")
	@NotNull
	private long cheque_reg_id;

    @Column(name = "REFERENCE_NO")
	private String reference_no;

    @Column(name = "REFERENCE_DT")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime reference_dt = LocalDateTime.now();

    
	@Column(name = "BILL_NO")
	private String bill_no;
	
	@Column(name = "BILL_AMOUNT")
	private double bill_amount;

	@Column(name = "CHEQUE_NO")
	private long cheque_no;

	@Column(name = "EPAYMENT_NO")
	private String epayment_no;
	
	@Column(name = "CHEQUE_EPAY_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate cheque_epay_dt = LocalDate.now();

	@Column(name = "CASHBOOK_ENTRY_DT")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime cashbook_entry_dt = LocalDateTime.now();

	
	@Column(name = "MESSENGER_NAME")
	private String messenger_name;
	
	@Column(name = "ENCAH_DELIV_DT")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime encah_deliv_dt = LocalDateTime.now();

	
	@Column(name = "REMARKS")
	private String remarks;
	
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

	public TdoiAcChequeRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TdoiAcChequeRegister(long cheque_reg_id, String reference_no, LocalDateTime reference_dt, String bill_no,
			double bill_amount, long cheque_no, String epayment_no, LocalDate cheque_epay_dt,
			LocalDateTime cashbook_entry_dt, String messenger_name, LocalDateTime encah_deliv_dt, String remarks,
			short active_status, LocalDateTime created_date, long created_by, long created_by_post,
			LocalDateTime updated_date, long updated_by, long updated_by_post) {
		super();
		this.cheque_reg_id = cheque_reg_id;
		this.reference_no = reference_no;
		this.reference_dt = reference_dt;
		this.bill_no = bill_no;
		this.bill_amount = bill_amount;
		this.cheque_no = cheque_no;
		this.epayment_no = epayment_no;
		this.cheque_epay_dt = cheque_epay_dt;
		this.cashbook_entry_dt = cashbook_entry_dt;
		this.messenger_name = messenger_name;
		this.encah_deliv_dt = encah_deliv_dt;
		this.remarks = remarks;
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
		return "TdoiAcChequeRegister [cheque_reg_id=" + cheque_reg_id + ", reference_no=" + reference_no
				+ ", reference_dt=" + reference_dt + ", bill_no=" + bill_no + ", bill_amount=" + bill_amount
				+ ", cheque_no=" + cheque_no + ", epayment_no=" + epayment_no + ", cheque_epay_dt=" + cheque_epay_dt
				+ ", cashbook_entry_dt=" + cashbook_entry_dt + ", messenger_name=" + messenger_name
				+ ", encah_deliv_dt=" + encah_deliv_dt + ", remarks=" + remarks + ", active_status=" + active_status
				+ ", created_date=" + created_date + ", created_by=" + created_by + ", created_by_post="
				+ created_by_post + ", updated_date=" + updated_date + ", updated_by=" + updated_by
				+ ", updated_by_post=" + updated_by_post + "]";
	}

	public long getCheque_reg_id() {
		return cheque_reg_id;
	}

	public void setCheque_reg_id(long cheque_reg_id) {
		this.cheque_reg_id = cheque_reg_id;
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

	public String getBill_no() {
		return bill_no;
	}

	public void setBill_no(String bill_no) {
		this.bill_no = bill_no;
	}

	public double getBill_amount() {
		return bill_amount;
	}

	public void setBill_amount(double bill_amount) {
		this.bill_amount = bill_amount;
	}

	public long getCheque_no() {
		return cheque_no;
	}

	public void setCheque_no(long cheque_no) {
		this.cheque_no = cheque_no;
	}

	public String getEpayment_no() {
		return epayment_no;
	}

	public void setEpayment_no(String epayment_no) {
		this.epayment_no = epayment_no;
	}

	public LocalDate getCheque_epay_dt() {
		return cheque_epay_dt;
	}

	public void setCheque_epay_dt(LocalDate cheque_epay_dt) {
		this.cheque_epay_dt = cheque_epay_dt;
	}

	public LocalDateTime getCashbook_entry_dt() {
		return cashbook_entry_dt;
	}

	public void setCashbook_entry_dt(LocalDateTime cashbook_entry_dt) {
		this.cashbook_entry_dt = cashbook_entry_dt;
	}

	public String getMessenger_name() {
		return messenger_name;
	}

	public void setMessenger_name(String messenger_name) {
		this.messenger_name = messenger_name;
	}

	public LocalDateTime getEncah_deliv_dt() {
		return encah_deliv_dt;
	}

	public void setEncah_deliv_dt(LocalDateTime encah_deliv_dt) {
		this.encah_deliv_dt = encah_deliv_dt;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
