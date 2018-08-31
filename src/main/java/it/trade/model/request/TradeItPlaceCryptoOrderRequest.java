package it.trade.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TradeItPlaceCryptoOrderRequest extends TradeItRequestWithSession {

    @SerializedName("orderId")
    @Expose
    public String orderId;

    public TradeItPlaceCryptoOrderRequest(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "TradeItPlaceCryptoOrderRequest{" +
                "orderId='" + orderId + '\'' +
                "}, " + super.toString();
    }
}
