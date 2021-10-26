package com.AccountAdminMdule.service;

import java.util.List;
import java.util.Map;

import com.AccountAdminMdule.entity.TdoiAcCashbookReceipt;

//import javax.validation.Valid;

//import com.accountadminmodule.entity.TdoiAcCashbookReceipt;

public interface AcCashbookReceiptService {

	List<TdoiAcCashbookReceipt> getAll();

	TdoiAcCashbookReceipt getCashbookReceiptbyId(Long id);

	List<TdoiAcCashbookReceipt> addAcStampRegister(List<TdoiAcCashbookReceipt> tdoiAcCashbookReceipt);

	TdoiAcCashbookReceipt deleteCashbookReceiptById(Long id);

	TdoiAcCashbookReceipt updateTdoiAcCashbookReceipt(TdoiAcCashbookReceipt tdoiAcCashbookReceipt);

	List<TdoiAcCashbookReceipt> filterAcCashbookReceipt(Map<String, String> acCashbookReceipt);

	TdoiAcCashbookReceipt updateAcCashbookReceipt(TdoiAcCashbookReceipt tdoiAcCashbookReceipt);

	//TdoiAcCashbookReceipt updateAcCashbookReceipt(TdoiAcCashbookReceipt tdoiAcCashbookReceipt);

}
