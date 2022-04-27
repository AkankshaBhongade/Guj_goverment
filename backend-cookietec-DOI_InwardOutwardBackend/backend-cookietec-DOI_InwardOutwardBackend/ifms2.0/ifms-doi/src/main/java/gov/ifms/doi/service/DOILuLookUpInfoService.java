package gov.ifms.doi.service;

import java.util.List;

import gov.ifms.doi.dto.DOILookUpInfoDto;

/**
 * The Interface EDPLuLookUpService.
 */
public interface DOILuLookUpInfoService {

	List<DOILookUpInfoDto> getByParentLookUpName(String lookupName);

}
