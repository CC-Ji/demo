package com.ccji.demo.cfx;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface WelcomeWS {
	@WebMethod
	@WebResult
	public String welcomeMessage(@WebParam String message);

}
