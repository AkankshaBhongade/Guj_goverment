package com.AccountAdminMdule.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.AccountAdminMdule.dto.AcDeadStockPurchseItems;
import com.AccountAdminMdule.entity.TdoiAcChequeRegister;
import com.AccountAdminMdule.entity.TdoiAcDeadStockRegister;
import com.AccountAdminMdule.repository.DeadStockRegisterRepository;
import com.AccountAdminMdule.service.ChallanRegisterService;
import com.AccountAdminMdule.service.DeadStockRegisterService;

@Service
@CrossOrigin(origins = "*")
@Transactional
public class DeadStockRegisterServiceimpl implements DeadStockRegisterService {
	@Autowired
	DeadStockRegisterRepository deadStockRegisterRepository;
	@Autowired
	JdbcTemplate jdbcTemplate;

	//getAll
	
	public List<TdoiAcDeadStockRegister> getAll() {
		List<TdoiAcDeadStockRegister> deadStock = new ArrayList<>();
		System.out.println(deadStockRegisterRepository.findAll());
		deadStockRegisterRepository.findAll().forEach(deadStock::add);
		return deadStock;
	}


	//getbyid
	
	public TdoiAcDeadStockRegister getDeadStockById(Long id) {
		return deadStockRegisterRepository.findById(id).get();
	}

/*
	//save
	
	public List<TdoiAcDeadStockRegister> addDeadStockRegister(List<TdoiAcDeadStockRegister> tdoiAcDeadStockRegister) {
		List<TdoiAcDeadStockRegister> savedDeadStock = new ArrayList<>();
		try {
		
			System.out.println(tdoiAcDeadStockRegister);
			tdoiAcDeadStockRegister.forEach(dtl -> {
				savedDeadStock.add((TdoiAcDeadStockRegister) deadStockRegisterRepository.save(dtl));
			});
			return savedDeadStock;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	*/
	
	
	
	//save
	
	@Override
	public 	List<AcDeadStockPurchseItems> addDeadStockRegister(List<TdoiAcDeadStockRegister> obdeadStockPurchse)
 {
		List<AcDeadStockPurchseItems> savedDeadStock = new ArrayList<>();
		//deadStockPurchseItems.forEach(d -> {
		for(int i=0;i<obdeadStockPurchse.size();i++) {
AcDeadStockPurchseItems deadStockPurchseItems = new AcDeadStockPurchseItems();

TdoiAcDeadStockRegister obdeadStockPurchseItemsjt = obdeadStockPurchse.get(i);
deadStockPurchseItems.setEquipment_Name(obdeadStockPurchseItemsjt.getEquipment_name());
deadStockPurchseItems.setPurchase_Order_Number(obdeadStockPurchseItemsjt.getPurch_receivr_name());
//deadStockPurchseItems.setPurchase_Order_Date(obdeadStockPurchseItemsjt.getPurchase_Order_Date());
deadStockPurchseItems.setQuantity(obdeadStockPurchseItemsjt.getQuantity()+"");
deadStockPurchseItems.setQuantity(obdeadStockPurchseItemsjt.getQuantity()+"");
deadStockPurchseItems.setAmount(obdeadStockPurchseItemsjt.getPurchase_amount()+"");
//deadStockPurchseItems.setReceiver_Name(obdeadStockPurchseItemsjt.getReceiver_Name());
deadStockPurchseItems.setSerial_Number(obdeadStockPurchseItemsjt.getSerial_no());



savedDeadStock.add(deadStockPurchseItems);
		}
					return savedDeadStock;
	}
	
	
	public void deleteTdoiAcDeadStockRegister(Long id) {
		deadStockRegisterRepository.deleteById(id);
	}


