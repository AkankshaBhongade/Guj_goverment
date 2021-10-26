package com.gov.demo.dto;

public class SurveyorMasteListingdto {

	private String party_type;
	private String district;
	private String taluka;
	private String  office_locationorname;
	
	public SurveyorMasteListingdto() {
		super();
	}

	public SurveyorMasteListingdto(String party_type, String district, String taluka, String office_locationorname) {
		super();
		this.party_type = party_type;
		this.district = district;
		this.taluka = taluka;
		this.office_locationorname = office_locationorname;
	}

	public String getParty_type() {
		return party_type;
	}

	public void setParty_type(String party_type) {
		this.party_type = party_type;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public String getOffice_locationorname() {
		return office_locationorname;
	}

	public void setOffice_locationorname(String office_locationorname) {
		this.office_locationorname = office_locationorname;
	}

	@Override
	public String toString() {
		return "SurveyorMasteListingdto [party_type=" + party_type + ", district=" + district + ", taluka=" + taluka
				+ ", office_locationorname=" + office_locationorname + "]";
	}
	
	
}
