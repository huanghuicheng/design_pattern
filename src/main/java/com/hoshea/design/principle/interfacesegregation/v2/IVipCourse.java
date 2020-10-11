package com.hoshea.design.principle.interfacesegregation.v2;

public interface IVipCourse extends ICommonCourse{
    // vip用户登陆可以查看的课程信息
    byte[] downloadCourse();

    void playVideo();

    void joinStudyGroup();
}
