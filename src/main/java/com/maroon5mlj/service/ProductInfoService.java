package com.maroon5mlj.service;

import com.maroon5mlj.dataobject.ProductInfo;
import com.maroon5mlj.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by lovea on 2017/10/28.
 */
public interface ProductInfoService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在售商品
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * 减库存
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
