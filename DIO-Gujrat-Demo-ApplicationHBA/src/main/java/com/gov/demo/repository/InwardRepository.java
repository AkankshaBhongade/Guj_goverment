package com.gov.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gov.demo.entity.Tdoi_hba_Claim_Entry;
import com.gov.demo.entity.Tdoi_inward_entry;
//import com.gov.demo.entity.Tdoi_inward_entry;
//import com.gov.demo.model.Tdoi_inward_entry;
import com.gov.demo.entity.Tdoi_surveyor_bill_dtls;

//import gov.ifms.doi.model.Tdoi_inward_entry;

//import gov.ifms.doi.model.Tdoi_inward_entry;

@Repository
public interface InwardRepository extends CrudRepository<Tdoi_inward_entry, Long> {


}
