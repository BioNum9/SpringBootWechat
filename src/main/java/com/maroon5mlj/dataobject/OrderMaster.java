package com.maroon5mlj.dataobject;

import com.maroon5mlj.enums.OrderStatusEnum;
import com.maroon5mlj.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单主表实体类
 * Created by lovea on 2017/10/29.
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /**
     * 订单ID
     */
    @Id
    private String      orderId;
    /**
     * 买家名字
     */
    private String      buyerName;

    /**
     * 买家手机号
     */
    private String      buyerPhone;

    /**
     * 买家地址
     */
    private String      buyerAddress;

    /**
     * 买家微信openid
     */
    private String      buyerOpenid;

    /**
     * 订单总金额
     */
    private BigDecimal  orderAmount;

    /**
     * 订单状态
     * 默认为新订单
     */
    private Integer     orderStatus = OrderStatusEnum.NEW.getCode();

    /**
     * 支付状态，默认未支付
     */
    private Integer     payStatus   = PayStatusEnum.NOT_PAID.getCode();

    /**
     * 创建时间
     */
    private Date        createTime;

    /**
     * 更新时间
     */
    private Date        updateTime;

}
