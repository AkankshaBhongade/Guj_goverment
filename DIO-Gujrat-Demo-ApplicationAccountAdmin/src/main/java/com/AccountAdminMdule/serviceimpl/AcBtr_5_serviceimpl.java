package com.AccountAdminMdule.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.AccountAdminMdule.entity.TdoiAcBtr_5;
import com.AccountAdminMdule.repository.AcBtr_5_repository;
import com.AccountAdminMdule.service.AcBtr_5_service;


@Service
@CrossOrigin(origins = "*")
@Transactional
public class AcBtr_5_serviceimpl implements AcBtr_5_service {
	@Autowired
	AcBtr_5_repository acBtr_5_repository;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	//getall
	@Override
	public List<TdoiAcBtr_5> getAll(){
		List<TdoiAcBtr_5> tdoiAcBtr_5 =new ArrayList<>();
		acBtr_5_repository.findAll().forEach(tdoiAcBtr_5::add);
		return tdoiAcBtr_5;	
	}

//getbyid
	@Override
	public TdoiAcBtr_5 getAcBtr_5byId(Long id) {
		return acBtr_5_repository.findById(id).get();
	}


	 //save
	@Override
			public List<TdoiAcBtr_5>  addAcBtr_5(List<TdoiAcBtr_5> tdoiAcBtr_5)
 {
				System.out.println("*******");

				List<TdoiAcBtr_5> savedAcBtr_5 = new ArrayList<>();
				try {
				
					System.out.println(tdoiAcBtr_5);
					tdoiAcBtr_5.forEach(dtl -> {
						savedAcBtr_5.add((TdoiAcBtr_5) acBtr_5_repository.save(dtl));
					});
					return savedAcBtr_5;
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
			}

	 

//delete
	@Override
	public TdoiAcBtr_5 deleteAcBtr_5ById(Long id) {
		TdoiAcBtr_5 tdoiAcBtr_5=acBtr_5_repository.findById(id).get();
		System.out.println(tdoiAcBtr_5);
		acBtr_5_repository.deleteById(id);
		return tdoiAcBtr_5;
		
	}

//update
	@Override
	public TdoiAcBtr_5 updateTdoiAcBtr_5(TdoiAcBtr_5 tdoiAcBtr_5) {
		TdoiAcBtr_5 AcBtr_5 = acBtr_5_repository.findById(tdoiAcBtr_5.getBtr5_reg_id()).get();
		System.out.println(AcBtr_5);
		
		if (tdoiAcBtr_5.getBtr5_reg_id() != 0) {
			AcBtr_5.setBtr5_reg_id(tdoiAcBtr_5.getBtr5_reg_id());
		}
		if (tdoiAcBtr_5.getReference_no() != null) {
			AcBtr_5.setReference_no(tdoiAcBtr_5.getReference_no());
		}
		if (tdoiAcBtr_5.getReference_dt() != null) {
			AcBtr_5.setReference_dt(tdoiAcBtr_5.getReference_dt());
		}
		if (tdoiAcBtr_5.getReceipt_no() != null) {
			AcBtr_5.setReceipt_no(tdoiAcBtr_5.getReceipt_no());
		}
		if (tdoiAcBtr_5.getFin_year_id() != 0) {
			AcBtr_5.setFin_year_id(tdoiAcBtr_5.getFin_year_id());
		}
		if (tdoiAcBtr_5.getTransaction_dt() != null) {
			AcBtr_5.setTransaction_dt(tdoiAcBtr_5.getTransaction_dt());
		}
		if (tdoiAcBtr_5.getRecv_frm_type_id() != 0) {
			AcBtr_5.setRecv_frm_type_id(tdoiAcBtr_5.getRecv_frm_type_id());
		}
		if (tdoiAcBtr_5.getLetter_no() != null) {
			AcBtr_5.setLetter_no(tdoiAcBtr_5.getLetter_no());
		}
		if (tdoiAcBtr_5.getParty_type_id() != 0) {
			AcBtr_5.setParty_type_id(tdoiAcBtr_5.getParty_type_id());
		}
		if (tdoiAcBtr_5.getParty_name() != null) {
			AcBtr_5.setParty_name(tdoiAcBtr_5.getParty_name());
		}
		if (tdoiAcBtr_5.getParty_address() != null) {
			AcBtr_5.setParty_address(tdoiAcBtr_5.getParty_address());
		}
		if (tdoiAcBtr_5.getCheque_dd_cash_id() != 0) {
			AcBtr_5.setCheque_dd_cash_id(tdoiAcBtr_5.getCheque_dd_cash_id());
		}
		if (tdoiAcBtr_5.getBank_id() != 0) {
			AcBtr_5.setBank_id(tdoiAcBtr_5.getBank_id());
		}
		if (tdoiAcBtr_5.getBank_name() != null) {
			AcBtr_5.setBank_name(tdoiAcBtr_5.getBank_name());
		}
		if (tdoiAcBtr_5.getBranch_id() != 0) {
			AcBtr_5.setBranch_id(tdoiAcBtr_5.getBranch_id());
		}
		if (tdoiAcBtr_5.getBranch_name() != null) {
			AcBtr_5.setBranch_name(tdoiAcBtr_5.getBranch_name());
		}
		if (tdoiAcBtr_5.getCheque_dd_no() != 0) {
			AcBtr_5.setCheque_dd_no(tdoiAcBtr_5.getCheque_dd_no());
		}
		if (tdoiAcBtr_5.getCheque_dd_dt() != null) {
			AcBtr_5.setCheque_dd_dt(tdoiAcBtr_5.getCheque_dd_dt());
		}
		if (tdoiAcBtr_5.getCheque_dd_amt() != 0) {
			AcBtr_5.setCheque_dd_amt(tdoiAcBtr_5.getCheque_dd_amt());
		}
		if (tdoiAcBtr_5.getCheque_amt_in_words() != null) {
			AcBtr_5.setCheque_amt_in_words(tdoiAcBtr_5.getCheque_amt_in_words());
		}
		if (tdoiAcBtr_5.getActive_status() != 0) {
			AcBtr_5.setActive_status(tdoiAcBtr_5.getActive_status());
		}
		if (tdoiAcBtr_5.getCreated_date() != null) {
			AcBtr_5.setCreated_date(tdoiAcBtr_5.getCreated_date());
		}
		if (tdoiAcBtr_5.getCreated_by() != 0) {
			AcBtr_5.setCreated_by(tdoiAcBtr_5.getCreated_by());
		}
		if (tdoiAcBtr_5.getCreated_by_post() != 0) {
			AcBtr_5.setCreated_by_post(tdoiAcBtr_5.getCreated_by_post());
		}
		if (tdoiAcBtr_5.getUpdated_date() != null) {
			AcBtr_5.setUpdated_date(tdoiAcBtr_5.getUpdated_date());
		}
		if (tdoiAcBtr_5.getUpdated_by() != 0) {
			AcBtr_5.setUpdated_by(tdoiAcBtr_5.getUpdated_by());
		}
		if (tdoiAcBtr_5.getUpdated_by_post() != 0) {
			AcBtr_5.setUpdated_by_post(tdoiAcBtr_5.getUpdated_by_post());
		}
		if (tdoiAcBtr_5.getPayment_mode() != null) {
			AcBtr_5.setPayment_mode(tdoiAcBtr_5.getPayment_mode());
		}
		if (tdoiAcBtr_5.getMajorhead_id() != 0) {
			AcBtr_5.setMajorhead_id(tdoiAcBtr_5.getMajorhead_id());
		}
		if (tdoiAcBtr_5.getInsured_address() != null) {
			AcBtr_5.setInsured_address(tdoiAcBtr_5.getInsured_address());
		}
		if (tdoiAcBtr_5.getInsured_name() != null) {
			AcBtr_5.setInsured_name(tdoiAcBtr_5.getInsured_name());
		}
		
	
		TdoiAcBtr_5 tdoiAcBtr_51 = acBtr_5_repository.save(AcBtr_5);

		return tdoiAcBtr_51;
	}



//filter
	@Override
	public List<TdoiAcBtr_5> filterAcBtr_5(Map<String, String> tdoiAcBtr_5) {
		String query = "SELECT * FROM DOI.TDOI_AC_BTR_5 i ";

		for (Map.Entry<String, String> entry : tdoiAcBtr_5.entrySet()) {
			query += (query.contains("WHERE"))
					? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
					: " WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
		}
		System.out.println(query);

		List<TdoiAcBtr_5> fetchedbtrEntry = new ArrayList<>();
		try {
			fetchedbtrEntry = jdbcTemplate.query(query, (rs, rowNum) -> new TdoiAcBtr_5(
					rs.getLong("BTR5_REG_ID"),rs.getString("REFERENCE_NO"),rs.getTimestamp("REFERENCE_DT").toLocalDateTime(),
					rs.getString("RECEIPT_NO"),rs.getLong("FIN_YEAR_ID"),rs.getTimestamp("TRANSACTION_DT").toLocalDateTime(),
					rs.getLong("RECV_FRM_TYPE_ID"),rs.getString("LETTER_NO"),rs.getLong("PARTY_TYPE_ID"),rs.getString("PARTY_NAME"),
					rs.getString("PARTY_ADDRESS"),rs.getLong("CHEQUE_DD_CASH_ID"),rs.getLong("BANK_ID"),rs.getString("BANK_NAME"),
					rs.getLong("BRANCH_ID"),rs.getString("BRANCH_NAME"),rs.getLong("CHEQUE_DD_NO"),rs.getDate("CHEQUE_DD_DT").toLocalDate(),
					rs.getDouble("CHEQUE_DD_AMT"),rs.getString("CHEQUE_AMT_IN_WORDS"),rs.getShort("ACTIVE_STATUS"),rs.getTimestamp("CREATED_DATE").toLocalDateTime(),
					rs.getLong("CREATED_BY"),rs.getLong("CREATED_BY_POST"),rs.getTimestamp("UPDATED_DATE").toLocalDateTime(),rs.getLong("UPDATED_BY"),
					rs.getLong("UPDATED_BY_POST"),rs.getString("PAYMENT_MODE"),rs.getLong("MAJORHEAD_ID"),rs.getString("INSURED_ADDRESS"),rs.getString("INSURED_NAME")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//acBtr_5_repository.findAll().forEach(fetchedbtrEntry::add);
		
		return fetchedbtrEntry;
	}


	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public List<TdoiAcStampRegister> addAcStampRegister( List<TdoiAcStampRegister> acStampRegisterRepository){
		
//		List<TdoiAcStampRegister> StampRegisterRepository = new ArrayList<>();
//		try {
//		
//			System.out.println(acStampRegisterRepository);
//			acStampRegisterRepository.forEach(dtl -> {
//				StampRegisterRepository.add((TdoiAcStampRegister)acStampRegisterRepository.save(dtl));
//			});
//			return StampRegisterRepository;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//		
//		return null;
//	}
//	
//	public TdoiAcStampRegister updateAcStampRegister(TdoiAcStampRegister tdoiAcStampRegister) {
//		return tdoiAcStampRegister;
//		
//	}
//	



