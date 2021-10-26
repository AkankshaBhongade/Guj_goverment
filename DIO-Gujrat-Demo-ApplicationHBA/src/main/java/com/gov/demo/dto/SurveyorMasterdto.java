package com.gov.demo.dto;

public class SurveyorMasterdto {

	
	private String surveyo_name;
    private String surveyor_firm_name;
    private String address;
    private String district;
    private String taluka;
    private String city;
    private String pincode;
    private String contact_no;
    private String email_id;
    private String adhar_no;
    private String pan_card_no;
    private String license_no;
    private String bank_name;
    private String branch_name;
    private String account_no;
    private String payment_preferred;
    private String ifsc_code;
    private String attachment_type;
    private String file_name;
    private String browse_file;
    private String uploaded_file_name;
    private String uploaded_file;
    
	public SurveyorMasterdto() {
		super();
	}

	@Override
	public String toString() {
		return "SurveyorMasterEntrydto [surveyo_name=" + surveyo_name + ", surveyor_firm_name=" + surveyor_firm_name
				+ ", address=" + address + ", district=" + district + ", taluka=" + taluka + ", city=" + city
				+ ", pincode=" + pincode + ", contact_no=" + contact_no + ", email_id=" + email_id + ", adhar_no="
				+ adhar_no + ", pan_card_no=" + pan_card_no + ", license_no=" + license_no + ", bank_name=" + bank_name
				+ ", branch_name=" + branch_name + ", account_no=" + account_no + ", payment_preferred="
				+ payment_preferred + ", ifsc_code=" + ifsc_code + ", attachment_type=" + attachment_type
				+ ", file_name=" + file_name + ", browse_file=" + browse_file + ", uploaded_file_name="
				+ uploaded_file_name + ", uploaded_file=" + uploaded_file + "]";
	}

	public SurveyorMasterdto(String surveyo_name, String surveyor_firm_name, String address, String district,
			String taluka, String city, String pincode, String contact_no, String email_id, String adhar_no,
			String pan_card_no, String license_no, String bank_name, String branch_name, String account_no,
			String payment_preferred, String ifsc_code, String attachment_type, String file_name, String browse_file,
			String uploaded_file_name, String uploaded_file) {
		super();
		this.surveyo_name = surveyo_name;
		this.surveyor_firm_name = surveyor_firm_name;
		this.address = address;
		this.district = district;
		this.taluka = taluka;
		this.city = city;
		this.pincode = pincode;
		this.contact_no = contact_no;
		this.email_id = email_id;
		this.adhar_no = adhar_no;
		this.pan_card_no = pan_card_no;
		this.license_no = license_no;
		this.bank_name = bank_name;
		this.branch_name = branch_name;
		this.account_no = account_no;
		this.payment_preferred = payment_preferred;
		this.ifsc_code = ifsc_code;
		this.attachment_type = attachment_type;
		this.file_name = file_name;
		this.browse_file = browse_file;
		this.uploaded_file_name = uploaded_file_name;
		this.uploaded_file = uploaded_file;
	}

	public String getSurveyo_name() {
		return surveyo_name;
	}

	public void setSurveyo_name(String surveyo_name) {
		this.surveyo_name = surveyo_name;
	}

	public String getSurveyor_firm_name() {
		return surveyor_firm_name;
	}

	public void setSurveyor_firm_name(String surveyor_firm_name) {
		this.surveyor_firm_name = surveyor_firm_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getAdhar_no() {
		return adhar_no;
	}

	public void setAdhar_no(String adhar_no) {
		this.adhar_no = adhar_no;
	}

	public String getPan_card_no() {
		return pan_card_no;
	}

	public void setPan_card_no(String pan_card_no) {
		this.pan_card_no = pan_card_no;
	}

	public String getLicense_no() {
		return license_no;
	}

	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	public String getPayment_preferred() {
		return payment_preferred;
	}

	public void setPayment_preferred(String payment_preferred) {
		this.payment_preferred = payment_preferred;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public String getAttachment_type() {
		return attachment_type;
	}

	public void setAttachment_type(String attachment_type) {
		this.attachment_type = attachment_type;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getBrowse_file() {
		return browse_file;
	}

	public void setBrowse_file(String browse_file) {
		this.browse_file = browse_file;
	}

	public String getUploaded_file_name() {
		return uploaded_file_name;
	}

	public void setUploaded_file_name(String uploaded_file_name) {
		this.uploaded_file_name = uploaded_file_name;
	}

	public String getUploaded_file() {
		return uploaded_file;
	}

	public void setUploaded_file(String uploaded_file) {
		this.uploaded_file = uploaded_file;
	}

	
}