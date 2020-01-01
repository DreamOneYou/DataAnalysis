package com.px.entity;

import java.util.HashSet;
import java.util.Set;

public class AssetType {

	private int a_type_id;
	private String type_name;
	private Set<AssetInFo> setAssetInFo = new HashSet<AssetInFo>();
	private Set<TwoAssetType> setTwoAssetType = new HashSet<TwoAssetType>();
	public Set<TwoAssetType> getSetTwoAssetType() {
		return setTwoAssetType;
	}
	public void setSetTwoAssetType(Set<TwoAssetType> setTwoAssetType) {
		this.setTwoAssetType = setTwoAssetType;
	}
	public Set<AssetInFo> getSetAssetInFo() {
		return setAssetInFo;
	}
	public void setSetAssetInFo(Set<AssetInFo> setAssetInFo) {
		this.setAssetInFo = setAssetInFo;
	}
	public int getA_type_id() {
		return a_type_id;
	}
	public void setA_type_id(int a_type_id) {
		this.a_type_id = a_type_id;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
}
