package gov.ifms.gst.service;

import gov.ifms.common.base.PagebleDTO;
import gov.ifms.common.exception.CustomException;
import gov.ifms.common.pagination.PageDetails;
import gov.ifms.gst.dto.GSTBankRateMasterDto;

public interface GSTBankRateMasterService {

	/**
	 * Fetch Bank Rate GST Master by given  id
	 * 
	 * @param id
	 * @return dto
	 */
	GSTBankRateMasterDto getBankRateMaster(Long id);


	/**
	 * creates a new Bank Rate GST Master
	 * 
	 * @param dto
	 * @return newly created entity in dto type
	 */
	GSTBankRateMasterDto createBankRateMaster(GSTBankRateMasterDto dto);

	/**
	 * Update the new Bank Rate GST Master
	 * 
	 * @param dto
	 * @return the updated entity in dto type
	 */
	GSTBankRateMasterDto updateBankRateMaster(GSTBankRateMasterDto dto);

	/**
	 * Gets the Bank Rate GST Master.
	 *
	 * @param pageDetail the page detail
	 * @return the Bank Rate GST Masters
	 * @throws CustomException the custom exception
	 */
	PagebleDTO<GSTBankRateMasterDto> getBankRateMasters(PageDetails pageDetail) throws CustomException;

}
