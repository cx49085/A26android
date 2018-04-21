package com.example.cx49085.recourse.home.data;

import android.net.Uri;

import com.example.cx49085.recourse.home.data.entity.RecommendData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cx49085 on 2018/4/5.
 */

public class HomeDataManager {
    private static final List<Uri> bannerImages = new ArrayList<Uri>();
    private static List<String> recommendImages = new ArrayList<String>();
    private static List<String> recommendTitles = new ArrayList<String>();

    private static List<RecommendData> recommendDatas = new ArrayList<RecommendData>();



    private static String[] names = {
            "巴黎高等商学院第二届金融与统计学大会",
            "巴黎高等商学院公开课-决策统计学",
            "概率论与数理统计",
           "国际贸易理论与实务",
            "国际投资学",
            "货币银行学"
    };
    private static String[] course_details = {
            "本次大会于2017年12月7日召开，大会内容为",
            "巴黎高等商学院首节面向全球公开课",
            "数学世界的精彩",
            "我们的贸易国际范儿",
            "教你如何投资",
            "货币！不只是钱"
    };
    private static String[] courses_num = {
            "共15课时",
            "共8课时",
            "共30课时",
            "共7课时",
            "共6课时",
            "共16课时",
    };
    public static List<Uri> getBannerImages()
    {
        for (int i = 1; i <= 6; i++) {
            Uri uri = Uri.parse("http://120.25.204.86:8080/holesay/images/a26/"+i+"/img3.jpg");
            bannerImages.add(uri);
        }
        return bannerImages;
    }
    
    public static List<String> getRecommendImages()
    {
        for (int i = 1; i < 7; i++) {
            recommendImages.add("http://120.25.204.86:8080/holesay/images/a26/"+i+"/img1.jpg");
        }
        return recommendImages;
    }

    public static List<String> getRecommendTitles()
    {
        for (int i = 0; i < 6; i++) {
            recommendTitles.add(names[i]);
        }
        return recommendTitles;
    }

    public static List<RecommendData> getRecommendDatas()
    {
        for (int i = 0; i < names.length; i++) {
            recommendDatas.add(new RecommendData(getRecommendImages().get(i),getRecommendTitles().get(i),courses_num[i],course_details[i]));
        }
        return recommendDatas;
    }
}
