package com.ticketnow.activities;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ticketnow.R;
import com.ticketnow.model.PartyModel;


public class PartyActivity extends AppCompatActivity {

    public static final String PARTY = "party";

    private PartyModel party;

    public ImageView imageView;
    public TextView titleView;
    public TextView localView;
    public TextView dateView;
    public TextView priceView;
    public TextView favNumberView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party);

        Spinner spTimes = (Spinner)
                findViewById(R.id.spinner);

        ArrayAdapter adapter =
                ArrayAdapter.createFromResource(this,
                        R.array.party_packages,
                        android.R.layout.simple_spinner_item);

        spTimes.setAdapter(adapter);

        party = (PartyModel) getIntent().getExtras().getSerializable(PARTY);


        imageView = (ImageView) findViewById(R.id.party_banner);
        titleView = (TextView) findViewById(R.id.party_title);
        localView = (TextView) findViewById(R.id.party_local);
        dateView = (TextView) findViewById(R.id.party_date);
        priceView = (TextView) findViewById(R.id.party_price);
        favNumberView = (TextView) findViewById(R.id.fav_number);

    }

    @Override
    protected void onStart() {
        super.onStart();

        Glide.with(this).load(party.getBanner()).into(imageView);
        titleView.setText(party.getTitle());
        localView.setText(party.getLocal());
        dateView.setText(party.getDate());
        priceView.setText(party.getPrice());
        favNumberView.setText(party.getFavNumber());

    }
}



