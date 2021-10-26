package com.AccountAdminMdule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AccountAdminMdule.entity.TdoiAcChequeRegister;

@Repository
public interface ChequeRegisterRepository  extends JpaRepository<TdoiAcChequeRegister, Long> {


}