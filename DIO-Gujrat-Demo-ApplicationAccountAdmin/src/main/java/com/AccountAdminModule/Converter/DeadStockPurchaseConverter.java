package com.AccountAdminModule.Converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.AccountAdminMdule.dto.AcDeadStockDisposalItems;
import com.AccountAdminMdule.dto.AcDeadStockPurchseItems;
import com.AccountAdminMdule.entity.TdoiAcDeadStockRegister;

public class DeadStockPurchaseConverter   {
	 
	
	private ModelMapper mapper;

	@Autowired
	public DeadStockPurchaseConverter(ModelMapper mapper) {
		this.mapper = mapper;
	}

	public TdoiAcDeadStockRegister toEntity(AcDeadStockPurchseItems deadStockPurchseItems) {
		TdoiAcDeadStockRegister tdoiAcDeadStockRegister = mapper.map(deadStockPurchseItems, TdoiAcDeadStockRegister.class);
		return tdoiAcDeadStockRegister;
	}

	public AcDeadStockPurchseItems toDTO1(TdoiAcDeadStockRegister tdoiAcDeadStockRegister) {
		AcDeadStockPurchseItems deadStockPurchseItems = mapper.map(tdoiAcDeadStockRegister, AcDeadStockPurchseItems.class);
		return deadStockPurchseItems;
	}
	public TdoiAcDeadStockRegister toEntity(AcDeadStockDisposalItems deadStockDisposalItems) {
		TdoiAcDeadStockRegister tdoiAcDeadStockRegister = mapper.map(deadStockDisposalItems, TdoiAcDeadStockRegister.class);
		return tdoiAcDeadStockRegister;
	}

	public AcDeadStockDisposalItems toDTO(TdoiAcDeadStockRegister tdoiAcDeadStockRegister) {
		AcDeadStockDisposalItems deadStockDisposalItems = mapper.map(tdoiAcDeadStockRegister, AcDeadStockDisposalItems.class);
		return deadStockDisposalItems;
	}

}
