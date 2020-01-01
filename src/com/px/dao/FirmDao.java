package com.px.dao;

import java.util.List;

import com.px.entity.Firm;

public interface FirmDao {

	public void  addUser(Firm firm);

	public List<Firm> list();

	public int findAll();

	public List<Firm> findPage(int begin, int pageSize);


	public Firm findOne(int sid);

	public void delete(Firm firmOne);

	public void update(Firm firm);

	public List<Firm> conditionQuery(Firm firm);

	public List<Firm> findTotal();

}
