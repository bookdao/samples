package com.lianjia.sh.samples.loupan.spi.v1;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dooioo.se.lorik.spi.view.authorize.LoginNeedless;
import com.lianjia.sh.samples.loupan.spi.v1.model.City;

/**
  * 城市标准服务
  * @author huisman
  * @since v1  
  * @Copyright (c) 2016, Lianjia Group All Rights Reserved.
*/
public interface CitySpiV1 {
  
     /**
     *  返回所有城市，没数据则返回空集合
     * @author huisman
     * @return 不存在则返回空集合
     * @since v1
     * @summary 查找所有城市 
     * @example /v1/citys
     * @errorCode 
      */
    @LoginNeedless
    @RequestMapping(value="/v1/citys",method=RequestMethod.GET)
    List<City> findAllV1();
    
    /**
     *  根据城市国标码查找城市信息，不存在则返回 null。
     * @author huisman
     * @param  gbCode 城市国标码
     * @return  不存在则返回 null
     * @since v1
     * @summary  根据gbCode查找城市
     * @example /v1/citys/310000
     * @errorCode 
      */
    @LoginNeedless
    @RequestMapping(value="/v1/citys/{gbCode}",method=RequestMethod.GET)
    City findByIdV1(@PathVariable("gbCode")int gbCode);
  
}
