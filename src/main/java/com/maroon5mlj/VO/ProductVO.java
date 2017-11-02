package com.maroon5mlj.VO;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lovea on 2017/10/28.
 */
@Data
public class ProductVO implements Serializable {


    private static final long serialVersionUID = 6990740746469645341L;
    /**
     * 商品类别名字
     */
    @JsonProperty("name")
    private String  categoryName;

    /**
     *商品类别
     */
    @JsonProperty("type")
    private Integer categoryType;

    /**
     * 商品详情
     */
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
