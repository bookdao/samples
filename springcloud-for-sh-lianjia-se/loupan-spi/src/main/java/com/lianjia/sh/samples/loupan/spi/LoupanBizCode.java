package com.lianjia.sh.samples.loupan.spi;

import com.dooioo.se.lorik.spi.view.support.BizCode;

/**
  * 楼盘标准业务码
  * @summary 
  * @Copyright (c) 2016, Lianjia Group All Rights Reserved.
*/
public interface LoupanBizCode {
  
    /**
     *  城市不存在。
     */
    BizCode CITY_NOT_EXISTS=new BizCode(21000, "城市不存在");

    /**
     * 商圈不存在
     */
    BizCode BIZCIRCLE_NOT_EXISTS=new BizCode(22000, "商圈不存在");
    
    /**
     *  楼盘不存在
     */
   BizCode REBLOCK_NOT_EXISTS=new BizCode(23000, "楼盘不存在");
    
    
    /**
     *  行政区域不存在
     */
   BizCode DISTRICT_NOT_EXISTS=new BizCode(24000, "区域不存在");
    
}
