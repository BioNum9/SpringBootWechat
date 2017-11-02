package com.maroon5mlj.utils;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;

/**
 * Created by lovea on 2017/10/29.
 */
public class MathUtil {

    private static final Double MONEY_RANGE = 0.01;

    /**
     * 乘法
     * @param price
     * @param count
     * @return
     */
    public static BigDecimal multiply(BigDecimal price,BigDecimal count){
        return price.multiply(count);
    }

    /**
     * 加法
     * @param number1
     * @param number2
     * @return
     */
    public static BigDecimal add(BigDecimal number1,BigDecimal number2){
        return number1.add(number2);
    }


    /**
     * 比较大小
     * @param d1
     * @param d2
     * @return
     */
    public static Boolean equals(Double d1, Double d2){
        Double result = Math.abs(d1 - d2);

        if(result < MONEY_RANGE){
            return true;
        }else{
            return false;
        }
    }
}
