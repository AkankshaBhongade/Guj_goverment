package com.gov.demo.service;

import java.util.List;
import java.util.Map;

import com.gov.demo.entity.Tdoi_surveyor_bill_dtls;


public interface Surveyor_bill_generation_service {

	List<Tdoi_surveyor_bill_dtls> getAll();

	Tdoi_surveyor_bill_dtls getSurveyorbilldtlsById(Long id);

	Tdoi_surveyor_bill_dtls  addSurveyorbilldtls(Tdoi_surveyor_bill_dtls tdoi_surveyor_bill_dtls);
	
	public Tdoi_surveyor_bill_dtls updateTdoi_surveyor_bill_dtl(Tdoi_surveyor_bill_dtls tdoi_surveyor_bill_dtl);

	Tdoi_surveyor_bill_dtls deletesurveyorbilldtls(Long id);

	List<Tdoi_surveyor_bill_dtls> filterSurveyorbilldtls(Map<String, String> surveyor_bill_generation_listing);
	
}
