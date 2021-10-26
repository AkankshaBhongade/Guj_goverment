package com.gov.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.gov.demo.lookup.MsBankEntity;

public interface BankRepository extends CrudRepository<MsBankEntity , Long>{

}
