package com.hoshea.design.principle.openclose;

/**
 * @author huanghuicheng
 * @Description TODO
 * @createTime 2020年08月17日 15:58:00
 */
public class JavaCourse implements ICourse {
    private Integer id;

    private String name;

    private Integer price;

    public JavaCourse(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }
}
