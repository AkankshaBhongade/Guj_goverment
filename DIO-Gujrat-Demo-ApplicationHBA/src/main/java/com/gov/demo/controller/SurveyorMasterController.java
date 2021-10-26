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
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.gov.demo.entity.JsonObjectFormat;
import com.gov.demo.entity.TdioHBAProposal;
import com.gov.demo.entity.Tdoi_surveyor_dtl;
import com.gov.demo.service.SurveyorMasterService;


@RestController
@RequestMapping("/surveyormaster")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SurveyorMasterController {

	@Autowired
	SurveyorMasterService service;
	


	// getall
	@GetMapping("/getall")
	public ResponseEntity<String> getAll() throws JsonProcessingException {
		List<Tdoi_surveyor_dtl> tdoi_surveyor_dtl = service.getAll();
		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(tdoi_surveyor_dtl);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper obj = new ObjectMapper();
		obj.registerModule(new JavaTimeModule());
		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		obj.setDateFormat(df);
		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);
	}

	// getbyid
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getSurveyorbyId(@Valid @PathVariable Long id) throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (id != null) {

				Tdoi_surveyor_dtl updateResponse = this.service.getSurveyordtlById(id);
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
			e.printStackTrace();
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.badRequest().body(customStr);
		}

	}

	@PostMapping("/save")
	public ResponseEntity<String> submitEntry(@Valid @RequestBody List<Tdoi_surveyor_dtl> tdoi_surveyor_dtl)
			throws JsonProcessingException {
		JsonObjectFormat jsonobjectFormat;

		try {
			if (tdoi_surveyor_dtl != null) {
				List<Tdoi_surveyor_dtl> tdoisurveyordtl = this.service.addSurveyordtl(tdoi_surveyor_dtl);
				jsonobjectFormat = new JsonObjectFormat("Data Save successfully", true, tdoisurveyordtl);
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				obj.setDateFormat(df);
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);

			} else {
				jsonobjectFormat = new JsonObjectFormat("No data entered", false, "");
				ObjectMapper obj = new ObjectMapper();
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.badRequest().body(customStr);
			}
		} catch (Exception e) {
			jsonobjectFormat = new JsonObjectFormat("Unable to save data", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.badRequest().body(customStr);
		}
	}
	// update

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateEntry(@Valid @RequestBody Tdoi_surveyor_dtl tdoi_surveyor_dtl)
			throws JsonProcessingException {

		Tdoi_surveyor_dtl tdoi_surveyor = service.updateTdoi_surveyor_dtl(tdoi_surveyor_dtl);

		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("Data Updated successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(tdoi_surveyor);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper Obj = new ObjectMapper();
		Obj.registerModule(new JavaTimeModule());
		Obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		Obj.setDateFormat(df);
		String customExceptionStr = Obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);

	}

	// delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEntrybyId(@Valid @PathVariable Long id) throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (id != null) {
			
				Tdoi_surveyor_dtl tdoi_surveyor_dtl=this.service.deleteTdoi_surveyor_dtl(id);
				jsonobjectFormat = new JsonObjectFormat("Data deleted for this id: " + id, true, tdoi_surveyor_dtl);
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
	
	
	@PostMapping("/filter")
	public ResponseEntity<String> getByFilter(@RequestBody Map<String, String> SurveyorMasterListingdto)
			throws JsonProcessingException {
		List<Tdoi_surveyor_dtl> tdoi_surveyor_dtl = this.service.filterSurveyorMaster(SurveyorMasterListingdto);
		System.out.println(tdoi_surveyor_dtl);
		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(tdoi_surveyor_dtl);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper obj = new ObjectMapper();
		obj.registerModule(new JavaTimeModule());
		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		obj.setDateFormat(df);
		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);
	}

}
