package com.gov.demo.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import com.gov.demo.dto.claimdtoforfilter;
import com.gov.demo.entity.DppfNo;
import com.gov.demo.entity.JsonObjectFormat;
import com.gov.demo.entity.TdioHBAProposal;
import com.gov.demo.entity.Tdoi_hba_Claim_Entry;
//import com.gov.demo.entity.Tdoi_hba_Claim_Entry;
import com.gov.demo.entity.Tdoi_surveyor_bill_dtls;
import com.gov.demo.entity.Tdoi_surveyor_dtl;
//import com.gov.demo.service.ClaimEnrtyService;
import com.gov.demo.service.HBAClaimEntryService;

@RestController
@RequestMapping("/claimentry")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClaimEntryController {
	@Autowired
	HBAClaimEntryService Service;

	// Getall
	@GetMapping("/claimenrty/getall")
	public ResponseEntity<String> getAll() throws JsonProcessingException {
		List<Tdoi_hba_Claim_Entry> tdio_Claim_entry_listing_dto = Service.getAll();
		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(tdio_Claim_entry_listing_dto);
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
	public ResponseEntity<String> gethbaclaimbyId(@Valid @PathVariable Long id) throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (id != null) {

				Tdoi_hba_Claim_Entry updateResponse = this.Service.getHBAClaimEntryById(id);
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

	// save
	@PostMapping("/save")
	public ResponseEntity<String> submitEntry(@Valid @RequestBody List<Tdoi_hba_Claim_Entry> tdoi_hba_Claim_Entry)
			throws JsonProcessingException {
		JsonObjectFormat jsonobjectFormat;

		try {
			if (tdoi_hba_Claim_Entry != null) {
				List<Tdoi_hba_Claim_Entry> hba_Claim_Entry = this.Service.addhbaClaimEntry(tdoi_hba_Claim_Entry);
				jsonobjectFormat = new JsonObjectFormat("Data Save successfully", true, hba_Claim_Entry);
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
			e.printStackTrace();
			jsonobjectFormat = new JsonObjectFormat("Unable to save data", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.badRequest().body(customStr);
		}
	}

	// update
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateEntry(@Valid @RequestBody Tdoi_hba_Claim_Entry tdoi_hba_Claim_Entry)
			throws JsonProcessingException {
		Tdoi_hba_Claim_Entry tdoi_hba_Claim_ = Service.updateTdoi_hba_Claim_Entry(tdoi_hba_Claim_Entry);

		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("Data Updated successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(tdoi_hba_Claim_);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper Obj = new ObjectMapper();
		Obj.registerModule(new JavaTimeModule());
		Obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		Obj.setDateFormat(df);
		String customExceptionStr = Obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);

	}

	// delete
	@DeleteMapping("claimenrty/delete/{id}")
	public ResponseEntity<String> deleteEntrybyId(@Valid @PathVariable Long id) throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (id != null) {
				this.Service.deleteTdoi_hba_Claim_Entry(id);
				jsonobjectFormat = new JsonObjectFormat("Data deleted for this id: " + id, true, "");
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



	@PostMapping("/distict")
	public ResponseEntity<String> getBydistict(@RequestBody long DISTRICT_ID) throws JsonProcessingException {
		try {
			Collection<Object> Claim_distict = this.Service.distictid(DISTRICT_ID);

			JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
			jsonobjectFormat.setMessage("got all successfully");
			jsonobjectFormat.setSuccess(true);
			jsonobjectFormat.setData(Claim_distict);
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			ObjectMapper obj = new ObjectMapper();
			obj.registerModule(new JavaTimeModule());
			obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			obj.setDateFormat(df);
			String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.ok().body(customExceptionStr);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}

	}

	
	
//	@PostMapping("/filter")
//	public ResponseEntity<String> getByFilter(@RequestBody Map<String, String> Claim_entry_listing_dto)
//			throws JsonProcessingException {
//
//		List<Tdoi_hba_Claim_Entry> tdoihbaClaimEntry = this.Service.filterhbaClaimEntry(Claim_entry_listing_dto);
//		System.out.println(tdoihbaClaimEntry);
////List<String> list = (List<String>) Claim_entry_listing_dto.keySet();
//
//		// HashSet<String> hash = (HashSet<String>) Claim_entry_listing_dto.keySet();
//		Set<String> hash = Claim_entry_listing_dto.keySet();
//
//		for (Iterator iterator = hash.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//
//			if ("DISTRICT_ID".equals(string)) {
//
//				for (Tdoi_hba_Claim_Entry obj : tdoihbaClaimEntry) {
//
//					TdioHBAProposal obj2 = obj.getHba_proposal_id();
//					obj2.getDistrict_id();
//					obj.setDisticid(obj2.getDistrict_id());
//
//				}
//			}
//		}
//		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
//		jsonobjectFormat.setMessage("got all successfully");
//		jsonobjectFormat.setSuccess(true);
//		jsonobjectFormat.setData(tdoihbaClaimEntry);
//		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//		ObjectMapper obj = new ObjectMapper();
//		obj.registerModule(new JavaTimeModule());
//		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//		obj.setDateFormat(df);
//		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
//
//		return ResponseEntity.ok().body(customExceptionStr);
//	}
//
////     @GetMapping("/testing")
////  	public void testing(@RequestParam("id")long id){
////  		
////  		List<Tdoi_hba_Claim_Entry> abc= this.Service.getfilterById(id);
////	
////  		
////  	}
//	
	
	
	@PostMapping("/filter")
	public ResponseEntity<String> getByFilternew(@RequestBody Map<String, String> claimdtoforfilter)
			throws JsonProcessingException {
		List<claimdtoforfilter> claimdto = this.Service.clamnewfilter(claimdtoforfilter);
		System.out.println(claimdto);
		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(claimdto);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper obj = new ObjectMapper();
		obj.registerModule(new JavaTimeModule());
		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		obj.setDateFormat(df);
		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);
	}

	
	
	
	
}
//for( )
//list
//propsal load data
//load data by id dist
//for
//if
