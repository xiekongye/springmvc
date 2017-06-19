package com.xiekongye.ws;

/**
 * Created by You on 2017/6/19.
 */
public class GetOrderDetailImpl implements IGetOrderDetail {
    public String getOrderDetail(Long orderId) {
        return String.format("Find order detail : %s",orderId);
    }
}
