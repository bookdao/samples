package com.lianjia.sh.samples.loupan.spi;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dooioo.se.lorik.spi.view.Pagination;
import com.dooioo.se.lorik.spi.view.authorize.LoginNeedless;
import com.dooioo.se.lorik.spi.view.support.LorikRest;
import com.dooioo.se.lorik.spi.view.support.LorikRest.Feature;
import com.lianjia.sh.samples.loupan.spi.model.Resblock;

/**
 * 楼盘 SPI
 * @summary 楼盘
 * @Copyright (c) 2016, Lianjia Group All Rights Reserved.
 */
@FeignClient("loupan-server")
public interface ResblockSpi {

  /**
   * 根据城市国标码对楼盘搜索，可根据区域ID、商圈ID分页检索楼盘。
   * 
   * @author huisman
   * @version v1
   * @param gbCode 城市对应的国标码
   * @param bizcircleId 商圈ID
   * @param districtId 行政区域ID
   * @param pageSize 分页大小
   * @param pageNo 当前页码
   * @return
   * @since 2016-01-01
   * @summary 根据gbCode分页检索楼盘
   */
  @LoginNeedless
  @RequestMapping(value = "/v1/resblocks", method = RequestMethod.GET, params = "gbCode")
  Pagination<Resblock> searchV1(@RequestParam("gbCode") int gbCode,
      @RequestParam(value = "districtId", required = false) Integer districtId,
      @RequestParam(value = "bizcircleId", required = false) Integer bizcircleId,
      @RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
      @RequestParam(value = "pageSize", defaultValue = "30") int pageSize);

  /**
   * 根据城市国标码以及楼盘关键字信息自动提示楼盘信息，最多返回 size（默认20）条数据。
   * 
   * @author huisman
   * @version v1
   * @param keyword 楼盘关键字
   * @param gbCode 城市国标码
   * @param size 返回的结果数，默认20
   * @return 不存在则返回空List
   * @since 2016-01-01
   * @summary 楼盘自动提示
   */
  @LoginNeedless
  @RequestMapping(value = "/v1/resblocks/autoSearch", method = RequestMethod.GET)
  List<Resblock> autoSearchV1(@RequestParam(value = "keyword", defaultValue = "") String keyword,
      @RequestParam(value = "gbCode") int gbCode,
      @RequestParam(value = "size", defaultValue = "20") int size);

  /**
   * 根据楼盘ID查找楼盘
   * @author huisman
   * @version v1
   * @param id 楼盘ID
   * @return
   * @since 2016-01-01
   * @summary 根据ID查找楼盘
   */
  @LoginNeedless
  @LorikRest(value = {Feature.NullTo404}, codes = {"23000:楼盘不存在","22000:商圈不存在"})
  @RequestMapping(value = "/v1/resblocks/{id}", method = RequestMethod.GET)
  Resblock findByIdV1(@PathVariable(value = "id") int id);
}
