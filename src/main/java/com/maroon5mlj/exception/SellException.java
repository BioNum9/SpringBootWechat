package com.maroon5mlj.exception;

import com.maroon5mlj.enums.ResultEnum;
import lombok.Getter;

/**
 * Created by lovea on 2017/10/29.
 */
@Getter
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super(message);
        this.code = code;
    }
}
