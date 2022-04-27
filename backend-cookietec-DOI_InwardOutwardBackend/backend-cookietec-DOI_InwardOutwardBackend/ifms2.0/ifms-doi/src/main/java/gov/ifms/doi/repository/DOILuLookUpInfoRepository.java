package gov.ifms.doi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gov.ifms.doi.entity.DOILuLookUpInfoEntity;

/**
 * The Interface DOILuLookUpRepository.
 */
@Repository
@Transactional
public interface DOILuLookUpInfoRepository extends JpaRepository<DOILuLookUpInfoEntity, Long> {

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("select entity from DOILuLookUpInfoEntity entity where parentLookupId in (select lookUpId from DOILuLookUpEntity where lookUpName = :lookupName) order by orderId")
	List<DOILuLookUpInfoEntity> getByParentLookUpName(@Param("lookupName") String lookupName);

	@Transactional
	@Query("select entity.lookUpInfoId from DOILuLookUpInfoEntity entity where parentLookupId in (select lookUpId from DOILuLookUpEntity where lookUpName = 'DOI_Branch_Name') and entity.lookUpInfoName=:branchName")
	Long getByParentLookUpNameForBranchId(@Param("branchName") String branchName);

	@Transactional
	@Query("select entity.lookUpInfoId from DOILuLookUpInfoEntity entity where parentLookupId in (select lookUpId from DOILuLookUpEntity where lookUpName = 'DOI_Outward_Mode') and entity.lookUpInfoName=:outwardMode")
	Long getByParentLookUpNameForOutwradModeId(@Param("outwardMode") String outwradMode);

	@Transactional
	@Query("select entity.lookUpInfoName from DOILuLookUpInfoEntity entity where lookUpInfoId = :lookUpInfoId")
	String getLookUpInfoNameByLookUpInfoId(@Param("lookUpInfoId") Long lookUpInfoId);
}
