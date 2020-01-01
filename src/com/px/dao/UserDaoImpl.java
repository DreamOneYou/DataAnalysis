package com.px.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.px.entity.Firm;
import com.px.entity.User;
@SuppressWarnings("all")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@SuppressWarnings("all")
	public User loginUser(User user) {
		HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
		List<User> list = (List<User>) hibernateTemplate.find("from User where username=? and password=?", user.getUsername(),user.getPassword());
		if(list!=null && list.size()!=0){
			User u = list.get(0);
			return u;
		}
		return null;
	}

	//根据id查询
	public User findOne(int adminID) {
		
		return this.getHibernateTemplate().get(User.class, adminID);
	}

	//修改密码

	public boolean updatePsswd(User user) {
		boolean flag = false;
		user.setPassword(user.getNewpassword());
		String users = user.getPassword();
		Integer a = user.getAdminID();
		String hql ="update User u set u.password="+users+"where u.adminID="+user.getAdminID()+"";
		/*this.getHibernateTemplate().update("update User set password="+users+"where adminID="+user.getAdminID()+"");*/
		
		/*SessionFactory sessionFactory = this.getHibernateTemplate().getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createSQLQuery("update User u set u.newpassword="+user.getPassword()+"where u.adminID="+user.getAdminID()+"");
		query.executeUpdate();
		*/
		
		Session session = this.getSessionFactory().getCurrentSession();
		int result = session.createQuery(hql).executeUpdate(); 
		if(result==1){
			flag = true;
			return flag;
		}else{
			return flag;
		}
		
		
		
	}
	

}
