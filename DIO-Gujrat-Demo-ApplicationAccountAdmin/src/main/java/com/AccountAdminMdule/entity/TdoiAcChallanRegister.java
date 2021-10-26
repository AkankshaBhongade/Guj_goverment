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

//import com.sun.istack.NotNull;

@Entity
@Table(name = "TDOI_AC_CHALLAN_REGISTER", schema = "DOI")
public class TdoiAcChallanRegister {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CHALLAN_REG_ID")
	@NotNull
	private long challan_reg_id;
	
	@Column(name = "REFERENCE_NO")
	private String reference_no;
	
	@Column(name = "REFERENCE_DT")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime reference_dt = LocalDateTime.now();

	@Column(name = "SERIAL_NO")
	private String serial_no;
	
	@Column(name = "CURRENT_DT")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime current_dt = LocalDateTime.now();

	@Column(name = "CHALLAN_NO")
	private long challan_no;
	
	@Column(name = "BTR_RECEIPT_DT")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime btr_receipt_dt = LocalDateTime.now();

	@Column(name = "CHEQUE_DD_NO")
	private long cheque_dd_no;
	
	@Column(name = "CHEQUE_DD_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate cheque_dd_dt = LocalDate.now();

	@Column(name = "BANK_ID")
	private long bank_id;
	
	@Column(name = "BANK_NAME")
	private String bank_name;
	
	@Column(name = "CHEQUE_DD_AMT")
	private double cheque_dd_amt;

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

	public TdoiAcChallanRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TdoiAcChallanRegister(long challan_reg_id, String reference_no, LocalDateTime reference_dt, String serial_no,
			LocalDateTime current_dt, long challan_no, LocalDateTime btr_receipt_dt, long cheque_dd_no,
			LocalDate cheque_dd_dt, long bank_id, String bank_name, double cheque_dd_amt, short active_status,
			LocalDateTime created_date, long created_by, long created_by_post, LocalDateTime updated_date,
			long updated_by, long updated_by_post) {
		super();
		this.challan_reg_id = challan_reg_id;
		this.reference_no = reference_no;
		this.reference_dt = reference_dt;
		this.serial_no = serial_no;
		this.current_dt = current_dt;
		this.challan_no = challan_no;
		this.btr_receipt_dt = btr_receipt_dt;
		this.cheque_dd_no = cheque_dd_no;
		this.cheque_dd_dt = cheque_dd_dt;
		this.bank_id = bank_id;
		this.bank_name = bank_name;
		this.cheque_dd_amt = cheque_dd_amt;
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
		return "TdoiAcChallanRegister [challan_reg_id=" + challan_reg_id + ", reference_no=" + reference_no
				+ ", reference_dt=" + reference_dt + ", serial_no=" + serial_no + ", current_dt=" + current_dt
				+ ", challan_no=" + challan_no + ", btr_receipt_dt=" + btr_receipt_dt + ", cheque_dd_no=" + cheque_dd_no
				+ ", cheque_dd_dt=" + cheque_dd_dt + ", bank_id=" + bank_id + ", bank_name=" + bank_name
				+ ", cheque_dd_amt=" + cheque_dd_amt + ", active_status=" + active_status + ", created_date="
				+ created_date + ", created_by=" + created_by + ", created_by_post=" + created_by_post
				+ ", updated_date=" + updated_date + ", updated_by=" + updated_by + ", updated_by_post="
				+ updated_by_post + "]";
	}

	public long getChallan_reg_id() {
		return challan_reg_id;
	}

	public void setChallan_reg_id(long challan_reg_id) {
		this.challan_reg_id = challan_reg_id;
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

	public String getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}

	public LocalDateTime getCurrent_dt() {
		return current_dt;
	}

	public void setCurrent_dt(LocalDateTime current_dt) {
		this.current_dt = current_dt;
	}

	public long getChallan_no() {
		return challan_no;
	}

	public void setChallan_no(long challan_no) {
		this.challan_no = challan_no;
	}

	public LocalDateTime getBtr_receipt_dt() {
		return btr_receipt_dt;
	}

	public void setBtr_receipt_dt(LocalDateTime btr_receipt_dt) {
		this.btr_receipt_dt = btr_receipt_dt;
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

	public long getBank_id() {
		return bank_id;
	}

	public void setBank_id(long bank_id) {
		this.bank_id = bank_id;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public double getCheque_dd_amt() {
		return cheque_dd_amt;
	}

	public void setCheque_dd_amt(double cheque_dd_amt) {
		this.cheque_dd_amt = cheque_dd_amt;
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
