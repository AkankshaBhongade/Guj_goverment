package com.gov.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Lookup")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NewLookupController {
	
	
//	 @GetMapping("/getbyfield/branchname")
//		public ResponseEntity<String> getBranchName(@RequestParam String lookupName) throws JsonProcessingException {
//             //public ResponseEntity<ApiResponse> getBranchName() {
//		   List<DOILuLookUpInfoEntity> lookUpInfo = service.getByParentLookUpName(lookupName);
//			JsonObjectFormat jsonobjectFormat = new JsonObjectFormat();
//			jsonobjectFormat.setMessage("got all successfully");
//			jsonobjectFormat.setSuccess(true);
//			jsonobjectFormat.setData(lookUpInfo);
//			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//			ObjectMapper obj = new ObjectMapper();
//			obj.registerModule(new JavaTimeModule());
//			obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//			obj.setDateFormat(df);
//			String customExceptionStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
//			return ResponseEntity.ok().body(customExceptionStr);
//
//	   }

}
