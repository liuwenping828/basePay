package com.wenping.basepay.component.pays;

import com.wenping.basepay.component.model.PayChannel;
import com.wenping.basepay.component.pays.ali.AliPay;

public class PaysFactory {

    public static IPayable GetInstance(PayChannel payType) {
        IPayable pay = null;
        switch (payType) {
            case CHANNEL_ALIPAY:
                pay = new AliPay();
                break;
            case CHANNEL_WEIXIN:
                pay = new WeixinPay();
                break;
            default:
                break;
        }
        return pay;
    }
}
