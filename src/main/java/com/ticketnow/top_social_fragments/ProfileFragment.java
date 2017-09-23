package com.ticketnow.top_social_fragments;

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

public class ProfileFragment extends Fragment {

    private FavPartiesAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.top_fragment_profile, container, false);

        List<PartyModel> parties = new ArrayList<PartyModel>();
        parties.add(new PartyModel("Festa 01", "Parque de exposições", "10/09/2017"));
        parties.add(new PartyModel("Festa 02", "Centro de convenções", "23/09/2017"));
        parties.add(new PartyModel("Festa 03", "Salvador Fest", "25/09/2017"));

        ViewPager pager = (ViewPager) view.findViewById(R.id.pager);
        pager.setAdapter( new PurchasedAdapter(getFragmentManager(), parties));

        return view;

    }

}