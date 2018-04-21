package com.example.cx49085.recourse.mine.data;

import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.mine.data.entity.Rv23Data;
import com.example.cx49085.recourse.mine.data.entity.Rv23Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cx49085 on 2018/4/7.
 */

public class Rv23DataManager {


    private static List<Rv23Data> rv1list  = new ArrayList<Rv23Data>();

    private static List<Rv23Data> rv2list  = new ArrayList<Rv23Data>();

    private static List<Rv23Data> rv3list  = new ArrayList<Rv23Data>();

    private static int[] rv_itemNms = {
            R.string.name_account,
            R.string.name_hobby,
            R.string.name_safe,
            R.string.name_test,
            R.string.name_watched,
            R.string.name_returnUser,
            R.string.name_otherSet,
    };

    private static int rv_itemImgs[] = {
            R.drawable.ic_mine_account,
            R.drawable.ic_mine_hobby,
            R.drawable.ic_mine_safe,
            R.drawable.ic_mine_test,
            R.drawable.ic_mine_watched,
            R.drawable.ic_mine_return,
            R.drawable.ic_mine_setting,
    };

    public static List<Rv23Data> getRv2DataList()
    {
        for (int i = 0; i < rv_itemImgs.length / 2; i++) {
            rv1list.add(new Rv23Data(rv_itemImgs[i],rv_itemNms[i]));
        }
        return rv1list;
    }
    public static List<Rv23Data> getRv3DataList()
    {
        for (int i = rv_itemImgs.length / 2; i < rv_itemImgs.length - 1; i++) {
            rv2list.add(new Rv23Data(rv_itemImgs[i],rv_itemNms[i]));
        }
        return rv2list;
    }

    public static List<Rv23Data> getRv4DataList()
    {
       rv3list.add(new Rv23Data(rv_itemImgs[6],rv_itemNms[6]));
        return rv3list;
    }

//    public static List<Rv23Data> getRvDataList()
//    {
//        for (int i = 0; i < rv_itemImgs.length ; i++) {
//            rv1list.add(new Rv23Data(rv_itemImgs[i],rv_itemNms[i]));
//        }
//        return rv1list;
//    }
}
