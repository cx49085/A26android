package com.example.cx49085.recourse.home;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.home.adapter.RecommedAdapter;
import com.example.cx49085.recourse.home.data.entity.RecommendData;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.loader.ImageLoader;

import java.util.List;

import static android.content.ContentValues.TAG;
import static com.example.cx49085.recourse.home.data.HomeDataManager.getBannerImages;
import static com.example.cx49085.recourse.home.data.HomeDataManager.getRecommendDatas;
import static com.example.cx49085.recourse.util.ImageUtil.getRequestOptions;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private Banner banner;
    private RecyclerView recommendRv;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        init(view);
        setBanner();
        setRecommendRv();

        return view;
    }

    private void setRecommendRv() {
        recommendRv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        List<RecommendData> recommendDatas = getRecommendDatas();
        //new RecommedAdapter(getActivity(),recommendDatas)
        recommendRv.setAdapter(new RecommedAdapter(getActivity(),recommendDatas));
        recommendRv.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
    }

    private void setBanner() {
        banner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(getActivity()).load(path).apply(getRequestOptions()).into(imageView);
            }
        });

        banner.setImages(getBannerImages());
        banner.isAutoPlay(true);
        banner.setDelayTime(2000);
        banner.setIndicatorGravity(BannerConfig.CENTER);
        banner.start();
    }

    private void init(View view) {
        banner = (Banner)view.findViewById(R.id.banner_main);
        recommendRv = (RecyclerView)view.findViewById(R.id.rv_recommend_main);
    }

}
