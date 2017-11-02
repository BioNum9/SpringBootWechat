package com.maroon5mlj.enums;

import lombok.Getter;

/**
 * Created by lovea on 2017/10/28.
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在售"),
    DOWN(1,"下架")
    ;
    private Integer code;

    private String  msg;

    ProductStatusEnum(Integer code,String msg){
        this.code = code;
        this.msg  = msg;
    }

}
