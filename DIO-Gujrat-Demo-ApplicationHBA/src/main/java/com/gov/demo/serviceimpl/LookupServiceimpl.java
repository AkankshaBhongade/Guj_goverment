package com.gov.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gov.demo.lookup.BankBranchEntity;
import com.gov.demo.lookup.MsBankEntity;

import com.gov.demo.lookup.MsDistrict;
import com.gov.demo.lookup.MsTaluka;
import com.gov.demo.repository.BankRepository;
import com.gov.demo.repository.BranchRepository;
import com.gov.demo.repository.LookupRepository;
import com.gov.demo.repository.TalukaRepository;
import com.gov.demo.service.LookupService;

@Service
@CrossOrigin(origins = "*")
@Transactional
public class LookupServiceimpl implements LookupService {
	@Autowired
	LookupRepository lookupRepository;
	@Autowired
	BankRepository bankRepository;
	@Autowired
	TalukaRepository talukaRepository;
	@Autowired
	BranchRepository branchRepository;
	
	@Override
	public List<MsDistrict> getAll() {
		List<MsDistrict> msDistrict = new ArrayList<>();
		System.out.println(lookupRepository.findAll());
		lookupRepository.findAll().forEach(msDistrict::add);
		return msDistrict;
	}

	@Override
	public List<String> getDistrictNames() {
		List<String> msDistrict = new ArrayList<>();
		this.getAll().stream().forEach(v -> msDistrict.add(v.getDistrict_name()));
		return msDistrict;
	}

	
	
	public List<MsTaluka> getAllTaluka(){
		List<MsTaluka> msTaluka = new ArrayList<>();
		System.out.println(talukaRepository.findAll());
		talukaRepository.findAll().forEach(msTaluka::add);
		return msTaluka;
		
		
	}

	@Override
	public List<MsBankEntity> getAllbank() {
		List<MsBankEntity> bankEntity = new ArrayList<>();
		System.out.println(bankRepository.findAll());
		bankRepository.findAll().forEach(bankEntity::add);
		return bankEntity;
		
	}

	@Override
	public List<BankBranchEntity> getAllbranch() {
		List<BankBranchEntity> branchEntity = new ArrayList<>();
		System.out.println(branchRepository.findAll());
		branchRepository.findAll().forEach(branchEntity::add);
		return branchEntity;
		
	}
	
	
	
}
