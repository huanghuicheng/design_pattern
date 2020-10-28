package com.hoshea.design.pattern.creational.prototype.v4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.age = 18;
        concretePrototype.name = "hhh";
        List<String> hobbies = new ArrayList<>();
        hobbies.add("lq");
        hobbies.add("zq");
        concretePrototype.hobbies = hobbies;

        ConcretePrototype clone = concretePrototype.clone();
        System.out.println(concretePrototype);
        System.out.println(clone);

        clone.name = "hhc";
        clone.age = 19;
        clone.hobbies.add("yx");
        System.out.println(concretePrototype);
        System.out.println(clone);

        System.out.println("====================deepClone=====================");
        ConcretePrototype deepClone = concretePrototype.deepClone();
        deepClone.hobbies.add("deepClone");
        System.out.println(concretePrototype);
        System.out.println(deepClone);
    }
}
