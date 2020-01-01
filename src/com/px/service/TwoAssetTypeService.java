package com.px.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.px.dao.TwoAssetTypeDao;
import com.px.entity.TwoAssetType;
@Transactional
public class TwoAssetTypeService {

	private TwoAssetTypeDao twoAssetTypeDao;

	public void setTwoAssetTypeDao(TwoAssetTypeDao twoAssetTypeDao) {
		this.twoAssetTypeDao = twoAssetTypeDao;
	}

	public List<TwoAssetType> findAll() {
		return twoAssetTypeDao.findAll();
	}

}
