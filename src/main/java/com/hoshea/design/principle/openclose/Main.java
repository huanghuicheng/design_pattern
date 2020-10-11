package com.hoshea.design.principle.openclose;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author huanghuicheng
 * @Description TODO
 * @createTime 2020年08月17日 16:33:00
 */
public class Main {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        JavaDiscountCourse javaDiscountCourse =
                new JavaDiscountCourse(1, "java设计模式", 99999);
        System.out.println(
                "课程编号：" + javaDiscountCourse.getId() + "\t" +
                "课程名称：" + javaDiscountCourse.getName() + "\t" +
                "课程原价：" + numberFormat.format(javaDiscountCourse.getPrice()/100.0) + "\t" +
                "课程折扣价：" + numberFormat.format(javaDiscountCourse.getDiscountPrice()/100.0) + "\t");
    }
}
