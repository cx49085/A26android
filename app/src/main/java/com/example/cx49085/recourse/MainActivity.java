package com.example.cx49085.recourse;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

import static com.example.cx49085.recourse.main.data.MainDataManager.getFgs;
import static com.example.cx49085.recourse.main.data.MainDataManager.getIconsNavSelected;
import static com.example.cx49085.recourse.main.data.MainDataManager.getNamesNav;

public class MainActivity extends AppCompatActivity {

    private View search;
    private BottomNavigationBar nav;
    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        //nav
        setNav();
        //viewPager
        setVp();
        //
    }

    private void setVp() {
        vp.setOffscreenPageLimit(3);
        final Fragment[] fgs = getFgs();
        vp.setAdapter(new FragmentStatePagerAdapter(this.getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fgs[position];
            }

            @Override
            public int getCount() {
                return fgs.length;
            }
        });

        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                nav.selectTab(position);
                switch (position) {
                    case 0:
                        search.setVisibility(View.VISIBLE);
                        ViewCompat.animate(search).scaleX(1);

                        break;
                    case 1:
                        ViewCompat.animate(search).scaleX(0).withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                search.setVisibility(View.GONE);
                            }
                        });
                        break;
                    case 2:
                        ViewCompat.animate(search).scaleX(0).withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                search.setVisibility(View.GONE);
                            }
                        });
                        break;
                    case 3:
                        ViewCompat.animate(search).scaleX(0).withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                search.setVisibility(View.GONE);
                            }
                        });
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void setNav() {
        nav.setMode(BottomNavigationBar.MODE_FIXED);
        nav.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        nav.setActiveColor(R.color.colorPrimary);
        nav.setFirstSelectedPosition(0);
        int[] icons = getIconsNavSelected();
        int[] names = getNamesNav();
        for (int i = 0; i < 4; i++) {
            nav.addItem(new BottomNavigationItem(icons[i], getResources().getString(names[i])));
        }
        nav.initialise();
        nav.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                vp.setCurrentItem(position);


            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });
    }

    private void init() {
        search = (View) findViewById(R.id.search_main);

        nav = (BottomNavigationBar)findViewById(R.id.nav_main);
        vp = (ViewPager)findViewById(R.id.vp_main);
    }


}
