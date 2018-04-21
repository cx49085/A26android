package com.example.cx49085.recourse.download.data.entity;

import com.example.cx49085.recourse.R;

/**
 * Created by cx49085 on 2018/4/8.
 */

public class DownloadData {
    private String img;
    private String name;
    private String num;
    private String classes;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
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

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public DownloadData(String img, String name, String num, String classes) {
        this.img = img;
        this.name = name;
        this.num = num;
        this.classes = classes;
    }
}

