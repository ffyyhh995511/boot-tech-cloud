package org.mall.web.service;

import java.util.Collections;
import java.util.List;

import org.product.service.dto.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * Product Service Fallback
 *
 * @author CD826(CD826Dong@gmail.com)
 * @since 1.0.0
 */
@Component
public class ProductServiceFallback implements ProductService {
    @Override
    public List<Product> findAll() {
        return Collections.emptyList();
    }

    @Override
    public Product loadByItemCode(@PathVariable("itemCode") String itemCode) {
        return new Product("error", "未知", "TwoStepsFromJava-Fallback", 0);
    }
}

