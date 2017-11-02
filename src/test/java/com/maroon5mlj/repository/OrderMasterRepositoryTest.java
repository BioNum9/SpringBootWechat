package com.maroon5mlj.repository;

import com.maroon5mlj.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by lovea on 2017/10/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private final String OPENID = "121212";

    @Test
    public void save(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1111111");
        orderMaster.setBuyerName("Adms");
        orderMaster.setBuyerPhone("123123123123");
        orderMaster.setBuyerAddress("Avenue");
        orderMaster.setBuyerOpenid("121212");
        orderMaster.setOrderAmount(new BigDecimal(11.1));
        orderMaster.setCreateTime(new Date());
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }



    @Test
    public void findByBuyerOpenId() throws Exception {
        PageRequest pageRequest = new PageRequest(0,1);

        Page<OrderMaster> result = repository.findByBuyerOpenid(OPENID,pageRequest);

        Assert.assertNotEquals(0,result.getTotalElements());

        System.out.println(result.getTotalElements());
    }

}