package com.ticketnow.top_dashboard_fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ticketnow.R;
import com.ticketnow.model.PartyModel;

public class PurchasedFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.item_vp_my_parties, container, false);

        Bundle bundle = getArguments();
        PartyModel party = (PartyModel) bundle.getSerializable("party");

        ImageView image = (ImageView) rootView.findViewById(R.id.party_image);
        TextView title = (TextView) rootView.findViewById(R.id.party_title);
        TextView local = (TextView) rootView.findViewById(R.id.party_local);
        TextView date  = (TextView) rootView.findViewById(R.id.party_date);

        title.setText(party.getTitle());
        local.setText(party.getLocal());
        date.setText(party.getDate());

        return rootView;
    }
}

