package com.krol.webapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Value("${JAVA_HOME}")
     private String s;

    private int d;

    @RequestMapping("/test")
    public String test() {
        return s;
    }
}
