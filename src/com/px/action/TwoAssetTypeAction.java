package com.px.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.px.entity.TwoAssetType;
import com.px.service.TwoAssetTypeService;

@SuppressWarnings("all")
public class TwoAssetTypeAction extends ActionSupport implements ModelDriven<TwoAssetType> {

	private TwoAssetType twoAssetType = new TwoAssetType();
	public TwoAssetType getModel() {
		return twoAssetType;
	}
	
	private TwoAssetTypeService twoAssetTypeService;
	public void setTwoAssetTypeService(TwoAssetTypeService twoAssetTypeService) {
		this.twoAssetTypeService = twoAssetTypeService;
	}
	
	//查询二级类别表
	public String findAll(){
		List<TwoAssetType> twolist = twoAssetTypeService.findAll();
		ServletActionContext.getRequest().setAttribute("twolist", twolist);
		return "findAll";
	}
}
