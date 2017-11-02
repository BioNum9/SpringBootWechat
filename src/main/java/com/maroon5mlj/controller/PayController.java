package com.maroon5mlj.controller;

import com.maroon5mlj.dto.OrderDTO;
import com.maroon5mlj.enums.ResultEnum;
import com.maroon5mlj.exception.SellException;
import com.maroon5mlj.service.OrderService;
import com.maroon5mlj.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by lovea on 2017/10/31.
 */
@Controller
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private PayService payService;

    @GetMapping("/create")
    public ModelAndView create(@RequestParam("orderId") String orderId,
                       @RequestParam("returnUrl") String returnUrl,
                       Map<String, Object> map){
        //查询订单
        OrderDTO orderDTO = orderService.findOne(orderId);
        //订单不存在的话，报错
        if(orderDTO == null){
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }

        //发起支付
        payService.create(orderDTO);

        map.put("result","111111");

        return new ModelAndView("pay/create",map);
    }

    @PostMapping("/notify")
    public void notify(@RequestBody String notifyData){

    }

}
