package com.AccountAdminMdule.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AccountAdminMdule.entity.TdoiAcCashbookPayment;


@Repository
public interface AcCashbookPaymentRepository extends CrudRepository<TdoiAcCashbookPayment, Long> {

}
