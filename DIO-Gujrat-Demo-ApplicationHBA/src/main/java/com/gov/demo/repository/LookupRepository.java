package com.gov.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gov.demo.lookup.MsDistrict;


@Repository
public interface LookupRepository extends CrudRepository<MsDistrict, Long>{
	
//	@Query(value="select * from MsDistrict where HBA_PROPOSAL_ID=?1", nativeQuery = true)
//	List<MsDistrict> getDistrictNames(String DISTRICT_NAME);

}
