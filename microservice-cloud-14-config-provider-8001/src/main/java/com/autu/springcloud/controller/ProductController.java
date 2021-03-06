package com.autu.springcloud.controller;

import com.autu.springcloud.entities.Product;
import com.autu.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: ProductController
 * date: 2019/9/23 17:26
 *
 * @author: qiufeng
 */
@RefreshScope
@RestController
public class ProductController {

    @Value("${emp.name}")
    private String name;

    @RequestMapping("/hello")
    public String getName() {
        return name;
    }

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        return productService.get(id);
    }

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

}
