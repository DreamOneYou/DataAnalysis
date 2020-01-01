package com.px.entity;

import java.util.HashSet;
import java.util.Set;

public class TwoAssetType {

	private Integer a_twotype_id;
	private String type_name;
	private Integer a_one_id;
	private AssetType assetType;
	private Set<ThreeAssetType> setThreeAssetType = new HashSet<ThreeAssetType>();
	public Set<ThreeAssetType> getSetThreeAssetType() {
		return setThreeAssetType;
	}
	public void setSetThreeAssetType(Set<ThreeAssetType> setThreeAssetType) {
		this.setThreeAssetType = setThreeAssetType;
	}
	public AssetType getAssetType() {
		return assetType;
	}
	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}
	public Integer getA_twotype_id() {
		return a_twotype_id;
	}
	public void setA_twotype_id(Integer a_twotype_id) {
		this.a_twotype_id = a_twotype_id;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public Integer getA_one_id() {
		return a_one_id;
	}
	public void setA_one_id(Integer a_one_id) {
		this.a_one_id = a_one_id;
	}
}
