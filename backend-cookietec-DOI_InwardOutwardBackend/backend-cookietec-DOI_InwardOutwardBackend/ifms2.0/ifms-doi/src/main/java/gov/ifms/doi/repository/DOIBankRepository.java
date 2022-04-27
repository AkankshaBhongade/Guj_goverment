package gov.ifms.doi.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gov.ifms.doi.entity.DOIBankEntity;

@Repository
@Transactional
public interface DOIBankRepository extends CrudRepository<DOIBankEntity, Long> {
}