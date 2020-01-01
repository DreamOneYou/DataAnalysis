package com.px.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.px.entity.TwoAssetType;

public class TwoAssetTypeDaoImpl extends HibernateDaoSupport implements
		TwoAssetTypeDao {

	//查询二级类别表
	@SuppressWarnings("unchecked")
	public List<TwoAssetType> findAll() {
		
		return (List<TwoAssetType>) this.getHibernateTemplate().find("from TwoAssetType where assetType.a_type_id=?",1);
	}
}
