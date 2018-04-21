package com.example.cx49085.recourse.community;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.community.adapter.NoteAdapter;

import static com.example.cx49085.recourse.community.data.CommunityManager.getNoteDatas;


/**
 * A simple {@link Fragment} subclass.
 */
public class NoteFragment extends Fragment {

    private RecyclerView rv;

    public NoteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_note, container, false);
        init(view);
        setRv();
        return view;
    }

    private void setRv() {
        rv.setLayoutManager(new GridLayoutManager(getActivity(),1));
        rv.setAdapter(new NoteAdapter(getActivity(), getNoteDatas()));
        rv.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
    }

    private void init(View view) {
        rv = (RecyclerView)view.findViewById(R.id.note_rv);
    }

}
