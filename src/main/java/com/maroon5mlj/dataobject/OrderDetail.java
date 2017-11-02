package com.maroon5mlj.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by lovea on 2017/10/29.
 */
@Entity
@Data
public class OrderDetail {

    @Id
    private String     detailId;

    /**
     * 订单ID
     */
    private String     orderId;
    /**
     * 商品id
     */
    private String     productId;

    /**
     * 商品名字
     */
    private String     productName;

    /**
     * 商品价格
     */
    private BigDecimal productPrice;

    /**
     * 商品数量
     */
    private Integer    productQuantity;

    /**
     * 商品图片
     */
    private String     productIcon;
}
