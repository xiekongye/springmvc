package com.xiekongye.cxfws;

import javax.jws.WebService;

/**
 * Created by You on 2017/6/19.
 */
@WebService
public interface IGetOrderDetail {

    String getOrderDetail(Long orderId);
}
