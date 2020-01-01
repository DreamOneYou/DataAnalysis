package com.px.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.px.entity.AssetInFo;
import com.px.entity.AssetType;
import com.px.entity.Firm;
import com.px.entity.PageBean;
import com.px.entity.ThreeAssetType;
import com.px.entity.TwoAssetType;
import com.px.service.AssetInFoService;
import com.px.service.AssetTypeService;
import com.px.service.FirmService;
import com.px.service.ThreeAssetTypeService;
import com.px.service.TwoAssetTypeService;

@SuppressWarnings("all")
public class AssetInFoAction extends ActionSupport implements ModelDriven<AssetInFo> {
	
	private AssetTypeService assetTypeService;
	public void setAssetTypeService(AssetTypeService assetTypeService) {
		this.assetTypeService = assetTypeService;
	}
	
	
	private TwoAssetTypeService twoAssetTypeService;
	public void setTwoAssetTypeService(TwoAssetTypeService twoAssetTypeService) {
		this.twoAssetTypeService = twoAssetTypeService;
	}
	
	private ThreeAssetTypeService threeAssetTypeService;
	public void setThreeAssetTypeService(ThreeAssetTypeService threeAssetTypeService) {
		this.threeAssetTypeService = threeAssetTypeService;
	}
	
	
	private AssetInFo assetinfo = new AssetInFo();
	public AssetInFo getModel() {
		return assetinfo;
	}
	private AssetInFoService assetinfoservice;
	private FirmService firmService;
	
	public FirmService getFirmService() {
		return firmService;
	}

	public void setFirmService(FirmService firmService) {
		this.firmService = firmService;
	}

	public void setAssetinfoservice(AssetInFoService assetinfoservice) {
		this.assetinfoservice = assetinfoservice;
	}

	public String AssetInfo(){
		return "AssetInfo";
	}
	
	//商家列表+分页
		private Integer currentPage;
		public Integer getCurrentPage() {
			return currentPage;
		}
		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}
		public String listPage(){
			PageBean assetpagebean = assetinfoservice.listPage(currentPage);
			ServletActionContext.getRequest().setAttribute("assetpagebean", assetpagebean);
			return "listPage";
		}
		
		private List<AssetInFo> list;
		public List<AssetInFo> getList() {
			return list;
		}
		public String list(){
			list = assetinfoservice.finAll();
			return "list";
		}
		
		//到添加器材的页面的方法
		public String toAddPage(){
			List<AssetType> onelist = assetTypeService.findOneType();
			ServletActionContext.getRequest().setAttribute("onelist", onelist);
			
			List<TwoAssetType> twolist = twoAssetTypeService.findAll();
			ServletActionContext.getRequest().setAttribute("twolist", twolist);
			
			List<ThreeAssetType> threelist = threeAssetTypeService.threefindAll();
			ServletActionContext.getRequest().setAttribute("threelist", threelist);
			//查询所有厂商
			List<Firm> firmlist = firmService.finAll();
			ServletActionContext.getRequest().setAttribute("firmlist", firmlist);
			return "toAddPage";
		}
		//添加器材
		public String toListPage(){
			assetinfoservice.addAsset(assetinfo);
			return "toListPage";
		}
}
