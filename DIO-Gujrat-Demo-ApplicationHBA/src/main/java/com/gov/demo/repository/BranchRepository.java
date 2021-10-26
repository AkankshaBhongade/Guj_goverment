package com.gov.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.gov.demo.lookup.BankBranchEntity;


public interface BranchRepository extends CrudRepository<BankBranchEntity, Long>{

}
