package com.maroon5mlj.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;


/**
 * http请求返回的最外层对象
 * Created by lovea on 2017/10/28.
 */
@Data
public class ResultVO<T> implements Serializable{


    private static final long serialVersionUID = 7217612088607147452L;
    /**
     * 信息码
     */
    private Integer code;
    /**
     * 信息
     */
    private String  msg;
    /**
     * 数据对象
     */
    private T       data;
}
