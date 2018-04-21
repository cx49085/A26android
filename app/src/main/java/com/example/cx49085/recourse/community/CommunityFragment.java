package com.example.cx49085.recourse.community;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cx49085.recourse.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CommunityFragment extends Fragment {

    private ViewPager vp;
    private TabLayout tab;
    public CommunityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_community, container, false);
        init(view);
        setVp();
        setTab();
        return view;
    }

    private void setTab() {
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setVp() {
        vp.setOffscreenPageLimit(2);
        final Fragment[] fgs = {
                new QuestionFragment(),
                new NoteFragment(),
                new VRAreaFragment()
        };
        vp.setAdapter(new FragmentStatePagerAdapter(getActivity().getSupportFragmentManager()) {
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
                tab.getTabAt(position).select();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void init(View view) {
        vp = (ViewPager)view.findViewById(R.id.vp_community);
        tab = (TabLayout)view.findViewById(R.id.tab_community);
    }

}
