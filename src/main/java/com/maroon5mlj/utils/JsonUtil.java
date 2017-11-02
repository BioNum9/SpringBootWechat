package com.maroon5mlj.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.omg.CORBA.Object;

/**
 * Created by lovea on 2017/10/31.
 */
public class JsonUtil {

    /**
     * 对象转化为JSON
     * @param object
     * @return
     */
    public static String toJson(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }

}
