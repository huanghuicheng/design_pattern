package com.hoshea.design.pattern.structural.proxy.v2_2;

public class Main {
    public static void main(String[] args) {
        HunJieSuo hunJieSuo = new HunJieSuo();
        IPersion intance = hunJieSuo.getIntance(new Zhangshan());
        intance.findLove();
    }
}
