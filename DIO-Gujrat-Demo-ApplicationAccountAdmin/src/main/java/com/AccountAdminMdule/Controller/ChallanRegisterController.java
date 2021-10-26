package com.AccountAdminMdule.Controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

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

import com.AccountAdminMdule.entity.JsonObjectFormat;
import com.AccountAdminMdule.entity.TdoiAcBtr_5;
import com.AccountAdminMdule.entity.TdoiAcChallanDtl;
import com.AccountAdminMdule.entity.TdoiAcChallanRegister;
import com.AccountAdminMdule.service.ChallanRegisterService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@RestController
@RequestMapping("/challanreg")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChallanRegisterController {
	@Autowired
	ChallanRegisterService service;
	
	@GetMapping("/getall")
	public ResponseEntity<String> getAll() throws JsonProcessingException {
		List<TdoiAcChallanRegister> tdoiAcChallanRegisterlist = service.getAll();
		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
		jsonobjectFormat.setMessage("got all successfully");
		jsonobjectFormat.setSuccess(true);
		jsonobjectFormat.setData(tdoiAcChallanRegisterlist);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		ObjectMapper obj = new ObjectMapper();
		obj.registerModule(new JavaTimeModule());
		obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		obj.setDateFormat(df);
		String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
		return ResponseEntity.ok().body(customExceptionStr);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getChallanRegister(@PathVariable Long id) throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (id != null) {

				TdoiAcChallanRegister updateResponse = this.service.getChallanRegisterById(id);
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
	
	@PostMapping("/save")
	public ResponseEntity<String> submitEntry(@RequestBody List<TdoiAcChallanRegister> tdoiAcChallanRegister)
			throws JsonProcessingException {
		JsonObjectFormat jsonobjectFormat;

		try {
			if (tdoiAcChallanRegister != null) {
				List<TdoiAcChallanRegister> AcChallanRegister = this.service.addChallanRegister(tdoiAcChallanRegister);
				jsonobjectFormat = new JsonObjectFormat("Data Save successfully", true, AcChallanRegister);
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
	
	// delete

		@DeleteMapping("/delete/{id}")
		public ResponseEntity<String> deleteEntry(@PathVariable Long id) throws JsonProcessingException {

			JsonObjectFormat jsonobjectFormat;

			try {
				if (id != null) {
					 this.service.deleteTdoiAcChallanRegister(id);
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
		
		 // update
	 	@PutMapping("/update/{id}")
	 	public ResponseEntity<String> updateEntry(@RequestBody TdoiAcChallanRegister tdoiAcChallanRegister)
	 			throws JsonProcessingException {
	 		TdoiAcChallanRegister AcChallanRegister = service.updateTdoiAcChallanRegister(tdoiAcChallanRegister);

	 		JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
	 		jsonobjectFormat.setMessage("Data Updated successfully");
	 		jsonobjectFormat.setSuccess(true);
	 		jsonobjectFormat.setData(AcChallanRegister);
	 		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	 		ObjectMapper Obj = new ObjectMapper();
	 		Obj.registerModule(new JavaTimeModule());
	 		Obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
	 		Obj.setDateFormat(df);
	 		String customExceptionStr = Obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
	 		return ResponseEntity.ok().body(customExceptionStr);


	 	}

	 	//filter
	 	@PostMapping("/filter")
		public ResponseEntity<String> getByFilter(@RequestBody Map<String, String> AcChallanRegister)
				throws JsonProcessingException {
			List<TdoiAcChallanRegister> tdoiAcChallanRegister = this.service.filterAcChallanRegister(AcChallanRegister);
			System.out.println(tdoiAcChallanRegister);
			JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
			jsonobjectFormat.setMessage("got all successfully");
			jsonobjectFormat.setSuccess(true);
			jsonobjectFormat.setData(tdoiAcChallanRegister);
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			ObjectMapper obj = new ObjectMapper();
			obj.registerModule(new JavaTimeModule());
			obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			obj.setDateFormat(df);
			String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.ok().body(customExceptionStr);
		}
		
}
