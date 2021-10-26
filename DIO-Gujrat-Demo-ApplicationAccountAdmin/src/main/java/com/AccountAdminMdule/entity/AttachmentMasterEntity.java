/*
 * package com.AccountAdminMdule.entity;
 * 
 * import java.io.Serializable; import java.util.StringJoiner;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.FetchType; import javax.persistence.GeneratedValue; import
 * javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.ManyToOne;
 * 
 * import com.google.common.base.Objects; import
 * com.ibm.db2.cmx.annotation.JoinColumn; import
 * com.ibm.db2.cmx.annotation.Table;
 * 
 * @Entity
 * 
 * @Table(name = "LK_MENU_ATT_TYP" , schema = "MASTER_V1" ) public class
 * AttachmentMasterEntity implements Serializable {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY)
 * 
 * @Column(name = "LK_MENU_ATT_TYP_ID") private Long lkMenuAttTypId;
 * 
 * @Column(name = "MENU_ID") private Long menuId;
 * 
 * /** The attahcment type id.
 * 
 * @ManyToOne(fetch = FetchType.LAZY)
 * 
 * @JoinColumn(name = "ATT_TYPE_ID") private DeadStockAttachmententity
 * attTypeId;
 * 
 * @Column(name = "ATT_CTEGRY_ID") private Long attCtegryId;
 * 
 * @Column(name = "FORMAT") private String format;
 * 
 * @Column(name = "FILE_SIZE") private Integer fileSize;
 * 
 * @Column(name = "UPLOAD_DIR_PATH") private String uploadDirectoryPath;
 * 
 * @Column(name = "ACTIVE_STATUS") private int activeStatus = 1;
 * 
 * 
 *//**
	 * DOIAttachmentMasterEntity Constructor
	 *//*
		 * public AttachmentMasterEntity() { super(); }
		 * 
		 * 
		 * public AttachmentMasterEntity(Long lkMenuAttTypId, Long menuId, Long
		 * attCtegryId, String format, Integer fileSize, String uploadDirectoryPath) {
		 * super(); this.lkMenuAttTypId = lkMenuAttTypId; this.menuId = menuId;
		 * this.attCtegryId = attCtegryId; this.format = format; this.fileSize =
		 * fileSize; this.uploadDirectoryPath = uploadDirectoryPath; }
		 * 
		 * public Long getLkMenuAttTypId() { return lkMenuAttTypId; }
		 * 
		 * public void setLkMenuAttTypId(Long lkMenuAttTypId) { this.lkMenuAttTypId =
		 * lkMenuAttTypId; }
		 * 
		 * public Long getMenuId() { return menuId; }
		 * 
		 * public void setMenuId(Long menuId) { this.menuId = menuId; }
		 * 
		 * public DeadStockAttachmententity getAttTypeId() { return attTypeId; }
		 * 
		 * public void setAttTypeId(DeadStockAttachmententity attTypeId) {
		 * this.attTypeId = attTypeId; }
		 * 
		 * public Long getAttCtegryId() { return attCtegryId; }
		 * 
		 * public void setAttCtegryId(Long attCtegryId) { this.attCtegryId =
		 * attCtegryId; }
		 * 
		 * public String getFormat() { return format; }
		 * 
		 * public void setFormat(String format) { this.format = format; }
		 * 
		 * public Integer getFileSize() { return fileSize; }
		 * 
		 * public void setFileSize(Integer fileSize) { this.fileSize = fileSize; }
		 * 
		 * public String getUploadDirectoryPath() { return uploadDirectoryPath; }
		 * 
		 * public void setUploadDirectoryPath(String uploadDirectoryPath) {
		 * this.uploadDirectoryPath = uploadDirectoryPath; }
		 * 
		 * public int getActiveStatus() { return activeStatus; }
		 * 
		 * public void setActiveStatus(int activeStatus) { this.activeStatus =
		 * activeStatus; }
		 * 
		 * 
		 * @Override public boolean equals(Object o) { if (this == o) return true; if (o
		 * == null || getClass() != o.getClass()) return false; AttachmentMasterEntity
		 * that = (AttachmentMasterEntity) o; return activeStatus == that.activeStatus
		 * && Objects.equal(lkMenuAttTypId, that.lkMenuAttTypId) &&
		 * Objects.equal(menuId, that.menuId) && Objects.equal(attTypeId,
		 * that.attTypeId) && Objects.equal(attCtegryId, that.attCtegryId) &&
		 * Objects.equal(format, that.format) && Objects.equal(fileSize, that.fileSize)
		 * && Objects.equal(uploadDirectoryPath, that.uploadDirectoryPath); }
		 * 
		 * @Override public int hashCode() { return Objects.hash(lkMenuAttTypId, menuId,
		 * attTypeId, attCtegryId, format, fileSize, uploadDirectoryPath, activeStatus);
		 * }
		 * 
		 * 
		 * 
		 * 
		 * @Override public String toString() { return new StringJoiner(", ",
		 * AttachmentMasterEntity.class.getSimpleName() + "[", "]")
		 * .add("lkMenuAttTypId=" + lkMenuAttTypId) .add("menuId=" + menuId)
		 * .add("attTypeId=" + attTypeId) .add("attCtegryId=" + attCtegryId)
		 * .add("format='" + format + "'") .add("fileSize=" + fileSize)
		 * .add("uploadDirectoryPath='" + uploadDirectoryPath + "'")
		 * .add("activeStatus=" + activeStatus) .toString(); }
		 * 
		 * 
		 * @Override public int hashCode() { return java.util.Objects.hash(activeStatus,
		 * attCtegryId, attTypeId, fileSize, format, lkMenuAttTypId, menuId,
		 * uploadDirectoryPath); }
		 * 
		 * 
		 * @Override public boolean equals(Object obj) { if (this == obj) return true;
		 * if (obj == null) return false; if (getClass() != obj.getClass()) return
		 * false; AttachmentMasterEntity other = (AttachmentMasterEntity) obj; return
		 * activeStatus == other.activeStatus && java.util.Objects.equals(attCtegryId,
		 * other.attCtegryId) && java.util.Objects.equals(attTypeId, other.attTypeId) &&
		 * java.util.Objects.equals(fileSize, other.fileSize) &&
		 * java.util.Objects.equals(format, other.format) &&
		 * java.util.Objects.equals(lkMenuAttTypId, other.lkMenuAttTypId) &&
		 * java.util.Objects.equals(menuId, other.menuId) &&
		 * java.util.Objects.equals(uploadDirectoryPath, other.uploadDirectoryPath); } }
		 */