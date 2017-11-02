package com.maroon5mlj.service;

import com.maroon5mlj.dto.OrderDTO;

/**
 * 买家服务层
 * Created by lovea on 2017/10/30.
 */
public interface BuyerService {


    /**
     * 查询订单
     */
    OrderDTO findOneOrder(String openid,String orderId);

    /**
     * 取消订单
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO cancelOrder(String openid,String orderId);

}
