package com.AccountAdminMdule.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AccountAdminMdule.entity.TdoiAcStampRegister;

///import com.accountadminmodule.entity.TdoiAcStampRegister;

@Repository
public interface AcStampRegisterRepository extends CrudRepository<TdoiAcStampRegister, Long> {
	
	

}