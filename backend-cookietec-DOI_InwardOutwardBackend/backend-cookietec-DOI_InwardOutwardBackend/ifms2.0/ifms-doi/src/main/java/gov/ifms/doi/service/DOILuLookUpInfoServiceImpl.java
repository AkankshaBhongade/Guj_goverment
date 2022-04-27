package gov.ifms.doi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.ifms.doi.converter.DOILookupInfoConverter;
import gov.ifms.doi.dto.DOILookUpInfoDto;
import gov.ifms.doi.entity.DOILuLookUpEntity;
import gov.ifms.doi.entity.DOILuLookUpInfoEntity;
import gov.ifms.doi.repository.DOILuLookUpInfoRepository;

/**
 * The Class DOILuLookUpServiceImpl.
 */
@Service
public class DOILuLookUpInfoServiceImpl implements DOILuLookUpInfoService {

	@Autowired
	private DOILuLookUpInfoRepository repository;

	@Autowired
	private DOILookupInfoConverter lookupInfoConverter;

	@Override
	public List<DOILookUpInfoDto> getByParentLookUpName(String lookupName) {
		List<DOILookUpInfoDto> dto = new ArrayList<>();
		List<DOILuLookUpInfoEntity> lookupinfo = this.repository.getByParentLookUpName(lookupName);
		System.out.println(lookupinfo);
		lookupinfo.forEach(v -> dto.add(this.lookupInfoConverter.toDTO(v)));
		return dto;
	}
}
