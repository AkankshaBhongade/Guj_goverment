package gov.ifms.doi.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import gov.ifms.common.util.Constant;

/**
 * The Class DOILuLookUpInfoEntity.
 */
@Entity
@Table(name = "LU_LOOKUP_INFO", schema = Constant.DOI_MASTER_SCHEMA)
public class DOILuLookUpInfoEntity extends BaseEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The look up info id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LOOKUP_INFO_ID")
	private long lookUpInfoId;

	/** The look up info name. */
	@Column(name = "LOOKUP_INFO_NAME")
	private String lookUpInfoName;

	/** The look up info name guj. */
	@Column(name = "LOOKUP_INFO_NAME_GUJ")
	private String lookUpInfoNameGuj;

	/** The look up info description. */
	@Column(name = "LOOKUP_INFO_DESCRIPTION")
	private String lookUpInfoDescription;

	/** The look up info description guj. */
	@Column(name = "LOOKUP_INFO_DESCRIPTION_GUJ")
	private String lookUpInfoDescriptionGuj;

	/** The DOI lu look up entity. */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "PARENT_LOOKUP_ID", referencedColumnName = "LOOKUP_ID")
	private DOILuLookUpEntity parentLookupId;

	/** The look up info value. */
	@Column(name = "LOOKUP_INFO_VALUE")
	private Integer lookUpInfoValue;

	/** The order id. */
	@Column(name = "ORDER_ID")
	private short orderId;

	/**
	 * Instantiates a new DOI lu look up info entity.
	 *
	 * @param lookUpInfoId the look up info id
	 */
	public DOILuLookUpInfoEntity(long lookUpInfoId) {
		super();
		this.lookUpInfoId = lookUpInfoId;
	}

	public DOILuLookUpInfoEntity(String lookUpInfoName) {
		super();
		this.lookUpInfoName = lookUpInfoName;
	}

	/**
	 * Gets the look up info id.
	 *
	 * @return the lookUpInfoId
	 */
	public long getLookUpInfoId() {
		return lookUpInfoId;
	}

	/**
	 * Sets the look up info id.
	 *
	 * @param lookUpInfoId the lookUpInfoId to set
	 */
	public void setLookUpInfoId(long lookUpInfoId) {
		this.lookUpInfoId = lookUpInfoId;
	}

	/**
	 * Gets the look up info name.
	 *
	 * @return the lookUpInfoName
	 */
	public String getLookUpInfoName() {
		return lookUpInfoName;
	}

	/**
	 * Sets the look up info name.
	 *
	 * @param lookUpInfoName the lookUpInfoName to set
	 */
	public void setLookUpInfoName(String lookUpInfoName) {
		this.lookUpInfoName = lookUpInfoName;
	}

	/**
	 * Gets the look up info name guj.
	 *
	 * @return the lookUpInfoNameGuj
	 */
	public String getLookUpInfoNameGuj() {
		return lookUpInfoNameGuj;
	}

	/**
	 * Sets the look up info name guj.
	 *
	 * @param lookUpInfoNameGuj the lookUpInfoNameGuj to set
	 */
	public void setLookUpInfoNameGuj(String lookUpInfoNameGuj) {
		this.lookUpInfoNameGuj = lookUpInfoNameGuj;
	}

	/**
	 * Gets the look up info description.
	 *
	 * @return the lookUpInfoDescription
	 */
	public String getLookUpInfoDescription() {
		return lookUpInfoDescription;
	}

	/**
	 * Sets the look up info description.
	 *
	 * @param lookUpInfoDescription the lookUpInfoDescription to set
	 */
	public void setLookUpInfoDescription(String lookUpInfoDescription) {
		this.lookUpInfoDescription = lookUpInfoDescription;
	}

	/**
	 * Gets the look up info description guj.
	 *
	 * @return the lookUpInfoDescriptionGuj
	 */
	public String getLookUpInfoDescriptionGuj() {
		return lookUpInfoDescriptionGuj;
	}

	/**
	 * Sets the look up info description guj.
	 *
	 * @param lookUpInfoDescriptionGuj the lookUpInfoDescriptionGuj to set
	 */
	public void setLookUpInfoDescriptionGuj(String lookUpInfoDescriptionGuj) {
		this.lookUpInfoDescriptionGuj = lookUpInfoDescriptionGuj;
	}

	/**
	 * Gets the DOI lu look up entity.
	 *
	 * @return the DOILuLookUpEntity
	 */
	public DOILuLookUpEntity getDOILuLookUpEntity() {
		return parentLookupId;
	}

	/**
	 * Sets the DOI lu look up entity.
	 *
	 * @param DOILuLookUpEntity the DOILuLookUpEntity to set
	 */
	public void setDOILuLookUpEntity(DOILuLookUpEntity DOILuLookUpEntity) {
		this.parentLookupId = DOILuLookUpEntity;
	}

	/**
	 * Gets the order id.
	 *
	 * @return the orderId
	 */
	public short getOrderId() {
		return orderId;
	}

	/**
	 * Sets the order id.
	 *
	 * @param orderId the orderId to set
	 */
	public void setOrderId(short orderId) {
		this.orderId = orderId;
	}

	/**
	 * Instantiates a new DOI lu look up info entity.
	 */
	public DOILuLookUpInfoEntity() {
		super();
	}

	/**
	 * Gets the look up info value.
	 *
	 * @return the look up info value
	 */
	public Integer getLookUpInfoValue() {
		return lookUpInfoValue;
	}

	/**
	 * Sets the look up info value.
	 *
	 * @param lookUpInfoValue the new look up info value
	 */
	public void setLookUpInfoValue(Integer lookUpInfoValue) {
		this.lookUpInfoValue = lookUpInfoValue;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(parentLookupId, lookUpInfoDescription, lookUpInfoDescriptionGuj, lookUpInfoId,
				lookUpInfoName, lookUpInfoNameGuj, lookUpInfoValue, orderId);
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof DOILuLookUpInfoEntity)) {
			return false;
		}
		DOILuLookUpInfoEntity other = (DOILuLookUpInfoEntity) obj;
		return Objects.equals(parentLookupId, other.parentLookupId)
				&& Objects.equals(lookUpInfoDescription, other.lookUpInfoDescription)
				&& Objects.equals(lookUpInfoDescriptionGuj, other.lookUpInfoDescriptionGuj)
				&& lookUpInfoId == other.lookUpInfoId && Objects.equals(lookUpInfoName, other.lookUpInfoName)
				&& Objects.equals(lookUpInfoNameGuj, other.lookUpInfoNameGuj)
				&& Objects.equals(lookUpInfoValue, other.lookUpInfoValue) && orderId == other.orderId;
	}

}
