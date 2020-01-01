package com.px.dao;

import java.util.List;

import com.px.entity.AssetInFo;

public interface AssetInFoDao {

	int findAll();

	List<AssetInFo> findPage(int begin, int pageSize);

	List<AssetInFo> findTotal();

	void addAsset(AssetInFo assetinfo);


}
