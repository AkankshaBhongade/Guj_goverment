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

import com.fasterxml.jackson.core.JsonProcessingException;

import gov.ifms.common.constant.MsgConstant;
import gov.ifms.common.constant.URLConstant;
import gov.ifms.common.dto.ApiResponse;
import gov.ifms.common.exception.CustomException;
import gov.ifms.common.logging.annotation.Trace;
import gov.ifms.common.util.ResponseUtil;
import gov.ifms.doi.dto.DOIInwardEntryDto;
import gov.ifms.doi.dto.DOIInwardListingDto;
import gov.ifms.doi.dto.DOIInwardUpdateEntryDto;
import gov.ifms.doi.entity.DOIInwardEntryEntity;
import gov.ifms.doi.service.DOIBankServiceImpl;
import gov.ifms.doi.service.DOIInwardServiceImpl;

/**
 * The Class DOIInwardController.
 */
@RestController
@RequestMapping(URLConstant.URL_DOI_INWARD)
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DOIInwardController {

	/**
	 * The service.
	 */
	@Autowired
	DOIInwardServiceImpl inwardService;

	/**
	 * The service.
	 */
	@Autowired
	DOIBankServiceImpl bankservice;

	/**
	 * Saves inward entries as a single or bulk operation
	 * 
	 * @param List<DOIInwardEntryDto> a list of inward entries
	 * @return dto
	 */
	@Trace
	@PostMapping(URLConstant.URL_POST)
	public ResponseEntity<ApiResponse> saveBulkInwardEntries(@RequestBody List<DOIInwardEntryDto> inwardEntryDTO) {
		List<DOIInwardEntryEntity> inwardEntry = this.inwardService.addInwardEntry(inwardEntryDTO);
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DOI_MSG_CREATE, inwardEntry);
	}

	/**
	 * Gets all inward entries
	 * 
	 * @param List<DOIInwardListingDto> a list of inward entries
	 * @return dto
	 */
	@Trace
	@PostMapping(URLConstant.URL_GET_ALL)
	public ResponseEntity<ApiResponse> getAllInwardEntries() {
		List<DOIInwardListingDto> inwardEntry = this.inwardService.getAll();
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DOI_MSG_CREATE, inwardEntry);
	}

	/**
	 * Gets maximum inward entries to be shown on page initialization
	 * 
	 * @param N/A
	 * @return dto
	 */
	@Trace
	@PostMapping(URLConstant.URL_DOI_MAX_INWARD_OUTWARD_NO)
	public ResponseEntity<ApiResponse> getMaxInwardEntryNumber() {
		List<String> maxInwardNo = this.inwardService.getLatestInwardNumber();
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DOI_MSG_FETCH_MAX_INWARD_OUTWARD_NO, maxInwardNo);
	}

	/**
	 * Gets bank branches to be shown on page initialization for cheque module
	 * 
	 * @param N/A
	 * @return dto
	 */
	@Trace
	@PostMapping(URLConstant.URL_DOI_BANK_BRANCHES)
	public ResponseEntity<ApiResponse> getInwardBankBranches() {
		List bankBranchNamesByBank = this.bankservice.getBankBranchNamesByBank();
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DOI_MSG_FETCH_BANK_BRANCHES, bankBranchNamesByBank);
	}

	/**
	 * Gets data based on the dynamic filter algorithm for the listing page
	 * 
	 * @param Map<String, String>, key value pairs representing the input data
	 * @return dto
	 */
	@Trace
	@PostMapping(URLConstant.URL_DOI_LISTING_FILTER)
	public ResponseEntity<ApiResponse> inwardListingFilter(@RequestBody Map<String, String> inwardEntry) {
		List<DOIInwardListingDto> inwardListingResponseList = this.inwardService.getInwardEntryByFieldName(inwardEntry);
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DOI_LISTING_FILTER, inwardListingResponseList);
	}

	/**
	 * Gets a single inward entry based on an Id
	 * 
	 * @param a long value representing the id to be fetched by
	 * @return dto
	 */
	@Trace
	@PostMapping(URLConstant.URL_GET_BY_ID)
	public ResponseEntity<ApiResponse> getInwardEntryById(@RequestBody Long id) {
		DOIInwardEntryEntity getByIdResponse = this.inwardService.getInwardEntryById(id);
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DOI_MSG_FETCH, getByIdResponse);
	}

	/**
	 * Updates inward entries
	 * 
	 * @param a DTO of inward entry
	 * @return dto
	 */
	@Trace
	@PostMapping(URLConstant.URL_PUT_BY_ID)
	public ResponseEntity<ApiResponse> updateInwardEntry(@RequestBody DOIInwardUpdateEntryDto inwardUpdateEntryDTO) {
		DOIInwardEntryEntity updateResponse = this.inwardService.updateInwardEntry(inwardUpdateEntryDTO);
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DOI_MSG_UPDATE, updateResponse);
	}

	/**
	 * Deletes a particular inward entry
	 * 
	 * @param a long value representing the id to be deleted by
	 * @return dto
	 */
	@Trace
	@PostMapping(URLConstant.URL_DELETE_BY_ID)
	public ResponseEntity<ApiResponse> deleteInwardEntryById(@RequestBody Long id) throws JsonProcessingException {
		this.inwardService.deleteInwardEntry(id);
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DOI_MSG_DELETE, "Data deleted for the id: " + id);
	}
}
