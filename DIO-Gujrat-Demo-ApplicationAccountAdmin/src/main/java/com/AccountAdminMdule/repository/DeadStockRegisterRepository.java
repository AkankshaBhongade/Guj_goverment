package com.AccountAdminMdule.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AccountAdminMdule.dto.AcDeadStockPurchseItems;
import com.AccountAdminMdule.entity.TdoiAcDeadStockRegister;
@Repository
public interface DeadStockRegisterRepository extends JpaRepository<TdoiAcDeadStockRegister, Long> {


	void save(List<TdoiAcDeadStockRegister> savedDeadStock);




}