package com.gov.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.gov.demo.entity.Tdoi_hba_Claim_Entry;
import com.gov.demo.lookup.MsTaluka;

public interface TalukaRepository extends CrudRepository<MsTaluka, Long>{

}
