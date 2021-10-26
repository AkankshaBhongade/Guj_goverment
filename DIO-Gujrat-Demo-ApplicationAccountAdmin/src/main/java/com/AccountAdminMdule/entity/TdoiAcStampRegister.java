package com.AccountAdminMdule.entity;

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
@Table(name = "TDOI_AC_STAMP_REGISTER",schema = "DOI")
public class TdoiAcStampRegister {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STAMP_REG_ID")
	private long stamp_reg_id;
	
	@Column(name = "REFERENCE_NO")
	private String reference_no="xxxxx";
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@Column(name = "REFERENCE_DT")
	private LocalDateTime reference_dt=LocalDateTime.now();
	
	@Column(name = "STAMP_REFERENCE_NO")
	private String stamp_reference_no="xxxxx";
	
	@NotNull
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@Column(name = "TRANSACTION_DT")
	private LocalDateTime transaction_dt=LocalDateTime.now();
	
	@Column(name = "TRANSACTION_TYPE_ID")
	private long transaction_type_id= 0;
	
	@Column(name = "STAMP_AMT ")
	private double stamp_amt= 0.0;
	
	@Column(name = "AVAILABLE_AMT")
	private double avaliable_amt= 0.0;
	
    @Column(name = "REMARKS")
	private String remarks="xxxxx";
	
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
	
	
	

	public TdoiAcStampRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public TdoiAcStampRegister(long stamp_reg_id, String reference_no, LocalDateTime reference_dt,
			String stamp_reference_no, LocalDateTime transaction_dt, long transaction_type_id, double stamp_amt,
			double avaliable_amt, String remarks, short active_status, LocalDateTime created_date, long created_by,
			long created_by_post, LocalDateTime updated_date, long updated_by, long updated_by_post) {
		super();
		this.stamp_reg_id = stamp_reg_id;
		this.reference_no = reference_no;
		this.reference_dt = reference_dt;
		this.stamp_reference_no = stamp_reference_no;
		this.transaction_dt = transaction_dt;
		this.transaction_type_id = transaction_type_id;
		this.stamp_amt = stamp_amt;
		this.avaliable_amt = avaliable_amt;
		this.remarks = remarks;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
	}



	public long getStamp_reg_id() {
		return stamp_reg_id;
	}

	public void setStamp_reg_id(long stamp_reg_id) {
		this.stamp_reg_id = stamp_reg_id;
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

	public String getStamp_reference_no() {
		return stamp_reference_no;
	}

	public void setStamp_reference_no(String stamp_reference_no) {
		this.stamp_reference_no = stamp_reference_no;
	}

	public LocalDateTime getTransaction_dt() {
		return transaction_dt;
	}

	public void setTransaction_dt(LocalDateTime transaction_dt) {
		this.transaction_dt = transaction_dt;
	}

	public long getTransaction_type_id() {
		return transaction_type_id;
	}

	public void setTransaction_type_id(long transaction_type_id) {
		this.transaction_type_id = transaction_type_id;
	}

	public double getStamp_amt() {
		return stamp_amt;
	}

	public void setStamp_amt(double stamp_amt) {
		this.stamp_amt = stamp_amt;
	}

	public double getAvaliable_amt() {
		return avaliable_amt;
	}

	public void setAvaliable_amt(double avaliable_amt) {
		this.avaliable_amt = avaliable_amt;
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
