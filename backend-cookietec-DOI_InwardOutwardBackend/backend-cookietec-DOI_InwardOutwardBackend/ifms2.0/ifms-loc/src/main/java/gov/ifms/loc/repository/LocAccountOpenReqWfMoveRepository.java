package gov.ifms.loc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gov.ifms.loc.entity.LocAccountOpenReqWfMoveEntity;


/**
 * The Class BudgetSubHeadWrkflwController.
 * 
 * @version 1.0
 * @created 2020/09/09 09:21:24
 */
@Repository
@Transactional
public interface LocAccountOpenReqWfMoveRepository
		extends JpaRepository<LocAccountOpenReqWfMoveEntity, Long>, JpaSpecificationExecutor<LocAccountOpenReqWfMoveEntity> {

}
