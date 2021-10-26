package com.gov.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gov.demo.entity.Tdoi_surveyor_dtl;

//import gov.ifms.doi.hba.entity.Tdoi_surveyor_dtl;

@Repository
public interface SurveyorMasterRepository extends JpaRepository<Tdoi_surveyor_dtl, Long> {

	Tdoi_surveyor_dtl findByid(Long Surveyor_id); 
	


}
