package com.ticketnow.top_dashboard_fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ticketnow.R;
import com.ticketnow.adapters.TopPartiesAdapter;
import com.ticketnow.adapters.FriendsPartiesAdapter;

public class TopPartiesFragment extends Fragment {

    private RecyclerView mTopRecycler;
    private RecyclerView mFriendsRecycler;
    private TopPartiesAdapter mTopAdapter;
    private FriendsPartiesAdapter mFriendsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.top_fragment_top_parties, container, false);

        mTopRecycler = (RecyclerView) view.findViewById(R.id.top_parties_list);
        mTopRecycler.setHasFixedSize(true);

        mFriendsRecycler = (RecyclerView) view.findViewById(R.id.friends_parties_list);
        mFriendsRecycler.setHasFixedSize(true);

        LinearLayoutManager layout = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);

        mTopRecycler.setLayoutManager(layout);

        return view;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mTopAdapter = new TopPartiesAdapter(getActivity());
        mTopRecycler.setAdapter(mTopAdapter);

        mFriendsAdapter = new FriendsPartiesAdapter(getActivity());
        mFriendsRecycler.setAdapter(mFriendsAdapter);

    }

}





