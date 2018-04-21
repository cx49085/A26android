package com.example.cx49085.recourse.download;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.download.adapter.DownloadAdapter;
import com.example.cx49085.recourse.download.data.entity.DownloadData;
import com.example.cx49085.recourse.home.adapter.RecommedAdapter;
import com.example.cx49085.recourse.home.data.entity.RecommendData;

import java.util.List;

import static com.example.cx49085.recourse.download.data.DownloadDataManager.getDownloadList;
import static com.example.cx49085.recourse.home.data.HomeDataManager.getRecommendDatas;

/**
 * A simple {@link Fragment} subclass.
 */
public class DownloadFragment extends Fragment {

    private RecyclerView rv;
    public DownloadFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_download, container, false);
        init(view);

        setRv();
        return view;
    }

    private void setRv() {
        rv.setLayoutManager(new GridLayoutManager(getActivity(),1));
        List<DownloadData> list = getDownloadList();
        //new RecommedAdapter(getActivity(),recommendDatas)
        rv.setAdapter(new DownloadAdapter(getActivity(),list));
        rv.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
    }


    private void init(View view) {
        rv = view.findViewById(R.id.rv_download);
    }

}
