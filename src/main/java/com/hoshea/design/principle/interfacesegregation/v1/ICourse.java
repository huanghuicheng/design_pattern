package com.hoshea.design.principle.interfacesegregation.v1;

public interface ICourse {
    // 普通用户登陆可以查看的课程信息
    void playCourseInfo();

    void playCoursePrice();

    void playCourseTime();

    // vip用户登陆可以查看的课程信息
    byte[] downloadCourse();

    void playVideo();

    void joinStudyGroup();
}
