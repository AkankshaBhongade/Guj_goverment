package gov.ifms.gst.pagination;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import gov.ifms.common.pagination.SearchCriteria;
import gov.ifms.common.pagination.SearchParam;
import gov.ifms.common.pagination.SpecificationImpl;
import gov.ifms.common.util.Constant;
import gov.ifms.gst.util.GSTUtility;

/**
 * The Class GstSearchCriteria.
 */
public class GstSearchCriteria extends SearchCriteria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	 
	public <GSTBankRateMaster> Specification<GSTBankRateMaster> getGstSpecificationDetail(SpecificationImpl<GSTBankRateMaster> spec, List<SearchParam> jsonArr) {

		for (SearchParam searchParam : jsonArr) {
			if(searchParam.getKey().equals("effectiveFromDate")||
					searchParam.getKey().equals("effectiveToDate")||
					searchParam.getKey().equals("referenceDate")) {
				spec.with(String.valueOf(searchParam.getKey()), Constant.COLON,GSTUtility.convertStringToLocalDate(searchParam.getValue()));
					
			}else {
				spec.with(String.valueOf(searchParam.getKey()), Constant.COLON, String.valueOf(searchParam.getValue()));
				
			}
		}

		return  spec.build();
	}
}
