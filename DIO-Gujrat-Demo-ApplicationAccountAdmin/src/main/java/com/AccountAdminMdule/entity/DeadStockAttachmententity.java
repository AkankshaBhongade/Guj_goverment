
/*
 * package com.AccountAdminMdule.entity;
 * 
 * import java.time.LocalDateTime;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.FetchType; import javax.persistence.ForeignKey; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.ManyToOne; import
 * javax.persistence.MappedSuperclass; import javax.persistence.Table;
 * 
 * import com.AccountAdminMdule.entity.DOILuLookUpEntity; import
 * com.AccountAdminMdule.entity.DOILuLookUpInfoEntity; import
 * com.ibm.db2.cmx.annotation.JoinColumn; import com.sun.istack.NotNull;
 * 
 * @Entity
 * 
 * @MappedSuperclass
 * 
 * @Table(name = "TDOI_AC_DEAD_STOCK_REGISTER_ATTACH",schema = "DOI") public
 * class DeadStockAttachmententity {
 * 
 * private static final String
 * TDOI_AC_DEAD_STOCK_REGISTER_ATTACH_LU_LOOKUP_INFO_FK_2 = null;
 * 
 * @Id
 * 
 * @NotNull
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY)
 * 
 * @Column(name = "TRN_ATTACH_ID") private long trn_attach_id;
 * 
 * @NotNull
 * 
 * @Column(name = "TRN_ID") private long trn_id;
 * 
 * @Column(name = "ATTACHMENT_ID") private long attachment_id;
 * 
 * @Column(name = "FILE_NAME") private String file_name;
 * 
 * @Column(name = "UPLOADED_FILE_PATH") private String uploaded_file_path;
 * 
 * @Column(name = "UPLOADED_FILE_NAME") private String uploaded_file_name;
 * 
 * @Column(name = "UPLOADED_FILE_SIZE") private double uploaded_file_size;
 * 
 * @Column(name = "UPLOADED_BY") private long uploades_by;
 * 
 * @Column(name = "DOCUMENT_ID") private String document_id;
 * 
 * @Column(name = "CATEGORY") private long category;
 * 
 * @Column(name = "WF_ID") private long wf_id;
 * 
 * @Column(name = "WF_ROLE_ID") private long wf_role_id;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "ACTION_ID") private DOILuLookUpEntity action_id;
 * 
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "STATUS_ID") private DOILuLookUpEntity status_id;
 * 
 * 
 * @Column(name = "CREATED_BY") private long created_by;
 * 
 * @Column(name = "CREATED_DATE") private LocalDateTime
 * created_date=LocalDateTime.now();
 * 
 * @Column(name = "CREATED_BY_POST") private long created_by_post;
 * 
 * @Column(name = "UPDATED_BY") private long updated_by;
 * 
 * @Column(name = "UPDATED_DATE") private LocalDateTime
 * updated_date=LocalDateTime.now();
 * 
 * @Column(name = "UPDATED_BY_POST") private long updated_by_post;
 * 
 * @Column(name = "ACTIVE_STATUS") private short active_status;
 * 
 * public DeadStockAttachmententity() { super(); // TODO Auto-generated
 * constructor stub }
 * 
 * public DeadStockAttachmententity(long trn_attach_id, long trn_id, long
 * attachment_id, String file_name, String uploaded_file_path, String
 * uploaded_file_name, double uploaded_file_size, long uploades_by, String
 * document_id, long category, long wf_id, long wf_role_id, DOILuLookUpEntity
 * action_id, DOILuLookUpEntity status_id, long created_by, LocalDateTime
 * created_date, long created_by_post, long updated_by, LocalDateTime
 * updated_date, long updated_by_post, short active_status) { super();
 * this.trn_attach_id = trn_attach_id; this.trn_id = trn_id; this.attachment_id
 * = attachment_id; this.file_name = file_name; this.uploaded_file_path =
 * uploaded_file_path; this.uploaded_file_name = uploaded_file_name;
 * this.uploaded_file_size = uploaded_file_size; this.uploades_by = uploades_by;
 * this.document_id = document_id; this.category = category; this.wf_id = wf_id;
 * this.wf_role_id = wf_role_id; this.action_id = action_id; this.status_id =
 * status_id; this.created_by = created_by; this.created_date = created_date;
 * this.created_by_post = created_by_post; this.updated_by = updated_by;
 * this.updated_date = updated_date; this.updated_by_post = updated_by_post;
 * this.active_status = active_status; }
 * 
 * @Override public String toString() { return
 * "DeadStockAttachmententity [trn_attach_id=" + trn_attach_id + ", trn_id=" +
 * trn_id + ", attachment_id=" + attachment_id + ", file_name=" + file_name +
 * ", uploaded_file_path=" + uploaded_file_path + ", uploaded_file_name=" +
 * uploaded_file_name + ", uploaded_file_size=" + uploaded_file_size +
 * ", uploades_by=" + uploades_by + ", document_id=" + document_id +
 * ", category=" + category + ", wf_id=" + wf_id + ", wf_role_id=" + wf_role_id
 * + ", action_id=" + action_id + ", status_id=" + status_id + ", created_by=" +
 * created_by + ", created_date=" + created_date + ", created_by_post=" +
 * created_by_post + ", updated_by=" + updated_by + ", updated_date=" +
 * updated_date + ", updated_by_post=" + updated_by_post + ", active_status=" +
 * active_status + "]"; }
 * 
 * public long getTrn_attach_id() { return trn_attach_id; }
 * 
 * public void setTrn_attach_id(long trn_attach_id) { this.trn_attach_id =
 * trn_attach_id; }
 * 
 * public long getTrn_id() { return trn_id; }
 * 
 * public void setTrn_id(long trn_id) { this.trn_id = trn_id; }
 * 
 * public long getAttachment_id() { return attachment_id; }
 * 
 * public void setAttachment_id(long attachment_id) { this.attachment_id =
 * attachment_id; }
 * 
 * public String getFile_name() { return file_name; }
 * 
 * public void setFile_name(String file_name) { this.file_name = file_name; }
 * 
 * public String getUploaded_file_path() { return uploaded_file_path; }
 * 
 * public void setUploaded_file_path(String uploaded_file_path) {
 * this.uploaded_file_path = uploaded_file_path; }
 * 
 * public String getUploaded_file_name() { return uploaded_file_name; }
 * 
 * public void setUploaded_file_name(String uploaded_file_name) {
 * this.uploaded_file_name = uploaded_file_name; }
 * 
 * public double getUploaded_file_size() { return uploaded_file_size; }
 * 
 * public void setUploaded_file_size(double uploaded_file_size) {
 * this.uploaded_file_size = uploaded_file_size; }
 * 
 * public long getUploades_by() { return uploades_by; }
 * 
 * public void setUploades_by(long uploades_by) { this.uploades_by =
 * uploades_by; }
 * 
 * public String getDocument_id() { return document_id; }
 * 
 * public void setDocument_id(String document_id) { this.document_id =
 * document_id; }
 * 
 * public long getCategory() { return category; }
 * 
 * public void setCategory(long category) { this.category = category; }
 * 
 * public long getWf_id() { return wf_id; }
 * 
 * public void setWf_id(long wf_id) { this.wf_id = wf_id; }
 * 
 * public long getWf_role_id() { return wf_role_id; }
 * 
 * public void setWf_role_id(long wf_role_id) { this.wf_role_id = wf_role_id; }
 * 
 * public DOILuLookUpEntity getAction_id() { return action_id; }
 * 
 * public void setAction_id(DOILuLookUpEntity action_id) { this.action_id =
 * action_id; }
 * 
 * public DOILuLookUpEntity getStatus_id() { return status_id; }
 * 
 * public void setStatus_id(DOILuLookUpEntity status_id) { this.status_id =
 * status_id; }
 * 
 * public long getCreated_by() { return created_by; }
 * 
 * public void setCreated_by(long created_by) { this.created_by = created_by; }
 * 
 * public LocalDateTime getCreated_date() { return created_date; }
 * 
 * public void setCreated_date(LocalDateTime created_date) { this.created_date =
 * created_date; }
 * 
 * public long getCreated_by_post() { return created_by_post; }
 * 
 * public void setCreated_by_post(long created_by_post) { this.created_by_post =
 * created_by_post; }
 * 
 * public long getUpdated_by() { return updated_by; }
 * 
 * public void setUpdated_by(long updated_by) { this.updated_by = updated_by; }
 * 
 * public LocalDateTime getUpdated_date() { return updated_date; }
 * 
 * public void setUpdated_date(LocalDateTime updated_date) { this.updated_date =
 * updated_date; }
 * 
 * public long getUpdated_by_post() { return updated_by_post; }
 * 
 * public void setUpdated_by_post(long updated_by_post) { this.updated_by_post =
 * updated_by_post; }
 * 
 * public short getActive_status() { return active_status; }
 * 
 * public void setActive_status(short active_status) { this.active_status =
 * active_status; }
 * 
 * public static String getTdoiAcDeadStockRegisterAttachLuLookupInfoFk2() {
 * return TDOI_AC_DEAD_STOCK_REGISTER_ATTACH_LU_LOOKUP_INFO_FK_2; }
 * 
 * public Object getEdpLkPoOffUserId() { // TODO Auto-generated method stub
 * return null; }
 * 
 * 
 * }
 */