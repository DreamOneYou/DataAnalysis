package com.px.entity;

public class ThreeAssetType {


	private Integer a_threetype_id;
	private String type_name;
	private Integer a_two_id;
	private TwoAssetType twoAssetType;
	public TwoAssetType getTwoAssetType() {
		return twoAssetType;
	}
	public void setTwoAssetType(TwoAssetType twoAssetType) {
		this.twoAssetType = twoAssetType;
	}
	public Integer getA_threetype_id() {
		return a_threetype_id;
	}
	public void setA_threetype_id(Integer a_threetype_id) {
		this.a_threetype_id = a_threetype_id;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public Integer getA_two_id() {
		return a_two_id;
	}
	public void setA_two_id(Integer a_two_id) {
		this.a_two_id = a_two_id;
	}
}
