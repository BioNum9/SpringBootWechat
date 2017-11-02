package com.maroon5mlj.service.impl;

import com.maroon5mlj.dataobject.SellerInfo;
import com.maroon5mlj.repository.SellerInfoRepository;
import com.maroon5mlj.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by lovea on 2017/11/1.
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
