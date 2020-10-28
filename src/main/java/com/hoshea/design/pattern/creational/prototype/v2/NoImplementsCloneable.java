package com.hoshea.design.pattern.creational.prototype.v2;

public class NoImplementsCloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        NoImplementsCloneable noImplementeCloneable = new NoImplementsCloneable();
        noImplementeCloneable.clone(); // 抛出java.lang.CloneNotSupportedException
    }
}
