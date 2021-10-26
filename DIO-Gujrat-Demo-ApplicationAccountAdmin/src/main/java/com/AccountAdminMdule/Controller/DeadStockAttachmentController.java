
/*
 * package com.AccountAdminMdule.Controller;
 * 
 * import java.text.DateFormat; import java.text.SimpleDateFormat; import
 * java.util.List;
 * 
 * import javax.xml.ws.Response;
 * 
 * import org.hibernate.annotations.common.util.impl.LoggerFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.dao.DataIntegrityViolationException; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.CrossOrigin; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.AccountAdminMdule.dto.DeadStockAttachmentDto; import
 * com.AccountAdminMdule.dto.IdDto; import
 * com.AccountAdminMdule.entity.DeadStockAttachmententity; import
 * com.AccountAdminMdule.entity.JsonObjectFormat; import
 * com.AccountAdminMdule.entity.TdoiAcBtr_5; import
 * com.AccountAdminMdule.service.AcBtr_5_service; import
 * com.AccountAdminMdule.service.DeadStockAttachmentService; import
 * com.fasterxml.jackson.core.JsonProcessingException; import
 * com.fasterxml.jackson.databind.ObjectMapper; import
 * com.fasterxml.jackson.databind.SerializationFeature; import
 * com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
 * 
 * import ch.qos.logback.classic.Logger;
 * 
 * //import antlr.collections.List;
 * 
 * @RestController
 * 
 * @RequestMapping("/attachment")
 * 
 * @CrossOrigin(origins = "*", allowedHeaders = "*") public abstract class
 * DeadStockAttachmentController <E extends DeadStockAttachmententity, D extends
 * DeadStockAttachmentDto> {
 * 
 * //Logger logger =
 * LoggerFactory.getLogger(DeadStockAttachmentController.class);
 * 
 * @Autowired private DeadStockAttachmentService service;
 * 
 * 
 * @PostMapping("/getbyid") public ResponseEntity<ApiResponse>
 * getDeadStockAttachment(@RequestBody final IdDto id) {
 * List<DeadStockAttachmententity> entity =
 * service.getDeadStockAttachmentByMenuId(id.getId()); return
 * ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.ATTACHMENT_MSG_FETCH,
 * this.converter.toDTO(entity)); }
 * 
 * 
 * }
 */