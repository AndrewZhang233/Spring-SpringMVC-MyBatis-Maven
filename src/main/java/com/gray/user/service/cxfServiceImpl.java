package com.gray.user.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public class cxfServiceImpl implements cxfService {

	public String hello(String str) {
		return "{'companyId':"+str+",'targetId':'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx','targetEntity':'client','actionType':'update'}";
	}

}
