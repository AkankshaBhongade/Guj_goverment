/*
 * package com.AccountAdminModule.Converter;
 * 
 * import java.util.List; import java.util.stream.Collectors;
 * 
 * import org.springframework.beans.BeanUtils; import
 * org.springframework.stereotype.Component;
 * 
 * import com.AccountAdminMdule.dto.DeadStockAttachmentDto; import
 * com.AccountAdminMdule.entity.AttachmentMasterEntity; import
 * com.AccountAdminMdule.entity.DeadStockAttachmententity;
 * 
 * 
 *//**
	 * The Class BasePVUAttachmentConverter.
	 *
	 * @param <E> the element type
	 * @param <D> the generic type
	 *//*
		 * @Component public abstract class DeadStockAttachmentConverter implements
		 * BaseConverter<AttachmentMasterEntity, DeadStockAttachmentDto>{
		 * 
		 * @Override public AttachmentMasterEntity toEntity(DeadStockAttachmentDto dto)
		 * { AttachmentMasterEntity entity = new AttachmentMasterEntity();
		 * BeanUtils.copyProperties(dto, entity); if (dto.getAttTypeId() != null) {
		 * DeadStockAttachmententity type = new DeadStockAttachmententity();
		 * type.setAttachmentId(dto.getAttTypeId().getId()); entity.setAttTypeId(type);
		 * } return entity; }
		 * 
		 * 
		 * }
		 */