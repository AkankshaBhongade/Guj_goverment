package com.AccountAdminMdule.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;
//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.AccountAdminMdule.entity.TdoiAcCashbookReceipt;
import com.AccountAdminMdule.entity.TdoiAcStampRegister;
import com.AccountAdminMdule.repository.AcStampRegisterRepository;
import com.AccountAdminMdule.service.AcStampRegisterService;




@Service
@CrossOrigin(origins = "*")
@Transactional
public class AcStampRegisterServiceimpl implements AcStampRegisterService {
	
	@Autowired
	AcStampRegisterRepository acStampRegisterRepository;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<TdoiAcStampRegister> getAll() {
		List<TdoiAcStampRegister> tdoiAcStampRegister =new ArrayList<>();
		acStampRegisterRepository.findAll().forEach(tdoiAcStampRegister::add);
		return tdoiAcStampRegister;
		
	}
	
	public TdoiAcStampRegister getStampRegisterbyId(Long id) {
		return acStampRegisterRepository.findById(id).get();
			
	}
	
	
	public List<TdoiAcStampRegister> addAcStampRegister( List<TdoiAcStampRegister> tdoiAcStampRegister){
		
		List<TdoiAcStampRegister> saveStampRegisterRepository = new ArrayList<>();
		try {
		
			System.out.println(acStampRegisterRepository);
			tdoiAcStampRegister.forEach(a -> {
				saveStampRegisterRepository.add((TdoiAcStampRegister)acStampRegisterRepository.save(a));
			});
			return saveStampRegisterRepository;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	
	}
	
	
	public TdoiAcStampRegister updateAcStampRegister(TdoiAcStampRegister tdoiAcStampRegister) {
		return tdoiAcStampRegister;
		
	}
	
	public TdoiAcStampRegister deleteAcStampRegisterById(Long id) {
		TdoiAcStampRegister tdoiAcStampRegister=acStampRegisterRepository.findById(id).get();
		System.out.println(tdoiAcStampRegister);
		 acStampRegisterRepository.deleteById(id);
		return tdoiAcStampRegister;
		
	}
	
	
	@Override
	public TdoiAcStampRegister updatetAcStampRegister(TdoiAcStampRegister tdoiAcStampRegister) {
		TdoiAcStampRegister AcStampRegister = acStampRegisterRepository.findById(tdoiAcStampRegister.getStamp_reg_id()).get();
		System.out.println(AcStampRegister);
		
		if (tdoiAcStampRegister.getStamp_reg_id() != 0) {
			AcStampRegister.setStamp_reg_id(tdoiAcStampRegister.getStamp_reg_id());
		}
		if (tdoiAcStampRegister.getReference_no() != null) {
			AcStampRegister.setReference_no(tdoiAcStampRegister.getReference_no());
		}
	
		if (tdoiAcStampRegister.getReference_dt() != null) {
			AcStampRegister.setReference_dt(tdoiAcStampRegister.getReference_dt());
		}
	
		if (tdoiAcStampRegister.getStamp_reference_no() != null) {
			AcStampRegister.setStamp_reference_no(tdoiAcStampRegister.getStamp_reference_no());
		}
	
		if (tdoiAcStampRegister.getTransaction_dt() != null) {
			AcStampRegister.setTransaction_dt(tdoiAcStampRegister.getTransaction_dt());
		}
	
		if (tdoiAcStampRegister.getTransaction_type_id() != 0) {
			AcStampRegister.setTransaction_type_id(tdoiAcStampRegister.getTransaction_type_id());
		}
	
		if (tdoiAcStampRegister.getStamp_amt() != 0) {
			AcStampRegister.setStamp_amt(tdoiAcStampRegister.getStamp_amt());
		}
	
		if (tdoiAcStampRegister.getAvaliable_amt() != 0) {
			AcStampRegister.setAvaliable_amt(tdoiAcStampRegister.getAvaliable_amt());
		}
	
		if (tdoiAcStampRegister.getRemarks() != null) {
			AcStampRegister.setRemarks(tdoiAcStampRegister.getRemarks());
		}
	
		if (tdoiAcStampRegister.getActive_status() != 0) {
			AcStampRegister.setActive_status(tdoiAcStampRegister.getActive_status());
		}
	
		if (tdoiAcStampRegister.getCreated_by() != 0) {
			AcStampRegister.setCreated_by(tdoiAcStampRegister.getCreated_by());
		}
	
		if (tdoiAcStampRegister.getCreated_date() != null) {
			AcStampRegister.setCreated_date(tdoiAcStampRegister.getCreated_date());
		}
		if (tdoiAcStampRegister.getCreated_by_post() != 0) {
			AcStampRegister.setCreated_by_post(tdoiAcStampRegister.getCreated_by_post());
		}
		if (tdoiAcStampRegister.getUpdated_date() != null) {
			AcStampRegister.setUpdated_date(tdoiAcStampRegister.getUpdated_date());
		}
		if (tdoiAcStampRegister.getUpdated_by() != 0) {
			AcStampRegister.setUpdated_by(tdoiAcStampRegister.getUpdated_by());
		}
		if (tdoiAcStampRegister.getUpdated_by_post() != 0) {
			AcStampRegister.setUpdated_by_post(tdoiAcStampRegister.getUpdated_by_post());
		}
		
		
		TdoiAcStampRegister tdoiAcStampRegister1 = acStampRegisterRepository.save(AcStampRegister);

		return tdoiAcStampRegister1;
	}



	@Override
	public List<TdoiAcStampRegister> filterAcStampRegister(Map<String, String> acStampRegister) {
		String query = "SELECT * FROM DOI.TDOI_AC_STAMP_REGISTER i ";

		for (Map.Entry<String, String> entry : acStampRegister.entrySet()) {
			query += (query.contains("WHERE"))
					? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
					: "WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
		}
		System.out.println(query);

		List<TdoiAcStampRegister> fetchedAcStampRegister = new ArrayList<>();
		try {
			fetchedAcStampRegister = jdbcTemplate.query(query, (rs, rowNum) -> new TdoiAcStampRegister(
					rs.getLong("STAMP_REG_ID"),rs.getString("REFERENCE_NO"),rs.getTimestamp("REFERENCE_DT").toLocalDateTime(),
					rs.getString("STAMP_REFERENCE_NO"),rs.getTimestamp("TRANSACTION_DT").toLocalDateTime(),rs.getLong("TRANSACTION_TYPE_ID"),
					rs.getDouble("STAMP_AMT"),rs.getDouble("AVAILABLE_AMT"),rs.getString("REMARKS"),
					rs.getShort("ACTIVE_STATUS"),rs.getTimestamp("CREATED_DATE").toLocalDateTime(),
					rs.getLong("CREATED_BY"),rs.getLong("CREATED_BY_POST"),rs.getTimestamp("UPDATED_DATE").toLocalDateTime(),
					rs.getLong("UPDATED_BY"),rs.getLong("UPDATED_BY_POST")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//acStampRegisterRepository.findAll().forEach(fetchedAcStampRegister::add);

	return fetchedAcStampRegister;
	}


	
	
}
