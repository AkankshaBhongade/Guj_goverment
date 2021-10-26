package com.AccountAdminMdule.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AccountAdminMdule.entity.TdoiAcCashbookReceipt;

//import com.accountadminmodule.entity.TdoiAcCashbookReceipt;

@Repository
public interface AcCashbookReceiptRepository extends CrudRepository<TdoiAcCashbookReceipt, Long> {

}
