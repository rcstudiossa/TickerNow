package com.ticketnow.top_dashboard_fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ticketnow.R;
import com.ticketnow.adapters.MyFeedAdapter;

public class MyFeedFragment extends Fragment {

    private RecyclerView mRecycler;
    private MyFeedAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.top_fragment_myfeed, container, false);

        mRecycler = (RecyclerView) view.findViewById(R.id.myfeed_parties_list);
        mRecycler.setHasFixedSize(true);

        LinearLayoutManager layout = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        mRecycler.setLayoutManager(layout);

        return view;


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mAdapter = new MyFeedAdapter(getActivity());
        mRecycler.setAdapter(mAdapter);

    }


}
