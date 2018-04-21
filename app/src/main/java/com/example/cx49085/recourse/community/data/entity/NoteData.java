package com.example.cx49085.recourse.community.data.entity;

/**
 * Created by 10919 on 2018/4/7/007.
 */

public class NoteData {
    private int img;
    private String username;
    private String time;

    private String title;
    private String info;
    private int browseNum;
    private int goodNum;



    public NoteData(String title, String info, int browseNum, int goodNum) {
        this.title = title;
        this.info = info;
        this.browseNum = browseNum;
        this.goodNum = goodNum;
    }

    public NoteData(int img, String username, String time, String title, String info, int browseNum, int goodNum) {
        this.img = img;
        this.username = username;
        this.time = time;
        this.title = title;
        this.info = info;
        this.browseNum = browseNum;
        this.goodNum = goodNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getBrowseNum() {
        return browseNum;
    }

    public void setBrowseNum(int browseNum) {
        this.browseNum = browseNum;
    }

    public int getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(int goodNum) {
        this.goodNum = goodNum;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