	@Override
	public TdoiAcDeadStockRegister updateTdoiAcDeadStockRegister(TdoiAcDeadStockRegister tdoiAcDeadStockRegister) {
		TdoiAcDeadStockRegister AcDeadStockRegister = deadStockRegisterRepository.findById(tdoiAcDeadStockRegister.getDead_stk_reg_id()).get();
		System.out.println(AcDeadStockRegister);
		
		if (tdoiAcDeadStockRegister.getDead_stk_reg_id() != 0) {
			AcDeadStockRegister.setDead_stk_reg_id(tdoiAcDeadStockRegister.getDead_stk_reg_id());
		}
		
		if (tdoiAcDeadStockRegister.getReference_no() !=null) {
			AcDeadStockRegister.setReference_no(tdoiAcDeadStockRegister.getReference_no());
		}
		
	    if (tdoiAcDeadStockRegister.getReference_dt() !=null) {
		AcDeadStockRegister.setReference_dt(tdoiAcDeadStockRegister.getReference_dt());
	    }
	
        if (tdoiAcDeadStockRegister.getEquip_type_id() !=0) {
	    AcDeadStockRegister.setEquip_type_id(tdoiAcDeadStockRegister.getEquip_type_id());
        }
        
        if (tdoiAcDeadStockRegister.getEquipment_name() !=null) {
			AcDeadStockRegister.setEquipment_name(tdoiAcDeadStockRegister.getEquipment_name());
		}
		
		if (tdoiAcDeadStockRegister.getPurchase_order_no() !=null) {
			AcDeadStockRegister.setPurchase_order_no(tdoiAcDeadStockRegister.getPurchase_order_no());
		}
		
		if (tdoiAcDeadStockRegister.getQuantity() !=0) {
			AcDeadStockRegister.setQuantity(tdoiAcDeadStockRegister.getQuantity());
		}
		
		if (tdoiAcDeadStockRegister.getPurchase_amount() !=0) {
			AcDeadStockRegister.setPurchase_amount(tdoiAcDeadStockRegister.getPurchase_amount());
		}
		
		if (tdoiAcDeadStockRegister.getPurch_receivr_name() !=null) {
			AcDeadStockRegister.setPurch_receivr_name(tdoiAcDeadStockRegister.getPurch_receivr_name());
		}
		
		if (tdoiAcDeadStockRegister.getSerial_no() !=null) {
			AcDeadStockRegister.setSerial_no(tdoiAcDeadStockRegister.getSerial_no());
		}
		
		if (tdoiAcDeadStockRegister.getRemarks() !=null) {
			AcDeadStockRegister.setRemarks(tdoiAcDeadStockRegister.getRemarks());
		}
		
		if (tdoiAcDeadStockRegister.getDisposal_type_id() !=0) {
			AcDeadStockRegister.setDisposal_type_id(tdoiAcDeadStockRegister.getDisposal_type_id());
		}
		
		if (tdoiAcDeadStockRegister.getDisposal_type() !=null) {
			AcDeadStockRegister.setDisposal_type(tdoiAcDeadStockRegister.getDisposal_type());
		}
		
		
		if (tdoiAcDeadStockRegister.getOrder_voucher_no() !=null) {
			AcDeadStockRegister.setOrder_voucher_no(tdoiAcDeadStockRegister.getOrder_voucher_no());
		}
		
		if (tdoiAcDeadStockRegister.getOrder_voucher_dt() !=null) {
			AcDeadStockRegister.setOrder_voucher_dt(tdoiAcDeadStockRegister.getOrder_voucher_dt());
		}
		
		
		if (tdoiAcDeadStockRegister.getFinal_disp_qty() !=0) {
			AcDeadStockRegister.setFinal_disp_qty(tdoiAcDeadStockRegister.getFinal_disp_qty());
		}
		

		if (tdoiAcDeadStockRegister.getDisp_receivr_name() !=null) {
			AcDeadStockRegister.setDisp_receivr_name(tdoiAcDeadStockRegister.getDisp_receivr_name());
		}
		
		if (tdoiAcDeadStockRegister.getDisp_recv_amt() !=0) {
			AcDeadStockRegister.setDisp_recv_amt(tdoiAcDeadStockRegister.getDisp_recv_amt());
		}
		

		if (tdoiAcDeadStockRegister.getDisp_recv_dt() !=null) {
			AcDeadStockRegister.setDisp_recv_dt(tdoiAcDeadStockRegister.getDisp_recv_dt());
		}
		

		if (tdoiAcDeadStockRegister.getGov_deposit_amt() !=0) {
			AcDeadStockRegister.setGov_deposit_amt(tdoiAcDeadStockRegister.getGov_deposit_amt());
		}
		

		if (tdoiAcDeadStockRegister.getDeposit_amount_dt() !=null) {
			AcDeadStockRegister.setDeposit_amount_dt(tdoiAcDeadStockRegister.getDeposit_amount_dt());
		}
		

		if (tdoiAcDeadStockRegister.getRemaining_qty() !=0) {
			AcDeadStockRegister.setRemaining_qty(tdoiAcDeadStockRegister.getRemaining_qty());
		}
		
		if (tdoiAcDeadStockRegister.getRemaining_equip_amt() !=0) {
			AcDeadStockRegister.setRemaining_equip_amt(tdoiAcDeadStockRegister.getRemaining_equip_amt());
		}
		
		if (tdoiAcDeadStockRegister.getDisposal_status() !=null) {
			AcDeadStockRegister.setDisposal_status(tdoiAcDeadStockRegister.getDisposal_status());
		}
		
		if (tdoiAcDeadStockRegister.getActive_status() !=0) {
			AcDeadStockRegister.setActive_status(tdoiAcDeadStockRegister.getActive_status());
		}
		
		if (tdoiAcDeadStockRegister.getCreated_date() !=null) {
			AcDeadStockRegister.setCreated_date(tdoiAcDeadStockRegister.getCreated_date());
		}
		
		if (tdoiAcDeadStockRegister.getCreated_by() !=0) {
			AcDeadStockRegister.setCreated_by(tdoiAcDeadStockRegister.getCreated_by());
		}
		
		if (tdoiAcDeadStockRegister.getCreated_by_post() !=0) {
			AcDeadStockRegister.setCreated_by_post(tdoiAcDeadStockRegister.getCreated_by_post());
		}
		
		
		if (tdoiAcDeadStockRegister.getUpdated_date() !=null) {
			AcDeadStockRegister.setUpdated_date(tdoiAcDeadStockRegister.getUpdated_date());
		}
		
		if (tdoiAcDeadStockRegister.getUpdated_by() !=00) {
			AcDeadStockRegister.setUpdated_by(tdoiAcDeadStockRegister.getUpdated_by());
		}


		if (tdoiAcDeadStockRegister.getUpdated_by_post() !=0) {
			AcDeadStockRegister.setUpdated_by_post(tdoiAcDeadStockRegister.getUpdated_by_post());
		}

		if (tdoiAcDeadStockRegister.getPurchase_order_dt() !=null) {
			AcDeadStockRegister.setPurchase_order_dt(tdoiAcDeadStockRegister.getPurchase_order_dt());
		}
		
	
		TdoiAcDeadStockRegister tdoiAcDeadStockRegister1 = deadStockRegisterRepository.save(AcDeadStockRegister);

		return tdoiAcDeadStockRegister1;
	
	}


