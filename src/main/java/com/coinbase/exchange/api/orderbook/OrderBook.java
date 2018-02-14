package com.coinbase.exchange.api.orderbook;

import com.coinbase.exchange.api.websocketfeed.message.HeartBeat;
import com.coinbase.exchange.api.websocketfeed.message.OrderBookMessage;

public interface OrderBook {
	
	/**
	 * Handle heartbeat.
	 * 
	 * @param object
	 */
	public void heartBeat(HeartBeat object);
	
	/**
	 * Handle update.
	 * 
	 * @param order
	 */
	public void updateOrderBook(OrderBookMessage order);
}
