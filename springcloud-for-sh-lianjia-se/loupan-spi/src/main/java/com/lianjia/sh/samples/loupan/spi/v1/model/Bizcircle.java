package com.lianjia.sh.samples.loupan.spi.v1.model;

import java.io.Serializable;

/**
 *  商圈 ，一个商圈归属一个区域
  * @author huisman
  * @since v1
  * @Copyright (c) 2016, Lianjia Group All Rights Reserved.
*/
public class Bizcircle implements Serializable {
	private static final long serialVersionUID = 1L;
	// 编号
	private Integer id;
	// 名称
	private String name;
	// 城市编号
	private Integer gbCode;
	// 所属城区
	private Integer districtId;
	// 全拼
	private String fullSpell;
	// 商圈关键字
	private String circleKeywords;
	// 中心坐标经度
	private Double pointLng;
	// 中心坐标纬度
	private Double pointLat;
	private String brief;
	
	//记录状态，1=正常，-1=删除
    private int status;

	 /**
	  *@return 商圈ID
	  */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	 /**
	  * @return 返回商圈名称
	  */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 /**
	  * @return 商圈所属的城市的国标码
	  */
	public Integer getGbCode() {
		return gbCode;
	}

	public void setGbCode(Integer gbCode) {
		this.gbCode = gbCode;
	}


	 /** 
	  *
	  * @return  商圈全拼
	  */
	public String getFullSpell() {
		return fullSpell;
	}

	public void setFullSpell(String fullSpell) {
		this.fullSpell = fullSpell;
	}

	 /**
	  *  
	  *  @return 商圈关键字
	  */
	public String getCircleKeywords() {
		return circleKeywords;
	}
	public void setCircleKeywords(String circleKeywords) {
		this.circleKeywords = circleKeywords;
	}


	 /**
	  * 
	  * @return  商圈中心点经度
	  */
	public Double getPointLng() {
		return pointLng;
	}

	public void setPointLng(Double pointLng) {
		this.pointLng = pointLng;
	}

	 /**
	  * 
	  * @return   商圈中心点维度
	  */
	public Double getPointLat() {
		return pointLat;
	}

	public void setPointLat(Double pointLat) {
		this.pointLat = pointLat;
	}


	 /**
	  *
	  * @return   商圈简介
	  */
	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}
	
	

   /**
    *
    * @return  区域ID
    */
  public Integer getDistrictId() {
    return districtId;
  }

  public void setDistrictId(Integer districtId) {
    this.districtId = districtId;
  }

   /**
    *
    * @return  //记录状态，1=正常，-1=删除
    */
  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Bizcircle [id=" + id + ", name=" + name + ", gbCode=" + gbCode + ", districtId="
        + districtId + ", fullSpell=" + fullSpell + ", circleKeywords=" + circleKeywords
        + ", pointLng=" + pointLng + ", pointLat=" + pointLat + ", brief=" + brief + "]";
  }



	


}
