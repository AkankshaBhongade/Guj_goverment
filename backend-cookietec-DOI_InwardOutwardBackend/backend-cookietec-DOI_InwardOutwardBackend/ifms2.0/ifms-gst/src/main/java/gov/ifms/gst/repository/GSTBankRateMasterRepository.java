/**
 * 
 */
package gov.ifms.gst.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import gov.ifms.common.dao.GenericDao;
import gov.ifms.gst.entity.GSTBankRateMaster;

@Transactional
@Repository
public interface GSTBankRateMasterRepository extends JpaRepository<GSTBankRateMaster,Long> , 
JpaSpecificationExecutor<GSTBankRateMaster>,GenericDao {
	
	GSTBankRateMaster findTopByOrderByIdDesc();
	
}

