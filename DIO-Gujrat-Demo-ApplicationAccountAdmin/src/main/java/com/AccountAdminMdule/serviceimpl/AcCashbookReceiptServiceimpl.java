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
import com.AccountAdminMdule.repository.AcCashbookReceiptRepository;
import com.AccountAdminMdule.service.AcCashbookReceiptService;


@Service
@CrossOrigin(origins = "*")
@Transactional
public class AcCashbookReceiptServiceimpl implements AcCashbookReceiptService{

	@Autowired
	AcCashbookReceiptRepository acCashbookReceiptRepository;
	@Autowired
	JdbcTemplate jdbcTemplate;


	public List<TdoiAcCashbookReceipt> getAll() {
		List<TdoiAcCashbookReceipt> tdoiAcCashbookReceipt =new ArrayList<>();
		acCashbookReceiptRepository.findAll().forEach(tdoiAcCashbookReceipt::add);
		return tdoiAcCashbookReceipt;	
	}


	public TdoiAcCashbookReceipt getCashbookReceiptbyId(Long id) {
		return acCashbookReceiptRepository.findById(id).get();
	}


	
	public List<TdoiAcCashbookReceipt> addAcStampRegister( List<TdoiAcCashbookReceipt> tdoiAcCashbookReceipt) {
		List<TdoiAcCashbookReceipt> savedAcCashbookReceipt = new ArrayList<>();
		try {
		
			System.out.println(tdoiAcCashbookReceipt);
			tdoiAcCashbookReceipt.forEach(dtl -> {
				savedAcCashbookReceipt.add((TdoiAcCashbookReceipt) acCashbookReceiptRepository.save(dtl));
			});
			return savedAcCashbookReceipt;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	 //save
			public List<TdoiAcCashbookReceipt> addAcCashbookReceipt(List<TdoiAcCashbookReceipt>tdoiAcCashbookReceipt) {

				List<TdoiAcCashbookReceipt> savedAcCashbookReceipt = new ArrayList<>();
				try {
				
					System.out.println(tdoiAcCashbookReceipt);
					tdoiAcCashbookReceipt.forEach(dtl -> {
						savedAcCashbookReceipt.add((TdoiAcCashbookReceipt) acCashbookReceiptRepository.save(dtl));
					});
					return savedAcCashbookReceipt;
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
			}

	 

	public TdoiAcCashbookReceipt deleteCashbookReceiptById( Long id) {
		TdoiAcCashbookReceipt tdoiAcCashbookReceipt=acCashbookReceiptRepository.findById(id).get();
		System.out.println(tdoiAcCashbookReceipt);
		 acCashbookReceiptRepository.deleteById(id);
		return tdoiAcCashbookReceipt;
		
	}


	//update
	
		
		@Override
		public TdoiAcCashbookReceipt updateAcCashbookReceipt(TdoiAcCashbookReceipt tdoiAcCashbookReceipt) {
	TdoiAcCashbookReceipt acCashbookReceipt =acCashbookReceiptRepository.findById(tdoiAcCashbookReceipt.getCb_receipt_id()).get();
			
			if (tdoiAcCashbookReceipt.getReference_no() != null) {
				acCashbookReceipt.setReference_no(tdoiAcCashbookReceipt.getReference_no());
			}
			
			if (tdoiAcCashbookReceipt.getReference_dt() != null) {
				acCashbookReceipt.setReference_dt(tdoiAcCashbookReceipt.getReference_dt());
			}
			
			if (tdoiAcCashbookReceipt.getPayment_dt() != null) {
				acCashbookReceipt.setPayment_dt(tdoiAcCashbookReceipt.getPayment_dt());
			}
			
			if (tdoiAcCashbookReceipt.getBill_receipt_srno() != 0) {
				acCashbookReceipt.setBill_receipt_srno(tdoiAcCashbookReceipt.getBill_receipt_srno());
			}
			if (tdoiAcCashbookReceipt.getReceive_from_name() != null) {
				acCashbookReceipt.setReceive_from_name(tdoiAcCashbookReceipt.getReceive_from_name());
			}
			
			if (tdoiAcCashbookReceipt.getCheque_dd_no() != 0) {
				acCashbookReceipt.setCheque_dd_no(tdoiAcCashbookReceipt.getCheque_dd_no());
			}
			
			if (tdoiAcCashbookReceipt.getGovt_acc_receipt() != null) {
				acCashbookReceipt.setGovt_acc_receipt(tdoiAcCashbookReceipt.getGovt_acc_receipt());
			}
			
			if (tdoiAcCashbookReceipt.getALLOWANCE_PAY() != 0) {
				acCashbookReceipt.setALLOWANCE_PAY(tdoiAcCashbookReceipt.getALLOWANCE_PAY());
			}
			
			if (tdoiAcCashbookReceipt.getAdvance() != 0) {
				acCashbookReceipt.setAdvance(tdoiAcCashbookReceipt.getAdvance());
			}
			
			if (tdoiAcCashbookReceipt.getTot_allowance() != 0) {
				acCashbookReceipt.setTot_allowance(tdoiAcCashbookReceipt.getTot_allowance());
			}
			
			if (tdoiAcCashbookReceipt.getTotal_amt() != 0) {
				acCashbookReceipt.setTotal_amt(tdoiAcCashbookReceipt.getTotal_amt());
			}
			
			if (tdoiAcCashbookReceipt.getPerm_adv_recoup() != 0) {
				acCashbookReceipt.setPerm_adv_recoup(tdoiAcCashbookReceipt.getPerm_adv_recoup());
			}
			
			if (tdoiAcCashbookReceipt.getDrawn_amt_type_id() != 0) {
				acCashbookReceipt.setDrawn_amt_type_id(tdoiAcCashbookReceipt.getDrawn_amt_type_id());
			}
			
			if (tdoiAcCashbookReceipt.getDrawn_bill_amt() != 0) {
				acCashbookReceipt.setDrawn_bill_amt(tdoiAcCashbookReceipt.getDrawn_bill_amt());
			}
			
			
			if (tdoiAcCashbookReceipt.getMisc_amt() != 0) {
				acCashbookReceipt.setMisc_amt(tdoiAcCashbookReceipt.getMisc_amt());
			}
			
			
			if (tdoiAcCashbookReceipt.getMajorhead_id() != 0) {
				acCashbookReceipt.setMajorhead_id(tdoiAcCashbookReceipt.getMajorhead_id());
			}
			
			
			if (tdoiAcCashbookReceipt.getSubmajorhead_id() != 0) {
				acCashbookReceipt.setSubmajorhead_id(tdoiAcCashbookReceipt.getSubmajorhead_id());
			}
			
			if (tdoiAcCashbookReceipt.getMinorhead_id() != 0) {
				acCashbookReceipt.setMinorhead_id(tdoiAcCashbookReceipt.getMinorhead_id());
			}
			
			if (tdoiAcCashbookReceipt.getSubhead_id()!= 0) {
				acCashbookReceipt.setSubhead_id(tdoiAcCashbookReceipt.getSubhead_id());
			}
			
			if (tdoiAcCashbookReceipt.getActive_status() != 0) {
				acCashbookReceipt.setActive_status(tdoiAcCashbookReceipt.getActive_status());
			}
			if (tdoiAcCashbookReceipt.getCreated_date() != null) {
				acCashbookReceipt.setCreated_date(tdoiAcCashbookReceipt.getCreated_date());
			}
			if (tdoiAcCashbookReceipt.getCreated_by() != 0) {
				acCashbookReceipt.setCreated_by(tdoiAcCashbookReceipt.getCreated_by());
			}
			if (tdoiAcCashbookReceipt.getCreated_by_post() != 0) {
				acCashbookReceipt.setCreated_by_post(tdoiAcCashbookReceipt.getCreated_by_post());
			}
			if (tdoiAcCashbookReceipt.getUpdated_date() != null) {
				acCashbookReceipt.setUpdated_date(tdoiAcCashbookReceipt.getUpdated_date());
			}
			if (tdoiAcCashbookReceipt.getUpdated_by() != 0) {
				acCashbookReceipt.setUpdated_by(tdoiAcCashbookReceipt.getUpdated_by());
			}
			if (tdoiAcCashbookReceipt.getUpdated_by_post() != 0) {
				acCashbookReceipt.setUpdated_by_post(tdoiAcCashbookReceipt.getUpdated_by_post());
				
			}
			if (tdoiAcCashbookReceipt.getChallan_amount() != 0) {
				acCashbookReceipt.setChallan_amount(tdoiAcCashbookReceipt.getChallan_amount());
				
			}
			if (tdoiAcCashbookReceipt.getChallan_no() != 0) {
				acCashbookReceipt.setChallan_no(tdoiAcCashbookReceipt.getChallan_no());
				
			}
			
		  TdoiAcCashbookReceipt tdoiAcCashbookReceipt1 = acCashbookReceiptRepository.save(acCashbookReceipt);
				  
				  return tdoiAcCashbookReceipt1;
			
		}



		@Override
		public List<TdoiAcCashbookReceipt> filterAcCashbookReceipt(Map<String, String> tdoiAcCashbookReceipt) {
			String query = "SELECT * FROM DOI.TDOI_AC_CASHBOOK_RECEIPT i ";

			for (Map.Entry<String, String> entry : tdoiAcCashbookReceipt.entrySet()) {
				query += (query.contains("WHERE"))
						? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
						: " WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
			}
			System.out.println(query);

			List<TdoiAcCashbookReceipt> fetchedAcCashbookReceiptEntry = new ArrayList<>();
			try {
				fetchedAcCashbookReceiptEntry = jdbcTemplate.query(query, (rs, rowNum) -> new TdoiAcCashbookReceipt(
						rs.getLong("CB_RECEIPT_ID"),rs.getString("REFERENCE_NO"),rs.getTimestamp("REFERENCE_DT").toLocalDateTime(),
						rs.getTimestamp("PAYMENT_DT").toLocalDateTime(),rs.getLong("BILL_RECEIPT_SRNO"),rs.getString("RECEIVE_FROM_NAME"),
						rs.getLong("CHEQUE_DD_NO"),rs.getString("GOVT_ACC_RECEIPT"),rs.getDouble("ALLOWANCE_PAY"),
						rs.getDouble("ADVANCE"),rs.getDouble("TOT_ALLOWANCE"),rs.getDouble("TOTAL_AMT"),
						rs.getDouble("PERM_ADV_RECOUP"),rs.getLong("DRAWN_AMT_TYPE_ID"),rs.getDouble("DRAWN_BILL_AMT"),
						rs.getDouble("MISC_AMT"),rs.getLong("MAJORHEAD_ID"),rs.getLong("SUBMAJORHEAD_ID"),rs.getLong("MINORHEAD_ID"),
						rs.getLong("SUBHEAD_ID"),rs.getShort("ACTIVE_STATUS"),rs.getTimestamp("CREATED_DATE").toLocalDateTime(),
						rs.getLong("CREATED_BY"),rs.getLong("CREATED_BY_POST"),rs.getTimestamp("UPDATED_DATE").toLocalDateTime(),
						rs.getLong("UPDATED_BY"),rs.getLong("UPDATED_BY_POST"),rs.getDouble("CHALLAN_AMOUNT"),rs.getInt("CHALLAN_NO")));
			} catch (Exception e) {
				e.printStackTrace();
			}

			//acCashbookReceiptRepository.findAll().forEach(fetchedAcCashbookReceiptEntry::add);

			return fetchedAcCashbookReceiptEntry;
		}


		@Override
		public TdoiAcCashbookReceipt updateTdoiAcCashbookReceipt(TdoiAcCashbookReceipt tdoiAcCashbookReceipt) {
			// TODO Auto-generated method stub
			return null;
		}

}
