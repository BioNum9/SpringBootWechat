package com.maroon5mlj.service;

import com.maroon5mlj.dataobject.SellerInfo;

/**
 * Created by lovea on 2017/11/1.
 */
public interface SellerService {

    /**
     * 通过openid查询卖家信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
