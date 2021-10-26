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
import com.gov.demo.entity.DppfNo;
import com.gov.demo.entity.JsonObjectFormat;
import com.gov.demo.entity.TdioHBAProposal;
import com.gov.demo.entity.Tdoi_hba_Claim_Entry;
import com.gov.demo.service.HBAProposalService;

@RestController
@RequestMapping("/proposal")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HBAProposalController {

	@Autowired
	HBAProposalService service;

//	@PostMapping("/filter")
//	public void getByFilter(@RequestBody Map<String, String> hbaProposalListing){
//				System.out.println(this.service.filterHbaProposal(hbaProposalListing));
//	}

	@PostMapping("/filter")
	public ResponseEntity<String> getByFilter(@RequestBody Map<String, String> hbaProposalListing)
			throws JsonProcessingException {
		List<TdioHBAProposal> tdioHBAProposal = this.service.filterHbaProposal(hbaProposalListing);
		System.out.println(tdioHBAProposal);
		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(tdioHBAProposal);
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
		List<TdioHBAProposal> tdioHBAProposal = service.getAll();
		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(tdioHBAProposal);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper obj = new ObjectMapper();
		obj.registerModule(new JavaTimeModule());
		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		obj.setDateFormat(df);
		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<String> getHbaProposalbyId(@Valid @PathVariable Long id) throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (id != null) {

				TdioHBAProposal tdioHBAProposal = this.service.getHbaProposalById(id);
				jsonobjectFormat = new JsonObjectFormat("Data fecthed for the id: " + id, true, tdioHBAProposal);
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

	@PostMapping("/save")
	public ResponseEntity<String> submitEntry(@Valid @RequestBody List<TdioHBAProposal> tdioHBAProposal)
			throws JsonProcessingException {
		JsonObjectFormat jsonobjectFormat;

		try {
			if (tdioHBAProposal != null) {
				List<TdioHBAProposal> HBAProposal = this.service.addHBAProposal(tdioHBAProposal);
				jsonobjectFormat = new JsonObjectFormat("Data Save successfully", true, HBAProposal);
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
	public ResponseEntity<String> updateEntry(@Valid @RequestBody TdioHBAProposal tdioHBAProposal)
			throws JsonProcessingException {
		TdioHBAProposal tdioProposal = service.updateTdioHBAProposal(tdioHBAProposal);

		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat("Data update successfully", true, tdioProposal);
		jsonobjectFormat.setMessage("Data Updated successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(tdioProposal);
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
				TdioHBAProposal tdioHBAProposal = this.service.deleteTdioHBAProposal(id);
				jsonobjectFormat = new JsonObjectFormat("Data deleted for this id: " + id, true, tdioHBAProposal);
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

//	@PostMapping("/hbadppf")
//	public ResponseEntity<String> getByDppfNo(@RequestParam String HBA_MCA_ACC_NUM)
//			throws JsonProcessingException {
//		
//		List<DppfNo> dppfNo = this.service.filterDppf(HBA_MCA_ACC_NUM);
//		
//		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
//		jsonobjectFormat.setMessage("got all successfully");
//		jsonobjectFormat.setSuccess(true);
//		jsonobjectFormat.setData(HBA_MCA_ACC_NUM);
//		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//		ObjectMapper obj = new ObjectMapper();
//		obj.registerModule(new JavaTimeModule());
//		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//		obj.setDateFormat(df);
//		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
//		return ResponseEntity.ok().body(customExceptionStr);
//	}
//	
// 	
// 	@PostMapping("/hbadppf")
//	public ResponseEntity<String> getByDppfNo(@RequestParam String HBA_MCA_ACC_NUM)
//			throws JsonProcessingException {
//		
//		List<DppfNo> dppfNo = this.service.filterDppf(HBA_MCA_ACC_NUM);
//	
//		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
//		jsonobjectFormat.setMessage("got all successfully");
//		jsonobjectFormat.setSuccess(true);
//		jsonobjectFormat.setData(dppfNo);
//		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//		ObjectMapper obj = new ObjectMapper();
//		obj.registerModule(new JavaTimeModule());
//		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//		obj.setDateFormat(df);
//		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
//		return ResponseEntity.ok().body(customExceptionStr);
//	}

	@PostMapping("/hbadppf")
	public ResponseEntity<String> getByDppfNo(@RequestBody String HBA_MCA_ACC_NUM) throws JsonProcessingException {
		System.out.println(HBA_MCA_ACC_NUM);
		Map<String, String> dppfNo = this.service.filterDppf(HBA_MCA_ACC_NUM);

		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(dppfNo);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper obj = new ObjectMapper();
		obj.registerModule(new JavaTimeModule());
		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		obj.setDateFormat(df);
		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);
	}

}
