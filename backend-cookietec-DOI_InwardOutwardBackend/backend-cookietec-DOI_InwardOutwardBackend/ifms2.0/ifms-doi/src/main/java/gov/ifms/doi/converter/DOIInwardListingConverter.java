package gov.ifms.doi.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gov.ifms.common.base.BaseConverter;
import gov.ifms.doi.dto.DOIInwardEntryDto;
import gov.ifms.doi.dto.DOIInwardListingDto;
import gov.ifms.doi.entity.DOIInwardEntryEntity;

@Component
public class DOIInwardListingConverter implements BaseConverter<DOIInwardEntryEntity, DOIInwardListingDto> {

	private ModelMapper mapper;

	@Autowired
	public DOIInwardListingConverter(ModelMapper mapper) {
		super();
		this.mapper = mapper;
	}

	@Override
	public DOIInwardEntryEntity toEntity(DOIInwardListingDto inwardListingDto) {
		DOIInwardEntryEntity inwardEntry = mapper.map(inwardListingDto, DOIInwardEntryEntity.class);
		return inwardEntry;
	}

	@Override
	public DOIInwardListingDto toDTO(DOIInwardEntryEntity inwardEntryEntity) {
		DOIInwardListingDto inwardListingDto = mapper.map(inwardEntryEntity, DOIInwardListingDto.class);
		return inwardListingDto;
	}

}
