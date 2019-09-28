package com.springboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/demo/")
public class SpringbootController {
    @RequestMapping("hello")
    public Object hello(){
        Map<String,Object> result=new HashMap<String, Object>();
        result.put("id","123");
        result.put("name","zhangsan");
        return result;
     }
}
