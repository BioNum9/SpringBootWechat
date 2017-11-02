package com.maroon5mlj.utils;

import com.maroon5mlj.enums.CodeEnum;

/**
 * Created by lovea on 2017/10/31.
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
        for(T each: enumClass.getEnumConstants()){
            if(code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
