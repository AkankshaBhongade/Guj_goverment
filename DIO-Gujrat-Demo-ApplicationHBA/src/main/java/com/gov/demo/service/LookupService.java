package com.gov.demo.service;

import java.util.List;

import com.gov.demo.lookup.BankBranchEntity;
import com.gov.demo.lookup.MsBankEntity;

import com.gov.demo.lookup.MsDistrict;
import com.gov.demo.lookup.MsTaluka;

public interface LookupService {

	List<MsDistrict> getAll();
	
	
	List<String> getDistrictNames();


	List<MsTaluka> getAllTaluka();


	List<MsBankEntity> getAllbank();


	List<BankBranchEntity> getAllbranch();


	

}
