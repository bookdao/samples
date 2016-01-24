package com.lianjia.sh.samples.loupan.spi.model;

import java.io.Serializable;

/**
 * 区域划分-城市
 * @author huisman
 * @since v1
 * @Copyright (c) 2015, Lianjia Group All Rights Reserved.
 */

public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	//城市名称
	private String name;
	//城市国标码
	private int gbCode;
	//记录状态，1=正常，-1=删除
	private int status;

	public City() {
		super();
	}

	

	  /**
	  *
	  * @return  记录状态，1=正常，-1=删除
	  */
	public int getStatus() {
    return status;
  }



  public void setStatus(int status) {
    this.status = status;
  }



  /**
	  *
	  * @return  城市名称
	  */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	 /**
	  *
	  * @return   城市的国标码
	  */
	public int getGbCode() {
		return gbCode;
	}

	public void setGbCode(int gbCode) {
		this.gbCode = gbCode;
	}


  @Override
  public String toString() {
    return "City [name=" + name + ", gbCode=" + gbCode + "]";
  }






}
