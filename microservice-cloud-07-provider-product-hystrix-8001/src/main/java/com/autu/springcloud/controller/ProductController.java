package com.autu.springcloud.controller;

import com.autu.springcloud.entities.Product;
import com.autu.springcloud.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: ProductController
 * date: 2019/9/23 17:26
 *
 * @author: qiufeng
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    @HystrixCommand(fallbackMethod = "getFallBack")
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {

        Product product = productService.get(id);

        if(product == null) {
            throw new RuntimeException("ID=" + id + "无效");
        }

        return product;
    }

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

    public Product getFallBack(@PathVariable("id") Long id) {
        return new Product(id, "ID=" + id + "无效--@HystrixCommand", "无有效数据库");
    }

}
