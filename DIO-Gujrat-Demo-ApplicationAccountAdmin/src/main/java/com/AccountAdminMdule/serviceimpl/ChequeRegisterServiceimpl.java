package com.AccountAdminMdule.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.AccountAdminMdule.entity.TdoiAcChallanDtl;
import com.AccountAdminMdule.entity.TdoiAcChallanRegister;
import com.AccountAdminMdule.entity.TdoiAcChequeRegister;
import com.AccountAdminMdule.repository.ChequeRegisterRepository;
import com.AccountAdminMdule.service.ChallanRegisterService;
import com.AccountAdminMdule.service.ChequeRegisterService;

@Service
@CrossOrigin(origins = "*")
@Transactional
public class ChequeRegisterServiceimpl implements ChequeRegisterService {
	@Autowired
	ChequeRegisterRepository chequeRegisterRepository;
	@Autowired
	JdbcTemplate jdbcTemplate;

	// getall
	public List<TdoiAcChequeRegister> getAll() {
		List<TdoiAcChequeRegister> chequeregister = new ArrayList<>();
		System.out.println(chequeRegisterRepository.findAll());
		chequeRegisterRepository.findAll().forEach(chequeregister::add);
		return chequeregister;
	}

	//getbyid
	
	public TdoiAcChequeRegister getChequeRegisterById(Long id) {
		return chequeRegisterRepository.findById(id).get();

	}

//save
	
