package com.px.dao;

import java.util.List;

import com.px.entity.ThreeAssetType;

public interface ThreeAssetTypeDao {

	List<ThreeAssetType> threefindAll();

	List<ThreeAssetType> getResult(String hql, String values);

}
