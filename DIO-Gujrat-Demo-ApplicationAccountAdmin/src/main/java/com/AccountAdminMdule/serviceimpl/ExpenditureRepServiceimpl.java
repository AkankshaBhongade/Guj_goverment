package com.AccountAdminMdule.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.AccountAdminMdule.entity.TdoiAcChequeRegister;
import com.AccountAdminMdule.entity.TdoiAcDeadStockRegister;
import com.AccountAdminMdule.entity.TdoiAcExpenditureRep;
import com.AccountAdminMdule.repository.ExpenditureRepRepository;
import com.AccountAdminMdule.service.ChallanRegisterService;
import com.AccountAdminMdule.service.ExpenditureRepService;

@Service
@CrossOrigin(origins = "*")
@Transactional
public class ExpenditureRepServiceimpl implements ExpenditureRepService {
	@Autowired
	ExpenditureRepRepository expenditureRepRepository;
	@Autowired
	JdbcTemplate jdbcTemplate;

	//getall
	
	public List<TdoiAcExpenditureRep> getAll() {
		List<TdoiAcExpenditureRep> surveyor_dtl = new ArrayList<>();
		System.out.println(expenditureRepRepository.findAll());
		expenditureRepRepository.findAll().forEach(surveyor_dtl::add);
		return surveyor_dtl;
	}

	//getbyid
	
	public TdoiAcExpenditureRep getExpenditureRepById(Long id) {
		return expenditureRepRepository.findById(id).get();
	}


	//save
	
