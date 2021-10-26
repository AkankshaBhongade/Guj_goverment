package com.AccountAdminMdule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AccountAdminMdule.entity.TdoiAcChallanDtl;

@Repository
public interface ChallanDtlRepository  extends JpaRepository<TdoiAcChallanDtl, Long> {

}
