package com.lianjia.sh.se.sample.loupan.server;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
  * <p>
  *  楼盘Server 
  * </p>
  * @author huisman
  * @since 1.0.0  
  * @Copyright (c) 2015, Lianjia Group All Rights Reserved.
*/
public class LoupanServerApplication  {
  public static void main(String[] args) {
  } 
  
  @FeignClient(url="")
  public interface CityService{
    @RequestMapping(value="/v1/city/{id}",method=RequestMethod.GET)
    Object findById(@PathVariable(value="id")int id );
  }
}
