package com.autu.springcloud.service;

import com.autu.springcloud.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * ClassName: ProductClientService
 * date: 2019/9/26 13:34
 *
 * @author: qiufeng
 */
@FeignClient(value = "microservice-product", fallback = ProductClientServiceFallBack.class)
public interface ProductClientService {

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    Product get(@PathVariable Long id);

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    List<Product> list();

    @RequestMapping(value = "product/add", method = RequestMethod.POST)
    boolean add(Product product);
}
