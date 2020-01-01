package com.px.entity;

import java.util.Date;

public class AssetInFo {

	private int a_id;
	private String a_name;
	private int a_type_id;
	private int a_status_id;
	private String a_use;
	private int a_seller_id;
	private String a_address;
	private String a_application;
	private float a_money;
	private Date a_inputdate;
	private float a_userLife;
	private String photo;
	private AssetType assetType;
	
	public AssetType getAssetType() {
		return assetType;
	}
	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	
	public int getA_type_id() {
		return a_type_id;
	}
	public void setA_type_id(int a_type_id) {
		this.a_type_id = a_type_id;
	}
	public int getA_status_id() {
		return a_status_id;
	}
	public void setA_status_id(int a_status_id) {
		this.a_status_id = a_status_id;
	}
	public String getA_use() {
		return a_use;
	}
	public void setA_use(String a_use) {
		this.a_use = a_use;
	}
	public int getA_seller_id() {
		return a_seller_id;
	}
	public void setA_seller_id(int a_seller_id) {
		this.a_seller_id = a_seller_id;
	}
	public String getA_address() {
		return a_address;
	}
	public void setA_address(String a_address) {
		this.a_address = a_address;
	}
	public String getA_application() {
		return a_application;
	}
	public void setA_application(String a_application) {
		this.a_application = a_application;
	}
	public float getA_money() {
		return a_money;
	}
	public void setA_money(float a_money) {
		this.a_money = a_money;
	}
	public Date getA_inputdate() {
		return a_inputdate;
	}
	public void setA_inputdate(Date a_inputdate) {
		this.a_inputdate = a_inputdate;
	}
	public float getA_userLife() {
		return a_userLife;
	}
	public void setA_userLife(float a_userLife) {
		this.a_userLife = a_userLife;
	}
}
