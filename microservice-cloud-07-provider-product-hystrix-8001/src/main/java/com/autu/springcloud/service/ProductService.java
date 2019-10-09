package com.autu.springcloud.service;

import com.autu.springcloud.entities.Product;

import java.util.List;

/**
 * ClassName: ProductService
 * date: 2019/9/23 17:17
 *
 * @author: qiufeng
 */
public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();

}
