package com.gov.demo.serviceimpl;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gov.demo.entity.Tdoi_hba_Claim_Entry;
import com.gov.demo.entity.Tdoi_inward_entry;
import com.gov.demo.repository.InwardRepository;
//import com.gov.demo.entity.Tdoi_inward_entry;
//import com.gov.demo.entity.Tdoi_surveyor_bill_dtls;
//import com.gov.demo.repository.InwardRepository;
import com.gov.demo.service.InwardService;

//import gov.ifms.doi.model.Tdoi_inward_entry;

@Service
@CrossOrigin(origins = "*")
@Transactional
public class InwardEntryServiceimpl implements InwardService {
	@Autowired
	InwardRepository inwardRepository;
	
	
	public List<Tdoi_inward_entry> getAll() {
		List<Tdoi_inward_entry> inward_entry = new ArrayList<>();
		System.out.println(inwardRepository.findAll());
		inwardRepository.findAll().forEach(inward_entry::add);
		return inward_entry;
	}
	
	
	//get by id
		public Tdoi_inward_entry getInwardentryById(Long id) {
			return inwardRepository.findById(id).get();
		}

		//delete
		
	public Tdoi_inward_entry deleteTdoi_inward_entry(Long id) {
		Tdoi_inward_entry tdoi_inward_entry=inwardRepository.findById(id).get();
		inwardRepository.deleteById(id);
		return tdoi_inward_entry;
					
				}
		
	
	
}
