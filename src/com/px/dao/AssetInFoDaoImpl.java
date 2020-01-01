package com.px.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.px.entity.AssetInFo;
import com.px.entity.Firm;
@SuppressWarnings("all")
public class AssetInFoDaoImpl extends HibernateDaoSupport implements
		AssetInFoDao {

	//查询商家总共有多少
	public int findAll() {
		List<Object> list = (List<Object>) this.getHibernateTemplate().find("from count(*) from AssetInFo");
		if(list!=null && list.size()!=0){
			Object obj = list.get(0);
			Long lobj = (Long)obj;
			int count = lobj.intValue();
			return count;
		}
		return 0;
	}

	//分页
	public List<AssetInFo> findPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(AssetInFo.class);
		List<AssetInFo> list = (List<AssetInFo>) this.getHibernateTemplate().findByCriteria(criteria, begin,pageSize);
		
		return list;
	}

	//查询所有

	public List<AssetInFo> findTotal() {
		return (List<AssetInFo>) this.getHibernateTemplate().find("from AssetInFo");
	}

	//添加器材信息
	public void addAsset(AssetInFo assetinfo) {
		this.getHibernateTemplate().update(assetinfo);
	}
	

}
