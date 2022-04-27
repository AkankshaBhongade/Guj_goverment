package gov.ifms.doi.service;

import java.util.List;
import java.util.Map;

import gov.ifms.doi.dto.DOIInwardEntryDto;
import gov.ifms.doi.dto.DOIInwardListingDto;
import gov.ifms.doi.dto.DOIInwardUpdateEntryDto;
import gov.ifms.doi.entity.DOIInwardEntryEntity;

public interface DOIInwardService {
	DOIInwardEntryEntity getInwardEntryById(long id);

	List<DOIInwardListingDto> getAll();

	List<String> getLatestInwardNumber();

	List<DOIInwardListingDto> getInwardEntryByFieldName(Map<String, String> inwardEntry);

	List<DOIInwardEntryEntity> addInwardEntry(List<DOIInwardEntryDto> inwardEntryDtoList);

	DOIInwardEntryEntity updateInwardEntry(DOIInwardUpdateEntryDto inwardUpdateEntryDTO);

	void deleteInwardEntry(long id);

}
