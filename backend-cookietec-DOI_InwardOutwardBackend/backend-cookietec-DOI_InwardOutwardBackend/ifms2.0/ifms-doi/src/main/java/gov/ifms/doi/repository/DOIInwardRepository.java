package gov.ifms.doi.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gov.ifms.doi.entity.DOIInwardEntryEntity;

@Transactional
@Repository
public interface DOIInwardRepository
		extends CrudRepository<DOIInwardEntryEntity, Long>, JpaSpecificationExecutor<DOIInwardEntryEntity> {

	@Query(value = "SELECT inward_no, reference_no FROM DOIInwardEntryEntity WHERE inward_id = (SELECT max(inward_id) FROM DOIInwardEntryEntity)")
	public List<String> getLatestInwardNumber();

}