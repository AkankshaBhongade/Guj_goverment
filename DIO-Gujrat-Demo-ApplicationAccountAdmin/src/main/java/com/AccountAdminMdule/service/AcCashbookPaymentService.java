package com.AccountAdminMdule.service;

import java.util.List;
import java.util.Map;

import com.AccountAdminMdule.entity.TdoiAcCashbookPayment;

//import javax.validation.Valid;


public interface AcCashbookPaymentService {

	List<TdoiAcCashbookPayment> getAll();

	TdoiAcCashbookPayment getCashbookPaymentbyId(Long id);


	TdoiAcCashbookPayment deleteAcCashbookPaymentById(Long id);

	List<TdoiAcCashbookPayment> addAcCashbookPayment(List<TdoiAcCashbookPayment> tdoiAcCashbookPayment);

	TdoiAcCashbookPayment updateTdoiAcCashbookPayment(TdoiAcCashbookPayment tdoiAcCashbookPayment);

	//TdoiAcCashbookPayment updateAcCashbookPayment(TdoiAcCashbookPayment tdoiAcCashbookPayment);
	
	List<TdoiAcCashbookPayment> filterAcCashbookPayment(Map<String, String> acCashbookPayment);

	//TdoiAcCashbookPayment updateAcCashbookPayment(TdoiAcCashbookPayment tdoiAcCashbookPayment);


}
