package com.example.cx49085.recourse.download.data;

import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.download.data.entity.DownloadData;
import com.example.cx49085.recourse.home.data.HomeDataManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cx49085 on 2018/4/8.
 */

public class DownloadDataManager {

    private static List<DownloadData> list = new ArrayList<DownloadData>();

    private static String imgs[] = new String[6];

    private static String[] names = {
            "商业模式的构架和解读",
            "民营机构体系与业务介绍",
            "民营银行业务揭秘",
            "融资租赁公司的盈利模式",
            "基金公司的运作模式",
            "股权投资与债权投资的区别与应用"
    };

    private static String num[] = {
            "112","1150","170","245","178","360","450",
    };

    private static String classes[] ={
            "基础","高级","基础","基础","中级","基础"
    };

    public static String[] getRecommendImages()
    {
        for (int i = 1; i <= 6; i++) {
            imgs[i-1] = ("http://120.25.204.86:9001/file/mbimg/img"+i+".jpg");
        }
        return imgs;
    }
    public static List<DownloadData>  getDownloadList()
    {
        imgs = getRecommendImages();
        for (int i = 0; i < names.length; i++) {
            list.add(new DownloadData(imgs[i],names[i],num[i],classes[i]));
        }
        return list;
    }

}
