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
@Table(name = "MS_DISTRICT", schema = "MASTER_V1")
public class MsDistrict {
	
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DISTRICT_ID")
	private Long district_id;
	
	@Column(name = "DISTRICT_NAME")
	private String district_name;
	
	
	@Column(name = "DISTRICT_NAME_GUJ")
	private String district_name_guj;
	
	@Column(name = "DISTRICT_DESC")
	private String district_desc;
	
    @Column(name = "DISTRICT_DESC_GUJ")
    private String district_desc_guj;
	
	@Column(name = "DISTRICT_CODE")
	private String district_code;
	
	@Column(name = "DISTRICT_CODE_GUJ")
	private String district_code_guj;
	
	@Column(name = "DISTRICT_CODE_NAME")
	private String district_code_name;
	
	@Column(name = "STATE_ID")
	private Long state_id;

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
	
	@Column(name = "HEADQUARTERS")
	private String  headquarters;
	
	@Column(name = "HEADQUARTERS_GUJ")
	private String  headquarters_guj;
	
	@Column(name = "EFFECTIVE_DATE")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime effective_date = LocalDateTime.now();
	
	@Column(name = "STATE_CODE")
	private String  state_code ;
	
	@Column(name = "DISTRICT_SHORT_CODE")
	private String  district_short_code;

	public MsDistrict() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MsDistrict(Long district_id, String district_name, String district_name_guj, String district_desc,
			String district_desc_guj, String district_code, String district_code_guj, String district_code_name,
			Long state_id, Long created_by, Long created_by_post, LocalDateTime updated_date, Long updated_by,
			Long updated_by_post, short active_status, String std_code, String headquarters, String headquarters_guj,
			LocalDateTime effective_date, String state_code, String district_short_code) {
		super();
		this.district_id = district_id;
		this.district_name = district_name;
		this.district_name_guj = district_name_guj;
		this.district_desc = district_desc;
		this.district_desc_guj = district_desc_guj;
		this.district_code = district_code;
		this.district_code_guj = district_code_guj;
		this.district_code_name = district_code_name;
		this.state_id = state_id;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
		this.active_status = active_status;
		this.std_code = std_code;
		this.headquarters = headquarters;
		this.headquarters_guj = headquarters_guj;
		this.effective_date = effective_date;
		this.state_code = state_code;
		this.district_short_code = district_short_code;
	}

	public Long getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(Long district_id) {
		this.district_id = district_id;
	}

	public String getDistrict_name() {
		return district_name;
	}

	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}

	public String getDistrict_name_guj() {
		return district_name_guj;
	}

	public void setDistrict_name_guj(String district_name_guj) {
		this.district_name_guj = district_name_guj;
	}

	public String getDistrict_desc() {
		return district_desc;
	}

	public void setDistrict_desc(String district_desc) {
		this.district_desc = district_desc;
	}

	public String getDistrict_desc_guj() {
		return district_desc_guj;
	}

	public void setDistrict_desc_guj(String district_desc_guj) {
		this.district_desc_guj = district_desc_guj;
	}

	public String getDistrict_code() {
		return district_code;
	}

	public void setDistrict_code(String district_code) {
		this.district_code = district_code;
	}

	public String getDistrict_code_guj() {
		return district_code_guj;
	}

	public void setDistrict_code_guj(String district_code_guj) {
		this.district_code_guj = district_code_guj;
	}

	public String getDistrict_code_name() {
		return district_code_name;
	}

	public void setDistrict_code_name(String district_code_name) {
		this.district_code_name = district_code_name;
	}

	public Long getState_id() {
		return state_id;
	}

	public void setState_id(Long state_id) {
		this.state_id = state_id;
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

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public String getHeadquarters_guj() {
		return headquarters_guj;
	}

	public void setHeadquarters_guj(String headquarters_guj) {
		this.headquarters_guj = headquarters_guj;
	}

	public LocalDateTime getEffective_date() {
		return effective_date;
	}

	public void setEffective_date(LocalDateTime effective_date) {
		this.effective_date = effective_date;
	}

	public String getState_code() {
		return state_code;
	}

	public void setState_code(String state_code) {
		this.state_code = state_code;
	}

	public String getDistrict_short_code() {
		return district_short_code;
	}

	public void setDistrict_short_code(String district_short_code) {
		this.district_short_code = district_short_code;
	}

	@Override
	public String toString() {
		return "MsDistrict [district_id=" + district_id + ", district_name=" + district_name + ", district_name_guj="
				+ district_name_guj + ", district_desc=" + district_desc + ", district_desc_guj=" + district_desc_guj
				+ ", district_code=" + district_code + ", district_code_guj=" + district_code_guj
				+ ", district_code_name=" + district_code_name + ", state_id=" + state_id + ", created_by=" + created_by
				+ ", created_by_post=" + created_by_post + ", updated_date=" + updated_date + ", updated_by="
				+ updated_by + ", updated_by_post=" + updated_by_post + ", active_status=" + active_status
				+ ", std_code=" + std_code + ", headquarters=" + headquarters + ", headquarters_guj=" + headquarters_guj
				+ ", effective_date=" + effective_date + ", state_code=" + state_code + ", district_short_code="
				+ district_short_code + "]";
	}

	
	
	

}
