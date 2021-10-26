package com.AccountAdminModule.Converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.AccountAdminMdule.dto.AcDeadStockDisposalItems;
//import com.AccountAdminMdule.dto.AcDeadStockPurchseItems;
import com.AccountAdminMdule.entity.TdoiAcDeadStockRegister;

public class DeadStockDisposalConverter implements BaseConverter<TdoiAcDeadStockRegister, AcDeadStockDisposalItems>  {
	 
	
	private ModelMapper mapper;

	@Autowired
	public DeadStockDisposalConverter(ModelMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public TdoiAcDeadStockRegister toEntity(AcDeadStockDisposalItems deadStockDisposalItems) {
		TdoiAcDeadStockRegister tdoiAcDeadStockRegister = mapper.map(deadStockDisposalItems, TdoiAcDeadStockRegister.class);
		return tdoiAcDeadStockRegister;
	}

	@Override
	public AcDeadStockDisposalItems toDTO(TdoiAcDeadStockRegister tdoiAcDeadStockRegister) {
		AcDeadStockDisposalItems deadStockDisposalItems = mapper.map(tdoiAcDeadStockRegister, AcDeadStockDisposalItems.class);
		return deadStockDisposalItems;
	}

}


