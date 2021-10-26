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
import com.AccountAdminMdule.repository.ChallanRegisterRepository;
import com.AccountAdminMdule.service.ChallanRegisterService;


@Service
@CrossOrigin(origins = "*")
@Transactional
public class ChallanRegisterServiceimpl implements ChallanRegisterService {
	@Autowired
	ChallanRegisterRepository challanRegisterRepository;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	//getAll
	public List<TdoiAcChallanRegister> getAll() {
		List<TdoiAcChallanRegister> AcChallanRegister = new ArrayList<>();
		System.out.println(challanRegisterRepository.findAll());
		challanRegisterRepository.findAll().forEach(AcChallanRegister::add);
		return AcChallanRegister;
	}

	//get by id
	
	public TdoiAcChallanRegister getChallanRegisterById(Long id) {
		return challanRegisterRepository.findById(id).get();
	}

	//save

	public List<TdoiAcChallanRegister> addChallanRegister(List<TdoiAcChallanRegister> tdoiAcChallanRegister) {
		List<TdoiAcChallanRegister> savedChallanRegister = new ArrayList<>();
		try {
			
			System.out.println(tdoiAcChallanRegister);
			tdoiAcChallanRegister.forEach(dtl -> {
				savedChallanRegister.add((TdoiAcChallanRegister) challanRegisterRepository.save(dtl));
			});
			return savedChallanRegister;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
//delete
	
	public void deleteTdoiAcChallanRegister(Long id) {
		challanRegisterRepository.deleteById(id);
		
	}

	//update
@Override
public TdoiAcChallanRegister updateTdoiAcChallanRegister(TdoiAcChallanRegister tdoiAcChallanRegister) {
	TdoiAcChallanRegister AcChallanRegister = challanRegisterRepository.findById(tdoiAcChallanRegister.getChallan_reg_id()).get();
	System.out.println(AcChallanRegister);
	
	if (tdoiAcChallanRegister.getChallan_reg_id() != 0) {
		AcChallanRegister.setChallan_reg_id(tdoiAcChallanRegister.getChallan_reg_id());
	}
	if (tdoiAcChallanRegister.getReference_no() != null) {
		AcChallanRegister.setReference_no(tdoiAcChallanRegister.getReference_no());
	}
	if (tdoiAcChallanRegister.getReference_dt() != null) {
		AcChallanRegister.setReference_dt(tdoiAcChallanRegister.getReference_dt());
	}
	if (tdoiAcChallanRegister.getSerial_no() != null) {
		AcChallanRegister.setSerial_no(tdoiAcChallanRegister.getSerial_no());
	}
	if (tdoiAcChallanRegister.getCurrent_dt() != null) {
		AcChallanRegister.setCurrent_dt(tdoiAcChallanRegister.getCurrent_dt());
	}
	if (tdoiAcChallanRegister.getChallan_no () != 0) {
		AcChallanRegister.setChallan_no(tdoiAcChallanRegister.getChallan_no());
	}
	if (tdoiAcChallanRegister.getBtr_receipt_dt() != null) {
		AcChallanRegister.setBtr_receipt_dt(tdoiAcChallanRegister.getBtr_receipt_dt());
	}
	if (tdoiAcChallanRegister.getCheque_dd_no() != 0) {
		AcChallanRegister.setCheque_dd_no(tdoiAcChallanRegister.getCheque_dd_no());
	}

	if (tdoiAcChallanRegister.getCheque_dd_dt() != null) {
		AcChallanRegister.setCheque_dd_dt(tdoiAcChallanRegister.getCheque_dd_dt());
	}
	if (tdoiAcChallanRegister.getBank_id() != 0) {
		AcChallanRegister.setBank_id(tdoiAcChallanRegister.getBank_id());
	}
	if (tdoiAcChallanRegister.getBank_name() != null) {
		AcChallanRegister.setBank_name(tdoiAcChallanRegister.getBank_name());
	}
	if (tdoiAcChallanRegister.getCheque_dd_amt() != 0) {
		AcChallanRegister.setCheque_dd_amt(tdoiAcChallanRegister.getCheque_dd_amt());
	}
	if (tdoiAcChallanRegister.getActive_status() != 0) {
		AcChallanRegister.setActive_status(tdoiAcChallanRegister.getActive_status());
	}
	if (tdoiAcChallanRegister.getCreated_date() != null) {
		AcChallanRegister.setCreated_date(tdoiAcChallanRegister.getCreated_date());
	}
	if (tdoiAcChallanRegister.getCreated_by() != 0) {
		AcChallanRegister.setCreated_by(tdoiAcChallanRegister.getCreated_by());
	}
	if (tdoiAcChallanRegister.getCreated_by_post() != 0) {
		AcChallanRegister.setCreated_by_post(tdoiAcChallanRegister.getCreated_by_post());
	}
	if (tdoiAcChallanRegister.getUpdated_by() != 0) {
		AcChallanRegister.setUpdated_by(tdoiAcChallanRegister.getUpdated_by());
	}

	if (tdoiAcChallanRegister.getUpdated_date() != null) {
		AcChallanRegister.setUpdated_date(tdoiAcChallanRegister.getUpdated_date());
	}

	if (tdoiAcChallanRegister.getUpdated_by_post() != 0) {
		AcChallanRegister.setUpdated_by_post(tdoiAcChallanRegister.getUpdated_by_post());
	}

	
	
	TdoiAcChallanRegister tdoiAcChallanRegister1 = challanRegisterRepository.save(AcChallanRegister);

	return tdoiAcChallanRegister1;
}

@Override
public List<TdoiAcChallanRegister> filterAcChallanRegister(Map<String, String> tdoiAcChallanRegister) {
	String query = "SELECT * FROM DOI.TDOI_AC_CHALLAN_REGISTER i ";

	for (Map.Entry<String, String> entry : tdoiAcChallanRegister.entrySet()) {
		query += (query.contains("WHERE"))
				? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
				: " WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
	}
	System.out.println(query);

	List<TdoiAcChallanRegister> fetchedchallanEntry = new ArrayList<>();
	try {
		fetchedchallanEntry = jdbcTemplate.query(query, (rs, rowNum) -> new TdoiAcChallanRegister(
				
			rs.getLong("CHALLAN_REG_ID"),rs.getString("REFERENCE_NO"),rs.getTimestamp("REFERENCE_DT").toLocalDateTime(),
			rs.getString("SERIAL_NO"),rs.getTimestamp("CURRENT_DT").toLocalDateTime(),rs.getLong("CHALLAN_NO"),
			rs.getTimestamp("BTR_RECEIPT_DT").toLocalDateTime(),rs.getLong("CHEQUE_DD_NO"),rs.getDate("CHEQUE_DD_DT").toLocalDate(),
			rs.getLong("BANK_ID"),rs.getString("BANK_NAME"),rs.getDouble("CHEQUE_DD_AMT"),rs.getShort("ACTIVE_STATUS"),
			rs.getTimestamp("CREATED_DATE").toLocalDateTime(),
			rs.getLong("CREATED_BY"),rs.getLong("CREATED_BY_POST"),rs.getTimestamp("UPDATED_DATE").toLocalDateTime(),
			rs.getLong("UPDATED_BY"),rs.getLong("UPDATED_BY_POST")));
	} catch (Exception e) {
		e.printStackTrace();
	}

	//challanRegisterRepository.findAll().forEach(fetchedchallanEntry::add);

	return fetchedchallanEntry;
}


}
