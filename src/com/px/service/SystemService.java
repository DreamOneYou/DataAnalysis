package com.px.service;

import org.springframework.transaction.annotation.Transactional;

import com.px.dao.SystemDao;
@SuppressWarnings("all")
@Transactional
public class SystemService {

	
	private SystemDao systemDao;

	public void setSystemDao(SystemDao systemDao) {
		this.systemDao = systemDao;
	}
	
}
