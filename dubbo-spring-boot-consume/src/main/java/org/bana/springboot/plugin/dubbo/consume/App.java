package org.bana.springboot.plugin.dubbo.consume;

import org.bana.springboot.plugin.dubbo.consume.ref.RefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * 是Spring Boot项目的核心注解,主要是开启自动配置 
 */  
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan  
@RestController  
public class App {  
  
    @Autowired  
    private RefService refService;  
      
    public static void main(String[] args) {  
        SpringApplication.run(App.class, args);  
    }  
      
    @RequestMapping("/say")  
    public String sayHello(String name) {  
        return refService.sayHello(name);  
    }  
      
}  