package com.autu.springcloud.controller;

import com.autu.springcloud.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * ClassName: ProductController_Consumer
 * date: 2019/9/24 21:38
 *
 * @author: qiufeng
 */
@RestController
public class ProductController_Consumer {

    // private static final String REST_URL_PRFIX = "http://localhost:8001";
    private static final String REST_URL_PRFIX = "http://microservice-product";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(@RequestBody Product product) {
        return restTemplate.postForObject(REST_URL_PRFIX + "/product/add", product, Boolean.class);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable Long id) {
        return restTemplate.getForObject(REST_URL_PRFIX + "/product/get/" +id, Product.class);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return restTemplate.getForObject(REST_URL_PRFIX + "/product/list", List.class);
    }
}
