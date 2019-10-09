package com.autu.springcloud.controller;

import com.autu.springcloud.entities.Product;
import com.autu.springcloud.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: ProductController_Feign
 * date: 2019/9/26 13:43
 *
 * @author: qiufeng
 */
@RestController
public class ProductController_Feign {
    @Autowired
    private ProductClientService service;

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return service.list();
    }

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        return service.add(product);
    }
}
