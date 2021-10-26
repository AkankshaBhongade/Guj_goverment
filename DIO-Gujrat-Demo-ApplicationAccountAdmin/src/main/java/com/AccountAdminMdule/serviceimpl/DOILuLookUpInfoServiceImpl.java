package com.AccountAdminMdule.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AccountAdminMdule.dto.DOILookUpInfoDto;
import com.AccountAdminMdule.entity.DOILuLookUpInfoEntity;
import com.AccountAdminMdule.repository.DOILuLookUpInfoRepository;
import com.AccountAdminMdule.service.DOILuLookUpInfoService;
//import com.AccountAdminModule.converter.DOILookupInfoConverter;



/**
 * The Class DOILuLookUpServiceImpl.
 */
@Service
public class DOILuLookUpInfoServiceImpl implements DOILuLookUpInfoService {

	@Autowired
	private DOILuLookUpInfoRepository repository;


	@Override
	public List<DOILuLookUpInfoEntity> getByParentLookUpName(String lookupName) {
		List<DOILuLookUpInfoEntity> entity = new ArrayList<>();
		entity = this.repository.getByParentLookUpName(lookupName);
		System.out.println(entity);
		//lookupinfo.forEach(v -> lookupinfo.add((v)));
		return entity;
	}
}


