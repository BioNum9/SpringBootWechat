package com.maroon5mlj.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maroon5mlj.dataobject.OrderDetail;
import com.maroon5mlj.enums.OrderStatusEnum;
import com.maroon5mlj.enums.PayStatusEnum;
import com.maroon5mlj.utils.EnumUtil;
import com.maroon5mlj.utils.serializer.Data2Long;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by lovea on 2017/10/29.
 */
@Data
public class OrderDTO {

    /**
     * 订单ID
     */
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
    private Integer     orderStatus;

    /**
     * 支付状态，默认未支付
     */
    private Integer     payStatus;

    /**
     * 创建时间
     */
    //转换返回数据格式
    @JsonSerialize(using = Data2Long.class)
    private Date        createTime;

    /**
     * 更新时间
     */
    //转换返回数据格式
    @JsonSerialize(using = Data2Long.class)
    private Date        updateTime;

    /**
     * 订单详情列表
     */
    private List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum(){
        return EnumUtil.getByCode(orderStatus,OrderStatusEnum.class);
    }
    @JsonIgnore
    public PayStatusEnum getPayStatusEnum(){
        return EnumUtil.getByCode(payStatus,PayStatusEnum.class);
    }
}
