package com.maroon5mlj.service.impl;

import com.maroon5mlj.dataobject.SellerInfo;
import com.maroon5mlj.service.SellerService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by lovea on 2017/11/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerServiceImplTest {


    @Autowired
    private SellerServiceImpl sellerService;

    private static final String openid = "abc";
    @Test
    public void findSellerInfoByOpenid() throws Exception {
        SellerInfo result = sellerService.findSellerInfoByOpenid(openid);

        Assert.assertEquals(openid,result.getOpenid());
    }

}