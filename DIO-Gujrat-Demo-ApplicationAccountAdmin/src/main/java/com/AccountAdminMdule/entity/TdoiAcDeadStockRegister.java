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
@Table(name = "TDOI_AC_DEAD_STOCK_REGISTER", schema = "DOI")
public class TdoiAcDeadStockRegister {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEAD_STK_REG_ID")
	@NotNull
	private long dead_stk_reg_id;
	
	@Column(name = "REFERENCE_NO")
	private String reference_no;

	@Column(name = "REFERENCE_DT")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime reference_dt = LocalDateTime.now();

	@Column(name = "EQUIP_TYPE_ID")
	private long equip_type_id;

	@Column(name = "EQUIPMENT_NAME")
	private String equipment_name;

	@Column(name = "PURCHASE_ORDER_NO")
	private String purchase_order_no;
	
	@Column(name = "QUANTITY")
	private int quantity;
	
	@Column(name = "PURCHASE_AMOUNT")
	private double purchase_amount;

	@Column(name = "PURCH_RECEIVR_NAME")
	private String purch_receivr_name;

	@Column(name = "SERIAL_NO")
	private String serial_no;

	@Column(name = "REMARKS")
	private String remarks;
	
	@Column(name = "DISPOSAL_TYPE_ID")
	private long disposal_type_id;

	@Column(name = "DISPOSAL_TYPE")
	private String disposal_type;

	@Column(name = "ORDER_VOUCHER_NO")
	private String order_voucher_no;
	
