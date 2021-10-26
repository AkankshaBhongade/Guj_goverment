package com.AccountAdminMdule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AccountAdminMdule.entity.TdoiAcExpenditureRep;
@Repository
public interface ExpenditureRepRepository extends JpaRepository<TdoiAcExpenditureRep, Long> {


}