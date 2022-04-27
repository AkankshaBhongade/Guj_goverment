package gov.ifms.doi.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gov.ifms.common.base.BaseConverter;
import gov.ifms.doi.dto.DOIInwardEntryDto;
import gov.ifms.doi.dto.DOIOutwardEntryDto;
import gov.ifms.doi.entity.DOIInwardEntryEntity;
import gov.ifms.doi.entity.DOIOutwardEntryEntity;

@Component
public class DOIOutwardEntryConverter implements BaseConverter<DOIOutwardEntryEntity, DOIOutwardEntryDto> {

	private ModelMapper mapper;

	@Autowired
	public DOIOutwardEntryConverter(ModelMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public DOIOutwardEntryEntity toEntity(DOIOutwardEntryDto outwardEntryDto) {
		DOIOutwardEntryEntity outwardEntry = mapper.map(outwardEntryDto, DOIOutwardEntryEntity.class);
		return outwardEntry;
	}

	@Override
	public DOIOutwardEntryDto toDTO(DOIOutwardEntryEntity outwardEntryEntity) {
		DOIOutwardEntryDto outwardEntryDto = mapper.map(outwardEntryEntity, DOIOutwardEntryDto.class);
		return outwardEntryDto;
	}

}
