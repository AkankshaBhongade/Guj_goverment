package com.gov.demo.lookup;

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
@Table(name = "MS_TALUKA", schema = "MASTER_V1")
public class MsTaluka {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TALUKA_ID")
	private Long taluka_id;
	
	@Column(name = "TALUKA_NAME")
	private String taluka_name;

	@Column(name = "TALUKA_NAME_GUJ")
	private String taluka_name_guj;
	
	@Column(name = "TALUKA_DESC")
	private String taluka_desc;
	
	@Column(name = "TALUKA_DESC_GUJ")
	private String taluka_desc_guj;

	@Column(name = "TALUKA_CODE")
	private String taluka_code;
	
	@Column(name = "TALUKA_CODE_GUJ")
	private String taluka_code_guj;
	
	@Column(name = "TALUKA_CODE_NAME")
	private String taluka_code_name;
	
	@Column(name = "DISTRICT_ID")
	private Long district_id;
	
	@NotNull
	@Column(name = "CREATED_BY")
	private Long created_by ;

	@NotNull
	@Column(name = "CREATED_BY_POST")
	private Long created_by_post ;

	@NotNull
	@Column(name = "UPDATED_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime updated_date = LocalDateTime.now();

	@NotNull
	@Column(name = "UPDATED_BY")
	private Long updated_by;

	@NotNull
	@Column(name = "UPDATED_BY_POST")
	private Long updated_by_post;
	
	@Column(name = "ACTIVE_STATUS")
	private short active_status;

	@Column(name = "STD_CODE")
	private String std_code;
	
	@Column(name = "DISTRICT_CODE")
	private String district_code;

	public MsTaluka() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MsTaluka(Long taluka_id, String taluka_name, String taluka_name_guj, String taluka_desc,
			String taluka_desc_guj, String taluka_code, String taluka_code_guj, String taluka_code_name,
			Long district_id, Long created_by, Long created_by_post, LocalDateTime updated_date, Long updated_by,
			Long updated_by_post, short active_status, String std_code, String district_code) {
		super();
		this.taluka_id = taluka_id;
		this.taluka_name = taluka_name;
		this.taluka_name_guj = taluka_name_guj;
		this.taluka_desc = taluka_desc;
		this.taluka_desc_guj = taluka_desc_guj;
		this.taluka_code = taluka_code;
		this.taluka_code_guj = taluka_code_guj;
		this.taluka_code_name = taluka_code_name;
		this.district_id = district_id;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
		this.active_status = active_status;
		this.std_code = std_code;
		this.district_code = district_code;
	}

	public Long getTaluka_id() {
		return taluka_id;
	}

	public void setTaluka_id(Long taluka_id) {
		this.taluka_id = taluka_id;
	}

	public String getTaluka_name() {
		return taluka_name;
	}

	public void setTaluka_name(String taluka_name) {
		this.taluka_name = taluka_name;
	}

	public String getTaluka_name_guj() {
		return taluka_name_guj;
	}

	public void setTaluka_name_guj(String taluka_name_guj) {
		this.taluka_name_guj = taluka_name_guj;
	}

	public String getTaluka_desc() {
		return taluka_desc;
	}

	public void setTaluka_desc(String taluka_desc) {
		this.taluka_desc = taluka_desc;
	}

	public String getTaluka_desc_guj() {
		return taluka_desc_guj;
	}

	public void setTaluka_desc_guj(String taluka_desc_guj) {
		this.taluka_desc_guj = taluka_desc_guj;
	}

	public String getTaluka_code() {
		return taluka_code;
	}

	public void setTaluka_code(String taluka_code) {
		this.taluka_code = taluka_code;
	}

	public String getTaluka_code_guj() {
		return taluka_code_guj;
	}

	public void setTaluka_code_guj(String taluka_code_guj) {
		this.taluka_code_guj = taluka_code_guj;
	}

	public String getTaluka_code_name() {
		return taluka_code_name;
	}

	public void setTaluka_code_name(String taluka_code_name) {
		this.taluka_code_name = taluka_code_name;
	}

	public Long getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(Long district_id) {
		this.district_id = district_id;
	}

	public Long getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Long created_by) {
		this.created_by = created_by;
	}

	public Long getCreated_by_post() {
		return created_by_post;
	}

	public void setCreated_by_post(Long created_by_post) {
		this.created_by_post = created_by_post;
	}

	public LocalDateTime getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(LocalDateTime updated_date) {
		this.updated_date = updated_date;
	}

	public Long getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(Long updated_by) {
		this.updated_by = updated_by;
	}

	public Long getUpdated_by_post() {
		return updated_by_post;
	}

	public void setUpdated_by_post(Long updated_by_post) {
		this.updated_by_post = updated_by_post;
	}

	public short getActive_status() {
		return active_status;
	}

	public void setActive_status(short active_status) {
		this.active_status = active_status;
	}

	public String getStd_code() {
		return std_code;
	}

	public void setStd_code(String std_code) {
		this.std_code = std_code;
	}

	public String getDistrict_code() {
		return district_code;
	}

	public void setDistrict_code(String district_code) {
		this.district_code = district_code;
	}

	@Override
	public String toString() {
		return "MsTaluka [taluka_id=" + taluka_id + ", taluka_name=" + taluka_name + ", taluka_name_guj="
				+ taluka_name_guj + ", taluka_desc=" + taluka_desc + ", taluka_desc_guj=" + taluka_desc_guj
				+ ", taluka_code=" + taluka_code + ", taluka_code_guj=" + taluka_code_guj + ", taluka_code_name="
				+ taluka_code_name + ", district_id=" + district_id + ", created_by=" + created_by
				+ ", created_by_post=" + created_by_post + ", updated_date=" + updated_date + ", updated_by="
				+ updated_by + ", updated_by_post=" + updated_by_post + ", active_status=" + active_status
				+ ", std_code=" + std_code + ", district_code=" + district_code + "]";
	}
	
	
	


}
