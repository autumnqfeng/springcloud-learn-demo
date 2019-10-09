package com.autu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName: EurekaServer_Config_6001
 * date: 2019/10/5 11:19
 *
 * @author: qiufeng
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer_Config_6001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_Config_6001.class, args);
    }
}
