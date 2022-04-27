package gov.ifms.doi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gov.ifms.common.constant.MsgConstant;
import gov.ifms.common.constant.URLConstant;
import gov.ifms.common.dto.ApiResponse;
import gov.ifms.common.logging.annotation.Trace;
import gov.ifms.common.util.ResponseUtil;
import gov.ifms.doi.dto.DOIOutwardEntryDto;
import gov.ifms.doi.dto.DOIOutwardListingDto;
import gov.ifms.doi.dto.DOIOutwardUpdateEntryDto;
import gov.ifms.doi.entity.DOIOutwardEntryEntity;
import gov.ifms.doi.service.DOIOutwardServiceImpl;

/**
 * The Class DOIOutwardController.
 */
@RestController
@RequestMapping(URLConstant.URL_DOI_OUTWARD)
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DOIOutwardController {

	/**
	 * The service.
	 */
	@Autowired
	DOIOutwardServiceImpl outwardService;

	/**
	 * Saves outward entries as a single or bulk operation
	 * 
	 * @param List<DOIOutwardEntryDto> a list of outward entries
	 * @return dto
	 */
	@Trace
	@PostMapping(URLConstant.URL_POST)
	public ResponseEntity<ApiResponse> saveBulkOutwardEntries(@RequestBody List<DOIOutwardEntryDto> outwardEntryDTO) {
		List<DOIOutwardEntryEntity> outwardEntry = this.outwardService.addOutwardEntry(outwardEntryDTO);
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DOI_MSG_CREATE, outwardEntry);
	}

	/**
	 * Gets maximum outward entries to be shown on page initialization
	 * 
	 * @param N/A
	 * @return dto
	 */
	@Trace
	@PostMapping(URLConstant.URL_DOI_MAX_INWARD_OUTWARD_NO)
	public ResponseEntity<ApiResponse> getMaxOutwardEntryNumber() {
		List<String> maxOutwardNo = this.outwardService.getLatestOutwardNumber();
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DOI_MSG_FETCH_MAX_INWARD_OUTWARD_NO, maxOutwardNo);
	}

	/**
	 * Gets data based on the dynamic filter algorithm for the listing page
	 * 
	 * @param Map<String, String>, key value pairs representing the input data
	 * @return dto
	 */
	@Trace
	@PostMapping(URLConstant.URL_DOI_LISTING_FILTER)
	public ResponseEntity<ApiResponse> outwardListingFilter(@RequestBody Map<String, String> outwardEntry) {
		List<DOIOutwardListingDto> outwardListingResponseList = this.outwardService.getOutwardEntryByFieldName(outwardEntry);
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DOI_LISTING_FILTER, outwardListingResponseList);
	}

	/**
	 * Gets a single outward entry based on an Id
	 * 
	 * @param a long value representing the id to be fetched by
	 * @return dto
	 */
	@Trace
	@PostMapping(URLConstant.URL_GET_BY_ID)
	public ResponseEntity<ApiResponse> getOutwardEntryById(@RequestBody Long id) {
		DOIOutwardEntryEntity getByIdResponse = this.outwardService.getOutwardEntryById(id);
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DOI_MSG_FETCH, getByIdResponse);
	}

	/**
	 * Updates outward entries
	 * 
	 * @param a DTO of outward entry
	 * @return dto
	 */
	@PostMapping(URLConstant.URL_PUT_BY_ID)
	public ResponseEntity<ApiResponse> updateOutwardEntry(@RequestBody DOIOutwardUpdateEntryDto outwardUpdateEntryDTO) {
		DOIOutwardEntryEntity updateResponse = this.outwardService.updateOutwardEntry(outwardUpdateEntryDTO);
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DOI_MSG_UPDATE, updateResponse);
	}

	/**
	 * Deletes a particular outward entry
	 * 
	 * @param a long value representing the id to be deleted by
	 * @return dto
	 */
	@Trace
	@PostMapping(URLConstant.URL_DELETE_BY_ID)
	public ResponseEntity<ApiResponse> deleteOutwardEntryById(@RequestBody Long id) {
		this.outwardService.deleteOutwardEntry(id);
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DOI_MSG_DELETE, "Data deleted for the id: " + id);
	}
}
