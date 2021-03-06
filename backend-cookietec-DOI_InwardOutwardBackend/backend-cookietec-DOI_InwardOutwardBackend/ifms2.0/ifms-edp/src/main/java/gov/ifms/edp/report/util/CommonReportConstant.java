package gov.ifms.edp.report.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

/**
 * The Class CommonReportConstant.
 */
public class CommonReportConstant {

	/**
	 * Instantiates a new common report constant.
	 */
	private CommonReportConstant() {
		super();
	}

	/** The Constant ATTACHMENT_FILENAME. */
	public static final String ATTACHMENT_FILENAME = "attachment; filename=";
	
	/** The Constant PDF_EXTENSION. */
	public static final String PDF_EXTENSION = ".pdf";
	
	/** The Constant DD_MM_YYYY_WITH_DASH. */
	public static final String DD_MM_YYYY_WITH_DASH = "dd-MM-yyyy";
	
	/** The Constant UNDERSCORE. */
	public static final String UNDERSCORE = "_";
	
	/** The Constant ARIAL. */
	public static final String ARIAL = "Arial";
	
	/** The Constant REPORT_STRING_COLON. */
	public static final String REPORT_STRING_COLON = " : ";
	
	/** The Constant REPORT_STRING_COMMA. */
	public static final String REPORT_STRING_COMMA = " , ";
	
	/** The Constant REPORT_GENERATED_BY. */
	public static final String REPORT_GENERATED_BY = "Generated By : ";
	
	/** The Constant REPORT_GENERATED_DATETIME. */
	public static final String REPORT_GENERATED_DATETIME = "Generated Date and Time : ";
	
	/** The report labels. */
	protected static Map<String,String> reportLabels = new LinkedHashMap<>();

	/**
	 * Gets the report labels.
	 *
	 * @return the report labels
	 */
	public static Map<String, String> getReportLabels() {
		return reportLabels;
	}
	
	/** The new item lables. */
	protected static Map<String, String> newItemLables = new LinkedHashMap<>();

	/**
	 * Gets the new item lables.
	 *
	 * @return the new item lables
	 */
	public static Map<String, String> getNewItemLables() {
		return newItemLables;
	}
	
	static {
		reportLabels.put("trnFromDate", "From Date");
		reportLabels.put("trnToDate", "To Date");
		reportLabels.put("districtId", "District");
		reportLabels.put("departmentId", "Department");
		reportLabels.put("hodId", "Hod");
		reportLabels.put("ddoNo", "DDO No");
		reportLabels.put("cardexNo", "Cardex No");
		reportLabels.put("statusId", "Status");
		reportLabels.put("wfStatusId", "Workflow Status");
		reportLabels.put("officeName", "Office Name");
		reportLabels.put("trnNo", "Transaction No");
		reportLabels.put("officeId", "Office Name");
		reportLabels.put("postId", "Post");
		
		newItemLables.put("fyId", "Financial Year");
		newItemLables.put("deptId", "Department Name");
		newItemLables.put("typeOfEstId", "Type of Estimate");
		newItemLables.put("demandId", "Demand Code");
		newItemLables.put("revCapId", "Revenue Capital");
		newItemLables.put("majorHeadId", "Major Head Code");
		newItemLables.put("subMajorHeadId", "Sub Major Head Code");
		newItemLables.put("minorHeadId", "Minor Head Code");
		newItemLables.put("subHeadId", "Sub Head Code");
		newItemLables.put("detailHeadId", "Detail Head Code");
		newItemLables.put("refNo", "Refernce Number");
		newItemLables.put("paStateFrom", "Proposal State From");
		newItemLables.put("paStateTo", "Proposal State To");
		newItemLables.put("paCssFrom", "Proposal Css From");
		newItemLables.put("paCssTo", "Proposal Css To");
		newItemLables.put("refFromDate", "Refernce From Date");
		newItemLables.put("refToDate", "Refernce To Date");
		newItemLables.put("trnStatus", "Refernce_From_Date);");
		newItemLables.put("wfStatus", "Workflow Status");
	}
	
	/** The Constant BOTH. */
	public static final String BOTH = "BOTH";
	
