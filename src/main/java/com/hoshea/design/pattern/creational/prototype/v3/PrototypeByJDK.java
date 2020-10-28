package com.hoshea.design.pattern.creational.prototype.v3;

/**
 * 通过jdk实现原型模式
 */
public class PrototypeByJDK {
    public static void main(String[] args) {
        //创建原型对象
        ConcretePrototype concretePrototype = new ConcretePrototype("original");
        System.out.println(concretePrototype);
        //复制原型对象
        ConcretePrototype cloneType = (ConcretePrototype) concretePrototype.clone();
        cloneType.desc = "clone";
        System.out.println(cloneType);
    }

    static class ConcretePrototype implements Cloneable{
        private String desc;

        public ConcretePrototype(String desc) {
            this.desc = desc;
        }

        @Override
        protected Object clone() {
            ConcretePrototype cloneType = null;
            try {
                cloneType = (ConcretePrototype) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return cloneType;
        }

        @Override
        public String toString() {
            return "ConcretePrototype{" +
                    "desc='" + desc + '\'' +
                    '}';
        }
    }
}
