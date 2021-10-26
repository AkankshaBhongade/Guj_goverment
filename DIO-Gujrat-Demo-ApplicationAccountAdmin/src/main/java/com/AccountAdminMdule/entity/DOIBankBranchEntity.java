package com.AccountAdminMdule.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "MS_BANK_BRANCH", schema = "MASTER_V1")
public class DOIBankBranchEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "BANK_BRANCH_ID")
	private Long bank_branch_id;

	@ManyToOne
	@JoinColumn(name = "BANK_ID", insertable = false, updatable = false)
	@ForeignKey(name = "MS_BANK_BRANCH_MS_BANK_FK1")
	private DOIBankEntity bank;

	@Column(name = "BRANCH_NAME", length = 1000)
	private String branch_name;

	@Column(name = "BRANCH_NAME_GUJ", length = 1000)
	private String bank_name_guj;

	@Column(name = "BRANCH_DESC", length = 1000)
	private String branch_desc;

	@Column(name = "BRANCH_DESC_GUJ", length = 1000)
	private String branch_desc_guj;

	@Column(name = "BRANCH_CODE", length = 3)
	private String branch_code;

	@Column(name = "BRANCH_CODE_GUJ", length = 6)
	private String branch_code_guj;

	@Column(name = "BRANCH_TYPE_ID")
	private Long branch_type_id;

	@Column(name = "PARENT_BRANCH_ID")
	private Long parent_branch_id;

	@Column(name = "CREATED_BY")
	private Long created_by;

	@Column(name = "CREATED_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime created_date;

	@Column(name = "CREATED_BY_POST")
	private Long created_by_post;

	@Column(name = "UPDATED_BY")
	private Long updated_by;

	@Column(name = "UPDATED_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime updated_date;

	@Column(name = "UPDATED_BY_POST")
	private Long updated_by_post;

	@Column(name = "ACTIVE_STATUS")
	private Short active_status;

	@Column(name = "BANK_ID")
	private Long bank_id;

	@Column(name = "DISTRICT_ID")
	private Long district_id;

	@Column(name = "TALUKA_ID")
	private Long taluka_id;

	@Column(name = "IFSC_CODE", length = 50)
	private String ifsc_code;

	@Column(name = "MICR_CODE", length = 50)
	private String micr_code;

	@Column(name = "BRANCH_ADDR", length = 1000)
	private String branch_addr;

	@Column(name = "BRANCH_EMAIL", length = 200)
	private String branch_email;

	@Column(name = "BRANCH_PHONE", length = 100)
	private String branch_phone;

	@Column(name = "IS_MERGED_BRANCH")
	private Long is_merged_branch;

	@Column(name = "IS_ENABLED_BRANCH")
	private Long is_enabled_branch;

	public DOIBankBranchEntity() {
		super();
	}

	@Override
	public String toString() {
		return "Ms_bank_branch [bank_branch_id=" + bank_branch_id + ", bank=" + bank + ", branch_name=" + branch_name
				+ ", bank_name_guj=" + bank_name_guj + ", branch_desc=" + branch_desc + ", branch_desc_guj="
				+ branch_desc_guj + ", branch_code=" + branch_code + ", branch_code_guj=" + branch_code_guj
				+ ", branch_type_id=" + branch_type_id + ", parent_branch_id=" + parent_branch_id + ", created_by="
				+ created_by + ", created_date=" + created_date + ", created_by_post=" + created_by_post
				+ ", updated_by=" + updated_by + ", updated_date=" + updated_date + ", updated_by_post="
				+ updated_by_post + ", active_status=" + active_status + ", bank_id=" + bank_id + ", district_id="
				+ district_id + ", taluka_id=" + taluka_id + ", ifsc_code=" + ifsc_code + ", micr_code=" + micr_code
				+ ", branch_addr=" + branch_addr + ", branch_email=" + branch_email + ", branch_phone=" + branch_phone
				+ ", is_merged_branch=" + is_merged_branch + ", is_enabled_branch=" + is_enabled_branch + "]";
	}

	public DOIBankBranchEntity(Long bank_branch_id, DOIBankEntity bank, String branch_name, String bank_name_guj,
			String branch_desc, String branch_desc_guj, String branch_code, String branch_code_guj, Long branch_type_id,
			Long parent_branch_id, Long created_by, LocalDateTime created_date, Long created_by_post, Long updated_by,
			LocalDateTime updated_date, Long updated_by_post, Short active_status, Long bank_id, Long district_id,
			Long taluka_id, String ifsc_code, String micr_code, String branch_addr, String branch_email,
			String branch_phone, Long is_merged_branch, Long is_enabled_branch) {
		super();
		this.bank_branch_id = bank_branch_id;
		this.bank = bank;
		this.branch_name = branch_name;
		this.bank_name_guj = bank_name_guj;
		this.branch_desc = branch_desc;
		this.branch_desc_guj = branch_desc_guj;
		this.branch_code = branch_code;
		this.branch_code_guj = branch_code_guj;
		this.branch_type_id = branch_type_id;
		this.parent_branch_id = parent_branch_id;
		this.created_by = created_by;
		this.created_date = created_date;
		this.created_by_post = created_by_post;
		this.updated_by = updated_by;
		this.updated_date = updated_date;
		this.updated_by_post = updated_by_post;
		this.active_status = active_status;
		this.bank_id = bank_id;
		this.district_id = district_id;
		this.taluka_id = taluka_id;
		this.ifsc_code = ifsc_code;
		this.micr_code = micr_code;
		this.branch_addr = branch_addr;
		this.branch_email = branch_email;
		this.branch_phone = branch_phone;
		this.is_merged_branch = is_merged_branch;
		this.is_enabled_branch = is_enabled_branch;
	}

	public Long getBank_branch_id() {
		return bank_branch_id;
	}

	public void setBank_branch_id(Long bank_branch_id) {
		this.bank_branch_id = bank_branch_id;
	}

	public DOIBankEntity getBank() {
		return bank;
	}

	public void setBank(DOIBankEntity bank) {
		this.bank = bank;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getBank_name_guj() {
		return bank_name_guj;
	}

	public void setBank_name_guj(String bank_name_guj) {
		this.bank_name_guj = bank_name_guj;
	}

	public String getBranch_desc() {
		return branch_desc;
	}

	public void setBranch_desc(String branch_desc) {
		this.branch_desc = branch_desc;
	}

	public String getBranch_desc_guj() {
		return branch_desc_guj;
	}

	public void setBranch_desc_guj(String branch_desc_guj) {
		this.branch_desc_guj = branch_desc_guj;
	}

	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	public String getBranch_code_guj() {
		return branch_code_guj;
	}

	public void setBranch_code_guj(String branch_code_guj) {
		this.branch_code_guj = branch_code_guj;
	}

	public Long getBranch_type_id() {
		return branch_type_id;
	}

	public void setBranch_type_id(Long branch_type_id) {
		this.branch_type_id = branch_type_id;
	}

	public Long getParent_branch_id() {
		return parent_branch_id;
	}

	public void setParent_branch_id(Long parent_branch_id) {
		this.parent_branch_id = parent_branch_id;
	}

	public Long getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Long created_by) {
		this.created_by = created_by;
	}

	public LocalDateTime getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}

	public Long getCreated_by_post() {
		return created_by_post;
	}

	public void setCreated_by_post(Long created_by_post) {
		this.created_by_post = created_by_post;
	}

	public Long getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(Long updated_by) {
		this.updated_by = updated_by;
	}

	public LocalDateTime getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(LocalDateTime updated_date) {
		this.updated_date = updated_date;
	}

	public Long getUpdated_by_post() {
		return updated_by_post;
	}

	public void setUpdated_by_post(Long updated_by_post) {
		this.updated_by_post = updated_by_post;
	}

	public Short getActive_status() {
		return active_status;
	}

	public void setActive_status(Short active_status) {
		this.active_status = active_status;
	}

	public Long getBank_id() {
		return bank_id;
	}

	public void setBank_id(Long bank_id) {
		this.bank_id = bank_id;
	}

	public Long getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(Long district_id) {
		this.district_id = district_id;
	}

	public Long getTaluka_id() {
		return taluka_id;
	}

	public void setTaluka_id(Long taluka_id) {
		this.taluka_id = taluka_id;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public String getMicr_code() {
		return micr_code;
	}

	public void setMicr_code(String micr_code) {
		this.micr_code = micr_code;
	}

	public String getBranch_addr() {
		return branch_addr;
	}

	public void setBranch_addr(String branch_addr) {
		this.branch_addr = branch_addr;
	}

	public String getBranch_email() {
		return branch_email;
	}

	public void setBranch_email(String branch_email) {
		this.branch_email = branch_email;
	}

	public String getBranch_phone() {
		return branch_phone;
	}

	public void setBranch_phone(String branch_phone) {
		this.branch_phone = branch_phone;
	}

	public Long getIs_merged_branch() {
		return is_merged_branch;
	}

	public void setIs_merged_branch(Long is_merged_branch) {
		this.is_merged_branch = is_merged_branch;
	}

	public Long getIs_enabled_branch() {
		return is_enabled_branch;
	}

	public void setIs_enabled_branch(Long is_enabled_branch) {
		this.is_enabled_branch = is_enabled_branch;
	}

}

