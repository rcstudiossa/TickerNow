package com.ticketnow.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ticketnow.R;
import com.ticketnow.model.PartyModel;

/**
 * Created by roquesouza on 27/08/17.
 */

public class MyFeedViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView titleView;
    public TextView localView;
    public TextView dateView;
    public TextView priceView;
    public TextView favNumberView;

    public MyFeedViewHolder(View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.party_image);
        titleView = (TextView) itemView.findViewById(R.id.party_title);
        localView = (TextView) itemView.findViewById(R.id.party_local);
        dateView = (TextView) itemView.findViewById(R.id.party_date);
        priceView = (TextView) itemView.findViewById(R.id.party_price);
        favNumberView = (TextView) itemView.findViewById(R.id.fav_number);


}


    public void bindToParty(PartyModel party) {

        titleView.setText(party.getTitle());
        localView.setText(party.getLocal());
        dateView.setText(party.getDate());
        priceView.setText(party.getPrice());
        favNumberView.setText(party.getFavNumber());


    }


}
