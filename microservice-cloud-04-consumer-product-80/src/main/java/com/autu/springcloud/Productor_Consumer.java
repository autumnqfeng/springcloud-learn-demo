package com.autu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: Productor_Consumer
 * date: 2019/9/24 21:58
 *
 * @author: qiufeng
 */
@EnableEurekaClient
@SpringBootApplication
public class Productor_Consumer {
    public static void main(String[] args) {
        SpringApplication.run(Productor_Consumer.class, args);
    }
}
