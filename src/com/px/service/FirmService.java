package com.px.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.px.dao.FirmDao;
import com.px.entity.Firm;
import com.px.entity.PageBean;
@Transactional
public class FirmService {

	private FirmDao firmDao;

	public void setFirmDao(FirmDao firmDao) {
		this.firmDao = firmDao;
	}
//添加用户  
	public void add(Firm firm) {
		firmDao.addUser(firm);
	}

// 用户列表
	public List<Firm> list() {
		return firmDao.list();
	}
	//分页
	public PageBean listPage(int currentPage) {
		PageBean pagebean = new PageBean();
		int totalRow = firmDao.findAll(); //总记录数
		pagebean.setTotalRow(totalRow);
		int pageSize = 3;					//每页显示记录数
		pagebean.setPageSize(pageSize);
		//计算总页数
		int totalPage=0;
		if(totalRow%pageSize==0){
			totalPage = totalRow/pageSize;
		}else{
			totalPage = totalRow/pageSize+1;
		}
		pagebean.setTotalPage(totalPage);
		//当前页
		pagebean.setCurrentPage(currentPage);
		//计算开始位置
		int begin = (currentPage-1)*pageSize;
		pagebean.setBegin(begin);
		List<Firm> list = firmDao.findPage(begin,pageSize);
		pagebean.setList(list);
		return pagebean;
	}
	//删除用户
	//得到id
	public Firm findOne(int sid) {
		return firmDao.findOne(sid);
	}
	public void delete(Firm firmOne) {
		firmDao.delete(firmOne);
	}
	//修改操作
	public void update(Firm firm) {
		firmDao.update(firm);
		
	}
	//条件查询
	public List<Firm> conditionQuery(Firm firm) {
		
		return firmDao.conditionQuery(firm);
	}
	//查询所有对象
	public List<Firm> finAll() {
		return firmDao.findTotal();
	}


}
