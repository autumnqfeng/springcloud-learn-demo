package com.autu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * ClassName: ProductProvider_8001
 * date: 2019/9/23 17:37
 *
 * @author: qiufeng
 */
@EnableHystrix
@EnableEurekaClient
@MapperScan("com.autu.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8001_Hystrix {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001_Hystrix.class, args);
    }

}
