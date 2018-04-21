package com.example.cx49085.recourse.community.data.entity;

/**
 * Created by 10919 on 2018/4/6/006.
 */

public class VRAreaData {
    private int img;
    private String name;
    private String num;

    private int color;
    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    public VRAreaData(int img, String name, String num) {
        this.img = img;
        this.name = name;
        this.num = num;
    }

    public VRAreaData(int img, String name, String num, int color) {
        this.img = img;
        this.name = name;
        this.num = num;
        this.color = color;
    }
}
