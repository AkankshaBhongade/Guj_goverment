package com.gov.demo.service;

import java.util.List;
import java.util.Map;

import com.gov.demo.entity.DppfNo;
import com.gov.demo.entity.TdioHBAProposal;


public interface HBAProposalService {
	
	public List<TdioHBAProposal> getAll();
	
	public TdioHBAProposal getHbaProposalById(Long id);

	public TdioHBAProposal deleteTdioHBAProposal(Long id);

	public TdioHBAProposal updateTdioHBAProposal(TdioHBAProposal tdioHBAProposal);

	public List<TdioHBAProposal> addHBAProposal(List<TdioHBAProposal> tdioHBAProposal);

	//public void filterdppfProposal();

	public List<TdioHBAProposal> filterHbaProposal(Map<String, String> hbaProposalListing);

	public Map<String, String> filterDppf(String hBA_MCA_ACC_NUM);
	//public List<DppfNo> filterDppf(String hBA_MCA_ACC_NUM);
	//public List<DppfNo> filterDppf(Map<String, String> hBA_MCA_ACC_NUM);
	

}

