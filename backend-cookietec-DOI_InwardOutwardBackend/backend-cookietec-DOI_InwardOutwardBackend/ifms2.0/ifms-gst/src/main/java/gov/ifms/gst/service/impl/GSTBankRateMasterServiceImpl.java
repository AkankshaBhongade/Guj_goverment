package gov.ifms.gst.service.impl;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import gov.ifms.common.base.PagebleDTO;
import gov.ifms.common.exception.CustomException;
import gov.ifms.common.pagination.PageDetails;
import gov.ifms.common.pagination.SearchCriteria;
import gov.ifms.common.pagination.SpecificationImpl;
import gov.ifms.common.util.Constant;
import gov.ifms.common.util.ErrorResponse;
import gov.ifms.common.util.Utils;
import gov.ifms.gst.converter.GSTBankRateMasterConverter;
import gov.ifms.gst.dto.GSTBankRateMasterDto;
import gov.ifms.gst.entity.GSTBankRateMaster;
import gov.ifms.gst.pagination.GstSearchCriteria;
import gov.ifms.gst.repository.GSTBankRateMasterRepository;
import gov.ifms.gst.service.GSTBankRateMasterService;
import gov.ifms.gst.util.GSTConstant;

@Service
public class GSTBankRateMasterServiceImpl implements GSTBankRateMasterService{
	
	@Autowired
	private GSTBankRateMasterConverter bankRateMasterConverter;
	
	@Autowired
	private GSTBankRateMasterRepository bankRateMasterRepository;

	/**
	 * Fetch Bank Rate GST Master by given  id
	 * 
	 * @param id
	 * @return dto
	 */
	@Override
	public GSTBankRateMasterDto getBankRateMaster(Long id) {
		return  bankRateMasterConverter.toDTO(bankRateMasterRepository.getOne(id));
	}

	/**
	 * creates a new Bank Rate GST Master
	 * 
	 * @param dto
	 * @return newly created entity in dto type
	 */
	@Override
	public GSTBankRateMasterDto createBankRateMaster(GSTBankRateMasterDto dto) {
		
		dto.setPanaltyRate(dto.getBankRate()+dto.getAdditionalRate());
		try {
			dto.setReferenceNumber(getTransactionNumber());
		} catch (CustomException e) {
			e.printStackTrace();
		}
		dto.setReferenceDate(LocalDate.now());
		GSTBankRateMaster bankRateMaster = bankRateMasterRepository.findTopByOrderByIdDesc();
		
		if(bankRateMaster!=null) {
			bankRateMaster.setEffectiveToDate(dto.getEffectiveFromDate().minusDays(1));
			bankRateMasterRepository.save(bankRateMaster);
		}
		
		return bankRateMasterConverter.toDTO(bankRateMasterRepository.save(bankRateMasterConverter.toEntity(dto)));
		
	}

	/**
	 * Update the new Bank Rate GST Master
	 * 
	 * @param dto
	 * @return the updated entity in dto type
	 */
	@Override
	public GSTBankRateMasterDto updateBankRateMaster(GSTBankRateMasterDto dto) {
		
		dto.setPanaltyRate(dto.getBankRate()+dto.getAdditionalRate());
		
		return bankRateMasterConverter.toDTO(bankRateMasterRepository.save(bankRateMasterConverter.toEntity(dto)));
	}

	/**
	 * Gets the Bank Rate GST Master.
	 *
	 * @param pageDetail the page detail
	 * @return the Bank Rate GST Masters
	 * @throws CustomException the custom exception
	 */
	@Override
	public PagebleDTO<GSTBankRateMasterDto> getBankRateMasters(PageDetails pageDetail) throws CustomException {
		
		try {
			PageRequest pageable = null;
			GstSearchCriteria searchCriteria = new GstSearchCriteria();
			SpecificationImpl<GSTBankRateMaster> spec = new SpecificationImpl<>();
			pageable = pageDetail.getPageDetails(pageDetail);
			Specification<GSTBankRateMaster> dataSpec = searchCriteria.getGstSpecificationDetail(spec,
					pageDetail.getJsonArr());
			Page<GSTBankRateMaster> page = bankRateMasterRepository.findAll(dataSpec, pageable);
			return new PagebleDTO<>(page.getSize(), page.getTotalPages(), page.getTotalElements(),
					bankRateMasterConverter.toDTO(page.getContent()));
		} catch (Exception ex) {
			throw new CustomException(ErrorResponse.ERROR_WHILE_FATCHING);
		}
		
		
		
	}
	
	/**
	 * Gets the transaction(Reference) number.
	 *
	 * @return the transaction number
	 * @throws CustomException the custom exception
	 */
	private String getTransactionNumber() throws CustomException {
		Map<String, Object> map = new LinkedHashMap<>();
		map.put(Constant.TRN_SCREEN, GSTBankRateMaster.TRN_SCREEN_BMS);
		String procName = GSTConstant.GST_SCHEMA.concat(Constant.DOT.concat(GSTConstant.P_GST_TRN_NO_GEN));
		List<Object[]> nextSequenceNumber = bankRateMasterRepository.callStoredProcedure(procName, map);
		if (!Utils.isEmpty(nextSequenceNumber)) {
			return (String) nextSequenceNumber.get(0)[0];
		} else {
			throw new CustomException(ErrorResponse.REF_GENERATION_FAILED);
		}
	}

}
