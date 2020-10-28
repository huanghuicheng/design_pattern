package com.hoshea.design.pattern.creational.prototype.v4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/**
 * 实现深克隆和浅克隆
 *
 * @author huanghuicheng
 */
public class ConcretePrototype implements Cloneable, Serializable {
    public Integer age;
    public String name;
    public List<String> hobbies;

    /**
     * 浅克隆
     *
     * @return 克隆对象
     * @throws CloneNotSupportedException 如果没有实现Cloneable接口，则抛出该异常
     */
    @Override
    public ConcretePrototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
    }

    public ConcretePrototype deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(bis);
        return (ConcretePrototype) objectInputStream.readObject();
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
