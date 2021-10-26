package com.gov.demo.service;



import java.util.List;
import com.gov.demo.entity.Tdoi_inward_entry;


public interface InwardService {


  List<Tdoi_inward_entry> getAll();

  Tdoi_inward_entry getInwardentryById(Long id);

  Tdoi_inward_entry deleteTdoi_inward_entry(Long id);	
	
	
}