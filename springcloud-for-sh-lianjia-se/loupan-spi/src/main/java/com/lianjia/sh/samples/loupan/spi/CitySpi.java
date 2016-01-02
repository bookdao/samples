package com.lianjia.sh.samples.loupan.spi;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.lianjia.sh.samples.loupan.spi.v1.CitySpiV1;

/**
  * 楼盘字典城市服务
  * @author huisman
  * @since 1.0.0  
  * @Copyright (c) 2016, Lianjia Group All Rights Reserved.
*/
@FeignClient("loupan-server")
public interface CitySpi  extends CitySpiV1{

}
