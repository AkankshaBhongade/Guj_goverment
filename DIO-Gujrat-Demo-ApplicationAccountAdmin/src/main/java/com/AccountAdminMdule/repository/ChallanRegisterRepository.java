package com.AccountAdminMdule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AccountAdminMdule.entity.TdoiAcChallanRegister;

@Repository
public interface ChallanRegisterRepository extends JpaRepository<TdoiAcChallanRegister, Long> {

}