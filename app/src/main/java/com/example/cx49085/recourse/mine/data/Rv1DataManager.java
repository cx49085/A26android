package com.example.cx49085.recourse.mine.data;

import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.mine.data.entity.Rv1Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cx49085 on 2018/4/6.
 */

public class Rv1DataManager {
    private static List<Rv1Data> list  = new ArrayList<Rv1Data>();

    private static int[] imgs = {
            R.drawable.ic_mine_study,
            R.drawable.ic_mine_collect,
            R.drawable.ic_mine_note,
            R.drawable.ic_mine_mycourse,
    };

    private static int[] names = {
            R.string.name_study,
            R.string.name_collect,
            R.string.name_note,
            R.string.name_course,
    };


    public Rv1DataManager()
    {
    }

    public static List<Rv1Data> getRv1DataList()
    {
        for (int i = 0; i < imgs.length; i++) {
            list.add(new Rv1Data(imgs[i],names[i]));
        }
        return list;
    }



}
