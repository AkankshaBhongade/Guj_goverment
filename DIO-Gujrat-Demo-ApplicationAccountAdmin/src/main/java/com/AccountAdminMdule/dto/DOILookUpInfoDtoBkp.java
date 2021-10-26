package com.AccountAdminMdule.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DOILookUpInfoDtoBkp {

	private static final long serialVersionUID = 1L;

	@JsonProperty("value")
	private String lookUpInfoId;
	private String lookUpInfoValue;
	@JsonProperty("viewValue")
	private String lookUpInfoName;
	private String lookUpInfoNameGuj;
	private String lookUpInfoDescription;
	private String lookUpInfoDescriptionGuj;
	private String parentLookupId;
	private String orderId;

	public DOILookUpInfoDtoBkp(String lookUpInfoId, String lookUpInfoValue, String lookUpInfoName,
			String lookUpInfoNameGuj, String lookUpInfoDescription, String lookUpInfoDescriptionGuj,
			String parentLookupId, String orderId) {
		super();
		this.lookUpInfoId = lookUpInfoId;
		this.lookUpInfoValue = lookUpInfoValue;
		this.lookUpInfoName = lookUpInfoName;
		this.lookUpInfoNameGuj = lookUpInfoNameGuj;
		this.lookUpInfoDescription = lookUpInfoDescription;
		this.lookUpInfoDescriptionGuj = lookUpInfoDescriptionGuj;
		this.parentLookupId = parentLookupId;
		this.orderId = orderId;
	}

	public DOILookUpInfoDtoBkp() {
		super();
	}

	public String getLookUpInfoId() {
		return lookUpInfoId;
	}

	public void setLookUpInfoId(String lookUpInfoId) {
		this.lookUpInfoId = lookUpInfoId;
	}

	public String getLookUpInfoValue() {
		return lookUpInfoValue;
	}

	public void setLookUpInfoValue(String lookUpInfoValue) {
		this.lookUpInfoValue = lookUpInfoValue;
	}

	public String getLookUpInfoName() {
		return lookUpInfoName;
	}

	public void setLookUpInfoName(String lookUpInfoName) {
		this.lookUpInfoName = lookUpInfoName;
	}

	public String getLookUpInfoNameGuj() {
		return lookUpInfoNameGuj;
	}

	public void setLookUpInfoNameGuj(String lookUpInfoNameGuj) {
		this.lookUpInfoNameGuj = lookUpInfoNameGuj;
	}

	public String getLookUpInfoDescription() {
		return lookUpInfoDescription;
	}

	public void setLookUpInfoDescription(String lookUpInfoDescription) {
		this.lookUpInfoDescription = lookUpInfoDescription;
	}

	public String getLookUpInfoDescriptionGuj() {
		return lookUpInfoDescriptionGuj;
	}

	public void setLookUpInfoDescriptionGuj(String lookUpInfoDescriptionGuj) {
		this.lookUpInfoDescriptionGuj = lookUpInfoDescriptionGuj;
	}

	public String getParentLookupId() {
		return parentLookupId;
	}

	public void setParentLookupId(String parentLookupId) {
		this.parentLookupId = parentLookupId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
