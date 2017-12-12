package org.bana.springboot.plugin.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;  
  
/** 
 * 是Spring Boot项目的核心注解,主要是开启自动配置 
 */  
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan   
public class App {  
      
    public static void main(String[] args) {  
        SpringApplication.run(App.class, args);  
    }  
      
} 