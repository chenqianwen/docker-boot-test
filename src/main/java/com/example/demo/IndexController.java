package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author： ygl
 * @date： 2018/5/9-14:48
 * @Description：
 */
@RestController
public class IndexController {

    @Value("${name}")
    private String name;

    private int count = 0;

    @GetMapping("/index")
    public String index(){
        count++;
        return count+name;
    }

}
