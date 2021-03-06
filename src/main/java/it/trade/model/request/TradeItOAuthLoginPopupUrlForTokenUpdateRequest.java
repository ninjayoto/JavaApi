package it.trade.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TradeItOAuthLoginPopupUrlForTokenUpdateRequest extends TradeItOAuthLoginPopupUrlForMobileRequest {

    @SerializedName("userId")
    @Expose
    public String userId;

    @SerializedName("userToken")
    @Expose
    public String userToken;

    public TradeItOAuthLoginPopupUrlForTokenUpdateRequest(String apiKey, String broker, String interAppAddressCallback, String userId, String userToken) {
        super(apiKey, broker, interAppAddressCallback);
        this.userId = userId;
        this.userToken = userToken;
    }

    private TradeItOAuthLoginPopupUrlForTokenUpdateRequest() {}

    @Override
    public String toString() {
        return "TradeItOAuthLoginPopupUrlForTokenUpdateRequest{" +
                "userId='" + userId + '\'' +
                "userToken='" + userToken + '\'' +
                '}';
    }
}
