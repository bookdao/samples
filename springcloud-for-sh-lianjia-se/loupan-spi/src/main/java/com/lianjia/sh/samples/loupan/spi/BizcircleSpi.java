package com.lianjia.sh.samples.loupan.spi;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dooioo.se.lorik.spi.view.authorize.LoginNeedless;
import com.dooioo.se.lorik.spi.view.support.LorikRest;
import com.dooioo.se.lorik.spi.view.support.LorikRest.Feature;
import com.lianjia.sh.samples.loupan.spi.model.Bizcircle;

/**
  * 商圈标准服务
  * @summary 商圈
  * @Copyright (c) 2016, Lianjia Group All Rights Reserved.
*/
@FeignClient(value="loupan-server")
public interface BizcircleSpi {
  
     /**
     *  返回特定区域下的所有商圈。区域ID不存在或者没有商圈则返回空集合
     * @author huisman
     * @version v1
     * @param  districtId 区域ID
     * @return 不存在则返回空集合
     * @since 2016-01-01
     * @summary 根据区域ID查找所有商圈 
      */
    @LoginNeedless
    @RequestMapping(value="/v1/bizcircles",method=RequestMethod.GET,params="districtId")
    List<Bizcircle> findByDistrictIdV1(@RequestParam("districtId")int districtId);
    
    /**
     *  返回商圈ID对应的商圈信息，不存在返回 null。
     * @author huisman
     * @version v1
     * @param  id 商圈ID
     * @return 不存在则返回 null
     * @since 2016-01-01
     * @summary 根据商圈ID查找商圈 
      */
    @LoginNeedless
    @LorikRest(value={Feature.NullTo404},codes={"21000:城市不存在"})
    @RequestMapping(value="/v1/bizcircles/{id}",method=RequestMethod.GET)
    Bizcircle findByIdV1(@PathVariable("id")int id);
  
}
