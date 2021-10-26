package com.gov.demo.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HBAPolicyMasterdto {

	private String policy_type;
	private String policy_no;
	
	//private String policy_date;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate policy_date;

	private String proposal_no;
	
	//private String proposal_date;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate proposal_date;

	private String adhar_card_no;
	private String mob_no;
	private String insured_house_address;
	private String type_of_bulding_use;
	private String wall;
	private String selling;
	
	//private String end_of_policy_date;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate end_of_policy_date;
	
	private String Sum_insured;
	private String term_of_insurance;
	private String rate;
	private String insurance_premium;
	private String employee_no;
	private String employee_name;
	private String designation;
	private String office_name;
	private String office_address;
	private String plot_no;
	private String house_no;
	private String serve_no;
	private String district;
	private String taluka;
	private String village;
	private String pincode;
	private String email_id;
	private String discount;
	private String discount_amount;
	private String loading_charge_amount;
	private String total_add_on_premium;
	private String total_pramium;
	private String gst;
	private String gst_amount;
	private String payable_premium;
	private String payment_mode;
	private String date_of_dd;
	private String date_of_cheque;
	private String dd_no;
	private String cheque_no;
	private String bank_no;
	private String bank_branch;
	private String challan_no;
	
	//private String challan_date;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate challan_date;
	
	private String challan_amount;
	
	
	public HBAPolicyMasterdto() {
		super();
	}


	@Override
	public String toString() {
		return "HBAPolicyMasterEntry [policy_type=" + policy_type + ", policy_no=" + policy_no + ", policy_date="
				+ policy_date + ", proposal_no=" + proposal_no + ", proposal_date=" + proposal_date + ", adhar_card_no="
				+ adhar_card_no + ", mob_no=" + mob_no + ", insured_house_address=" + insured_house_address
				+ ", type_of_bulding_use=" + type_of_bulding_use + ", wall=" + wall + ", selling=" + selling
				+ ", end_of_policy_date=" + end_of_policy_date + ", Sum_insured=" + Sum_insured + ", term_of_insurance="
				+ term_of_insurance + ", rate=" + rate + ", insurance_premium=" + insurance_premium + ", employee_no="
				+ employee_no + ", employee_name=" + employee_name + ", designation=" + designation + ", office_name="
				+ office_name + ", office_address=" + office_address + ", plot_no=" + plot_no + ", house_no=" + house_no
				+ ", serve_no=" + serve_no + ", district=" + district + ", taluka=" + taluka + ", village=" + village
				+ ", pincode=" + pincode + ", email_id=" + email_id + ", discount=" + discount + ", discount_amount="
				+ discount_amount + ", loading_charge_amount=" + loading_charge_amount + ", total_add_on_premium="
				+ total_add_on_premium + ", total_pramium=" + total_pramium + ", gst=" + gst + ", gst_amount="
				+ gst_amount + ", payable_premium=" + payable_premium + ", payment_mode=" + payment_mode
				+ ", date_of_dd=" + date_of_dd + ", date_of_cheque=" + date_of_cheque + ", dd_no=" + dd_no
				+ ", cheque_no=" + cheque_no + ", bank_no=" + bank_no + ", bank_branch=" + bank_branch + ", challan_no="
				+ challan_no + ", challan_date=" + challan_date + ", challan_amount=" + challan_amount + "]";
	}


	public HBAPolicyMasterdto(String policy_type, String policy_no, LocalDate policy_date, String proposal_no,
			LocalDate proposal_date, String adhar_card_no, String mob_no, String insured_house_address,
			String type_of_bulding_use, String wall, String selling, LocalDate end_of_policy_date, String sum_insured,
			String term_of_insurance, String rate, String insurance_premium, String employee_no, String employee_name,
			String designation, String office_name, String office_address, String plot_no, String house_no,
			String serve_no, String district, String taluka, String village, String pincode, String email_id,
			String discount, String discount_amount, String loading_charge_amount, String total_add_on_premium,
			String total_pramium, String gst, String gst_amount, String payable_premium, String payment_mode,
			String date_of_dd, String date_of_cheque, String dd_no, String cheque_no, String bank_no,
			String bank_branch, String challan_no, LocalDate challan_date, String challan_amount) {
		super();
		this.policy_type = policy_type;
		this.policy_no = policy_no;
		this.policy_date = policy_date;
		this.proposal_no = proposal_no;
		this.proposal_date = proposal_date;
		this.adhar_card_no = adhar_card_no;
		this.mob_no = mob_no;
		this.insured_house_address = insured_house_address;
		this.type_of_bulding_use = type_of_bulding_use;
		this.wall = wall;
		this.selling = selling;
		this.end_of_policy_date = end_of_policy_date;
		Sum_insured = sum_insured;
		this.term_of_insurance = term_of_insurance;
		this.rate = rate;
		this.insurance_premium = insurance_premium;
		this.employee_no = employee_no;
		this.employee_name = employee_name;
		this.designation = designation;
		this.office_name = office_name;
		this.office_address = office_address;
		this.plot_no = plot_no;
		this.house_no = house_no;
		this.serve_no = serve_no;
		this.district = district;
		this.taluka = taluka;
		this.village = village;
		this.pincode = pincode;
		this.email_id = email_id;
		this.discount = discount;
		this.discount_amount = discount_amount;
		this.loading_charge_amount = loading_charge_amount;
		this.total_add_on_premium = total_add_on_premium;
		this.total_pramium = total_pramium;
		this.gst = gst;
		this.gst_amount = gst_amount;
		this.payable_premium = payable_premium;
		this.payment_mode = payment_mode;
		this.date_of_dd = date_of_dd;
		this.date_of_cheque = date_of_cheque;
		this.dd_no = dd_no;
		this.cheque_no = cheque_no;
		this.bank_no = bank_no;
		this.bank_branch = bank_branch;
		this.challan_no = challan_no;
		this.challan_date = challan_date;
		this.challan_amount = challan_amount;
	}
	
}