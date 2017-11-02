package com.maroon5mlj.service;

import com.maroon5mlj.dto.OrderDTO;

/**
 * Created by lovea on 2017/10/31.
 */
public interface PayService {

    void create(OrderDTO orderDTO);

    void notify(String data);
}
