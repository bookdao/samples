package com.lianjia.sh.se.sample.loupan.server;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.dooioo.se.lorik.core.annotation.EnableBuiltinRestSupport;

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
  
  @Bean
  public DataSource data(){
     return DataSourceBuilder.create().build();
  }
  
  public static void main(String[] args) {
     SpringApplication.run(LoupanServerApplication.class, args);
  } 
}
