package gov.ifms.doi.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gov.ifms.common.base.BaseConverter;
import gov.ifms.doi.dto.DOIInwardListingDto;
import gov.ifms.doi.dto.DOIOutwardEntryDto;
import gov.ifms.doi.dto.DOIOutwardListingDto;
import gov.ifms.doi.entity.DOIInwardEntryEntity;
import gov.ifms.doi.entity.DOIOutwardEntryEntity;

@Component
public class DOIOutwardListingConverter implements BaseConverter<DOIOutwardEntryEntity, DOIOutwardListingDto> {

	private ModelMapper mapper;

	@Autowired
	public DOIOutwardListingConverter(ModelMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public DOIOutwardEntryEntity toEntity(DOIOutwardListingDto outwardListingDto) {
		DOIOutwardEntryEntity outwardEntry = mapper.map(outwardListingDto, DOIOutwardEntryEntity.class);
		return outwardEntry;
	}

	@Override
	public DOIOutwardListingDto toDTO(DOIOutwardEntryEntity outwardEntryEntity) {
		DOIOutwardListingDto outwardListingDto = mapper.map(outwardEntryEntity, DOIOutwardListingDto.class);
		return outwardListingDto;
	}

}
