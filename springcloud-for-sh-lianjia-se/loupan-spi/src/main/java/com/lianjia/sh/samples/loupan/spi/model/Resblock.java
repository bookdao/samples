package com.lianjia.sh.samples.loupan.spi.model;

import java.io.Serializable;

/**
 * 楼盘
 * 
 * @author huisman
 * @since v1
 * @Copyright (c) 2015, Lianjia Group All Rights Reserved.
 */
public class Resblock implements Serializable {
  private static final long serialVersionUID = 1L;
  // 编号
  private Long id;
  // 城区编号
  private Integer districtId;
  // 商圈编号
  private Integer bizcircleId;
  // 一级社区
  private String primaryCommunity;
  // 二级社区
  private String secondCommunity;
  // 名称
  private String name;
  // 别名
  private String alias;
  // 简拼
  private String simpleSpell;
  // 全拼
  private String fullSpell;
  // 行政地址
  private String adminAddr;
  // 产权地址
  private String propAddr;
  // 绿化面积
  private float greenArea;
  // 绿化率
  private float greenRate;
  // 容积率
  private float cubageRate;
  // 中心点经度
  private double pointLng;
  // 中心点纬度
  private double pointLat;
  // 城市编号
  private Integer gbCode;

  public Resblock() {
    super();
  }

  /**
   * @return 楼盘ID
   */
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @return 楼盘所属区域
   */
  public Integer getDistrictId() {
    return this.districtId;
  }

  public void setDistrictId(Integer districtId) {
    this.districtId = districtId;
  }

  /**
   * @return 楼盘所属商圈ID
   */
  public Integer getBizcircleId() {
    return this.bizcircleId;
  }

  public void setBizcircleId(Integer bizcircleId) {
    this.bizcircleId = bizcircleId;
  }

  /**
   * 
   * @return 一级社区名称
   */
  public String getPrimaryCommunity() {
    return this.primaryCommunity;
  }

  public void setPrimaryCommunity(String primaryCommunity) {
    this.primaryCommunity = primaryCommunity;
  }

  /**
   * @return 二级社区名称
   */
  public String getSecondCommunity() {
    return this.secondCommunity;
  }

  public void setSecondCommunity(String secondCommunity) {
    this.secondCommunity = secondCommunity;
  }

  /**
   * @return 楼盘名称
   */
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return 楼盘别名
   */
  public String getAlias() {
    return this.alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  /**
   * @return 楼盘名称简拼
   */
  public String getSimpleSpell() {
    return this.simpleSpell;
  }

  public void setSimpleSpell(String simpleSpell) {
    this.simpleSpell = simpleSpell;
  }

  /**
   * 
   * @return 楼盘名称全拼
   */
  public String getFullSpell() {
    return this.fullSpell;
  }

  public void setFullSpell(String fullSpell) {
    this.fullSpell = fullSpell;
  }

  /**
   * 
   * @return 楼盘行政登记地址
   */
  public String getAdminAddr() {
    return this.adminAddr;
  }

  public void setAdminAddr(String adminAddr) {
    this.adminAddr = adminAddr;
  }

  /**
   * @return 楼盘产权地址
   */
  public String getPropAddr() {
    return this.propAddr;
  }

  public void setPropAddr(String propAddr) {
    this.propAddr = propAddr;
  }

  /**
   * @return 楼盘绿化面积
   */
  public float getGreenArea() {
    return this.greenArea;
  }

  public void setGreenArea(float greenArea) {
    this.greenArea = greenArea;
  }

  /**
   * @return 楼盘绿化率
   */
  public float getGreenRate() {
    return this.greenRate;
  }

  public void setGreenRate(float greenRate) {
    this.greenRate = greenRate;
  }

  /**
   * 
   * @return 容积率
   */
  public float getCubageRate() {
    return this.cubageRate;
  }

  public void setCubageRate(float cubageRate) {
    this.cubageRate = cubageRate;
  }


  /**
   * 
   * @return 楼盘中心点经度
   */
  public double getPointLng() {
    return this.pointLng;
  }

  public void setPointLng(double pointLng) {
    this.pointLng = pointLng;
  }

  /**
   * 
   * @return 楼盘中心点纬度
   */
  public double getPointLat() {
    return this.pointLat;
  }

  public void setPointLat(double pointLat) {
    this.pointLat = pointLat;
  }


  /**
   * @return 楼盘所属城市的国标码
   */
  public Integer getGbCode() {
    return this.gbCode;
  }

  public void setGbCode(Integer gbCode) {
    this.gbCode = gbCode;
  }

  @Override
  public String toString() {
    return "Resblock [id=" + id + ", districtId=" + districtId + ", bizcircleId=" + bizcircleId
        + ", primaryCommunity=" + primaryCommunity + ", secondCommunity=" + secondCommunity
        + ", name=" + name + ", alias=" + alias + ", simpleSpell=" + simpleSpell + ", fullSpell="
        + fullSpell + ", adminAddr=" + adminAddr + ", propAddr=" + propAddr + ", greenArea="
        + greenArea + ", greenRate=" + greenRate + ", cubageRate=" + cubageRate + ", pointLng="
        + pointLng + ", pointLat=" + pointLat + ", gbCode=" + gbCode + "]";
  }



}
