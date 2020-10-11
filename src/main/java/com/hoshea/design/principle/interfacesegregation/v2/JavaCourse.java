package com.hoshea.design.principle.interfacesegregation.v2;

public class JavaCourse implements IVipCourse {
    @Override
    public byte[] downloadCourse() {
        System.out.println("下载java课程。。。");
        return new byte[0];
    }

    @Override
    public void playVideo() {
        System.out.println("播放java课程");
    }

    @Override
    public void joinStudyGroup() {
        System.out.println("加入java课程交流讨论组");
    }

    @Override
    public void playCourseInfo() {
        System.out.println("java课程基本信息");
    }

    @Override
    public void playCoursePrice() {
        System.out.println("java课程需要￥99.9");
    }

    @Override
    public void playCourseTime() {
        System.out.println("java课程的时长是9个小时");
    }
}
