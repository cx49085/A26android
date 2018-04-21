package com.example.cx49085.recourse.mine.data.entity;

/**
 * Created by cx49085 on 2018/4/6.
 */

public class Rv1Data {
    private int img;
    private int title;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public Rv1Data() {
    }

    public Rv1Data(int img, int title) {
        this.img = img;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Rv1Data{" +
                "img=" + img +
                ", title=" + title +
                '}';
    }
}
