package com.coinbase.exchange.api.marketdata;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.coinbase.exchange.api.BaseTest;

/**
 * Created by robevansuk on 14/02/2017.
 */
public class MarketDataTest extends BaseTest {

    @Autowired
    MarketDataService marketDataService;

    @Test
    public void canGetMarketDataForLevelOneBidAndAsk() {
        MarketData marketData = marketDataService.getMarketDataOrderBook("BTC-GBP", "1");
        System.out.println(marketData);
        assertTrue(marketData.getSequence() > 0);
    }

    @Test
    public void canGetMarketDataForLevelTwoBidAndAsk() {
        MarketData marketData = marketDataService.getMarketDataOrderBook("BTC-GBP", "2");
        System.out.println(marketData);
        assertTrue(marketData.getSequence() > 0);
    }

    /**
     * note that the returned results are slightly different for level 3. For level 3 you will see an
     * order Id rather than the count of orders at a certain price.
     */
    @Test
    public void canGetMarketDataForLevelThreeBidAndAsk() {
        MarketData marketData = marketDataService.getMarketDataOrderBook("BTC-GBP", "3");
        System.out.println(marketData);
        assertTrue(marketData.getSequence() > 0);
    }
}
