package com.maroon5mlj.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by lovea on 2017/10/27.
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /**
     * 类目ID
     */
    @Id
    @GeneratedValue
    private Integer categoryId;
    /**
     * 类目名称
     */
    private String  categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;

    /**
     * 创建日期
     */
    private Date    createTime;

    public ProductCategory(){

    }

    public ProductCategory(String categoryName, Integer categoryType,Date createTime) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
        this.createTime   = createTime;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                '}';
    }
}
