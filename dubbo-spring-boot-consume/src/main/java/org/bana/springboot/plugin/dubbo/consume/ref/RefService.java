package org.bana.springboot.plugin.dubbo.consume.ref;
import org.bana.springboot.plugin.dubbo.api.BaseService;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;  
  
@Service("refService")  
public class RefService {  
      
    @Reference(group="helloService", version="1.0")  
    private BaseService baseService;  
      
    public String sayHello(String name){  
        return baseService.build(name);  
    }  
      
} 