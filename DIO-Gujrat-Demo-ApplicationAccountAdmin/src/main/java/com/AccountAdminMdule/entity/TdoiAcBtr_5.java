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
@Table(name = "TDOI_AC_BTR_5",schema = "DOI")
public class TdoiAcBtr_5 {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BTR5_REG_ID")
	private long btr5_reg_id;
	
	@Column(name = "REFERENCE_NO")
	private String reference_no="xxxxx";
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@Column(name = "REFERENCE_DT")
	private LocalDateTime reference_dt=LocalDateTime.now();
	
	@Column(name = "RECEIPT_NO")
	private String receipt_no;
	
	@Column(name = "FIN_YEAR_ID")
	private long fin_year_id;
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@Column(name = "TRANSACTION_DT")
	private LocalDateTime transaction_dt=LocalDateTime.now();
	
	@Column(name = "RECV_FRM_TYPE_ID")
	private long recv_frm_type_id;

	@Column(name = "LETTER_NO")
	private String letter_no;
	
	@Column(name = "PARTY_TYPE_ID")
	private long party_type_id;
	
	@Column(name = "PARTY_NAME")
	private String party_name;
	
	@Column(name = "PARTY_ADDRESS")
	private String party_address;
	
	@Column(name = "CHEQUE_DD_CASH_ID")
	private long cheque_dd_cash_id;
	
	@Column(name = "BANK_ID")
	private long bank_id;

	@Column(name = "BANK_NAME")
	private String bank_name;
	
	@Column(name = "BRANCH_ID")
	private long branch_id;
	
	@Column(name = "BRANCH_NAME")
	private String branch_name;
	
	@Column(name = "CHEQUE_DD_NO")
	private long cheque_dd_no;

	@Column(name = "CHEQUE_DD_DT")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate cheque_dd_dt = LocalDate.now();
	
	@Column(name = "CHEQUE_DD_AMT")
	private double cheque_dd_amt;
	
	@Column(name = "CHEQUE_AMT_IN_WORDS")
	private String cheque_amt_in_words;
	
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
	
	@Column(name = "PAYMENT_MODE")
	private String payment_mode ="xxxxx";
	
	@Column(name = "MAJORHEAD_ID")
	private long majorhead_id = 0;
	
	@Column(name = "INSURED_ADDRESS")
	private String insured_address ="xxxxx";
	
	@Column(name = "INSURED_NAME")
	private String insured_name ="xxxxx";

	public TdoiAcBtr_5() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TdoiAcBtr_5(long btr5_reg_id, String reference_no, LocalDateTime reference_dt, String receipt_no,
			long fin_year_id, LocalDateTime transaction_dt, long recv_frm_type_id, String letter_no, long party_type_id,
			String party_name, String party_address, long cheque_dd_cash_id, long bank_id, String bank_name,
			long branch_id, String branch_name, long cheque_dd_no, LocalDate cheque_dd_dt, double cheque_dd_amt,
			String cheque_amt_in_words, short active_status, LocalDateTime created_date, long created_by,
			long created_by_post, LocalDateTime updated_date, long updated_by, long updated_by_post,
			String payment_mode, long majorhead_id, String insured_address, String insured_name) {
		super();
		this.btr5_reg_id = btr5_reg_id;
		this.reference_no = reference_no;
		this.reference_dt = reference_dt;
		this.receipt_no = receipt_no;
		this.fin_year_id = fin_year_id;
		this.transaction_dt = transaction_dt;
		this.recv_frm_type_id = recv_frm_type_id;
		this.letter_no = letter_no;
		this.party_type_id = party_type_id;
		this.party_name = party_name;
		this.party_address = party_address;
		this.cheque_dd_cash_id = cheque_dd_cash_id;
		this.bank_id = bank_id;
		this.bank_name = bank_name;
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.cheque_dd_no = cheque_dd_no;
		this.cheque_dd_dt = cheque_dd_dt;
		this.cheque_dd_amt = cheque_dd_amt;
		this.cheque_amt_in_words = cheque_amt_in_words;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
		this.payment_mode = payment_mode;
		this.majorhead_id = majorhead_id;
		this.insured_address = insured_address;
		this.insured_name = insured_name;
	}

