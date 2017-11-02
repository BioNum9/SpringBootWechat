package com.maroon5mlj.service.impl;

import com.maroon5mlj.dto.OrderDTO;
import com.maroon5mlj.enums.ResultEnum;
import com.maroon5mlj.exception.SellException;
import com.maroon5mlj.service.OrderService;
import com.maroon5mlj.service.PayService;
import com.maroon5mlj.utils.MathUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by lovea on 2017/10/31.
 */
@Service
@Slf4j
public class PayServiceImpl implements PayService {

    @Autowired
    private OrderService orderService;

    @Override
    public void create(OrderDTO orderDTO) {
        //Do pay here
        orderService.pay(orderDTO);
    }

    @Override
    public void notify(String data) {

        //验证签名
        //支付状态--是否支付成功？
        //支付金额
        //支付人


        //接受异步通知

        //修改订单状态为已支付

        //查询订单
        OrderDTO orderDTO = orderService.findOne("1231232");

        //判断订单是否存在
        if(orderDTO == null){
            //日志报错
            log.error("【微信支付】异步通知, 订单不存在, orderId={}", "1231232");
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }
        //判断金额是否一致
        if(!MathUtil.equals(orderDTO.getOrderAmount().doubleValue(),new BigDecimal(0).doubleValue())){
            log.error("【微信支付】异步通知, 订单金额不一致, orderId={}, 微信通知金额={}, 系统金额={}",
                    data,
                    orderDTO.getOrderAmount());
            throw new SellException(ResultEnum.WXPAY_NOTIFY_MONEY_VERIFY_ERROR);
        }
        //修改支付状态
        orderService.pay(orderDTO);

    }
}