	public List<TdoiAcChequeRegister> addChequeRegister(List<TdoiAcChequeRegister> tdoiAcChequeRegister) {
		List<TdoiAcChequeRegister> savedChequeRegister = new ArrayList<>();
		try {
		
			System.out.println(tdoiAcChequeRegister);
			tdoiAcChequeRegister.forEach(dtl -> {
				savedChequeRegister.add((TdoiAcChequeRegister) chequeRegisterRepository.save(dtl));
			});
			return savedChequeRegister;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	//delete
	public void deleteTdoiAcChequeRegister(Long id) {
		chequeRegisterRepository.deleteById(id);
		
	}

	//delete
	
	@Override
	public TdoiAcChequeRegister updateTdoiAcChequeRegister(TdoiAcChequeRegister tdoiAcChequeRegister) {
		TdoiAcChequeRegister AcChequeRegister = chequeRegisterRepository.findById(tdoiAcChequeRegister.getCheque_reg_id()).get();
		System.out.println(AcChequeRegister);
		
		if (tdoiAcChequeRegister.getCheque_reg_id() != 0) {
			AcChequeRegister.setCheque_reg_id(tdoiAcChequeRegister.getCheque_reg_id());
		}
			
		if (tdoiAcChequeRegister.getReference_no() != null) {
			AcChequeRegister.setReference_no(tdoiAcChequeRegister.getReference_no());
		}
			
		if (tdoiAcChequeRegister.getReference_dt() != null) {
			AcChequeRegister.setReference_dt(tdoiAcChequeRegister.getReference_dt());
		}
			
		if (tdoiAcChequeRegister.getBill_no() != null) {
			AcChequeRegister.setBill_no(tdoiAcChequeRegister.getBill_no());
		}
			
		if (tdoiAcChequeRegister.getBill_amount() != 0) {
			AcChequeRegister.setBill_amount(tdoiAcChequeRegister.getBill_amount());
		}
			
		if (tdoiAcChequeRegister.getCheque_no() != 0) {
			AcChequeRegister.setCheque_no(tdoiAcChequeRegister.getCheque_no());
		}
			
		if (tdoiAcChequeRegister.getEpayment_no() != null) {
			AcChequeRegister.setEpayment_no(tdoiAcChequeRegister.getEpayment_no());
		}
			
		if (tdoiAcChequeRegister.getCheque_epay_dt() != null) {
			AcChequeRegister.setCheque_epay_dt(tdoiAcChequeRegister.getCheque_epay_dt());
		}
		if (tdoiAcChequeRegister.getCashbook_entry_dt() != null) {
			AcChequeRegister.setCashbook_entry_dt(tdoiAcChequeRegister.getCashbook_entry_dt());
		}
		if (tdoiAcChequeRegister.getMessenger_name() != null) {
			AcChequeRegister.setMessenger_name(tdoiAcChequeRegister.getMessenger_name());
		}
		if (tdoiAcChequeRegister.getEncah_deliv_dt() != null) {
			AcChequeRegister.setEncah_deliv_dt(tdoiAcChequeRegister.getEncah_deliv_dt());
		}
		if (tdoiAcChequeRegister.getRemarks() != null) {
			AcChequeRegister.setRemarks(tdoiAcChequeRegister.getRemarks());
		}
			
		if (tdoiAcChequeRegister.getActive_status() != 0) {
			AcChequeRegister.setActive_status(tdoiAcChequeRegister.getActive_status());
		}
			
		if (tdoiAcChequeRegister.getCreated_date() != null) {
			AcChequeRegister.setCreated_date(tdoiAcChequeRegister.getCreated_date());
		}
			
		if (tdoiAcChequeRegister.getCreated_by() != 0) {
			AcChequeRegister.setCreated_by(tdoiAcChequeRegister.getCreated_by());
		}
			
		if (tdoiAcChequeRegister.getCreated_by_post() != 0) {
			AcChequeRegister.setCreated_by_post(tdoiAcChequeRegister.getCreated_by_post());
		}
			
		if (tdoiAcChequeRegister.getUpdated_date() != null) {
			AcChequeRegister.setUpdated_date(tdoiAcChequeRegister.getUpdated_date());
		}
			
		if (tdoiAcChequeRegister.getUpdated_by() != 0) {
			AcChequeRegister.setUpdated_by(tdoiAcChequeRegister.getUpdated_by());
		}
			
		if (tdoiAcChequeRegister.getUpdated_by_post() != 0) {
			AcChequeRegister.setUpdated_by_post(tdoiAcChequeRegister.getUpdated_by_post());
		}
			
		
		
		
		
		TdoiAcChequeRegister tdoiAcChequeRegister1 = chequeRegisterRepository.save(AcChequeRegister);

		return tdoiAcChequeRegister1;
	
	}

	@Override
	public List<TdoiAcChequeRegister> filterAcChequeRegister(Map<String, String> acChequeRegister) {
		String query = "SELECT * FROM DOI.TDOI_AC_CHEQUE_REGISTER i ";

		for (Map.Entry<String, String> entry : acChequeRegister.entrySet()) {
			query += (query.contains("WHERE"))
					? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
					: " WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
		}
		System.out.println(query);

		List<TdoiAcChequeRegister> fetchedAcChequeRegister = new ArrayList<>();
		try {
			fetchedAcChequeRegister = jdbcTemplate.query(query, (rs, rowNum) -> new TdoiAcChequeRegister(
					rs.getLong("CHEQUE_REG_ID"),rs.getString("REFERENCE_NO"),rs.getTimestamp("REFERENCE_DT").toLocalDateTime(),
					rs.getString("BILL_NO"),rs.getDouble("BILL_AMOUNT"),rs.getLong("CHEQUE_NO"),rs.getString("EPAYMENT_NO"),
					rs.getDate("CHEQUE_EPAY_DT").toLocalDate(),rs.getTimestamp("CASHBOOK_ENTRY_DT").toLocalDateTime(),
					rs.getString("MESSENGER_NAME"),rs.getTimestamp("ENCAH_DELIV_DT").toLocalDateTime(),rs.getString("REMARKS"),
					rs.getShort("ACTIVE_STATUS"),rs.getTimestamp("CREATED_DATE").toLocalDateTime(),
					rs.getLong("CREATED_BY"),rs.getLong("CREATED_BY_POST"),rs.getTimestamp("UPDATED_DATE").toLocalDateTime(),
					rs.getLong("UPDATED_BY"),rs.getLong("UPDATED_BY_POST")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//chequeRegisterRepository.findAll().forEach(fetchedAcChequeRegister::add);

	return fetchedAcChequeRegister;
	}
	
	
	
	
	
	
}


