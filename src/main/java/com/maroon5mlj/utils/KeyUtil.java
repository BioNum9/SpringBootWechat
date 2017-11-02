package com.maroon5mlj.utils;

import java.util.Random;

/**
 * Created by lovea on 2017/10/29.
 */
public class KeyUtil {

    /**
     * 生成主键
     * 时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();

        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }

}
