package org.bana.springboot.plugin.dubbo.provider.impl;
import org.bana.springboot.plugin.dubbo.api.BaseService;

import com.alibaba.dubbo.config.annotation.Service;

//import com.alibaba.dubbo.config.annotation.Service;  
  
@Service(group="helloService", version="1.0")  
//@Service
public class HelloService implements BaseService {  
  
    @Override  
    public String build(String str) {  
        return "hello "+str+" !";  
    }  
  
} 