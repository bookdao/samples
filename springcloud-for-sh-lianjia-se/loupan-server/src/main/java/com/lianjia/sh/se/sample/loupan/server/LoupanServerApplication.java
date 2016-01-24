package com.lianjia.sh.se.sample.loupan.server;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.cloud.netflix.feign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.dooioo.se.lorik.core.annotation.EnableBuiltinRestSupport;
import com.netflix.governator.annotations.binding.Primary;

/**
  * <p>
  *  楼盘Server 
  * </p>
  * @author huisman
  * @since 1.0.0  
  * @Copyright (c) 2015, Lianjia Group All Rights Reserved.
*/
@Configuration
@SpringBootApplication
@EnableBuiltinRestSupport
@EnableAspectJAutoProxy
public class LoupanServerApplication  {
  
  @Bean(autowire=Autowire.BY_NAME,destroyMethod="close",initMethod="init",name={"dataSource"})
  @Scope(value="singleton",proxyMode=ScopedProxyMode.TARGET_CLASS)
  //@Scope(value="prototype")
  @DependsOn(value={"otherBeanName"})
  @Primary
  @Lazy
  public DataSource data(){
     return DataSourceBuilder.create().build();
  }
  
  public static void main(String[] args) {
     SpringApplication.run(LoupanServerApplication.class, args);
  } 
}
