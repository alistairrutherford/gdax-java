package com.coinbase.exchange.api.products;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.coinbase.exchange.api.BaseTest;
import com.coinbase.exchange.api.entity.Product;

/**
 * Created by robevansuk on 08/02/2017.
 */
public class ProductsTest extends BaseTest {

    @Autowired
    ProductService productService;

    @Test
    public void canGetProducts() {
        List<Product> products = productService.getProducts();
        assertTrue(products.size() >= 0);
    }
}