	/** The Constant INPUT. */
	public static final String INPUT = "INPUT";
	
	/** The Constant OUTPUT. */
	public static final String OUTPUT = "OUTPUT";
	
	/** The Constant REPORT_DDO. */
	public static final String REPORT_DDO = "Report_Ddo";
	
	/** The Constant OFFICE_NAME_DDO. */
	public static final String OFFICE_NAME_DDO = "OfficeName_Ddo";
	
	/** The Constant OFFICE_ADD_DDO. */
	public static final String OFFICE_ADD_DDO = "OfficeAdd_Ddo";
	
	/** The Constant SELECTOR_DDO. */
	public static final String SELECTOR_DDO = "selector_Ddo";
	
	/** The Constant COLOUMN_DDO. */
	public static final String COLOUMN_DDO = "coloumn_Ddo";
	
	/** The Constant BLANK1_NO_BORDER_DDO. */
	public static final String BLANK1_NO_BORDER_DDO = "blank1_NoBorder_Ddo";
	
	/** The Constant BLANK2_NO_BORDER_DDO. */
	public static final String BLANK2_NO_BORDER_DDO = "blank2_NoBorder_Ddo";
	
	/** The Constant XLSX_EXTENSION. */
	public static final String XLSX_EXTENSION = ".xlsx";
	
	/** The Constant NO_BORDER. */
	public static final String NO_BORDER = "_NoBorder";
	
	/** The Constant USER_NAME_NO_BORDER. */
	public static final String USER_NAME_NO_BORDER = "userName_NoBorder";
	
	/** The Constant CENTER. */
	public static final HorizontalAlignment CENTER = HorizontalAlignment.CENTER;
	
	/** The Constant AD_DEPT. */
	public static final String AD_DEPT = "AD Department";

	/** The Constant FD_DEPT. */
	public static final String FD_DEPT = "FD Department";
	
	/** The Constant BORDER_THIN. */
	public static final BorderStyle BORDER_THIN  = BorderStyle.THIN;
	
	/** The Constant SOLID_FOREGROUND. */
	public static final FillPatternType SOLID_FOREGROUND = FillPatternType.SOLID_FOREGROUND ;
	
	/** The Constant EMPTY_STRING. */
	public static final String EMPTY_STRING = "";
	
	/** The Constant HIDDEN. */
	public static final String HIDDEN = "HIDDEN";
	
	/** The Constant REPORT_NAME. */
	public static final String REPORT_NAME = "REPORT_NAME";
	
	/** The Constant OFFICE_DISP_NAME. */
	public static final String OFFICE_DISP_NAME = "OFFICE_DISP_NAME";
	
	/** The Constant HEADER. */
	public static final String HEADER = "HEADER";
	
	/** The Constant FOOTER. */
	public static final String FOOTER = "FOOTER";
	
	/** The Constant DISTRICT_NAME. */
	public static final String DISTRICT_NAME = "DISTRICT_NAME";
	
	/** The Constant TALUKA_NAME. */
	public static final String TALUKA_NAME = "TALUKA_NAME";
	
	/** The Constant GENERATED_BY. */
	public static final String GENERATED_BY = "GENERATED_BY";
	
	/** The Constant GENERATED_DATE_TIME. */
	public static final String 	GENERATED_DATE_TIME = "GENERATED_DATE_TIME";
	
	/** The Constant INT_ZERO. */
	public static final int INT_ZERO = 0;
	
	/** The Constant INT_ONE. */
	public static final int INT_ONE = 1;
	
	/** The Constant DROPDOWN_SQL. */
	public static final String DROPDOWN_SQL = "DROPDOWN_SQL";
	
	/** The Constant INT_TWO. */
	public static final int INT_TWO = 2;
	
	/** The Constant INT_THREE. */
	public static final int INT_THREE = 3;
	
	/** The Constant INT_FOUR. */
	public static final int INT_FOUR = 4;
	
	/** The Constant FY. */
	public static final String FY = "FY";
	
	/** The Constant TRN_S. */
	public static final String TRN_S = "TRN_S";
	
	/** The Constant WRK_S. */
	public static final String WRK_S = "WRK_S";
}
