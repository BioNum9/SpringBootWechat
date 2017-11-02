package com.maroon5mlj.service;

import com.maroon5mlj.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by lovea on 2017/10/27.
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
