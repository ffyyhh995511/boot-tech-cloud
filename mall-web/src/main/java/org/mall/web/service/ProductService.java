package org.mall.web.service;

import java.util.List;

import org.product.service.dto.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product Service
 *
 * @author CD826(CD826Dong@gmail.com)
 * @since 1.0.0
 */
@FeignClient(name = "PRODUCT-SERVICE", fallback = ProductServiceFallback.class)
public interface ProductService {

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    List<Product> findAll();

    @RequestMapping(value = "/products/{itemCode}", method = RequestMethod.GET)
    Product loadByItemCode(@PathVariable("itemCode") String itemCode);

}

