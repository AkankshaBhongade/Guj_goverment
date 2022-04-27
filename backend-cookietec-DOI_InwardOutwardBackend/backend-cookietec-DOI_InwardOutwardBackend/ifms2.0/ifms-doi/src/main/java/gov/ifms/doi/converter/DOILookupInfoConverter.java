package gov.ifms.doi.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gov.ifms.common.base.BaseConverter;
import gov.ifms.doi.dto.DOILookUpInfoDto;
import gov.ifms.doi.entity.DOILuLookUpInfoEntity;

@Component
public class DOILookupInfoConverter implements BaseConverter<DOILuLookUpInfoEntity, DOILookUpInfoDto> {

	private ModelMapper mapper;

	@Autowired
	public DOILookupInfoConverter(ModelMapper mapper) {
		super();
		this.mapper = mapper;
	}

	@Override
	public DOILuLookUpInfoEntity toEntity(DOILookUpInfoDto inwardListingDto) {
		DOILuLookUpInfoEntity lookupinfoEntry = mapper.map(inwardListingDto, DOILuLookUpInfoEntity.class);
		return lookupinfoEntry;
	}

	@Override
	public DOILookUpInfoDto toDTO(DOILuLookUpInfoEntity inwardEntryEntity) {
		DOILookUpInfoDto lookUpInfoDto = mapper.map(inwardEntryEntity, DOILookUpInfoDto.class);
		return lookUpInfoDto;
	}

}
