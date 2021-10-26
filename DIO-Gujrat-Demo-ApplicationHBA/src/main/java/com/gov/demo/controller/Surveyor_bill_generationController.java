package com.gov.demo.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.common.util.concurrent.Service;
import com.gov.demo.dto.Surveyor_bill_generation_dto;
import com.gov.demo.entity.JsonObjectFormat;
import com.gov.demo.entity.TdioHBAProposal;
import com.gov.demo.entity.Tdoi_surveyor_bill_dtls;
import com.gov.demo.entity.Tdoi_surveyor_dtl;
import com.gov.demo.service.Surveyor_bill_generation_service;


@RestController
@RequestMapping("/sbg")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Surveyor_bill_generationController {

	@Autowired
	Surveyor_bill_generation_service service;

	@PostMapping("/filter")
	public ResponseEntity<String> getByFilter(@RequestBody Map<String, String> Surveyor_bill_generation_listing )
			throws JsonProcessingException {
		List<Tdoi_surveyor_bill_dtls> tdoisurveyorbilldtls = this.service.filterSurveyorbilldtls(Surveyor_bill_generation_listing );
		System.out.println(tdoisurveyorbilldtls);
		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(tdoisurveyorbilldtls);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper obj = new ObjectMapper();
		obj.registerModule(new JavaTimeModule());
		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		obj.setDateFormat(df);
		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);
	}
	
	
	
	@GetMapping("/getall")
	public ResponseEntity<String> getAll() throws JsonProcessingException {
		List<Tdoi_surveyor_bill_dtls> tdio_surveyor_bill_generation_list = service.getAll();
		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(tdio_surveyor_bill_generation_list);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper obj = new ObjectMapper();
		obj.registerModule(new JavaTimeModule());
		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		obj.setDateFormat(df);
		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getSurveyorbillbyId(@Valid @PathVariable Long id) throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (id != null) {

				Tdoi_surveyor_bill_dtls updateResponse = this.service.getSurveyorbilldtlsById(id);
				jsonobjectFormat = new JsonObjectFormat("Data fecthed for the id: " + id, true, updateResponse);
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				obj.setDateFormat(df);
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);

			} else {
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				obj.setDateFormat(df);
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString("No id entered");
				return ResponseEntity.badRequest().body(customStr);
			}
		} catch (Exception e) {
			jsonobjectFormat = new JsonObjectFormat("Unable to fetch data", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.badRequest().body(customStr);
		}
	}
	
//	@PostMapping("/save")
//	public ResponseEntity<String> submitEntry(@Valid @RequestBody Tdoi_surveyor_bill_dtls tdoi_surveyor_bill_dtls)
//			throws JsonProcessingException {
//		JsonObjectFormat jsonobjectFormat;
//
//		try {
//			if (tdoi_surveyor_bill_dtls != null) {
//				Tdoi_surveyor_bill_dtls tdoisurveyorbilldtl = this.service.addSurveyorbilldtls(tdoi_surveyor_bill_dtls);
//				jsonobjectFormat = new JsonObjectFormat("Data Save successfully", true, tdoisurveyorbilldtl);
//				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//				ObjectMapper obj = new ObjectMapper();
//				obj.registerModule(new JavaTimeModule());
//				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//				obj.setDateFormat(df);
//				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
//				return ResponseEntity.ok().body(customStr);
//
//			} else {
//				jsonobjectFormat = new JsonObjectFormat("No data entered", false, "");
//				ObjectMapper obj = new ObjectMapper();
//				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
//				return ResponseEntity.badRequest().body(customStr);
//			}
//		} catch (Exception e) {
//			jsonobjectFormat = new JsonObjectFormat("Unable to save data", false, "");
//			ObjectMapper obj = new ObjectMapper();
//			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
//			return ResponseEntity.badRequest().body(customStr);
//		}
//	}
//	
	
	
	@PostMapping("/save")
	public ResponseEntity<String> submitEntry(@Valid @RequestBody Tdoi_surveyor_bill_dtls tdoi_surveyor_bill_dtls)
			throws JsonProcessingException {
		JsonObjectFormat jsonobjectFormat;

		try {
			if (tdoi_surveyor_bill_dtls != null) {
				Tdoi_surveyor_bill_dtls surveyor_bill_dtls   = 	this.service.addSurveyorbilldtls(tdoi_surveyor_bill_dtls);
				if( surveyor_bill_dtls!= null) {
					
				jsonobjectFormat = new JsonObjectFormat("Data Save successfully", true, surveyor_bill_dtls );
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				
			    obj.setDateFormat(df);
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);
				}else {
					jsonobjectFormat = new JsonObjectFormat("Unable to save data", false, "");
					ObjectMapper obj = new ObjectMapper();
					String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
					return ResponseEntity.badRequest().body(customStr);
				}
			} else {
				jsonobjectFormat = new JsonObjectFormat("No data entered", false, "");
				ObjectMapper obj = new ObjectMapper();
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.badRequest().body(customStr);
			}
		} catch (Exception e) {
			e.printStackTrace();
			jsonobjectFormat = new JsonObjectFormat("catch Unable to save data", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.badRequest().body(customStr);
		}
	}

	
	
	//update
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateEntry(@Valid @RequestBody Tdoi_surveyor_bill_dtls tdoi_surveyor_bill_dtl) throws JsonProcessingException {

		Tdoi_surveyor_bill_dtls tdoi_surveyor_bill = service.updateTdoi_surveyor_bill_dtl(tdoi_surveyor_bill_dtl);
		
 JsonObjectFormat jsonobjectFormat=new JsonObjectFormat();
		 
	jsonobjectFormat.setMessage("Data Updated successfully");
	jsonobjectFormat.setSuccess(true);
	jsonobjectFormat.setData(tdoi_surveyor_bill);
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	ObjectMapper Obj = new ObjectMapper();
	Obj.registerModule(new JavaTimeModule());
	Obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
	Obj.setDateFormat(df);
	String customExceptionStr = Obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
	return ResponseEntity.ok().body(customExceptionStr);

}

	
		
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEntrybyId(@Valid @PathVariable Long id) throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (id != null) {
				//this.service.deleteTdoi_surveyor_bill_dtls(id);
				Tdoi_surveyor_bill_dtls tdoi_surveyor_bill_dtls=this.service.deletesurveyorbilldtls(id);
				jsonobjectFormat = new JsonObjectFormat("Data deleted for this id: " + id, true,"");
				ObjectMapper obj1 = new ObjectMapper();
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				obj.setDateFormat(df);
				
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);

			} else {
				ObjectMapper obj = new ObjectMapper();
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString("No id entered");
				return ResponseEntity.badRequest().body(customStr);
			}
		} catch (Exception e) {
			e.printStackTrace();
			jsonobjectFormat = new JsonObjectFormat("Unable to delete data", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.badRequest().body(customStr);
		}
	}
	
	
	
	
}
