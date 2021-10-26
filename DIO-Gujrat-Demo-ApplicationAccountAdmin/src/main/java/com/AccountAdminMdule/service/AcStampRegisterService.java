package com.AccountAdminMdule.service;

import java.util.List;
import java.util.Map;

//import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.AccountAdminMdule.entity.TdoiAcStampRegister;

//import com.accountadminmodule.entity.TdoiAcStampRegister;


public interface AcStampRegisterService {

	List<TdoiAcStampRegister> getAll();

	TdoiAcStampRegister getStampRegisterbyId( Long id);

	List<TdoiAcStampRegister> addAcStampRegister( List<TdoiAcStampRegister> tdoi_surveyor_dtl);

	TdoiAcStampRegister updateAcStampRegister(TdoiAcStampRegister tdoiAcStampRegister);

	TdoiAcStampRegister deleteAcStampRegisterById(Long id);

	//TdoiAcStampRegister updateTdoiAcStampRegister(TdoiAcStampRegister tdoiAcStampRegister);

	List<TdoiAcStampRegister> filterAcStampRegister(Map<String, String> acStampRegister);

	//TdoiAcStampRegister updatetAcStampRegister(TdoiAcStampRegister tdoiAcStampRegister);
	TdoiAcStampRegister updatetAcStampRegister(TdoiAcStampRegister tdoiAcStampRegister) ;
}
