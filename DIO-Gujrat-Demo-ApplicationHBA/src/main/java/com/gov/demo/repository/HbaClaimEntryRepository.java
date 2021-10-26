package com.gov.demo.repository;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gov.demo.entity.Tdoi_hba_Claim_Entry;

@Repository
public interface HbaClaimEntryRepository extends CrudRepository<Tdoi_hba_Claim_Entry, Long> {

//	
//	@Query(value="SELECT * FROM  Tdoi_hba_Claim_Entry i WHERE i.HBA_PROPOSAL_ID IN (SELECT t.HBA_PROPOSAL_ID FROM TDOI_HBA_PROPOSAL t WHERE t.DISTRICT_ID = 9); =?1 ", nativeQuery = true)
//	List<Tdoi_hba_Claim_Entry> getBydistictid(long DISTRICT_ID);

	@Query(value = "SELECT * FROM  Tdoi_hba_Claim_Entry i RIGHT JOIN TDOI_HBA_PROPOSAL j ON i.HBA_PROPOSAL_ID = j.HBA_PROPOSAL_ID WHERE j.DISTRICT_ID = :districtid", nativeQuery = true)
	Collection<Object> getBydistictid(@Param("districtid") long DISTRICT_ID);

//Map<String, String> getByHbaMcaAccNum(@Param("accNumber") String HBA_MCA_ACC_NUM);
}
