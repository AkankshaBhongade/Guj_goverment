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

import com.AccountAdminMdule.entity.TdoiAcCashbookPayment;
import com.AccountAdminMdule.repository.AcCashbookPaymentRepository;
import com.AccountAdminMdule.service.AcCashbookPaymentService;



@Service
@CrossOrigin(origins = "*")
@Transactional
public class AcCashbookPaymentServiceimpl implements AcCashbookPaymentService{

	@Autowired
	AcCashbookPaymentRepository acCashbookPaymentRepository;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
//getall
	public List<TdoiAcCashbookPayment> getAll() {
		List<TdoiAcCashbookPayment> tdoiAcCashbookPayment =new ArrayList<>();
		acCashbookPaymentRepository.findAll().forEach(tdoiAcCashbookPayment::add);
		return tdoiAcCashbookPayment;	
		
	}

//getbyid
	public TdoiAcCashbookPayment getCashbookPaymentbyId(Long id) {
		
		return acCashbookPaymentRepository.findById(id).get();
	}
	
	
	//save

	public List<TdoiAcCashbookPayment> addAcCashbookPayment(List<TdoiAcCashbookPayment> tdoiAcCashbookPayment) {
		List<TdoiAcCashbookPayment> savedAcCashbookPayment = new ArrayList<>();
		try {
		
			System.out.println(tdoiAcCashbookPayment);
			tdoiAcCashbookPayment.forEach(d -> {
				savedAcCashbookPayment.add((TdoiAcCashbookPayment) acCashbookPaymentRepository.save(d));
			});
			return savedAcCashbookPayment;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	 //save
			public List<TdoiAcCashbookPayment> addSurveyordtl(List<TdoiAcCashbookPayment> tdoiAcCashbookPayment) {

				List<TdoiAcCashbookPayment> savedAcCashbookPayment = new ArrayList<>();
				try {
				
					System.out.println(tdoiAcCashbookPayment);
					tdoiAcCashbookPayment.forEach(dtl -> {
						savedAcCashbookPayment.add((TdoiAcCashbookPayment) acCashbookPaymentRepository.save(dtl));
					});
					return savedAcCashbookPayment;
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
			}

	 //delete
	
	@Override
	public TdoiAcCashbookPayment deleteAcCashbookPaymentById(Long id) {
		TdoiAcCashbookPayment tdoiAcCashbookPayment=acCashbookPaymentRepository.findById(id).get();
		System.out.println(tdoiAcCashbookPayment);
		 acCashbookPaymentRepository.deleteById(id);
		return tdoiAcCashbookPayment;
			}

//update
	
	@Override
	public TdoiAcCashbookPayment updateTdoiAcCashbookPayment(TdoiAcCashbookPayment tdoiAcCashbookPayment) {
TdoiAcCashbookPayment AcCashbookPayment =acCashbookPaymentRepository.findById(tdoiAcCashbookPayment.getCb_payment_id()).get();
		
		if (tdoiAcCashbookPayment.getReference_no() != null) {
			AcCashbookPayment.setReference_no(tdoiAcCashbookPayment.getReference_no());
		}
		
		if (tdoiAcCashbookPayment.getReference_dt() != null) {
			AcCashbookPayment.setReference_dt(tdoiAcCashbookPayment.getReference_dt());
		}
		
		if (tdoiAcCashbookPayment.getPayment_dt() != null) {
			AcCashbookPayment.setPayment_dt(tdoiAcCashbookPayment.getPayment_dt());
		}
		
		if (tdoiAcCashbookPayment.getSubvoucher_srno() != 0) {
			AcCashbookPayment.setSubvoucher_srno(tdoiAcCashbookPayment.getSubvoucher_srno());
		}
		if (tdoiAcCashbookPayment.getWhom_paid_name() != null) {
			AcCashbookPayment.setWhom_paid_name(tdoiAcCashbookPayment.getWhom_paid_name());
		}
		
		if (tdoiAcCashbookPayment.getGovt_acc_receipt()!= null) {
			AcCashbookPayment.setGovt_acc_receipt(tdoiAcCashbookPayment.getGovt_acc_receipt());
		}
		
		
		if (tdoiAcCashbookPayment.getAllowance_pay()!= 0) {
			AcCashbookPayment.setAllowance_pay(tdoiAcCashbookPayment.getAllowance_pay());
		}
		
		if (tdoiAcCashbookPayment.getAdvance() != 0) {
			AcCashbookPayment.setAdvance(tdoiAcCashbookPayment.getAdvance());
		}
		
		if (tdoiAcCashbookPayment.getTot_allowance() != 0) {
			AcCashbookPayment.setTot_allowance(tdoiAcCashbookPayment.getTot_allowance());
		}
		
		if (tdoiAcCashbookPayment.getTotal_amt() != 0) {
			AcCashbookPayment.setTotal_amt(tdoiAcCashbookPayment.getTotal_amt());
		}
		
		if (tdoiAcCashbookPayment.getPerm_adv_recoup() != 0) {
			AcCashbookPayment.setPerm_adv_recoup(tdoiAcCashbookPayment.getPerm_adv_recoup());
		}
		
		if (tdoiAcCashbookPayment.getDrawn_amt_type_id() != 0) {
			AcCashbookPayment.setDrawn_amt_type_id(tdoiAcCashbookPayment.getDrawn_amt_type_id());
		}
		
		if (tdoiAcCashbookPayment.getDrawn_bill_amt() != 0) {
			AcCashbookPayment.setDrawn_bill_amt(tdoiAcCashbookPayment.getDrawn_bill_amt());
		}
		
		
		if (tdoiAcCashbookPayment.getMisc_amt() != 0) {
			AcCashbookPayment.setMisc_amt(tdoiAcCashbookPayment.getMisc_amt());
		}
		
		
		if (tdoiAcCashbookPayment.getMajorhead_id() != 0) {
			AcCashbookPayment.setMajorhead_id(tdoiAcCashbookPayment.getMajorhead_id());
		}
		
		
		if (tdoiAcCashbookPayment.getSubmajorhead_id() != 0) {
			AcCashbookPayment.setSubmajorhead_id(tdoiAcCashbookPayment.getSubmajorhead_id());
		}
		
		if (tdoiAcCashbookPayment.getMinorhead_id() != 0) {
			AcCashbookPayment.setMinorhead_id(tdoiAcCashbookPayment.getMinorhead_id());
		}
		
		if (tdoiAcCashbookPayment.getSubhead_id()!= 0) {
			AcCashbookPayment.setSubhead_id(tdoiAcCashbookPayment.getSubhead_id());
		}
		
		if (tdoiAcCashbookPayment.getActive_status() != 0) {
			AcCashbookPayment.setActive_status(tdoiAcCashbookPayment.getActive_status());
		}
		if (tdoiAcCashbookPayment.getCreated_date() != null) {
			AcCashbookPayment.setCreated_date(tdoiAcCashbookPayment.getCreated_date());
		}
		if (tdoiAcCashbookPayment.getCreated_by() != 0) {
			AcCashbookPayment.setCreated_by(tdoiAcCashbookPayment.getCreated_by());
		}
		if (tdoiAcCashbookPayment.getCreated_by_post() != 0) {
			AcCashbookPayment.setCreated_by_post(tdoiAcCashbookPayment.getCreated_by_post());
		}
		if (tdoiAcCashbookPayment.getUpdated_date() != null) {
			AcCashbookPayment.setUpdated_date(tdoiAcCashbookPayment.getUpdated_date());
		}
		if (tdoiAcCashbookPayment.getUpdated_by() != 0) {
			AcCashbookPayment.setUpdated_by(tdoiAcCashbookPayment.getUpdated_by());
		}
		if (tdoiAcCashbookPayment.getUpdated_by_post() != 0) {
			AcCashbookPayment.setUpdated_by_post(tdoiAcCashbookPayment.getUpdated_by_post());
		}
		
		if (tdoiAcCashbookPayment.getChallan_amount() != 0) {
			AcCashbookPayment.setChallan_amount(tdoiAcCashbookPayment.getChallan_amount());
		}
		if (tdoiAcCashbookPayment.getChallan_no() != 0) {
			AcCashbookPayment.setChallan_no(tdoiAcCashbookPayment.getChallan_no());
		}
		
		TdoiAcCashbookPayment tdoiAcCashbookPayment1 = acCashbookPaymentRepository.save(AcCashbookPayment);
			  
			  return tdoiAcCashbookPayment1;
		

	
}
	
	
	//filter
	@Override
	public List<TdoiAcCashbookPayment> filterAcCashbookPayment(Map<String, String> tdoiAcCashbookPayment) {
		String query = "SELECT * FROM DOI.TDOI_AC_CASHBOOK_PAYMENT i ";

		for (Map.Entry<String, String> entry : tdoiAcCashbookPayment.entrySet()) {
			query += (query.contains("WHERE"))
					? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
					: " WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
		}
		System.out.println(query);

		List<TdoiAcCashbookPayment> fetchedAcCashbookPaymentEntry = new ArrayList<>();
		try {
			fetchedAcCashbookPaymentEntry = jdbcTemplate.query(query, (rs, rowNum) -> new TdoiAcCashbookPayment(
					rs.getLong("CB_PAYMENT_ID"),rs.getString("REFERENCE_NO"),rs.getTimestamp("REFERENCE_DT").toLocalDateTime(),
					rs.getTimestamp("PAYMENT_DT").toLocalDateTime(),rs.getLong("SUBVOUCHER_SRNO"),
					rs.getString("WHOM_PAID_NAME"),rs.getString("GOVT_ACC_RECEIPT"),rs.getDouble("ALLOWANCE_PAY"),
					rs.getDouble("ADVANCE"),rs.getDouble("TOT_ALLOWANCE"),rs.getDouble("TOTAL_AMT"),
					rs.getDouble("PERM_ADV_RECOUP"),rs.getLong("DRAWN_AMT_TYPE_ID"),rs.getDouble("DRAWN_BILL_AMT"),
					rs.getDouble("MISC_AMT"),rs.getLong("MAJORHEAD_ID"),rs.getLong("SUBMAJORHEAD_ID"),rs.getLong("MINORHEAD_ID"),
					rs.getLong("SUBHEAD_ID"),rs.getShort("ACTIVE_STATUS"),rs.getTimestamp("CREATED_DATE").toLocalDateTime(),
					rs.getLong("CREATED_BY"),rs.getLong("CREATED_BY_POST"),rs.getTimestamp("UPDATED_DATE").toLocalDateTime(),
					rs.getLong("UPDATED_BY"),rs.getLong("UPDATED_BY_POST"),rs.getDouble("CHALLAN_AMOUNT"),rs.getInt("CHALLAN_NO")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//acCashbookPaymentRepository.findAll().forEach(fetchedAcCashbookPaymentEntry::add);

		
		return fetchedAcCashbookPaymentEntry;
	}

	


}
