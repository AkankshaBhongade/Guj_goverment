package com.AccountAdminMdule.service;

import java.util.List;

import com.AccountAdminMdule.dto.DOILookUpInfoDto;
import com.AccountAdminMdule.entity.DOILuLookUpInfoEntity;

//import gov.ifms.doi.acadmin.dto.DOILookUpInfoDto;

//import gov.ifms.doi.dto.DOILookUpInfoDto;

/**
 * The Interface EDPLuLookUpService.
 */
public interface DOILuLookUpInfoService {

	List<DOILuLookUpInfoEntity> getByParentLookUpName(String lookupName);

	}
