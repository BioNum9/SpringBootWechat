package com.maroon5mlj.service.impl;

import com.maroon5mlj.dataobject.OrderDetail;
import com.maroon5mlj.dto.OrderDTO;
import com.maroon5mlj.enums.OrderStatusEnum;
import com.maroon5mlj.enums.PayStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lovea on 2017/10/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    private final String ORDER_ID = "1111111";

    private final String BUYER_OPEN_ID = "1212121";

    @Test
    public void create() throws Exception {

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("廖师兄");
        orderDTO.setBuyerAddress("幕课网");
        orderDTO.setBuyerPhone("123456789012");
        orderDTO.setBuyerOpenid(BUYER_OPEN_ID);

        //购物车
        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail o1 = new OrderDetail();
        o1.setProductId("123123");
        o1.setProductQuantity(1);

        OrderDetail o2 = new OrderDetail();
        o2.setProductId("321312");
        o2.setProductQuantity(2);

        orderDetailList.add(o1);
        orderDetailList.add(o2);

        orderDTO.setOrderDetailList(orderDetailList);

        OrderDTO result = orderService.create(orderDTO);
        log.info("【创建订单】result={}", result);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() throws Exception {
        OrderDTO result = orderService.findOne(ORDER_ID);
        log.info("【查询单个订单】result = {}" + result);
        Assert.assertEquals(ORDER_ID,result.getOrderId());
    }

    @Test
    public void findList() throws Exception {
        PageRequest pageRequest = new PageRequest(0,2);

        Page<OrderDTO> orderDTOPage = orderService.findList(BUYER_OPEN_ID,pageRequest);

        Assert.assertNotEquals(0,orderDTOPage.getTotalElements());
    }

    @Test
    public void cancel() throws Exception {
        OrderDTO result = orderService.findOne(ORDER_ID);
        OrderDTO result2 = orderService.cancel(result);
        Assert.assertEquals(OrderStatusEnum.CANCELED.getCode(),result2.getOrderStatus());
    }


    @Test
    public void finish() throws Exception {
        OrderDTO result = orderService.findOne(ORDER_ID);
        OrderDTO result2 = orderService.finish(result);
        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(),result2.getOrderStatus());
    }

    /**
     * 支付订单
     * @throws Exception
     */
    @Test
    public void pay() throws Exception {
        OrderDTO result = orderService.findOne(ORDER_ID);
        OrderDTO result2 = orderService.finish(result);
        Assert.assertEquals(PayStatusEnum.PAID.getCode(),result2.getOrderStatus());
    }

    @Test
    public void list(){

        PageRequest pageRequest = new PageRequest(0,2);

        Page<OrderDTO> orderDTOPage = orderService.findList(pageRequest);

//        Assert.assertNotEquals(0,orderDTOPage.getTotalElements());
        Assert.assertTrue("查询所有订单列表",orderDTOPage.getTotalElements() > 0);
    }

}