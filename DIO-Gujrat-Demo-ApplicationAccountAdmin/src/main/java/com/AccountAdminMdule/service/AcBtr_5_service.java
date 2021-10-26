package com.AccountAdminMdule.service;

import java.util.List;
import java.util.Map;

import com.AccountAdminMdule.entity.TdoiAcBtr_5;

//import com.accountadminmodule.entity.TdoiAcBtr_5;

public interface AcBtr_5_service {

	List<TdoiAcBtr_5> getAll();

	TdoiAcBtr_5 getAcBtr_5byId(Long id);

	List<TdoiAcBtr_5> addAcBtr_5(List<TdoiAcBtr_5> tdoiAcBtr_5);

	TdoiAcBtr_5 deleteAcBtr_5ById(Long id);

	TdoiAcBtr_5 updateTdoiAcBtr_5(TdoiAcBtr_5 tdoiAcBtr_5);

	//List<TdoiAcBtr_5> filterAcBtr_5(List<TdoiAcBtr_5> acBtr_5);

	//TdoiAcBtr_5 updateAcBtr_5(TdoiAcBtr_5 tdoiAcBtr_5);

	List<TdoiAcBtr_5> filterAcBtr_5(Map<String, String> tdoiAcBtr_5);

}
