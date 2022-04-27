package gov.ifms.doi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DOILookUpInfoDto {

	private String lookUpInfoName;

	public DOILookUpInfoDto() {
		super();
	}

	public DOILookUpInfoDto(String lookUpInfoName) {
		super();
		this.lookUpInfoName = lookUpInfoName;
	}

	public String getLookUpInfoName() {
		return lookUpInfoName;
	}

	public void setLookUpInfoName(String lookUpInfoName) {
		this.lookUpInfoName = lookUpInfoName;
	}

}