	@Override
	public String toString() {
		return "TdoiAcBtr_5 [btr5_reg_id=" + btr5_reg_id + ", reference_no=" + reference_no + ", reference_dt="
				+ reference_dt + ", receipt_no=" + receipt_no + ", fin_year_id=" + fin_year_id + ", transaction_dt="
				+ transaction_dt + ", recv_frm_type_id=" + recv_frm_type_id + ", letter_no=" + letter_no
				+ ", party_type_id=" + party_type_id + ", party_name=" + party_name + ", party_address=" + party_address
				+ ", cheque_dd_cash_id=" + cheque_dd_cash_id + ", bank_id=" + bank_id + ", bank_name=" + bank_name
				+ ", branch_id=" + branch_id + ", branch_name=" + branch_name + ", cheque_dd_no=" + cheque_dd_no
				+ ", cheque_dd_dt=" + cheque_dd_dt + ", cheque_dd_amt=" + cheque_dd_amt + ", cheque_amt_in_words="
				+ cheque_amt_in_words + ", active_status=" + active_status + ", created_date=" + created_date
				+ ", created_by=" + created_by + ", created_by_post=" + created_by_post + ", updated_date="
				+ updated_date + ", updated_by=" + updated_by + ", updated_by_post=" + updated_by_post
				+ ", payment_mode=" + payment_mode + ", majorhead_id=" + majorhead_id + ", insured_address="
				+ insured_address + ", insured_name=" + insured_name + "]";
	}

	public long getBtr5_reg_id() {
		return btr5_reg_id;
	}

	public void setBtr5_reg_id(long btr5_reg_id) {
		this.btr5_reg_id = btr5_reg_id;
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

	public String getReceipt_no() {
		return receipt_no;
	}

	public void setReceipt_no(String receipt_no) {
		this.receipt_no = receipt_no;
	}

	public long getFin_year_id() {
		return fin_year_id;
	}

	public void setFin_year_id(long fin_year_id) {
		this.fin_year_id = fin_year_id;
	}

	public LocalDateTime getTransaction_dt() {
		return transaction_dt;
	}

	public void setTransaction_dt(LocalDateTime transaction_dt) {
		this.transaction_dt = transaction_dt;
	}

	public long getRecv_frm_type_id() {
		return recv_frm_type_id;
	}

	public void setRecv_frm_type_id(long recv_frm_type_id) {
		this.recv_frm_type_id = recv_frm_type_id;
	}

	public String getLetter_no() {
		return letter_no;
	}

	public void setLetter_no(String letter_no) {
		this.letter_no = letter_no;
	}

	public long getParty_type_id() {
		return party_type_id;
	}

	public void setParty_type_id(long party_type_id) {
		this.party_type_id = party_type_id;
	}

	public String getParty_name() {
		return party_name;
	}

	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}

	public String getParty_address() {
		return party_address;
	}

	public void setParty_address(String party_address) {
		this.party_address = party_address;
	}

	public long getCheque_dd_cash_id() {
		return cheque_dd_cash_id;
	}

	public void setCheque_dd_cash_id(long cheque_dd_cash_id) {
		this.cheque_dd_cash_id = cheque_dd_cash_id;
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

	public long getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(long branch_id) {
		this.branch_id = branch_id;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
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

	public String getCheque_amt_in_words() {
		return cheque_amt_in_words;
	}

	public void setCheque_amt_in_words(String cheque_amt_in_words) {
		this.cheque_amt_in_words = cheque_amt_in_words;
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

	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public long getMajorhead_id() {
		return majorhead_id;
	}

	public void setMajorhead_id(long majorhead_id) {
		this.majorhead_id = majorhead_id;
	}

	public String getInsured_address() {
		return insured_address;
	}

	public void setInsured_address(String insured_address) {
		this.insured_address = insured_address;
	}

	public String getInsured_name() {
		return insured_name;
	}

	public void setInsured_name(String insured_name) {
		this.insured_name = insured_name;
	}


	

}
