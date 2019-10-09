package com.autu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: ConfigClient
 * date: 2019/10/5 10:18
 *
 * @author: qiufeng
 */
@RestController
public class ConfigClient {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig() {
        String content = "applicationName:" + applicationName + ",port:" + port;
        System.out.println("content:" + content);
        return content;
    }
}
