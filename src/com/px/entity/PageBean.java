package com.px.entity;

   
import java.util.List;
@SuppressWarnings("all")	
public class PageBean {    
	

	private List<Firm> list;  //要返回的某一页的记录列表    
	private Integer totalRow; //总记录数    
	private Integer totalPage;  //总页数    
	private Integer currentPage;  //当前页    
	private Integer begin; 		  //开始位置
	private List<AssetInFo> listAsset; 
	public List<AssetInFo> getListAsset() {
		return listAsset;
	}
	public void setListAsset(List<AssetInFo> listAsset) {
		this.listAsset = listAsset;
	}
	public List<Firm> getList() {
		return list;
	}
	public void setList(List<Firm> list) {
		this.list = list;
	}
	public Integer getTotalRow() {
		return totalRow;
	}
	public void setTotalRow(Integer totalRow) {
		this.totalRow = totalRow;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getBegin() {
		return begin;
	}
	public void setBegin(Integer begin) {
		this.begin = begin;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	private Integer pageSize;  //每页的记录数    
}    
