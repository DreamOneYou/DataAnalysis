package com.px.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.px.entity.AssetType;

public class AssetTypeDaoImpl extends HibernateDaoSupport implements AssetTypeDao {

	//一级类别查找
	@SuppressWarnings("unchecked")
	public List<AssetType> findOneType() {
		
		return (List<AssetType>) this.getHibernateTemplate().find("from AssetType");
	}
}
