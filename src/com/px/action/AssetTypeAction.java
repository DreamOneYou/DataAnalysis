package com.px.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.px.entity.AssetType;
import com.px.service.AssetTypeService;

@SuppressWarnings("all")
public class AssetTypeAction extends ActionSupport implements ModelDriven<AssetType> {

	
	private AssetType assetType = new AssetType();
	public AssetType getModel() {
		return assetType;
	}
	
	private AssetTypeService assetTypeService;
	public void setAssetTypeService(AssetTypeService assetTypeService) {
		this.assetTypeService = assetTypeService;
	}
	public String oneType(){
		List<AssetType> onelist = assetTypeService.findOneType();
		ServletActionContext.getRequest().setAttribute("onelist", onelist);
		return "oneType";
	}
}
