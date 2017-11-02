package com.maroon5mlj.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 前端商品信息最外层对象
 * Created by lovea on 2017/10/28.
 */
@Data
public class ProductInfoVO implements Serializable {


    private static final long serialVersionUID = -2301654227422027058L;
    /**
     * 商品Id
     */
    @JsonProperty("id")
    private String     productId;
    /**
     * 商品名称
     */
    @JsonProperty("name")
    private String     productName;

    /**
     * 商品价格
     */
    @JsonProperty("price")
    private BigDecimal productPrice;

    /**
     * 商品描述
     */
    @JsonProperty("description")
    private String     productDescription;

    /**
     * 商品图片
     */
    @JsonProperty("icon")
    private String     productIcon;
}
