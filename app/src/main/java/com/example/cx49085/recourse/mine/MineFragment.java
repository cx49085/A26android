package com.example.cx49085.recourse.mine;


import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.mine.adapter.Rv1Adapter;
import com.example.cx49085.recourse.mine.adapter.Rv23Adapter;
import com.example.cx49085.recourse.mine.data.Rv1DataManager;
import com.example.cx49085.recourse.mine.data.Rv23DataManager;
import com.example.cx49085.recourse.mine.data.entity.Rv1Data;
import com.example.cx49085.recourse.mine.data.entity.Rv23Data;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * A simple {@link Fragment} subclass.
 */
public class MineFragment extends Fragment {


    private RecyclerView rv1 ;
    private RecyclerView rv2 ;
    private RecyclerView rv3 ;
    private RecyclerView rv4 ;
    public MineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        init(view);
        setRv1();

        setRv2();
        setRv3();
        setRv4();
        return view;
    }



    private void setRv4() {
        rv4.setLayoutManager(new GridLayoutManager(getActivity(),1));
        List<Rv23Data> rv23DataList = Rv23DataManager.getRv4DataList();
        rv4.setAdapter(new Rv23Adapter(getActivity(),rv23DataList));
        rv4.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
    }

    private void setRv3() {
        rv3.setLayoutManager(new GridLayoutManager(getActivity(),1));
        List<Rv23Data> rv23DataList = Rv23DataManager.getRv3DataList();
        for (int i = 0; i < rv23DataList.size(); i++) {
            Log.e(TAG,"rvData:"+getResources().getString(rv23DataList.get(i).getTitle()) );

        }
        rv3.setAdapter(new Rv23Adapter(getActivity(),rv23DataList));
        rv3.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
    }

    private void setRv2() {
        rv2.setLayoutManager(new GridLayoutManager(getActivity(),1));
        List<Rv23Data> rv23DataList = Rv23DataManager.getRv2DataList();
        for (int i = 0; i < rv23DataList.size(); i++) {
            Log.e(TAG,"rvData:"+getResources().getString(rv23DataList.get(i).getTitle()) );

        }
        rv2.setAdapter(new Rv23Adapter(getActivity(),rv23DataList));
        rv2.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
    }


    private void setRv1() {
        rv1.setLayoutManager(new GridLayoutManager(getActivity(),4));
        List<Rv1Data> rv1DataList = Rv1DataManager.getRv1DataList();
        rv1.setAdapter(new Rv1Adapter(getActivity(),rv1DataList));
    }

    private void init(View view) {
        rv1 = (RecyclerView)view.findViewById(R.id.rv1_mine);
        rv2 = (RecyclerView)view.findViewById(R.id.rv2_mine);
        rv3 = (RecyclerView)view.findViewById(R.id.rv3_mine);
        rv4 = (RecyclerView)view.findViewById(R.id.rv4_mine);
    }

}
