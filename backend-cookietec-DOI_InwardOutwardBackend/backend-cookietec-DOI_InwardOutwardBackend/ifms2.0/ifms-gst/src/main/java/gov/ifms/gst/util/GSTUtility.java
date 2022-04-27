package gov.ifms.gst.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * The Class EDPUtility.
 */
public class GSTUtility {

	
	
	/**
	 * Instantiates a new EDP utility.
	 */
	private GSTUtility() {
	}
	
	public static Double roundUpDoubleValue(Double input) {
	    return new BigDecimal(input).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

	public static LocalDate convertStringToLocalDate(String value) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
        return LocalDate.parse(value, formatter);
	}

}
