package com.example.cx49085.recourse.home.data.entity;

/**
 * Created by cx49085 on 2018/4/5.
 */

public class RecommendData {
    private String img;
    private String title;
    private String course_num;
    private String course_introduction;

    public String getCourse_num() {
        return course_num;
    }

    public void setCourse_num(String course_num) {
        this.course_num = course_num;
    }

    public String getCourse_introduction() {
        return course_introduction;
    }

    public void setCourse_introduction(String course_introduction) {
        this.course_introduction = course_introduction;
    }

    public RecommendData(String img, String title, String course_num, String course_introduction) {
        this.img = img;
        this.title = title;
        this.course_num = course_num;
        this.course_introduction = course_introduction;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
