package com.ticketnow.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ticketnow.R;
import com.ticketnow.model.FriendModel;
import com.ticketnow.model.PartyModel;

/**
 * Created by roquesouza on 27/08/17.
 */

public class FriendViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView nameView;
    public TextView statusView;
    public TextView idView;
    public TextView ticketsView;

    public FriendViewHolder(View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.friend_image);
        nameView = (TextView) itemView.findViewById(R.id.friend_name);
        statusView = (TextView) itemView.findViewById(R.id.friend_status);
        idView = (TextView) itemView.findViewById(R.id.friend_id);
        ticketsView = (TextView) itemView.findViewById(R.id.friend_tickets);


    }


    public void bindToFriend(FriendModel friend) {

        nameView.setText(friend.getName());
        statusView.setText(friend.getStatus());
        idView.setText(friend.getId());
        ticketsView.setText(friend.getTickets());


    }


}