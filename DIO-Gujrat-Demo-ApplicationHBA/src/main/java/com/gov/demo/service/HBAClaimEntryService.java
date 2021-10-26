package com.gov.demo.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.gov.demo.dto.claimdtoforfilter;
import com.gov.demo.entity.DppfNo;
import com.gov.demo.entity.Tdoi_hba_Claim_Entry;

public interface HBAClaimEntryService {

	List<Tdoi_hba_Claim_Entry> getAll();

	Tdoi_hba_Claim_Entry getHBAClaimEntryById(Long id);

	void deleteTdoi_hba_Claim_Entry(Long id);

	Tdoi_hba_Claim_Entry updateTdoi_hba_Claim_Entry(Tdoi_hba_Claim_Entry tdoi_hba_Claim_Entry);

	List<Tdoi_hba_Claim_Entry> addhbaClaimEntry(List<Tdoi_hba_Claim_Entry> tdoi_hba_Claim_Entry);

	//List<Tdoi_hba_Claim_Entry> filterhbaClaimEntry(Map<String, String> claim_entry_listing_dto);

	Collection<Object> distictid(long dISTRICT_ID);

	List<claimdtoforfilter> clamnewfilter(Map<String, String> claimdtoforfilter);



	//List<Tdoi_hba_Claim_Entry> getfilterById(long id);
	
	
}
