package com.px.service;

import org.springframework.transaction.annotation.Transactional;

import com.px.dao.AnalysisDao;
@Transactional
public class AnalysisService {

	private AnalysisDao analysisDao;

	public void setAnalysisDao(AnalysisDao analysisDao) {
		this.analysisDao = analysisDao;
	}
}
