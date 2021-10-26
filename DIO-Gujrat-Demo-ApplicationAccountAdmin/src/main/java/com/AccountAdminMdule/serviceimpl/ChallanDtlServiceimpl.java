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
import com.AccountAdminMdule.entity.TdoiAcStampRegister;
import com.AccountAdminMdule.repository.ChallanDtlRepository;
import com.AccountAdminMdule.service.ChallanDtlService;

@Service
@CrossOrigin(origins = "*")
@Transactional
public class ChallanDtlServiceimpl implements ChallanDtlService {
	@Autowired
	ChallanDtlRepository challanDtlRepository;
	@Autowired
	JdbcTemplate jdbcTemplate;

	//getall
	
	public List<TdoiAcChallanDtl> getAll() {
		List<TdoiAcChallanDtl> AcChallanDtl = new ArrayList<>();
		System.out.println(challanDtlRepository.findAll());
		challanDtlRepository.findAll().forEach(AcChallanDtl::add);
		return AcChallanDtl;
	}
	//getbyid
	
	public TdoiAcChallanDtl getChallanDtlById(Long id) {
		return challanDtlRepository.findById(id).get();
	}

   //save
	public List<TdoiAcChallanDtl> addChallanDtl(List<TdoiAcChallanDtl> tdoiAcChallanDtl) {
		List<TdoiAcChallanDtl> savedChallanDtl = new ArrayList<>();
		try {
			
			System.out.println(tdoiAcChallanDtl);
			tdoiAcChallanDtl.forEach(dtl -> {
				savedChallanDtl.add((TdoiAcChallanDtl) challanDtlRepository.save(dtl));
			});
			return savedChallanDtl;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	//Delete
	public void deleteTdoiAcChallanDtl(Long id) {
		challanDtlRepository.deleteById(id);
		
	}
	
	//update
	
	@Override
	public TdoiAcChallanDtl updateTdoiAcChallanDtl(TdoiAcChallanDtl tdoiAcChallanDtl) {
		TdoiAcChallanDtl AcChallanDtl = challanDtlRepository.findById(tdoiAcChallanDtl.getChallan_dtl_id()).get();
		System.out.println(AcChallanDtl);
		
		if (tdoiAcChallanDtl.getChallan_dtl_id() != 0) {
			AcChallanDtl.setChallan_dtl_id(tdoiAcChallanDtl.getChallan_dtl_id());
		}
		
		if (tdoiAcChallanDtl.getReference_no() != null) {
			AcChallanDtl.setReference_no(tdoiAcChallanDtl.getReference_no());
		}
		
		if (tdoiAcChallanDtl.getReference_dt() != null) {
			AcChallanDtl.setReference_dt(tdoiAcChallanDtl.getReference_dt());
		}
		
		if (tdoiAcChallanDtl.getChallan_no() != null) {
			AcChallanDtl.setChallan_no(tdoiAcChallanDtl.getChallan_no());
		}
		
		if (tdoiAcChallanDtl.getBtr_receipt_no() != 0) {
			AcChallanDtl.setBtr_receipt_no(tdoiAcChallanDtl.getBtr_receipt_no());
		}
		
		if (tdoiAcChallanDtl.getCheque_dd_no() != 0) {
			AcChallanDtl.setCheque_dd_no(tdoiAcChallanDtl.getCheque_dd_no());
		}
		
		if (tdoiAcChallanDtl.getCheque_dd_amt() != 0) {
			AcChallanDtl.setCheque_dd_amt(tdoiAcChallanDtl.getCheque_dd_amt());
		}
		
		if (tdoiAcChallanDtl.getCheque_amt_in_word() != null) {
			AcChallanDtl.setCheque_amt_in_word(tdoiAcChallanDtl.getCheque_amt_in_word());
		}
		
		if (tdoiAcChallanDtl.getParty_name() != null) {
			AcChallanDtl.setParty_name(tdoiAcChallanDtl.getParty_name());
		}
		
		if (tdoiAcChallanDtl.getParty_desc() != null) {
			AcChallanDtl.setParty_desc(tdoiAcChallanDtl.getParty_desc());
		}
	
		
		if (tdoiAcChallanDtl.getMajorhead_id() != 0) {
			AcChallanDtl.setMajorhead_id(tdoiAcChallanDtl.getMajorhead_id());
		}
	
		if (tdoiAcChallanDtl.getSubmajorhead_id() != 0) {
			AcChallanDtl.setSubmajorhead_id(tdoiAcChallanDtl.getSubmajorhead_id());
		}
	
		
		if (tdoiAcChallanDtl.getMinorhead_id() != 0) {
			AcChallanDtl.setMinorhead_id(tdoiAcChallanDtl.getMinorhead_id());
		}
	
		if (tdoiAcChallanDtl.getSubhead_id() != 0) {
			AcChallanDtl.setSubhead_id(tdoiAcChallanDtl.getSubhead_id());
		}
	
		if (tdoiAcChallanDtl.getDetail_head_id() != 0) {
			AcChallanDtl.setDetail_head_id(tdoiAcChallanDtl.getDetail_head_id());
		}
	
		if (tdoiAcChallanDtl.getMobile_no() != 0) {
			AcChallanDtl.setMobile_no(tdoiAcChallanDtl.getMobile_no());
		}
	
		if (tdoiAcChallanDtl.getActive_status() != 0) {
			AcChallanDtl.setActive_status(tdoiAcChallanDtl.getActive_status());
		}
	

		if (tdoiAcChallanDtl.getCreated_date() != null) {
			AcChallanDtl.setCreated_date(tdoiAcChallanDtl.getCreated_date());
		}
		if (tdoiAcChallanDtl.getCreated_by_post() != 0) {
			AcChallanDtl.setCreated_by_post(tdoiAcChallanDtl.getCreated_by_post());
		}
		if (tdoiAcChallanDtl.getUpdated_date() != null) {
			AcChallanDtl.setUpdated_date(tdoiAcChallanDtl.getUpdated_date());
		}
		if (tdoiAcChallanDtl.getUpdated_by() != 0) {
			AcChallanDtl.setUpdated_by(tdoiAcChallanDtl.getUpdated_by());
		}
		if (tdoiAcChallanDtl.getUpdated_by_post() != 0) {
			AcChallanDtl.setUpdated_by_post(tdoiAcChallanDtl.getUpdated_by_post());
		}
		if (tdoiAcChallanDtl.getChallan_desc() != null) {
			AcChallanDtl.setChallan_desc(tdoiAcChallanDtl.getChallan_desc());
		}
		if (tdoiAcChallanDtl.getChallan_dt() != null) {
			AcChallanDtl.setChallan_dt(tdoiAcChallanDtl.getChallan_dt());
		}
		
		
		
		TdoiAcChallanDtl tdoiAcChallanDtl1 = challanDtlRepository.save(AcChallanDtl);

		return tdoiAcChallanDtl1;
	}

	
	
	
	
	
	
	
	
	@Override
	public List<TdoiAcChallanDtl> filterAcChallanDtl(Map<String, String> acChallanDtl) {
		String query = "SELECT * FROM DOI.TDOI_AC_CHALLAN_DTL i ";

		for (Map.Entry<String, String> entry : acChallanDtl.entrySet()) {
			query += (query.contains("WHERE"))
					? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
					: " WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
		}
		System.out.println(query);

		List<TdoiAcChallanDtl> fetchedAcChallanDtl = new ArrayList<>();
		try {
			fetchedAcChallanDtl = jdbcTemplate.query(query, (rs, rowNum) -> new TdoiAcChallanDtl(
					rs.getLong("CHALLAN_DTL_ID"),rs.getString("REFERENCE_NO"),rs.getTimestamp("REFERENCE_DT").toLocalDateTime(),
					rs.getString("CHALLAN_NO"),rs.getLong("BTR_RECEIPT_NO"),rs.getLong("CHEQUE_DD_NO"),
					rs.getDate("CHEQUE_DD_DT").toLocalDate(),rs.getDouble("CHEQUE_DD_AMT"),rs.getString("CHEQUE_AMT_IN_WORDS"),rs.getString("PARTY_NAME"),
					rs.getString("PARTY_DESC"),rs.getLong("MAJORHEAD_ID"),rs.getLong("SUBMAJORHEAD_ID"),rs.getLong("MINORHEAD_ID"),
					rs.getLong("SUBHEAD_ID"),rs.getLong("DETAIL_HEAD_ID"),rs.getLong("MOBILE_NO"),rs.getShort("ACTIVE_STATUS"),rs.getTimestamp("CREATED_DATE").toLocalDateTime(),
					rs.getLong("CREATED_BY"),rs.getLong("CREATED_BY_POST"),rs.getTimestamp("UPDATED_DATE").toLocalDateTime(),
					rs.getLong("UPDATED_BY"),rs.getLong("UPDATED_BY_POST"),rs.getString("CHALLAN_DESC"),rs.getDate("CHALLAN_DT").toLocalDate()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//challanDtlRepository.findAll().forEach(fetchedAcChallanDtl::add);

	return fetchedAcChallanDtl;
	}
	
	
	
	
	
	
	}

