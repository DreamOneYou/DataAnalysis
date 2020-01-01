package com.px.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {

	private final static Configuration cfg;
	private final static SessionFactory sessionfactory;
	static{
		cfg = new Configuration();
		cfg.configure();
		sessionfactory = cfg.buildSessionFactory();
	}
	public static Session getSessionObject(){
		return sessionfactory.getCurrentSession();
	}
	public static SessionFactory getSessionFactory(){
		return sessionfactory;
	}
	public static void main(String[] agrs){
		
	}
}

