package com.example.cx49085.recourse.community.data.entity;

/**
 * Created by 10919 on 2018/4/6/006.
 */

public class QuestionData {
    private String username;
    private String title;
    private int answerNum;
    private String state;
    private String detail;
    private String time;
    private int img;

    public QuestionData(String username, String title, int answerNum, String state, String detail, String time, int img) {
        this.username = username;
        this.title = title;
        this.answerNum = answerNum;
        this.state = state;
        this.detail = detail;
        this.time = time;
        this.img = img;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public QuestionData(String title, int answerNum, String state) {
        this.title = title;
        this.answerNum = answerNum;
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAnswerNum() {
        return answerNum;
    }

    public void setAnswerNum(int answerNum) {
        this.answerNum = answerNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
