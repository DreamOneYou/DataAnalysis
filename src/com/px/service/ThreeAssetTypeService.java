package com.px.service;

import java.util.List;

import com.px.dao.ThreeAssetTypeDao;
import com.px.entity.ThreeAssetType;

public class ThreeAssetTypeService {

	String hql;
	String parmeter;
	private ThreeAssetTypeDao threeAssetTypeDao;

	public void setThreeAssetTypeDao(ThreeAssetTypeDao threeAssetTypeDao) {
		this.threeAssetTypeDao = threeAssetTypeDao;
	}

	public List<ThreeAssetType> threefindAll() {
		return threeAssetTypeDao.threefindAll();
	}

	public List<ThreeAssetType> getResult() {
		return threeAssetTypeDao.getResult(hql,parmeter);
	}
	
}
