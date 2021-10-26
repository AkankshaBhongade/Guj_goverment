package com.AccountAdminMdule.service;

import java.util.List;
import java.util.Map;

import com.AccountAdminMdule.entity.TdoiAcChequeRegister;

public interface ChequeRegisterService {

	List<TdoiAcChequeRegister> getAll();

	TdoiAcChequeRegister getChequeRegisterById(Long id);

	List<TdoiAcChequeRegister> addChequeRegister(List<TdoiAcChequeRegister> tdoiAcChequeRegister);

	void deleteTdoiAcChequeRegister(Long id);

	TdoiAcChequeRegister updateTdoiAcChequeRegister(TdoiAcChequeRegister tdoiAcChequeRegister);

	List<TdoiAcChequeRegister> filterAcChequeRegister(Map<String, String> acChequeRegister);

}
