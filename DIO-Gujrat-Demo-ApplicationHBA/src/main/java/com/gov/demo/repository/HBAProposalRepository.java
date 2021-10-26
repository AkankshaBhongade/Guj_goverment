package com.gov.demo.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gov.demo.entity.TdioHBAProposal;

@Repository
public interface HBAProposalRepository extends CrudRepository<TdioHBAProposal, Long> {

//	@Query(value="select * from TdioHBAProposal where HBA_PROPOSAL_ID=?1", nativeQuery = true)
//	List<TdioHBAProposal> findByHBAPROPOSALID(Long HBA_PROPOSAL_ID);

//	@Query(value = "SELECT tagd.HBA_MCA_ACC_NUM ,tagd.EMPLOYEE_NUM ,tagd.FIRST_NAME ,tagd.MIDDLE_NAME ,tagd.LAST_NAME,loan.LOAN_AMT,OFC.OFFICE_ADD FROM DPFF.THBA_ACC_GEN_DTL tagd LEFT JOIN DPFF.THBA_ADG_OFF_DTL OFC ON OFC.THBA_ACC_GEN_DTL_ID =TAGD.THBA_ACC_GEN_DTL_ID LEFT JOIN DPFF.THBA_ADG_LOAN_DTL loan ON loan.THBA_ACC_GEN_DTL_ID =TAGD.THBA_ACC_GEN_DTL_ID WHERE tagd.HBA_MCA_ACC_NUM  = :accNumber", nativeQuery = true)
//	Map<String, String> getByHbaMcaAccNum(@Param("accNumber") String HBA_MCA_ACC_NUM);

	//running
//	@Query(value = "SELECT tagd.HBA_MCA_ACC_NUM ,tagd.EMPLOYEE_NUM ,tagd.FIRST_NAME ,tagd.MIDDLE_NAME ,tagd.LAST_NAME,loan.LOAN_AMT,OFC.OFFICE_ADD FROM DPFF.THBA_ACC_GEN_DTL tagd LEFT JOIN DPFF.THBA_ADG_OFF_DTL OFC ON OFC.THBA_ACC_GEN_DTL_ID =TAGD.THBA_ACC_GEN_DTL_ID LEFT JOIN DPFF.THBA_ADG_LOAN_DTL loan ON loan.THBA_ACC_GEN_DTL_ID =TAGD.THBA_ACC_GEN_DTL_ID WHERE tagd.HBA_MCA_ACC_NUM  = ?1", nativeQuery = true)
//	Map<String, String> getByHbaMcaAccNum( String HBA_MCA_ACC_NUM);
	
	@Query(value = "SELECT tagd.HBA_MCA_ACC_NUM ,tagd.EMPLOYEE_NUM ,tagd.FIRST_NAME ,tagd.MIDDLE_NAME ,tagd.LAST_NAME, loan.LOAN_AMT,OFC.OFFICE_ADD, OFC.OFFICE_NAME , OFC.DISTRICT_ID,  OFC.DESIGANATION_ID FROM DPFF.THBA_ACC_GEN_DTL tagd  LEFT JOIN DPFF.THBA_ADG_OFF_DTL OFC ON OFC.THBA_ACC_GEN_DTL_ID =TAGD.THBA_ACC_GEN_DTL_ID LEFT JOIN DPFF.THBA_ADG_LOAN_DTL loan ON loan.THBA_ACC_GEN_DTL_ID =TAGD.THBA_ACC_GEN_DTL_ID WHERE tagd.HBA_MCA_ACC_NUM   = ?1", nativeQuery = true)
	Map<String, String> getByHbaMcaAccNum( String HBA_MCA_ACC_NUM);


}
