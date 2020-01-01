package com.px.action;

import com.opensymphony.xwork2.ActionSupport;
import com.px.service.AnalysisService;

public class AnalysisAction extends ActionSupport {

	private AnalysisService analysisService;

	public void setAnalysisService(AnalysisService analysisService) {
		this.analysisService = analysisService;
	}

	public String Analysis(){
		return "Analysis";
	}
}
