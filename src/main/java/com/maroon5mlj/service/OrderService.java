package com.maroon5mlj.service;

import com.maroon5mlj.dataobject.OrderMaster;
import com.maroon5mlj.dto.OrderDTO;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by lovea on 2017/10/29.
 */
public interface OrderService {

    /**
     * 创建订单
     */

    OrderDTO create(OrderDTO orderDTO);

    /**
     * 查询订单
     */
    OrderDTO findOne(String orderId);

    /**
     * 查询订单列表
     */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /**
     * 取消订单
     */
    OrderDTO cancel(OrderDTO orderDTO);
    /**
     * 完结订单
     */
    OrderDTO finish(OrderDTO orderDTO);

    /**
     * 支付订单
     */
    OrderDTO pay(OrderDTO orderDTO);

    /**
     * 查询订单列表--卖家
     */
    Page<OrderDTO> findList(Pageable pageable);


}
