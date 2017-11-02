package com.maroon5mlj.repository;

import com.maroon5mlj.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lovea on 2017/10/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void save(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId("123123");
        orderDetail.setDetailId("123121233");
        orderDetail.setProductIcon("12312312");
        orderDetail.setProductId("1122");
        orderDetail.setProductName("测试");
        orderDetail.setProductPrice(new BigDecimal(12.2));
        orderDetail.setProductQuantity(123);

        OrderDetail result =  repository.save(orderDetail);

        Assert.assertNotNull(result);
    }


    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> orderDetailList = repository.findByOrderId("123123");

        Assert.assertNotEquals(0,orderDetailList.size());
    }

}