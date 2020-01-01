package com.px.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.px.entity.Firm;
@SuppressWarnings("all")
public class FirmDaoImpl extends HibernateDaoSupport implements FirmDao {

	//添加公司
	public void addUser(Firm firm){
		Session session = currentSession();
		String sql = "insert into t_firm values('"+firm.getFirm_name()+"','"+firm.getS_name()+"','"+firm.getS_move_tel()+"','"
				+firm.getS_fixed_tel()+"','"+firm.getS_email()+"','"+firm.getS_city()+"','"+firm.getS_credit()+"','"+
				firm.getS_code()+"','"+firm.getS_web()+"')";
		session.createSQLQuery(sql).executeUpdate();
		
		//this.getHibernateTemplate().save(firm);
		
	}
	//显示公司列表
	public List<Firm> list() {
		return (List<Firm>) this.getHibernateTemplate().find("from Firm");
	}

	//查询记录数

	public int findAll() {
		List<Object> list = (List<Object>) this.getHibernateTemplate().find("select count(*) from Firm");
		if(list!=null && list.size()!=0){
			Object obj = list.get(0);
			Long lobj = (Long)obj;
			int count = lobj.intValue();
			return count;
		}
		return 0;
	}

	//分页查询
	public List<Firm> findPage(int begin, int pageSize) {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Firm.class);
		List<Firm> list = (List<Firm>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		
		return list;
	}

	//id查询
	public Firm findOne(int sid) {
		
		return this.getHibernateTemplate().get(Firm.class, sid);
	}
	//删除操作
	public void delete(Firm firmOne) {
		this.getHibernateTemplate().delete(firmOne);
	}
	//修改操作
	public void update(Firm firm) {
		this.getHibernateTemplate().update(firm);
	}
	//条件查询
	public List<Firm> conditionQuery(Firm firm) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Firm.class);
		criteria.add(Restrictions.like("firm_name","%"+firm.getFirm_name()+"%"));
		List<Firm> list = (List<Firm>) this.getHibernateTemplate().findByCriteria(criteria);
		return list;
	}
	//查询所有对象
	public List<Firm> findTotal() {
		
		return (List<Firm>) this.getHibernateTemplate().find("from Firm");
	}



}
