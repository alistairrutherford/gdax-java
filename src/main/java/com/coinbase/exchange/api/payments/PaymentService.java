package com.coinbase.exchange.api.payments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;

import com.coinbase.exchange.api.exchange.GdaxExchange;

/**
 * Created by robevansuk on 16/02/2017.
 */
@Component
public class PaymentService {

	public static final String PAYMENT_METHODS_ENDPOINT = "/payment-methods";
	public static final String COINBASE_ACCOUNTS_ENDPOINT = "/coinbase-accounts";

    @Autowired
    GdaxExchange gdaxExchange;

    public PaymentTypes getPaymentTypes() {
        return gdaxExchange.get(PAYMENT_METHODS_ENDPOINT, new ParameterizedTypeReference<PaymentTypes>(){});
    }

    public CoinbaseAccounts getCoinbaseAccounts() {
        return gdaxExchange.get(COINBASE_ACCOUNTS_ENDPOINT, new ParameterizedTypeReference<CoinbaseAccounts>() {});
    }
}