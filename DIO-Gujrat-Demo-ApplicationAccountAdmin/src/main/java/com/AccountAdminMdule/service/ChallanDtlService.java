package com.AccountAdminMdule.service;

import java.util.List;
import java.util.Map;

import com.AccountAdminMdule.entity.TdoiAcChallanDtl;

public interface ChallanDtlService {

	List<TdoiAcChallanDtl> getAll();

	TdoiAcChallanDtl getChallanDtlById(Long id);

	List<TdoiAcChallanDtl> addChallanDtl(List<TdoiAcChallanDtl> tdoiAcChallanDtl);

	void deleteTdoiAcChallanDtl(Long id);

	TdoiAcChallanDtl updateTdoiAcChallanDtl(TdoiAcChallanDtl tdoiAcChallanDtl);

	List<TdoiAcChallanDtl> filterAcChallanDtl(Map<String, String> acChallanDtl);

}
