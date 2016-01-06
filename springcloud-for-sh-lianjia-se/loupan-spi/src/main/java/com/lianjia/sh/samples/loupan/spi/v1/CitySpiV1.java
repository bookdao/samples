package com.lianjia.sh.samples.loupan.spi.v1;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dooioo.se.lorik.spi.view.BeanView;
import com.dooioo.se.lorik.spi.view.authorize.LoginNeedless;
import com.dooioo.se.lorik.spi.view.support.LorikRest;
import com.dooioo.se.lorik.spi.view.support.LorikRest.Feature;
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
     * @version v1
     * @return 不存在则返回空集合
     * @since 2016-01-01
     * @summary 查找所有城市 
      */
    @LoginNeedless
    @RequestMapping(value="/v1/citys",method=RequestMethod.GET)
    List<City> findAllV1();
    
    /**
     *  根据城市国标码查找城市信息，不存在则返回 null。
     * @author huisman
     * @version v1
     * @param  gbCode 城市国标码
     * @return  不存在则返回 null
     * @since 2016-01-01
     * @summary  根据gbCode查找城市
      */
    @LoginNeedless
    @LorikRest(value={Feature.NullTo404},codes={"21000:城市不存在"})
    @RequestMapping(value="/v1/citys/{gbCode}",method=RequestMethod.GET)
    BeanView<City> findByIdV1(@PathVariable("gbCode")int gbCode);
  
}
