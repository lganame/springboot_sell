package com.imooc.dataobject;

import com.imooc.enums.ProductStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@DynamicUpdate
@Data
public class ProductInfo {
    /** 类目id. */
    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productIcon;

    /** 状态, 0正常1下架. */
    private Integer productStatus = ProductStatusEnum.UP.getCode();
    private Integer category_type;
    private Date createTime;
    private Date updateTime;

    public ProductInfo() {
    }

    public ProductInfo(BigDecimal productPrice, Integer productStock, String productIcon, Integer category_type, Date createTime, Date updateTime) {
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productIcon = productIcon;
        this.category_type = category_type;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
