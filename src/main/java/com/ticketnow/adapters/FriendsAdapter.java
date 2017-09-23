package com.ticketnow.adapters;

import android.app.Activity;
// import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.ticketnow.R;
// import com.ticketnow.activities.PartyActivity;
import com.ticketnow.model.FriendModel;
import com.ticketnow.viewholder.FriendViewHolder;

import java.util.ArrayList;
import java.util.List;

public class FriendsAdapter extends RecyclerView.Adapter<FriendViewHolder> {

    private Activity activity;
    List<FriendModel> friends;
    int banner;

    public FriendsAdapter(Activity activity) {

        this.activity = activity;
        friends = new ArrayList<FriendModel>();

        friends.add(new FriendModel(R.drawable.amigo1_80, "roque.souza@gmail.com", "Roque Souza", "roque.souza", "Social", "2"));
        friends.add(new FriendModel(R.drawable.amigo2_80, "pedro.sampaio23@hotmail.com", "Pedro Sampaio", "peu.sampaio", "Sedentário", "0"));
        friends.add(new FriendModel(R.drawable.amigo3_80, "gabriele.riv@outlook.com", "Gabriele Riviera", "gabi_riviera", "Baladeira", "4"));
        friends.add(new FriendModel(R.drawable.amigo4_80, "naty-2003@live.com", "Natália Costa", "nah-costa", "Preguiçosa", "1"));
        friends.add(new FriendModel(R.drawable.amigo5_80, "rei.jardim@gmail.com", "Rei Carlos", "rei.carlos", "Social", "3"));
        friends.add(new FriendModel(R.drawable.amigo1_80, "roque.souza@gmail.com", "Roque Souza", "roque.souza", "Social", "2"));
        friends.add(new FriendModel(R.drawable.amigo2_80, "pedro.sampaio23@hotmail.com", "Pedro Sampaio", "peu.sampaio", "Sedentário", "0"));
        friends.add(new FriendModel(R.drawable.amigo3_80, "gabriele.riv@outlook.com", "Gabriele Riviera", "gabi_riviera", "Baladeira", "4"));
        friends.add(new FriendModel(R.drawable.amigo4_80, "naty-2003@live.com", "Natália Costa", "nah-costa", "Preguiçosa", "1"));
        friends.add(new FriendModel(R.drawable.amigo5_80, "rei.jardim@gmail.com", "Rei Carlos", "rei.carlos", "Social", "3"));


    }

    @Override
    public FriendViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new FriendViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rv_friends, parent, false));
    }

    @Override
    public void onBindViewHolder(FriendViewHolder holder, final int position) {

        holder.bindToFriend(friends.get(position));
        Glide.with(activity).load(friends.get(position).getThumb()).into(holder.imageView);

    /*    holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, PartyActivity.class);
                intent.putExtra(PartyActivity.PARTY, friends.get(position));
                activity.startActivity(intent);
            }
        });
    */
    }

    @Override
    public int getItemCount() {
        return friends != null ? friends.size() : 0;
    }

}