package com.autu.springcloud.mapper;

import com.autu.springcloud.entities.Product;

import java.util.List;

/**
 * ClassName: ProductMapper
 * date: 2019/9/23 16:56
 *
 * @author: qiufeng
 */
// @Mapper //或在主启动类上使用@MapperScan注解
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);

}
