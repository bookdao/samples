package com.lianjia.sh.samples.loupan.spi;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.lianjia.sh.samples.loupan.spi.v1.DistrictSpiV1;

/**
  * 楼盘字典区域服务
  * @author huisman
  * @since 1.0.0  
  * @Copyright (c) 2016, Lianjia Group All Rights Reserved.
*/
@FeignClient("loupan-server")
public interface DistrictSpi extends DistrictSpiV1{

}
