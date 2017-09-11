package com.ticketnow.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ticketnow.R;
import com.ticketnow.model.PartyModel;

/**
 * Created by Rodrigo Costa on 02/09/2017.
 */

public class FriendsPartiesViewHolder extends RecyclerView.ViewHolder {

    public ImageView partyImageView;
    public ImageView friendImageView;
    public TextView titleView;
    public TextView dateView;


    public FriendsPartiesViewHolder(View itemView) {
        super(itemView);

        partyImageView = (ImageView) itemView.findViewById(R.id.friends_parties_image);
        friendImageView = (ImageView) itemView.findViewById(R.id.friends_parties_friend_image);
        titleView = (TextView) itemView.findViewById(R.id.friends_parties_title);
        dateView = (TextView) itemView.findViewById(R.id.friends_parties_date);

    }

    public void bindToParty(PartyModel party) {

        titleView.setText(party.getTitle());
        dateView.setText(party.getDate());


    }

}


