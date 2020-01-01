package com.px.action;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.px.entity.Firm;
import com.px.entity.PageBean;
import com.px.service.FirmService;

@SuppressWarnings("serial")
public class FirmAction extends ActionSupport implements ModelDriven<Firm> {

	
	private Firm firm = new Firm();
	private FirmService firmService;
	
	private File upload;
	
	private String uploadFileName;
	
	public Firm getModel() {
		return firm;
	}

	public void setFirmService(FirmService firmService) {
		this.firmService = firmService;
	}
	//跳转到添加人员界面
	public String toAddPage(){
		return "toAddPage";
	}
	
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	//更新文件
	public String add(){
		if(upload!=null){
			File serviceFile = new File("F:\\img"+"/"+uploadFileName);
			try {
				FileUtils.copyFile(upload, serviceFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		firmService.add(firm);
		return "add";
	}

	//显示商品信息
	private Integer currentPage;
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public String listPage(){
		PageBean pagebean = firmService.listPage(currentPage);
		ServletActionContext.getRequest().setAttribute("pagebean", pagebean);
		return "listPage";
	}
	
	//删除设备
	public String delete(){
		int sid = firm.getSid();
		//获取id
		Firm firmOne = firmService.findOne(sid);
		
		if(firmOne!=null){
			//删除
			firmService.delete(firmOne);
		}
		return "delete";
	}
	//更新
	public String revise(){
		int sid = firm.getSid();
		Firm firmOne = firmService.findOne(sid);
		ServletActionContext.getRequest().setAttribute("firmOne", firmOne);
		return "revise";
	}
	public String update(){
		firmService.update(firm);
		return "update";
	}
	private List<Firm> list;
	public List<Firm> getList() {
		return list;
	}
	public String list(){
		list = firmService.finAll();
		return "list";
	}
	//条件查询
	public String  conditionQuery(){
		if(firm.getFirm_name()!=null && !"".equals(firm.getFirm_name())){
			List<Firm> list = firmService.conditionQuery(firm);
			ServletActionContext.getRequest().setAttribute("list", list);
		}else{
			list = firmService.finAll();
		}
		return "conditionQuery";
	}

}
