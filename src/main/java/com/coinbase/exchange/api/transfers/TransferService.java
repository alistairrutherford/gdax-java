package com.coinbase.exchange.api.transfers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;

import com.coinbase.exchange.api.exchange.GdaxExchange;

/**
 * This class is best used in conjunction with the coinbase library
 * to get the coinbase account Id's. see: https://github.com/coinbase/coinbase-java
 *
 * Created by robevansuk on 15/02/2017.
 */
@Component
public class TransferService {

    public static final String TRANSFER_ENDPOINT = "/transfers";

    @Autowired
    private GdaxExchange gdaxExchange;

    /**
     * TODO untested due to lack of a coinbaseaccountID to test with.
     * @param type
     * @param amount
     * @param coinbaseAccountId
     * @return
     */
    public String transfer(String type, BigDecimal amount, String coinbaseAccountId) {
        return gdaxExchange.post(TRANSFER_ENDPOINT,
                new ParameterizedTypeReference<String>(){},
                new Transfer(type, amount, coinbaseAccountId));
    }

}
