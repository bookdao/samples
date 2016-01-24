package com.lianjia.sh.samples.loupan.spi.model;

import java.io.Serializable;

/**
 * 区域划分 - 城市中的城区
 * 
 * @author huisman
 * @since v1
 * @Copyright (c) 2015, Lianjia Group All Rights Reserved.
 */
public class District implements Serializable {
	private static final long serialVersionUID = 1L;
	// 区域ID
	private Integer id;
	// 区域名称
	private String name;
	 //全拼
	private String fullSpell;
	// 中心坐标经度
	private Float pointLng;
	// 中心坐标纬度
	private Float pointLat;
	 // 中心边界坐标
	private String positionBorder;
	
	 //城区所属城市Code
	private Integer gbCode;

	public District() {
		super();
	}

	 /**
	  *
	  * @return  城区ID
	  */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	 /**
	  *
	  * @return  城区名称
	  */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 /**
	  *
	  * @return  城区全拼
	  */
	public String getFullSpell() {
		return fullSpell;
	}

	public void setFullSpell(String fullSpell) {
		this.fullSpell = fullSpell;
	}



	 /**
	  *
	  * @return  城区边界坐标
	  */
	public String getPositionBorder() {
		return positionBorder;
	}

	public void setPositionBorder(String positionBorder) {
		this.positionBorder = positionBorder;
	}

	 /**
	  *
	  * @return  城区中心点经度
	  */
	public Float getPointLng() {
		return pointLng;
	}

	public void setPointLng(Float pointLng) {
		if (pointLng == null) {
			pointLng = Float.valueOf(0);
		} else {
			this.pointLng = pointLng;
		}
	}

	 /**
	  *
	  * @return  城区中心点纬度
	  */
	public Float getPointLat() {
		return pointLat;
	}

	public void setPointLat(Float pointLat) {
		if (pointLat == null) {
			pointLat = Float.valueOf(0);
		} else {
			this.pointLat = pointLat;
		}
	}

	 /**
	  *
	  * @return  城区所属城市的国标码
	  */
	public Integer getGbCode() {
		return gbCode;
	}

	public void setGbCode(Integer gbCode) {
		this.gbCode = gbCode;
	}

	@Override
	public String toString() {
		return "District [id=" + id + ", name=" + name + ", fullSpell=" + fullSpell + ", pointLng="
				+ pointLng + ", pointLat=" + pointLat + ", positionBorder=" + positionBorder
				+ ", gbCode=" + gbCode + "]";
	}


}
