package com.autu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: ProductProvider_8001
 * date: 2019/9/23 17:37
 *
 * @author: qiufeng
 */
@EnableEurekaClient
@MapperScan("com.autu.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8002 {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8002.class, args);
    }

}
