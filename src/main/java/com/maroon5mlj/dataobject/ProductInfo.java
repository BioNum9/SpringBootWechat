package com.maroon5mlj.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by lovea on 2017/10/27.
 */
@Entity
@DynamicUpdate
@Data
public class ProductInfo {

    @Id
    private String    productId;

    /**
     * 商品名称
     */
    private String     productName;

    /**
     * 单价
     */
    private BigDecimal productPrice;

    /**
     * 库存
     */
    private Integer    productStock;

    /**
     * 商品描述
     */
    private String     productDescription;

    /**
     * 小图
     */
    private String     productIcon;

    /**
     * 商品状态
     * 0正常
     * 1下架
     */
    private Integer    productStatus;

    /**
     * 类目编号
     */
    private Integer    categoryType;

    /**
     * 创建时间
     */
    private Date       createTime;


}
