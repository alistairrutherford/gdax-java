package com.coinbase.exchange.api.websocketfeed.message;

/**
 * Created by robevansuk on 12/03/2017.
 */
public class Subscribe {

    private String type;
    private String[] product_ids;

    // Used for signing the subscribe message to the Websocket feed
    private String signature;
    private String passphrase;
    private String timestamp;
    private String apiKey;

    public Subscribe() { }

    public Subscribe(String[] product_ids) {
        this.type = "subscribe";
        this.product_ids = product_ids;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getProduct_ids() {
        return product_ids;
    }

    public void setProduct_ids(String[] product_ids) {
        this.product_ids = product_ids;
    }

    public Subscribe setSignature(String signature) {
        this.signature = signature;
        return this;
    }

    public Subscribe  setPassphrase(String passphrase) {
        this.passphrase = passphrase;
        return this;
    }

    public Subscribe setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Subscribe setKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getSignature() {
		return signature;
	}

	public String getPassphrase() {
		return passphrase;
	}

	public String getTimestamp() {
		return timestamp;
	}

}
