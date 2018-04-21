package com.example.cx49085.recourse.main.data;

import android.support.v4.app.Fragment;

import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.community.CommunityFragment;
import com.example.cx49085.recourse.download.DownloadFragment;
import com.example.cx49085.recourse.home.HomeFragment;
import com.example.cx49085.recourse.mine.MineFragment;

/**
 * Created by cx49085 on 2018/4/5.
 */

public class MainDataManager {
    private static final  int[] iconsNavSelected = {
            R.drawable.ic_nav1_unselected,
            R.drawable.ic_nav2_unselected,
            R.drawable.ic_nav3_unselected,
            R.drawable.ic_nav4_unselected,
    };
    private static final int[] namesNav = {
            R.string.name_nav1,
            R.string.name_nav2,
            R.string.name_nav3,
            R.string.name_nav4
    };

    private static final Fragment[] fgs = {
            new HomeFragment(),
            new CommunityFragment(),
            new DownloadFragment(),
            new MineFragment(),
    };

    public static Fragment[] getFgs() {
        return fgs;
    }

    public static int[] getIconsNavSelected() {
        return iconsNavSelected;
    }

    public static int[] getNamesNav() {
        return namesNav;
    }
}
