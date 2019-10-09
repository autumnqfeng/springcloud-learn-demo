package com.autu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: ProductProvider_Config_8001
 * date: 2019/10/5 14:11
 *
 * @author: qiufeng
 */
@MapperScan("com.autu.springcloud.mapper")
@EnableEurekaClient
@SpringBootApplication
public class ProductProvider_Config_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_Config_8001.class, args);
    }
}
