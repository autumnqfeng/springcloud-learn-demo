package com.autu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * ClassName: ConfigServer_5001
 * date: 2019/10/4 13:32
 *
 * @author: qiufeng
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServer_5001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_5001.class, args);
    }
}
