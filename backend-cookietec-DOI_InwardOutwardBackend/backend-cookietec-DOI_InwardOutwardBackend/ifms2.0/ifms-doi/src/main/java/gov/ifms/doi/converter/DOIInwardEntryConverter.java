package gov.ifms.doi.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gov.ifms.common.base.BaseConverter;
import gov.ifms.doi.dto.DOIInwardEntryDto;
import gov.ifms.doi.entity.DOIInwardEntryEntity;

@Component
public class DOIInwardEntryConverter implements BaseConverter<DOIInwardEntryEntity, DOIInwardEntryDto> {

	private ModelMapper mapper;

	@Autowired
	public DOIInwardEntryConverter(ModelMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public DOIInwardEntryEntity toEntity(DOIInwardEntryDto inwardEntryDto) {
		DOIInwardEntryEntity inwardEntry = mapper.map(inwardEntryDto, DOIInwardEntryEntity.class);
		return inwardEntry;
	}

	@Override
	public DOIInwardEntryDto toDTO(DOIInwardEntryEntity inwardEntryEntity) {
		DOIInwardEntryDto inwardEntryDTO = mapper.map(inwardEntryEntity, DOIInwardEntryDto.class);
		return inwardEntryDTO;
	}

}
