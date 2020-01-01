package com.px.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class AssetStatus {

	private int a_status_id;
	private String a_status;
	private Date a_outputDate;
	private String a_out_address;

	
	public int getA_status_id() {
		return a_status_id;
	}
	public void setA_status_id(int a_status_id) {
		this.a_status_id = a_status_id;
	}
	public String getA_status() {
		return a_status;
	}
	public void setA_status(String a_status) {
		this.a_status = a_status;
	}
	public Date getA_outputDate() {
		return a_outputDate;
	}
	public void setA_outputDate(Date a_outputDate) {
		this.a_outputDate = a_outputDate;
	}
	public String getA_out_address() {
		return a_out_address;
	}
	public void setA_out_address(String a_out_address) {
		this.a_out_address = a_out_address;
	}
}
