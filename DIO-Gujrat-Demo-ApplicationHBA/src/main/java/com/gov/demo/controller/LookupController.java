package com.gov.demo.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.gov.demo.entity.JsonObjectFormat;
import com.gov.demo.lookup.BankBranchEntity;
import com.gov.demo.lookup.MsBankEntity;

import com.gov.demo.lookup.MsDistrict;
import com.gov.demo.lookup.MsTaluka;
import com.gov.demo.service.LookupService;

@RestController
@RequestMapping("/Lookup")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LookupController {
	
	@Autowired
	LookupService lookupService;
	
	// getall
		@GetMapping("/getallDistrict")
		public ResponseEntity<String> getAll() throws JsonProcessingException {
			List<MsDistrict> district = lookupService.getAll();
			JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
			jsonobjectFormat.setMessage("got all successfully");
			jsonobjectFormat.setSuccess(true);
			jsonobjectFormat.setData(district);
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			ObjectMapper obj = new ObjectMapper();
			obj.registerModule(new JavaTimeModule());
			obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			obj.setDateFormat(df);
			String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.ok().body(customExceptionStr);
		}
		
		// getDistrictNames
		@GetMapping("/getDistrictNames")
		public ResponseEntity<String> getDistrictNames() throws JsonProcessingException {
			List<String> district = lookupService.getDistrictNames();
			JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
			jsonobjectFormat.setMessage("got all successfully");
			jsonobjectFormat.setSuccess(true);
			jsonobjectFormat.setData(district);
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			ObjectMapper obj = new ObjectMapper();
			obj.registerModule(new JavaTimeModule());
			obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			obj.setDateFormat(df);
			String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.ok().body(customExceptionStr);
		}


		// getall
				@GetMapping("/getalltaluka")
				public ResponseEntity<String> getAllTaluka() throws JsonProcessingException {
					List<MsTaluka> taluka = lookupService.getAllTaluka();
					JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
					jsonobjectFormat.setMessage("got all successfully");
					jsonobjectFormat.setSuccess(true);
					jsonobjectFormat.setData(taluka);
					DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
					ObjectMapper obj = new ObjectMapper();
					obj.registerModule(new JavaTimeModule());
					obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
					obj.setDateFormat(df);
					String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
					return ResponseEntity.ok().body(customExceptionStr);
				}
				

				// getall
						@GetMapping("/getallbank")
						public ResponseEntity<String> getAllbank() throws JsonProcessingException {
							List<MsBankEntity> bankEntity = lookupService.getAllbank();
							JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
							jsonobjectFormat.setMessage("got all successfully");
							jsonobjectFormat.setSuccess(true);
							jsonobjectFormat.setData(bankEntity);
							DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
							ObjectMapper obj = new ObjectMapper();
							obj.registerModule(new JavaTimeModule());
							obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
							obj.setDateFormat(df);
							String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
							return ResponseEntity.ok().body(customExceptionStr);
						}
						

						// getall
								@GetMapping("/getallbranch")
								public ResponseEntity<String> getAllbranch() throws JsonProcessingException {
									List<BankBranchEntity> branchEntity = lookupService.getAllbranch();
									JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
									jsonobjectFormat.setMessage("got all successfully");
									jsonobjectFormat.setSuccess(true);
									jsonobjectFormat.setData(branchEntity);
									DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
									ObjectMapper obj = new ObjectMapper();
									obj.registerModule(new JavaTimeModule());
									obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
									obj.setDateFormat(df);
									String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
									return ResponseEntity.ok().body(customExceptionStr);
								}
		
		
}
