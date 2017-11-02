package com.maroon5mlj.dto;

import lombok.Data;

/**购物车
 * Created by lovea on 2017/10/29.
 */
@Data
public class CartDTO {

    /**
     * 商品ID
     */
    private String  productId;
    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
