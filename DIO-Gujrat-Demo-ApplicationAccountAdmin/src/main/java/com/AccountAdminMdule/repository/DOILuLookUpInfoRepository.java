package com.AccountAdminMdule.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.AccountAdminMdule.entity.DOILuLookUpInfoEntity;

//import com.AccountAdminMdule.entity.DOILuLookUpInfoEntity;

//import gov.ifms.doi.acadmin.entity.DOILuLookUpInfoEntity;

//import gov.ifms.doi.acadmin.entity.DOILuLookUpInfoEntity;

//import gov.ifms.doi.entity.DOILuLookUpInfoEntity;

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
	@Query("select entity.lookUpInfoId from DOILuLookUpInfoEntity entity where parentLookupId in (select lookUpId from DOILuLookUpEntity where lookUpName = 'Majorhead Type') and entity.lookUpInfoName=:majorhead")
	Long getByParentLookUpNameForMajorheadId(@Param("majorhead") String majorhead);
	
	@Transactional
	@Query("select entity.lookUpInfoId from DOILuLookUpInfoEntity entity where parentLookupId in (select lookUpId from DOILuLookUpEntity where lookUpName = 'Minorhead Type') and entity.lookUpInfoName=:minorhead")
	Long getByParentLookUpNameForMinorheadId(@Param("minorhead") String minorhead);
	
	@Transactional
	@Query("select entity.lookUpInfoId from DOILuLookUpInfoEntity entity where parentLookupId in (select lookUpId from DOILuLookUpEntity where lookUpName = 'Submajorhead Type') and entity.lookUpInfoName=:submajorhead")
	Long getByParentLookUpNameForSubmajorheadfId(@Param("submajorhead") String submajorhead);
	
	@Transactional
	@Query("select entity.lookUpInfoId from DOILuLookUpInfoEntity entity where parentLookupId in (select lookUpId from DOILuLookUpEntity where lookUpName = 'Subhead Type') and entity.lookUpInfoName=:subhead")
	Long getByParentLookUpNameForSubheadId(@Param("subhead") String subhead);
	
	@Transactional
	@Query("select entity.lookUpInfoId from DOILuLookUpInfoEntity entity where parentLookupId in (select lookUpId from DOILuLookUpEntity where lookUpName = 'DOI_Bank_Name') and entity.lookUpInfoName=:bankname")
	Long getByParentLookUpNameForBankId(@Param("bankname") String bankname);
	
	@Transactional
	@Query("select entity.lookUpInfoId from DOILuLookUpInfoEntity entity where parentLookupId in (select lookUpId from DOILuLookUpEntity where lookUpName = 'DetailHead') and entity.lookUpInfoName=:detailhead")
	Long getByParentLookUpNameForDetailheadId(@Param("detailhead") String detailhead);
	
	@Transactional
	@Query("select entity.lookUpInfoId from DOILuLookUpInfoEntity entity where parentLookupId in (select lookUpId from DOILuLookUpEntity where lookUpName = 'Type') and entity.lookUpInfoName=:type")
	Long getByParentLookUpNameForTypeId(@Param("type") String type);
}
