package com.coinbase.exchange.api;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coinbase.exchange.ap.testi.TestConfig;
import com.coinbase.exchange.api.exchange.GdaxExchange;

/**
 * Created by robevansuk on 20/01/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfig.class })
public abstract class BaseTest {

	@Autowired
	public GdaxExchange exchange;
}
