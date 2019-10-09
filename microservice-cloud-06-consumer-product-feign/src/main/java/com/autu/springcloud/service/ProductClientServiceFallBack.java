package com.autu.springcloud.service;

import com.autu.springcloud.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ClassName: ProductClientServiceFallBack
 * date: 2019/9/26 17:35
 *
 * @author: qiufeng
 */
@Component
public class ProductClientServiceFallBack implements ProductClientService {

    @Override
    public Product get(Long id) {
        return new Product(id,"id=" + id + "无数据--feign&hystrix","无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }

    @Override
    public boolean add(Product product) {
        return false;
    }
}
