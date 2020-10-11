package com.hoshea.design.pattern.creational.simplefactory;

/**
 * 简单工厂通用写法
 */
public class CommonSimpleFactory {

    //抽象产品
    public interface IProduct {
        void doSomething();
    }

    static class ProductA implements IProduct {
        @Override
        public void doSomething() {
            System.out.println("I am Product A");
        }
    }

    static class ProductB implements IProduct {
        @Override
        public void doSomething() {
            System.out.println("I am Product B");
        }
    }

    static class ProductC implements IProduct {
        @Override
        public void doSomething() {
            System.out.println("I am Product C");
        }
    }

    final class Const {
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
        static final int PRODUCT_C = 2;
    }

    static class SimpleFactory {
        public static IProduct makeProduct(int kind) {
            IProduct product = null;
            switch (kind) {
                case Const.PRODUCT_A:
                    product = new ProductA();
                    break;
                case Const.PRODUCT_B:
                    product = new ProductB();
                    break;
                case Const.PRODUCT_C:
                    product = new ProductC();
                    break;
                default:
                    break;
            }
            return product;
        }
    }

}


