package com.px.entity;
@SuppressWarnings("all")
public class Firm {

	private Integer sid;
	private String firm_name;
	private String s_name;
	private String s_move_tel;
	private String s_fixed_tel;
	private String s_email;
	private String s_city;
	private String s_credit;
	private String s_code;
	private String s_web;
	public String getS_move_tel() {
		return s_move_tel;
	}
	public void setS_move_tel(String s_move_tel) {
		this.s_move_tel = s_move_tel;
	}
	public String getS_fixed_tel() {
		return s_fixed_tel;
	}
	public void setS_fixed_tel(String s_fixed_tel) {
		this.s_fixed_tel = s_fixed_tel;
	}
	public String getS_code() {
		return s_code;
	}
	public void setS_code(String s_code) {
		this.s_code = s_code;
	}
	public String getS_web() {
		return s_web;
	}
	public void setS_web(String s_web) {
		this.s_web = s_web;
	}
	
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getFirm_name() {
		return firm_name;
	}
	public void setFirm_name(String firm_name) {
		this.firm_name = firm_name;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	
	public String getS_email() {
		return s_email;
	}
	public void setS_email(String s_email) {
		this.s_email = s_email;
	}
	public String getS_city() {
		return s_city;
	}
	public void setS_city(String s_city) {
		this.s_city = s_city;
	}
	public String getS_credit() {
		return s_credit;
	}
	public void setS_credit(String s_credit) {
		this.s_credit = s_credit;
	}
}