	@Override
	public List<TdoiAcDeadStockRegister> filterAcDeadStockRegister(Map<String, String> acDeadStockRegister) {
		String query = "SELECT * FROM DOI.TDOI_AC_DEAD_STOCK_REGISTER i ";

		for (Map.Entry<String, String> entry : acDeadStockRegister.entrySet()) {
			query += (query.contains("WHERE"))
					? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
					: "WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
		}
		System.out.println(query);

		List<TdoiAcDeadStockRegister> fetchedAcDeadStockRegister = new ArrayList<>();
		try {
			fetchedAcDeadStockRegister = jdbcTemplate.query(query, (rs, rowNum) -> new TdoiAcDeadStockRegister(
					rs.getLong("DEAD_STK_REG_ID"),rs.getString("REFERENCE_NO"),rs.getTimestamp("REFERENCE_DT").toLocalDateTime(),rs.getLong("EQUIP_TYPE_ID"),
					rs.getString("EQUIPMENT_NAME"),rs.getString("PURCHASE_ORDER_NO"),
					rs.getInt("QUANTITY"),rs.getDouble("PURCHASE_AMOUNT"),rs.getString("PURCH_RECEIVR_NAME"),
					rs.getString("SERIAL_NO"),rs.getString("REMARKS"),
					rs.getLong("DISPOSAL_TYPE_ID"),
					rs.getString("DISPOSAL_TYPE"),rs.getString("ORDER_VOUCHER_NO"),
					rs.getDate("ORDER_VOUCHER_DT").toLocalDate(),rs.getInt("FINAL_DISP_QTY"),
					rs.getString("DISP_RECEIVR_NAME"),rs.getDouble("DISP_RECV_AMT"),
					rs.getDate("DISP_RECV_DT").toLocalDate(),rs.getDouble("GOVT_DEPOSIT_AMT"),
					rs.getDate("DEPOSIT_AMOUNT_DT").toLocalDate(),rs.getInt("REMAINING_QTY"),rs.getDouble("REMAINING_EQUIP_AMT"),rs.getString("DISPOSAL_STATUS"),rs.getShort("ACTIVE_STATUS"),
					rs.getTimestamp("CREATED_DATE").toLocalDateTime(),rs.getLong("CREATED_BY"),rs.getLong("CREATED_BY_POST"),rs.getTimestamp("UPDATED_DATE").toLocalDateTime(),
					rs.getLong("UPDATED_BY"),rs.getLong("UPDATED_BY_POST"),rs.getDate("PURCHASE_ORDER_DT").toLocalDate()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//deadStockRegisterRepository.findAll().forEach(fetchedAcDeadStockRegister::add);

	return fetchedAcDeadStockRegister;
	}










	
	
	
		
	
	
		
		
		
		
		
		
	}

