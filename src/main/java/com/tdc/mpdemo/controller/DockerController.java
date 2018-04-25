package com.tdc.mpdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * mp-demo
 * com.tdc.controller
 * author   taodachuan
 * date     2018/4/23 15:08
 */
@RestController
public class DockerController {

    @RequestMapping("/")
    public String url(){
        return "hello world";
    }
}
