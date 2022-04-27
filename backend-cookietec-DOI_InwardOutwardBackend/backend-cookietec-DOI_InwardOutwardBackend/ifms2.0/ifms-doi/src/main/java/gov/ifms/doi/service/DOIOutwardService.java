package gov.ifms.doi.service;

import java.util.List;
import java.util.Map;

import gov.ifms.doi.dto.DOIOutwardEntryDto;
import gov.ifms.doi.dto.DOIOutwardListingDto;
import gov.ifms.doi.dto.DOIOutwardUpdateEntryDto;
import gov.ifms.doi.entity.DOIOutwardEntryEntity;

public interface DOIOutwardService {
	DOIOutwardEntryEntity getOutwardEntryById(long id);

	List<DOIOutwardListingDto> getAll();

	List<String> getLatestOutwardNumber();

	List<DOIOutwardListingDto> getOutwardEntryByFieldName(Map<String, String> outwardEntry);

	List<DOIOutwardEntryEntity> addOutwardEntry(List<DOIOutwardEntryDto> outwardEntryDto);

	DOIOutwardEntryEntity updateOutwardEntry(DOIOutwardUpdateEntryDto outwardUpdateEntryDTO);

	void deleteOutwardEntry(long id);

}
