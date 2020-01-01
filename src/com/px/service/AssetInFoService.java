package com.px.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.px.dao.AssetInFoDao;
import com.px.entity.AssetInFo;
import com.px.entity.PageBean;
@Transactional
public class AssetInFoService {

	private AssetInFoDao assetInfoDao;

	public void setAssetInfoDao(AssetInFoDao assetInfoDao) {
		this.assetInfoDao = assetInfoDao;
	}
	//商家列表+分页
	//分页
		public PageBean listPage(int currentPage) {
			PageBean pagebean = new PageBean();
			int totalRow = assetInfoDao.findAll(); //总记录数
			pagebean.setTotalRow(totalRow);
			int pageSize = 6;					//每页显示记录数
			pagebean.setPageSize(pageSize);
			//计算总页数
			int totalPage=0;
			if(totalRow%pageSize==0){
				totalPage = totalRow/pageSize;
			}else{
				totalPage = totalRow/pageSize+1;
			}
			pagebean.setTotalPage(totalPage);
			//当前页
			pagebean.setCurrentPage(currentPage);
			//计算开始位置
			int begin = (currentPage-1)*pageSize;
			pagebean.setBegin(begin);
			List<AssetInFo> list = assetInfoDao.findPage(begin,pageSize);
			pagebean.setListAsset(list);
			return pagebean;
		}
		//查询所有器材
		public List<AssetInFo> finAll() {
			
			return assetInfoDao.findTotal();
		}
		//添加器材信息
		public void addAsset(AssetInFo assetinfo) {
			
			assetInfoDao.addAsset(assetinfo);
		}
	
}
