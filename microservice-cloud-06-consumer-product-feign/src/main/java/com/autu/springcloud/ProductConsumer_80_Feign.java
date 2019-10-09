package com.autu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: ProductConsumer_80_Feign
 * date: 2019/9/26 13:17
 *
 * @author: qiufeng
 */
// 会扫描指定包下标记了@FeignClient注解的接口，并生成此接口的代理对象
@EnableFeignClients(basePackages = "com.autu.springcloud")
@EnableEurekaClient
@SpringBootApplication
public class ProductConsumer_80_Feign {
    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_80_Feign.class, args);
    }
}
