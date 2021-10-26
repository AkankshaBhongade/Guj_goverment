package com.AccountAdminMdule.service;

import java.util.List;
import java.util.Map;

import com.AccountAdminMdule.entity.TdoiAcExpenditureRep;

public interface ExpenditureRepService {

	List<TdoiAcExpenditureRep> getAll();

	TdoiAcExpenditureRep getExpenditureRepById(Long id);

	List<TdoiAcExpenditureRep> addExpenditureRep(List<TdoiAcExpenditureRep> tdoiAcExpenditureRep);

	void deleteTdoiAcExpenditureRep(Long id);

	TdoiAcExpenditureRep updateTdoiAcExpenditureRep(TdoiAcExpenditureRep tdoiAcExpenditureRep);

	List<TdoiAcExpenditureRep> filterAcExpenditureRep(Map<String, String> acExpenditureRep);

}
