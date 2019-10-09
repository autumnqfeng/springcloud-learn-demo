package com.autu.springcloud.service.impl;

import com.autu.springcloud.entities.Product;
import com.autu.springcloud.mapper.ProductMapper;
import com.autu.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: ProductServiceImpl
 * date: 2019/9/23 17:19
 *
 * @author: qiufeng
 */
@Service(value = "ProductService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Product get(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}
