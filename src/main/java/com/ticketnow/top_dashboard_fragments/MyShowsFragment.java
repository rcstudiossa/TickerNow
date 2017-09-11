package com.ticketnow.top_dashboard_fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ticketnow.R;
import com.ticketnow.activities.PartyActivity;
import com.ticketnow.adapters.FavPartiesAdapter;
import com.ticketnow.adapters.PurchasedAdapter;
import com.ticketnow.model.PartyModel;

import java.util.ArrayList;
import java.util.List;

public class MyShowsFragment extends Fragment {

    private RecyclerView mRecycler;
    private FavPartiesAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.top_fragment_my_parties, container, false);

        mRecycler = (RecyclerView) view.findViewById(R.id.fav_parties_list);
        mRecycler.setHasFixedSize(true);
        mRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), PartyActivity.class));
            }
        });

        LinearLayoutManager layout = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mRecycler.setLayoutManager(layout);

        mAdapter = new FavPartiesAdapter(getActivity());
        mRecycler.setAdapter(mAdapter);

        List<PartyModel> parties = new ArrayList<PartyModel>();
        parties.add(new PartyModel("Festa 01", "Parque de exposições", "10/09/2017"));
        parties.add(new PartyModel("Festa 02", "Centro de convenções", "23/09/2017"));
        parties.add(new PartyModel("Festa 03", "Salvador Fest", "25/09/2017"));


        ViewPager pager = (ViewPager) view.findViewById(R.id.pager);
        pager.setAdapter( new PurchasedAdapter(getFragmentManager(), parties));

        return view;

    }

}



