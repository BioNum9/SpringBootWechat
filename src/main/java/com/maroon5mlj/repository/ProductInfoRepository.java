package com.maroon5mlj.repository;

import com.maroon5mlj.dataobject.ProductCategory;
import com.maroon5mlj.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by lovea on 2017/10/27.
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>{

    /**
     * 查找上架商品
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);


}
