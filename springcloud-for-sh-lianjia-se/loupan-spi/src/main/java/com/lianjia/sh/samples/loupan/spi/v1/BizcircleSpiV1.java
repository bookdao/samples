package com.lianjia.sh.samples.loupan.spi.v1;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lianjia.sh.samples.loupan.spi.v1.model.Bizcircle;

/**
  * 商圈标准服务
  * @author huisman
  * @since v1  
  * @Copyright (c) 2016, Lianjia Group All Rights Reserved.
*/
public interface BizcircleSpiV1 {
  
     /**
     *  返回特定区域下的所有商圈。区域ID不存在或者没有商圈则返回空集合
     * @author huisman
     * @param  districtId 区域ID
     * @return 不存在则返回空集合
     * @since v1
     * @summary 根据区域ID查找所有商圈 
     * @example /v1/bizcircles?districtId=2100200
     * @errorCode 
      */
    @RequestMapping(value="/v1/bizcircles",method=RequestMethod.GET,params="districtId")
    List<Bizcircle> findByDistrictIdV1(@RequestParam("districtId")int districtId);
    
    /**
     *  返回商圈ID对应的商圈信息，不存在返回 null。
     * @author huisman
     * @param  id 商圈ID
     * @return 不存在则返回 null
     * @since v1
     * @summary 根据商圈ID查找商圈 
     * @example /v1/bizcircles/2100000
     * @errorCode 
      */
    @RequestMapping(value="/v1/bizcircles/{id}",method=RequestMethod.GET)
    Bizcircle findByIdV1(@PathVariable("id")int id);
  
}
