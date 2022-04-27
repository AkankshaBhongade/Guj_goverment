package gov.ifms.doi.controller;

import java.util.List;

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
import gov.ifms.doi.constants.DoiConstants;
import gov.ifms.doi.dto.DOILookUpInfoDto;
import gov.ifms.doi.service.DOILuLookUpInfoService;

/**
 * The Class EDPLuLookUpController.
 * 
 * @version 1.0.
 * @created 2019/08/29 18:10:47.
 *
 */

@RestController
@RequestMapping(URLConstant.URL_DOI_LOOKUP)
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DOILuLookUpController {

	/** The service. */
	@Autowired
	private DOILuLookUpInfoService service;

	/**
	 * Fetch LuLookUps by given LuLookUps id
	 * 
	 * @param id
	 * @return dto
	 */
	@Trace
	@PostMapping(DoiConstants.GET_OUTWARD_MODE_LIST)
	public ResponseEntity<ApiResponse> getOuwatrdModeList() {
		List<DOILookUpInfoDto> lookUpInfo = service.getByParentLookUpName(DoiConstants.DOI_OUTWARD_MODE_LIST_NAME);
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.EDP_MSG_FETCH, lookUpInfo);
	}

	@Trace
	@PostMapping(DoiConstants.GET_BRANCH_NAME_LIST)
	public ResponseEntity<ApiResponse> getBranchName() {
		List<DOILookUpInfoDto> lookUpInfo = service.getByParentLookUpName(DoiConstants.DOI_BRANCH_LIST_NAME);
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.EDP_MSG_FETCH, lookUpInfo);
	}
}