	public List<TdoiAcExpenditureRep> addExpenditureRep(List<TdoiAcExpenditureRep> tdoiAcExpenditureRep) {
		List<TdoiAcExpenditureRep> savedExpenditureRep = new ArrayList<>();
		try {
		
			System.out.println(tdoiAcExpenditureRep);
			tdoiAcExpenditureRep.forEach(dtl -> {
				savedExpenditureRep.add((TdoiAcExpenditureRep) expenditureRepRepository.save(dtl));
			});
			return savedExpenditureRep;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	public void deleteTdoiAcExpenditureRep(Long id) {
		expenditureRepRepository.deleteById(id);
	}

	@Override
	public TdoiAcExpenditureRep updateTdoiAcExpenditureRep(TdoiAcExpenditureRep tdoiAcExpenditureRep) {
		TdoiAcExpenditureRep AcExpenditureRep = expenditureRepRepository.findById(tdoiAcExpenditureRep.getExpend_rep_id()).get();
		System.out.println(AcExpenditureRep);
		
		if (tdoiAcExpenditureRep.getExpend_rep_id() != 0) {
			AcExpenditureRep.setExpend_rep_id(tdoiAcExpenditureRep.getExpend_rep_id());
		}
	

		if (tdoiAcExpenditureRep.getReference_no() != null) {
			AcExpenditureRep.setReference_no(tdoiAcExpenditureRep.getReference_no());
		}
		

		if (tdoiAcExpenditureRep.getReference_dt() != null) {
			AcExpenditureRep.setReference_dt(tdoiAcExpenditureRep.getReference_dt());
		}
		
		if (tdoiAcExpenditureRep.getFrom_dt() != null) {
			AcExpenditureRep.setFrom_dt(tdoiAcExpenditureRep.getFrom_dt());
		}
		if (tdoiAcExpenditureRep.getTo_dt() != null) {
			AcExpenditureRep.setTo_dt(tdoiAcExpenditureRep.getTo_dt());
		}
		if (tdoiAcExpenditureRep.getMajorhead_id() != 0) {
			AcExpenditureRep.setMajorhead_id(tdoiAcExpenditureRep.getMajorhead_id());
		}
		if (tdoiAcExpenditureRep.getMajorhead_desc() != null) {
			AcExpenditureRep.setMajorhead_desc(tdoiAcExpenditureRep.getMajorhead_desc());
		}
		if (tdoiAcExpenditureRep.getSubhead_id() != 0) {
			AcExpenditureRep.setSubhead_id(tdoiAcExpenditureRep.getSubhead_id());
		}
		if (tdoiAcExpenditureRep.getSubhead_desc() != null) {
			AcExpenditureRep.setSubhead_desc(tdoiAcExpenditureRep.getSubhead_desc());
		}
		if (tdoiAcExpenditureRep.getExpend_type_id() != 00) {
			AcExpenditureRep.setExpend_type_id(tdoiAcExpenditureRep.getExpend_type_id());
		}
		if (tdoiAcExpenditureRep.getExpend_type_desc() != null) {
			AcExpenditureRep.setExpend_type_desc(tdoiAcExpenditureRep.getExpend_type_desc());
		}
		if (tdoiAcExpenditureRep.getCheque_no() != 00) {
			AcExpenditureRep.setCheque_no(tdoiAcExpenditureRep.getCheque_no());
		}
		if (tdoiAcExpenditureRep.getCheque_dt() != null) {
			AcExpenditureRep.setCheque_dt(tdoiAcExpenditureRep.getCheque_dt());
		}
		
		if (tdoiAcExpenditureRep.getStaus_id() != 0) {
			AcExpenditureRep.setStaus_id(tdoiAcExpenditureRep.getStaus_id());
		}
		if (tdoiAcExpenditureRep.getStatus_desc() != null) {
			AcExpenditureRep.setStatus_desc(tdoiAcExpenditureRep.getStatus_desc());
		}
		if (tdoiAcExpenditureRep.getActive_status() != 0) {
			AcExpenditureRep.setActive_status(tdoiAcExpenditureRep.getActive_status());
		}
		if (tdoiAcExpenditureRep.getCreated_date() != null) {
			AcExpenditureRep.setCreated_date(tdoiAcExpenditureRep.getCreated_date());
		}
		if (tdoiAcExpenditureRep.getCreated_by() != 0) {
			AcExpenditureRep.setCreated_by(tdoiAcExpenditureRep.getCreated_by());
		}
		if (tdoiAcExpenditureRep.getCreated_by_post() != 0) {
			AcExpenditureRep.setCreated_by_post(tdoiAcExpenditureRep.getCreated_by_post());
		}
		if (tdoiAcExpenditureRep.getUpdated_date() != null) {
			AcExpenditureRep.setUpdated_date(tdoiAcExpenditureRep.getUpdated_date());
		}
		if (tdoiAcExpenditureRep.getUpdated_by() != 0) {
			AcExpenditureRep.setUpdated_by(tdoiAcExpenditureRep.getUpdated_by());
		}
		if (tdoiAcExpenditureRep.getUpdated_by_post() != 0) {
			AcExpenditureRep.setUpdated_by_post(tdoiAcExpenditureRep.getUpdated_by_post());
		}
		
		
		TdoiAcExpenditureRep tdoiAcExpenditureRep1 = expenditureRepRepository.save(AcExpenditureRep);
		return tdoiAcExpenditureRep1;
		
		
	}

	@Override
	public List<TdoiAcExpenditureRep> filterAcExpenditureRep(Map<String, String> acExpenditureRep) {
		String query = "SELECT * FROM DOI.TDOI_AC_EXPENDITURE_REP i ";

		for (Map.Entry<String, String> entry : acExpenditureRep.entrySet()) {
			query += (query.contains("WHERE"))
					? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
					: " WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
		}
		System.out.println(query);

		List<TdoiAcExpenditureRep> fetchedAcExpenditureRep = new ArrayList<>();
		try {
			fetchedAcExpenditureRep = jdbcTemplate.query(query, (rs, rowNum) -> new TdoiAcExpenditureRep(
					rs.getLong("EXPEND_REP_ID"),rs.getString("REFERENCE_NO"),rs.getTimestamp("REFERENCE_DT").toLocalDateTime(),
					rs.getDate("FROM_DT").toLocalDate(),rs.getDate("TO_DT").toLocalDate(),rs.getLong("MAJORHEAD_ID"),
					rs.getString("MAJORHEAD_DESC"),rs.getLong("SUBHEAD_ID"),rs.getString("SUBHEAD_DESC"),
					rs.getLong("EXPEND_TYPE_ID"),rs.getString("EXPEND_TYPE_DESC"),rs.getLong("CHEQUE_NO"),rs.getDate("CHEQUE_DT").toLocalDate(),
					rs.getLong("STAUS_ID"),rs.getString("STATUS_DESC"),rs.getShort("ACTIVE_STATUS"),rs.getTimestamp("CREATED_DATE").toLocalDateTime(),
					rs.getLong("CREATED_BY"),rs.getLong("CREATED_BY_POST"),rs.getTimestamp("UPDATED_DATE").toLocalDateTime(),
					rs.getLong("UPDATED_BY"),rs.getLong("UPDATED_BY_POST")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//expenditureRepRepository.findAll().forEach(fetchedAcExpenditureRep::add);

	return fetchedAcExpenditureRep;
	}
	
	
	
	
	
	
}