	@Column(name = "ORDER_VOUCHER_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate order_voucher_dt = LocalDate.now();

	@Column(name = "FINAL_DISP_QTY")
	private int final_disp_qty;
	
	@Column(name = "DISP_RECEIVR_NAME")
	private String disp_receivr_name;

	@Column(name = "DISP_RECV_AMT")
	private double disp_recv_amt;
	
	@Column(name = "DISP_RECV_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate disp_recv_dt = LocalDate.now();

	@Column(name = "GOVT_DEPOSIT_AMT")
	private double gov_deposit_amt;
	
	@Column(name = "DEPOSIT_AMOUNT_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate deposit_amount_dt = LocalDate.now();

	@Column(name = "REMAINING_QTY")
	private int remaining_qty;
	
	@Column(name = "REMAINING_EQUIP_AMT")
	private double remaining_equip_amt;
	
	@Column(name = "DISPOSAL_STATUS")
	private String disposal_status;
	
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

	@Column(name = "PURCHASE_ORDER_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate purchase_order_dt = LocalDate.now();

	public TdoiAcDeadStockRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TdoiAcDeadStockRegister(long dead_stk_reg_id, String reference_no, LocalDateTime reference_dt,
			long equip_type_id, String equipment_name, String purchase_order_no, int quantity, double purchase_amount,
			String purch_receivr_name, String serial_no, String remarks, long disposal_type_id, String disposal_type,
			String order_voucher_no, LocalDate order_voucher_dt, int final_disp_qty, String disp_receivr_name,
			double disp_recv_amt, LocalDate disp_recv_dt, double gov_deposit_amt, LocalDate deposit_amount_dt,
			int remaining_qty, double remaining_equip_amt, String disposal_status, short active_status,
			LocalDateTime created_date, long created_by, long created_by_post, LocalDateTime updated_date,
			long updated_by, long updated_by_post, LocalDate purchase_order_dt) {
		super();
		this.dead_stk_reg_id = dead_stk_reg_id;
		this.reference_no = reference_no;
		this.reference_dt = reference_dt;
		this.equip_type_id = equip_type_id;
		this.equipment_name = equipment_name;
		this.purchase_order_no = purchase_order_no;
		this.quantity = quantity;
		this.purchase_amount = purchase_amount;
		this.purch_receivr_name = purch_receivr_name;
		this.serial_no = serial_no;
		this.remarks = remarks;
		this.disposal_type_id = disposal_type_id;
		this.disposal_type = disposal_type;
		this.order_voucher_no = order_voucher_no;
		this.order_voucher_dt = order_voucher_dt;
		this.final_disp_qty = final_disp_qty;
		this.disp_receivr_name = disp_receivr_name;
		this.disp_recv_amt = disp_recv_amt;
		this.disp_recv_dt = disp_recv_dt;
		this.gov_deposit_amt = gov_deposit_amt;
		this.deposit_amount_dt = deposit_amount_dt;
		this.remaining_qty = remaining_qty;
		this.remaining_equip_amt = remaining_equip_amt;
		this.disposal_status = disposal_status;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
		this.purchase_order_dt = purchase_order_dt;
	}

	@Override
	public String toString() {
		return "TdoiAcDeadStockRegister [dead_stk_reg_id=" + dead_stk_reg_id + ", reference_no=" + reference_no
				+ ", reference_dt=" + reference_dt + ", equip_type_id=" + equip_type_id + ", equipment_name="
				+ equipment_name + ", purchase_order_no=" + purchase_order_no + ", quantity=" + quantity
				+ ", purchase_amount=" + purchase_amount + ", purch_receivr_name=" + purch_receivr_name + ", serial_no="
				+ serial_no + ", remarks=" + remarks + ", disposal_type_id=" + disposal_type_id + ", disposal_type="
				+ disposal_type + ", order_voucher_no=" + order_voucher_no + ", order_voucher_dt=" + order_voucher_dt
				+ ", final_disp_qty=" + final_disp_qty + ", disp_receivr_name=" + disp_receivr_name + ", disp_recv_amt="
				+ disp_recv_amt + ", disp_recv_dt=" + disp_recv_dt + ", gov_deposit_amt=" + gov_deposit_amt
				+ ", deposit_amount_dt=" + deposit_amount_dt + ", remaining_qty=" + remaining_qty
				+ ", remaining_equip_amt=" + remaining_equip_amt + ", disposal_status=" + disposal_status
				+ ", active_status=" + active_status + ", created_date=" + created_date + ", created_by=" + created_by
				+ ", created_by_post=" + created_by_post + ", updated_date=" + updated_date + ", updated_by="
				+ updated_by + ", updated_by_post=" + updated_by_post + ", purchase_order_dt=" + purchase_order_dt
				+ "]";
	}

	public long getDead_stk_reg_id() {
		return dead_stk_reg_id;
	}

	public void setDead_stk_reg_id(long dead_stk_reg_id) {
		this.dead_stk_reg_id = dead_stk_reg_id;
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

	public long getEquip_type_id() {
		return equip_type_id;
	}

	public void setEquip_type_id(long equip_type_id) {
		this.equip_type_id = equip_type_id;
	}

	public String getEquipment_name() {
		return equipment_name;
	}

	public void setEquipment_name(String equipment_name) {
		this.equipment_name = equipment_name;
	}

	public String getPurchase_order_no() {
		return purchase_order_no;
	}

	public void setPurchase_order_no(String purchase_order_no) {
		this.purchase_order_no = purchase_order_no;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPurchase_amount() {
		return purchase_amount;
	}

	public void setPurchase_amount(double purchase_amount) {
		this.purchase_amount = purchase_amount;
	}

	public String getPurch_receivr_name() {
		return purch_receivr_name;
	}

	public void setPurch_receivr_name(String purch_receivr_name) {
		this.purch_receivr_name = purch_receivr_name;
	}

	public String getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public long getDisposal_type_id() {
		return disposal_type_id;
	}

	public void setDisposal_type_id(long disposal_type_id) {
		this.disposal_type_id = disposal_type_id;
	}

	public String getDisposal_type() {
		return disposal_type;
	}

	public void setDisposal_type(String disposal_type) {
		this.disposal_type = disposal_type;
	}

	public String getOrder_voucher_no() {
		return order_voucher_no;
	}

	public void setOrder_voucher_no(String order_voucher_no) {
		this.order_voucher_no = order_voucher_no;
	}

	public LocalDate getOrder_voucher_dt() {
		return order_voucher_dt;
	}

	public void setOrder_voucher_dt(LocalDate order_voucher_dt) {
		this.order_voucher_dt = order_voucher_dt;
	}

	public int getFinal_disp_qty() {
		return final_disp_qty;
	}

	public void setFinal_disp_qty(int final_disp_qty) {
		this.final_disp_qty = final_disp_qty;
	}

	public String getDisp_receivr_name() {
		return disp_receivr_name;
	}

	public void setDisp_receivr_name(String disp_receivr_name) {
		this.disp_receivr_name = disp_receivr_name;
	}

	public double getDisp_recv_amt() {
		return disp_recv_amt;
	}

	public void setDisp_recv_amt(double disp_recv_amt) {
		this.disp_recv_amt = disp_recv_amt;
	}

	public LocalDate getDisp_recv_dt() {
		return disp_recv_dt;
	}

	public void setDisp_recv_dt(LocalDate disp_recv_dt) {
		this.disp_recv_dt = disp_recv_dt;
	}

	public double getGov_deposit_amt() {
		return gov_deposit_amt;
	}

	public void setGov_deposit_amt(double gov_deposit_amt) {
		this.gov_deposit_amt = gov_deposit_amt;
	}

	public LocalDate getDeposit_amount_dt() {
		return deposit_amount_dt;
	}

	public void setDeposit_amount_dt(LocalDate deposit_amount_dt) {
		this.deposit_amount_dt = deposit_amount_dt;
	}

	public int getRemaining_qty() {
		return remaining_qty;
	}

	public void setRemaining_qty(int remaining_qty) {
		this.remaining_qty = remaining_qty;
	}

	public double getRemaining_equip_amt() {
		return remaining_equip_amt;
	}

	public void setRemaining_equip_amt(double remaining_equip_amt) {
		this.remaining_equip_amt = remaining_equip_amt;
	}

	public String getDisposal_status() {
		return disposal_status;
	}

	public void setDisposal_status(String disposal_status) {
		this.disposal_status = disposal_status;
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

	public LocalDate getPurchase_order_dt() {
		return purchase_order_dt;
	}

	public void setPurchase_order_dt(LocalDate purchase_order_dt) {
		this.purchase_order_dt = purchase_order_dt;
	}


}
