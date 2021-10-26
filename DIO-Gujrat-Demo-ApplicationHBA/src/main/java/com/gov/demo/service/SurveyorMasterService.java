package com.gov.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.gov.demo.entity.Tdoi_surveyor_dtl;
import com.gov.demo.repository.SurveyorMasterRepository;

//import com.gov.demo.repository.SurveyorMasterRepository;
public interface SurveyorMasterService {

	public List<Tdoi_surveyor_dtl> getAll();

	public Tdoi_surveyor_dtl getSurveyordtlById(Long id);

	public List<Tdoi_surveyor_dtl> addSurveyordtl(List<Tdoi_surveyor_dtl> tdoi_surveyor_dtl);

	public Tdoi_surveyor_dtl updateTdoi_surveyor_dtl(Tdoi_surveyor_dtl tdoi_surveyor_dtl);

	public Tdoi_surveyor_dtl deleteTdoi_surveyor_dtl(Long id);

	public List<Tdoi_surveyor_dtl> filterSurveyorMaster(Map<String, String> surveyorMasterListingdto);

}
