package com.coinbase.exchange.api.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;

import com.coinbase.exchange.api.entity.Product;
import com.coinbase.exchange.api.exchange.GdaxExchange;

/**
 * Created by robevansuk on 03/02/2017.
 */
@Component
public class ProductService {

    @Autowired
    private GdaxExchange exchange;

    public static final String PRODUCTS_ENDPOINT = "/products";

    // no paged products necessary
    public List<Product> getProducts() {
        return exchange.getAsList(PRODUCTS_ENDPOINT, new ParameterizedTypeReference<Product[]>(){});
    }
}
