package com.acilia.ws.service.impl;

import com.acilia.ws.bean.BeanLogin;
import com.acilia.ws.service.IFaceLogin;

public class IFaceLoginImpl implements IFaceLogin{

	@Override
	public BeanLogin validaLogin(BeanLogin beanlogin) {
		BeanLogin beanresult = new BeanLogin();
		if (beanlogin.getUsuario().equals("Alicia") && beanlogin.getPassword().equals("Alicia")){
			beanresult.setMensaje("Usuario correcto");
			beanresult.setStatus(true);
		}
		else {
			beanresult.setMensaje("Usuario correcto");
			beanresult.setStatus(false);
		}
		return beanresult;
	}

}
