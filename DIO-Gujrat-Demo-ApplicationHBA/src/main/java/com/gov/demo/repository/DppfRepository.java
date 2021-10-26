//package com.gov.demo.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//
//import com.gov.demo.entity.DppfNo;
//
//public interface DppfRepository extends CrudRepository<DppfRepository, Long> {
//	@Query(value="SELECT tagd.HBA_MCA_ACC_NUM ,tagd.EMPLOYEE_NUM ,tagd.FIRST_NAME ,tagd.MIDDLE_NAME ,tagd.LAST_NAME, loan.LOAN_AMT,OFC.OFFICE_ADD, \r\n"
//			+ " OFC.OFFICE_NAME , OFC.DISTRICT_ID,  OFC.DESIGANATION_ID FROM DPFF.THBA_ACC_GEN_DTL tagd\r\n"
//			+ "   LEFT JOIN DPFF.THBA_ADG_OFF_DTL OFC ON OFC.THBA_ACC_GEN_DTL_ID =TAGD.THBA_ACC_GEN_DTL_ID\r\n"
//			+ "   LEFT JOIN DPFF.THBA_ADG_LOAN_DTL loan ON loan.THBA_ACC_GEN_DTL_ID =TAGD.THBA_ACC_GEN_DTL_ID\r\n"
//			+ "   WHERE tagd.HBA_MCA_ACC_NUM ='25100001' =?1 ", nativeQuery = true)
//	List<DppfNo> getByHbaMcaAccNum(String HBA_MCA_ACC_NUM);
//	
//
//}
