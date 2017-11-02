package com.maroon5mlj.enums;

import lombok.Getter;

/**
 * Created by lovea on 2017/10/29.
 */
@Getter
public enum OrderStatusEnum implements CodeEnum{

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCELED(2,"已取消");

    private Integer code;

    private String  msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
