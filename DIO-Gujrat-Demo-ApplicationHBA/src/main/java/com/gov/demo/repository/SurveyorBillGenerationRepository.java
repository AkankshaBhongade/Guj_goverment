package com.gov.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gov.demo.entity.Tdoi_surveyor_bill_dtls;

@Repository
public interface SurveyorBillGenerationRepository extends CrudRepository<Tdoi_surveyor_bill_dtls, Long> {

}
