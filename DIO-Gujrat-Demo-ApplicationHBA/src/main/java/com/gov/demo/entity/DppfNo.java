package com.gov.demo.entity;

import com.ibm.db2.cmx.annotation.Column;

public class DppfNo {

	@Column(name = "HBA_MCA_ACC_NUM")
	private String claim_no;

	@Column(name = "EMPLOYEE_NUM")
	private String employee_num;

	@Column(name = "FIRST_NAME")
	private String first_name;

	@Column(name = "MIDDLE_NAME")
	private String middle_name;

	@Column(name = "LAST_NAME")
	private String last_name;

	@Column(name = "LOAN_AMT")
	private String loan_amt;

	@Column(name = "OFFICE_ADD")
	private String office_add;

	@Column(name = "OFFICE_NAME")
	private String office_name ;

	@Column(name = "DISTRICT_ID")
	private String office_id ;
	
	@Column(name = "DESIGANATION_ID")
	private String desiganation_id ;

	public DppfNo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public DppfNo(String claim_no, String employee_num, String first_name, String middle_name, String last_name,
			String loan_amt, String office_add, String office_name, String office_id, String desiganation_id) {
		super();
		this.claim_no = claim_no;
		this.employee_num = employee_num;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.loan_amt = loan_amt;
		this.office_add = office_add;
		this.office_name = office_name;
		this.office_id = office_id;
		this.desiganation_id = desiganation_id;
	}



	public String getClaim_no() {
		return claim_no;
	}

	public void setClaim_no(String claim_no) {
		this.claim_no = claim_no;
	}

	public String getEmployee_num() {
		return employee_num;
	}

	public void setEmployee_num(String employee_num) {
		this.employee_num = employee_num;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getLoan_amt() {
		return loan_amt;
	}

	public void setLoan_amt(String loan_amt) {
		this.loan_amt = loan_amt;
	}

	public String getOffice_add() {
		return office_add;
	}

	public void setOffice_add(String office_add) {
		this.office_add = office_add;
	}

	public String getOffice_name() {
		return office_name;
	}

	public void setOffice_name(String office_name) {
		this.office_name = office_name;
	}

	public String getOffice_id() {
		return office_id;
	}

	public void setOffice_id(String office_id) {
		this.office_id = office_id;
	}

	public String getDesiganation_id() {
		return desiganation_id;
	}

	public void setDesiganation_id(String desiganation_id) {
		this.desiganation_id = desiganation_id;
	}

	@Override
	public String toString() {
		return "DppfNo [claim_no=" + claim_no + ", employee_num=" + employee_num + ", first_name=" + first_name
				+ ", middle_name=" + middle_name + ", last_name=" + last_name + ", loan_amt=" + loan_amt
				+ ", office_add=" + office_add + ", office_name=" + office_name + ", office_id=" + office_id
				+ ", desiganation_id=" + desiganation_id + "]";
	}

//	public DppfNo(String claim_no, String employee_num, String first_name, String middle_name, String last_name,
//			String loan_amt, String office_add) {
//		super();
//		this.claim_no = claim_no;
//		this.employee_num = employee_num;
//		this.first_name = first_name;
//		this.middle_name = middle_name;
//		this.last_name = last_name;
//		this.loan_amt = loan_amt;
//		this.office_add = office_add;
//	}

	

}
