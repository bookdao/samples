package com.lianjia.sh.samples.loupan.spi.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dooioo.se.lorik.spi.view.ListView;
import com.dooioo.se.lorik.spi.view.Pagination;
import com.dooioo.se.lorik.spi.view.authorize.LoginNeedless;
import com.lianjia.sh.samples.loupan.spi.v1.model.Resblock;

/**
 * 区域标准服务
 * 
 * @author huisman
 * @since v1
 * @Copyright (c) 2016, Lianjia Group All Rights Reserved.
 */
public interface ResblockSpiV1 {

  /**
   *  根据城市国标码对楼盘搜索，可根据区域ID、商圈ID分页检索楼盘。
   * 
   * @author huisman
   * @param gbCode 城市对应的国标码
   * @param bizcircleId 商圈ID
   * @param districtId 行政区域ID
   * @param pageSize 分页大小
   * @param pageNo 当前页码
   * @return 
   * @since v1
   * @summary 根据gbCode分页检索楼盘
   * @example /v1/resblocks?gbCode=310000
   * @errorCode
   */
  @LoginNeedless
  @RequestMapping(value = "/v1/resblocks", method = RequestMethod.GET, params = "gbCode")
  Pagination<Resblock> search(@RequestParam("gbCode") int gbCode,
      @RequestParam(value = "districtId", required = false) Integer districtId,
      @RequestParam(value = "bizcircleId", required = false) Integer bizcircleId,
      @RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
      @RequestParam(value = "pageSize", defaultValue = "30") int pageSize);

  /**
   * 根据城市国标码以及楼盘关键字信息自动提示楼盘信息，最多返回 size（默认20）条数据。
   * 
   * @author huisman
   * @param keyword 楼盘关键字
   * @param gbCode 城市国标码
   * @param size 返回的结果数，默认20
   * @return 不存在则返回空List
   * @since v1
   * @summary 楼盘自动提示
   * @example /v1/bizcircles/2100000
   * @errorCode
   */
  @LoginNeedless
  @RequestMapping(value = "/v1/resblocks/autoSearch", method = RequestMethod.GET)
  ListView<Resblock> autoSearch(@RequestParam(value = "keyword", defaultValue = "") String keyword,
      @RequestParam(value = "gbCode") int gbCode,
      @RequestParam(value = "size", defaultValue = "20") int size);

}
