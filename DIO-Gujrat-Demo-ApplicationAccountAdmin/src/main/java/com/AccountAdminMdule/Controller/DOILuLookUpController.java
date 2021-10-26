package com.AccountAdminMdule.Controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AccountAdminMdule.dto.DOILookUpInfoDto;
import com.AccountAdminMdule.entity.DOILuLookUpInfoEntity;
import com.AccountAdminMdule.entity.JsonObjectFormat;
import com.AccountAdminMdule.entity.TdoiAcBtr_5;
import com.AccountAdminMdule.service.DOILuLookUpInfoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import io.swagger.annotations.ApiResponse;


/**
 * The Class EDPLuLookUpController.
 * 
 * @version 1.0.
 * @created 2019/08/29 18:10:47.
 *
 */

@RestController
@RequestMapping
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DOILuLookUpController {

	/** The service. */
	@Autowired
	DOILuLookUpInfoService service;
     // String StringlookupName;



	
	
	
	   @GetMapping("/getbyfield/branchname")
		public ResponseEntity<String> getBranchName(@RequestParam String lookupName) throws JsonProcessingException {
                //public ResponseEntity<ApiResponse> getBranchName() {
		   List<DOILuLookUpInfoEntity> lookUpInfo = service.getByParentLookUpName(lookupName);
			JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
			jsonobjectFormat.setMessage("got all successfully");
			jsonobjectFormat.setSuccess(true);
			jsonobjectFormat.setData(lookUpInfo);
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			ObjectMapper obj = new ObjectMapper();
			obj.registerModule(new JavaTimeModule());
			obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			obj.setDateFormat(df);
			String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.ok().body(customExceptionStr);

	   }

	   
	 @GetMapping("/getbyfield/majorhead")
		public ResponseEntity<String> getMajorhead(@RequestParam String lookupName) throws JsonProcessingException {
             //public ResponseEntity<ApiResponse> getBranchName() {
		   List<DOILuLookUpInfoEntity> lookUpInfo = service.getByParentLookUpName(lookupName);
			JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
			jsonobjectFormat.setMessage("got all successfully");
			jsonobjectFormat.setSuccess(true);
			jsonobjectFormat.setData(lookUpInfo);
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			ObjectMapper obj = new ObjectMapper();
			obj.registerModule(new JavaTimeModule());
			obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			obj.setDateFormat(df);
			String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.ok().body(customExceptionStr);

	   }
	
	
	 @GetMapping("/getbyfield/minorhead")
		public ResponseEntity<String> getMinorhead(@RequestParam String lookupName) throws JsonProcessingException {
          //public ResponseEntity<ApiResponse> getBranchName() {
		   List<DOILuLookUpInfoEntity> lookUpInfo = service.getByParentLookUpName(lookupName);
			JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
			jsonobjectFormat.setMessage("got all successfully");
			jsonobjectFormat.setSuccess(true);
			jsonobjectFormat.setData(lookUpInfo);
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			ObjectMapper obj = new ObjectMapper();
			obj.registerModule(new JavaTimeModule());
			obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			obj.setDateFormat(df);
			String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.ok().body(customExceptionStr);

	   }
	

	
	@GetMapping("/getbyfield/submajorhead")
	public ResponseEntity<String> getSubMajorheadList(@RequestParam String lookupName) throws JsonProcessingException {
      //public ResponseEntity<ApiResponse> getBranchName() {
	   List<DOILuLookUpInfoEntity> lookUpInfo = service.getByParentLookUpName(lookupName);
		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(lookUpInfo);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper obj = new ObjectMapper();
		obj.registerModule(new JavaTimeModule());
		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		obj.setDateFormat(df);
		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);

   }
	
	
	@GetMapping("/getbyfield/subhead")
	public ResponseEntity<String> getSubhead(@RequestParam String lookupName) throws JsonProcessingException {
		List<DOILuLookUpInfoEntity> lookUpInfo = service.getByParentLookUpName(lookupName);
		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(lookUpInfo);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper obj = new ObjectMapper();
		obj.registerModule(new JavaTimeModule());
		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		obj.setDateFormat(df);
		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);

   }
	
	@GetMapping("/getbyfield/bankname")
	public ResponseEntity<String> getBankName(@RequestParam String lookupName) throws JsonProcessingException {
	   List<DOILuLookUpInfoEntity> lookUpInfo = service.getByParentLookUpName(lookupName);
		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(lookUpInfo);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper obj = new ObjectMapper();
		obj.registerModule(new JavaTimeModule());
		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		obj.setDateFormat(df);
		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);

   }
	
	@GetMapping("/getbyfield/detailhead")
	public ResponseEntity<String> getDetailHead(@RequestParam String lookupName) throws JsonProcessingException {
		List<DOILuLookUpInfoEntity> lookUpInfo = service.getByParentLookUpName(lookupName);
		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(lookUpInfo);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper obj = new ObjectMapper();
		obj.registerModule(new JavaTimeModule());
		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		obj.setDateFormat(df);
		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);

   }
	@GetMapping("/getbyfield/Type")
	public ResponseEntity<String> getType(@RequestParam String lookupName) throws JsonProcessingException {
		List<DOILuLookUpInfoEntity> lookUpInfo = service.getByParentLookUpName(lookupName);
		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(lookUpInfo);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper obj = new ObjectMapper();
		obj.registerModule(new JavaTimeModule());
		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		obj.setDateFormat(df);
		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);

   }
	
	
}