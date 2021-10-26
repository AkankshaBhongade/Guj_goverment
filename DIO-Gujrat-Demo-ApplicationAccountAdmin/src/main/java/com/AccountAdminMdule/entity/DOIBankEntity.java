package com.AccountAdminMdule.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "MS_BANK", schema = "MASTER_V1")
public class DOIBankEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "BANK_ID")
	private Long bank_id;

	@OneToMany(mappedBy = "bank")
	private Set<DOIBankBranchEntity> bank_branches = new HashSet<>();

	@Column(name = "BANK_NAME", length = 200)
	private String bank_name;

	@Column(name = "BANK_NAME_GUJ", length = 200)
	private String bank_name_guj;

	@Column(name = "BANK_CODE", length = 200)
	private String bank_code;

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

	@Column(name = "BANK_CODE_GUJ", length = 200)
	private String bank_code_guj;

	@Override
	public String toString() {
		return "Ms_bank [bank_id=" + bank_id + ", bank_name=" + bank_name + ", bank_name_guj=" + bank_name_guj
				+ ", bank_code=" + bank_code + ", created_by=" + created_by + ", created_date=" + created_date
				+ ", created_by_post=" + created_by_post + ", updated_by=" + updated_by + ", updated_date="
				+ updated_date + ", updated_by_post=" + updated_by_post + ", active_status=" + active_status
				+ ", bank_code_guj=" + bank_code_guj + "]";
	}

	public DOIBankEntity() {
		super();
	}

	public DOIBankEntity(Long bank_id, Set<DOIBankBranchEntity> bank_branches, String bank_name, String bank_name_guj,
			String bank_code, Long created_by, LocalDateTime created_date, Long created_by_post, Long updated_by,
			LocalDateTime updated_date, Long updated_by_post, Short active_status, String bank_code_guj) {
		super();
		this.bank_id = bank_id;
		this.bank_branches = bank_branches;
		this.bank_name = bank_name;
		this.bank_name_guj = bank_name_guj;
		this.bank_code = bank_code;
		this.created_by = created_by;
		this.created_date = created_date;
		this.created_by_post = created_by_post;
		this.updated_by = updated_by;
		this.updated_date = updated_date;
		this.updated_by_post = updated_by_post;
		this.active_status = active_status;
		this.bank_code_guj = bank_code_guj;
	}

	public Long getBank_id() {
		return bank_id;
	}

	public void setBank_id(Long bank_id) {
		this.bank_id = bank_id;
	}

	public Set<DOIBankBranchEntity> getBank_branches() {
		return bank_branches;
	}

	public void setBank_branches(Set<DOIBankBranchEntity> bank_branches) {
		this.bank_branches = bank_branches;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBank_name_guj() {
		return bank_name_guj;
	}

	public void setBank_name_guj(String bank_name_guj) {
		this.bank_name_guj = bank_name_guj;
	}

	public String getBank_code() {
		return bank_code;
	}

	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
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

	public String getBank_code_guj() {
		return bank_code_guj;
	}

	public void setBank_code_guj(String bank_code_guj) {
		this.bank_code_guj = bank_code_guj;
	}

}
