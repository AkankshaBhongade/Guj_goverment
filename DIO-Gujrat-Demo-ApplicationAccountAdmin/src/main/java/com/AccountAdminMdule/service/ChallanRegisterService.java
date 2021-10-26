package com.AccountAdminMdule.service;

import java.util.List;
import java.util.Map;

import com.AccountAdminMdule.entity.TdoiAcChallanRegister;

public interface ChallanRegisterService {

	List<TdoiAcChallanRegister> getAll();

	TdoiAcChallanRegister getChallanRegisterById(Long id);

	List<TdoiAcChallanRegister> addChallanRegister(List<TdoiAcChallanRegister> tdoiAcChallanRegister);

	void deleteTdoiAcChallanRegister(Long id);

	TdoiAcChallanRegister updateTdoiAcChallanRegister(TdoiAcChallanRegister tdoiAcChallanRegister);

	List<TdoiAcChallanRegister> filterAcChallanRegister(Map<String, String> acChallanRegister);

}
