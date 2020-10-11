package com.hoshea.design.principle.openclose;

import java.math.BigDecimal;

/**
 * @author huanghuicheng
 * @Description TODO
 * @createTime 2020年08月17日 16:30:00
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Integer price) {
        super(id, name, price);
    }

    public Integer getDiscountPrice() {
        return new BigDecimal(String.valueOf(super.getPrice())).multiply(new BigDecimal(String.valueOf(0.8))).intValue();
    }
}
