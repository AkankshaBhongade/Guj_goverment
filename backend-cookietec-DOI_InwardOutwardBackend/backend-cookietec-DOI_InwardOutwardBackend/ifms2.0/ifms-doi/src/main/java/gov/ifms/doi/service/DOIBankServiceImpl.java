package gov.ifms.doi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import gov.ifms.doi.entity.DOIBankEntity;
import gov.ifms.doi.repository.DOIBankRepository;

@Service
@Transactional
public class DOIBankServiceImpl implements DOIBankService {
	private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	private DOIBankRepository bankRepository;

	@Autowired
	public DOIBankServiceImpl(DOIBankRepository bankRepository) {
		this.bankRepository = bankRepository;
	}

	public List<Map<String, Object>> getBankBranchNamesByBank() {

		List<Map<String, Object>> bankDetails = new ArrayList<>();
		Iterable<DOIBankEntity> ms_bank = this.bankRepository.findAll();
		
		ms_bank.forEach(bank -> {
			List<String> bankBranchName = new ArrayList<>();
			bank.getBank_branches().forEach(bankBranch -> {
				bankBranchName.add(bankBranch.getBranch_name());
			});
			Map<String, Object> bankDetail = new HashMap<>();
			bankDetail.put("bank", bank.getBank_name());
			bankDetail.put("branches", bankBranchName);
			bankDetails.add(bankDetail);
		});
		return bankDetails;
	}
}
