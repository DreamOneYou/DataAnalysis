package com.px.action;

import com.opensymphony.xwork2.ActionSupport;
import com.px.service.SystemService;
@SuppressWarnings("all")
public class SystemAction extends ActionSupport {

	
	private SystemService systemService;

	public void setSystemService(SystemService systemService) {
		this.systemService = systemService;
	}
	
	public String toSystem(){
		return "toSystem";
	}
	public String information(){
		return "information";
	}
}
