package com.lianjia.sh.samples.loupan.spi.v1;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dooioo.se.lorik.spi.view.authorize.LoginNeedless;
import com.dooioo.se.lorik.spi.view.support.LorikRest;
import com.dooioo.se.lorik.spi.view.support.LorikRest.Feature;
import com.lianjia.sh.samples.loupan.spi.v1.model.Bizcircle;
import com.lianjia.sh.samples.loupan.spi.v1.model.District;

/**
 * 区域标准服务
 * 
 * @author huisman
 * @since v1
 * @Copyright (c) 2016, Lianjia Group All Rights Reserved.
 */
public interface DistrictSpiV1 {

  /**
   * 返回一个城市里的所有行政区域，没有数据则返回空集合
   * 
   * @author huisman
   * @param gbCode 城市对应的国标码
   * @since v1
   * @summary 根据gbCode查找所有行政区域
   * @example /v1/districts?gbCode=310000
   */
  @LoginNeedless
  @RequestMapping(value = "/v1/districts", method = RequestMethod.GET, params = "gbCode")
  List<District> findByGbCodeV1(@RequestParam("gbCode") int gbCode);

  /**
   * 返回ID关联区域的信息，不存在返回 null。
   * 
   * @author huisman
   * @param id 区域ID
   * @return 不存在则返回null
   * @since v1
   * @summary 根据区域ID查找区域
   * @example /v1/bizcircles/2100000
   */
  @LoginNeedless
  @LorikRest(value = {Feature.NullTo404}, codes = {"24000:区域不存在"})
  @RequestMapping(value = "/v1/districts/{id}", method = RequestMethod.GET)
  Bizcircle findByIdV1(@PathVariable("id") int id);

}
