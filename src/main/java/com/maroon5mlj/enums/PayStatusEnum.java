package com.maroon5mlj.enums;

import lombok.Getter;

/**
 * Created by lovea on 2017/10/29.
 */
@Getter
public enum PayStatusEnum implements CodeEnum{

    NOT_PAID(0,"未支付"),
    PAID(1,"已支付");

    private Integer code;

    private String  msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
