package com.px.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.px.entity.ThreeAssetType;
import com.px.service.ThreeAssetTypeService;

@SuppressWarnings("all")
public class ThreeAssetTypeAction extends ActionSupport implements
		ModelDriven<ThreeAssetType> {

	private ThreeAssetType threeAssetType = new ThreeAssetType();
	public ThreeAssetType getModel() {
		return threeAssetType;
	}
	
	private ThreeAssetTypeService threeAssetTypeService;
	public void setThreeAssetTypeService(ThreeAssetTypeService threeAssetTypeService) {
		this.threeAssetTypeService = threeAssetTypeService;
	}

	public String threefindAll(){
		List<ThreeAssetType> threelist = threeAssetTypeService.threefindAll();
		ServletActionContext.getRequest().setAttribute("threelist", threelist);
		return "threefindAll";
	}
	public void getResult(){
		List<ThreeAssetType> threeChangeList = threeAssetTypeService.getResult();
		ServletActionContext.getRequest().setAttribute("threeChangeList", threeChangeList);
	}
}
