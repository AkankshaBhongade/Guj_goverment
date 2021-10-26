package com.gov.demo.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name = "TDOI_SURVEYOR_DTL", schema = "DOI")
public class Tdoi_surveyor_dtl {

	@OneToMany(mappedBy = "surveyor_id", cascade = CascadeType.ALL)
	private Set<Tdoi_surveyor_bill_dtls> surveyor_bill_dtls = new HashSet<>();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SURVEYOR_ID")
	private long id;

	@NotNull
	@Column(name = "SURVEYOR_NAME")
	private String surveyor_name = "xxxxx";

	@Column(name = "SURVEY_FIRM_NAME")
	private String surveyor_firm_name = "xxxxx";

	@Column(name = "FIRM_ADDRESS")
	private String firm_address = "xxxxx";

	@Column(name = "DISTRICT_ID")
	private long district_id = 0;

	@Column(name = "TALUKA_ID")
	private long taluka_id = 0;

	@Column(name = "CITY")
	private String city = "xxxxx";

	@Column(name = "PINCODE")
	private long pincode = 0;

	@Column(name = "CONTACT_NUMBER")
	private String contact_number = "xxxxx";

	@Email
	@Column(name = "EMAIL_ID")
	private String email_id = "xxxxx";

	@Column(name = "AADHAR_NUM")
	private long aadhar_num = 0;

	@Column(name = "PAN_NUM")
	private String pan_num = "xxxxx";

	@Column(name = "BANK_ID")
	private long bank_id = 0;

	@Column(name = "BRANCH_ID")
	private long branch_id = 0;

	@Column(name = "IFSC_CODE")
	private String ifsc_code = "xxxxx";

	@Column(name = "ACCOUNT_NO")
	private long account_no = 0;

	@Column(name = "PAYMENT_MODE_ID")
	private long payment_mode_id = 0;

	@Column(name = "REFERENCE_NO")
	private String reference_no = "xxxxx";

	@Column(name = "REFERENCE_DT")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime reference_dt = LocalDateTime.now();

	@NotNull
	@Column(name = "ACTIVE_STATUS")
	private short active_status = 0;

	@NotNull
	@Column(name = "CREATED_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime created_date = LocalDateTime.now();

	@NotNull
	@Column(name = "CREATED_BY")
	private long created_by = 0;

	@NotNull
	@Column(name = "CREATED_BY_POST")
	private long created_by_post = 0;

	@NotNull
	@Column(name = "UPDATED_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime updated_date = LocalDateTime.now();

	@NotNull
	@Column(name = "UPDATED_BY")
	private long updated_by = 0;

	@NotNull
	@Column(name = "UPDATED_BY_POST")
	private long updated_by_post = 0;

	public Tdoi_surveyor_dtl() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Tdoi_surveyor_dtl(Long id, String surveyor_name,
			String surveyor_firm_name, String firm_address, long district_id, long taluka_id, String city, long pincode,
			String contact_number, @Email String email_id, long aadhar_num, String pan_num, long bank_id,
			long branch_id, String ifsc_code, long account_no, long payment_mode_id, String reference_no,
			LocalDateTime reference_dt, short active_status, LocalDateTime created_date, long created_by,
			long created_by_post, LocalDateTime updated_date, long updated_by, long updated_by_post) {
		super();
		this.surveyor_bill_dtls = surveyor_bill_dtls;
		this.id = id;
		this.surveyor_name = surveyor_name;
		this.surveyor_firm_name = surveyor_firm_name;
		this.firm_address = firm_address;
		this.district_id = district_id;
		this.taluka_id = taluka_id;
		this.city = city;
		this.pincode = pincode;
		this.contact_number = contact_number;
		this.email_id = email_id;
		this.aadhar_num = aadhar_num;
		this.pan_num = pan_num;
		this.bank_id = bank_id;
		this.branch_id = branch_id;
		this.ifsc_code = ifsc_code;
		this.account_no = account_no;
		this.payment_mode_id = payment_mode_id;
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



	public Set<Tdoi_surveyor_bill_dtls> getSurveyor_bill_dtls() {
		return surveyor_bill_dtls;
	}

	public void setSurveyor_bill_dtls(Set<Tdoi_surveyor_bill_dtls> surveyor_bill_dtls) {
		this.surveyor_bill_dtls = surveyor_bill_dtls;
	}

	public long getid() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
	}

	public String getSurveyor_name() {
		return surveyor_name;
	}

	public void setSurveyor_name(String surveyor_name) {
		this.surveyor_name = surveyor_name;
	}

	public String getSurveyor_firm_name() {
		return surveyor_firm_name;
	}

	public void setSurveyor_firm_name(String surveyor_firm_name) {
		this.surveyor_firm_name = surveyor_firm_name;
	}

	public String getFirm_address() {
		return firm_address;
	}

	public void setFirm_address(String firm_address) {
		this.firm_address = firm_address;
	}

	public long getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(long district_id) {
		this.district_id = district_id;
	}

	public long getTaluka_id() {
		return taluka_id;
	}

	public void setTaluka_id(long taluka_id) {
		this.taluka_id = taluka_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public long getAadhar_num() {
		return aadhar_num;
	}

	public void setAadhar_num(long aadhar_num) {
		this.aadhar_num = aadhar_num;
	}

	public String getPan_num() {
		return pan_num;
	}

	public void setPan_num(String pan_num) {
		this.pan_num = pan_num;
	}

	public long getBank_id() {
		return bank_id;
	}

	public void setBank_id(long bank_id) {
		this.bank_id = bank_id;
	}

	public long getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(long branch_id) {
		this.branch_id = branch_id;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public long getAccount_no() {
		return account_no;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public long getPayment_mode_id() {
		return payment_mode_id;
	}

	public void setPayment_mode_id(long payment_mode_id) {
		this.payment_mode_id = payment_mode_id;
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

	public String getServices() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setService(String serviceString) {
		// TODO Auto-generated method stub

	}

}
