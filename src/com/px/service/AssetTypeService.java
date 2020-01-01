package com.px.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.px.dao.AssetTypeDao;
import com.px.entity.AssetType;
@Transactional
public class AssetTypeService {

	private AssetTypeDao assetTypeDao;

	public void setAssetTypeDao(AssetTypeDao assetTypeDao) {
		this.assetTypeDao = assetTypeDao;
	}
	//二级类别查询
	public List<AssetType> findOneType() {
		
		return assetTypeDao.findOneType();
	}
}
