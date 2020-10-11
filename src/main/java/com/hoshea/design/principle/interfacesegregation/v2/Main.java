package com.hoshea.design.principle.interfacesegregation.v2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            ICommonCourse commonCourse = new JavaCourse();
            if ("普通用户".equals(in.nextLine())) {
                commonCourse.playCourseInfo();
                commonCourse.playCoursePrice();
                commonCourse.playCourseTime();
            }

            System.out.println("升级vip用户");
            IVipCourse vipCourse = (IVipCourse) commonCourse;
            vipCourse.downloadCourse();
            vipCourse.joinStudyGroup();
            vipCourse.playVideo();

            System.out.println("Vip到期");
            commonCourse.playCourseInfo();
            commonCourse.playCoursePrice();
            commonCourse.playCourseTime();
        }
    }
}
