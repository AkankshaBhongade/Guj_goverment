package com.AccountAdminMdule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AccountAdminMdule.entity.DOIBankEntity;

//import gov.ifms.doi.acadmin.entity.DOIBankEntity;

public interface DOIBankRepository extends JpaRepository<DOIBankEntity, Long>{

}
