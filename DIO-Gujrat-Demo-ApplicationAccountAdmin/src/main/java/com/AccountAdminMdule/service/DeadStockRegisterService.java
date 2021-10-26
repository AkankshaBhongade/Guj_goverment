package com.AccountAdminMdule.service;

import java.util.List;
import java.util.Map;

import com.AccountAdminMdule.dto.AcDeadStockPurchseItems;
import com.AccountAdminMdule.entity.TdoiAcDeadStockRegister;

public interface DeadStockRegisterService {

	List<TdoiAcDeadStockRegister> getAll();

    TdoiAcDeadStockRegister getDeadStockById(Long id);

	//List<TdoiAcDeadStockRegister> addDeadStockRegister(List<TdoiAcDeadStockRegister> tdoiAcDeadStockRegister);

	void deleteTdoiAcDeadStockRegister(Long id);

	TdoiAcDeadStockRegister updateTdoiAcDeadStockRegister(TdoiAcDeadStockRegister tdoiAcDeadStockRegister);

	List<TdoiAcDeadStockRegister> filterAcDeadStockRegister(Map<String, String> acDeadStockRegister);

	List<AcDeadStockPurchseItems> addDeadStockRegister(List<TdoiAcDeadStockRegister> obdeadStockPurchse);

	//List<TdoiAcDeadStockRegister> addDeadStockRegister(List<AcDeadStockPurchseItems> obdeadStockPurchseItemsjt);



}
