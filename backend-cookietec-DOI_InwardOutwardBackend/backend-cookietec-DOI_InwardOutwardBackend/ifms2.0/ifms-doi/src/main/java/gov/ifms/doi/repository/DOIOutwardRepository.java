package gov.ifms.doi.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gov.ifms.doi.entity.DOIOutwardEntryEntity;

@Transactional
@Repository
public interface DOIOutwardRepository extends CrudRepository<DOIOutwardEntryEntity, Long> {

	@Query(value = "SELECT outward_no, reference_no FROM DOIOutwardEntryEntity WHERE outward_id = (SELECT max(outward_id) FROM DOIOutwardEntryEntity)")
	public List<String> getLatestOutwardNumber();

}
