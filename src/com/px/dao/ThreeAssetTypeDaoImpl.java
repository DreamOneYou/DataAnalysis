package com.px.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.px.entity.ThreeAssetType;

public class ThreeAssetTypeDaoImpl extends HibernateDaoSupport implements
		ThreeAssetTypeDao {

	//三级类别表
	@SuppressWarnings("unchecked")
	public List<ThreeAssetType> threefindAll() {
		return (List<ThreeAssetType>) this.getHibernateTemplate().find("from ThreeAssetType where twoAssetType.a_twotype_id=?",1);
	}

	//数据转换
	@SuppressWarnings("unchecked")
	public List<ThreeAssetType> getResult(String hql, String values) {
		
		return (List<ThreeAssetType>) this.getHibernateTemplate().find(hql, values);
	}

}
