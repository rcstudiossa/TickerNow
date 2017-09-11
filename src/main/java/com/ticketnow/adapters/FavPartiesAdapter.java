package com.ticketnow.adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import com.ticketnow.R;
import com.ticketnow.activities.PartyActivity;
import com.ticketnow.model.PartyModel;
import com.ticketnow.viewholder.FavPartiesViewHolder;

import java.util.ArrayList;
import java.util.List;

public class FavPartiesAdapter extends RecyclerView.Adapter<FavPartiesViewHolder> {

    private Activity activity;
    List<PartyModel> parties;

    public FavPartiesAdapter(Activity activity) {

        this.activity = activity;
        parties = new ArrayList<PartyModel>();

        parties.add(new PartyModel(R.drawable.emicida_128, "Emicida", "12/08 21h"));
        parties.add(new PartyModel(R.drawable.o_rappa_128, "O Rappa", "26/08 20h"));
        parties.add(new PartyModel(R.drawable.marcelo_d2_128, "Marcelo D2", "09/10 18h"));
        parties.add(new PartyModel(R.drawable.annita_128, "Anitta", "15/10 21h"));
        parties.add(new PartyModel(R.drawable.villamix_128, "VillaMix", "22/08 16h"));
        parties.add(new PartyModel(R.drawable.emicida_128, "Emicida", "12/08 21h"));
        parties.add(new PartyModel(R.drawable.o_rappa_128, "O Rappa", "26/08 20h"));
        parties.add(new PartyModel(R.drawable.marcelo_d2_128, "Marcelo D2", "09/10 18h"));
        parties.add(new PartyModel(R.drawable.annita_128, "Anitta", "15/10 21h"));
        parties.add(new PartyModel(R.drawable.villamix_128, "VillaMix", "22/08 16h"));

    }

    @Override
    public FavPartiesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new FavPartiesViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rv_fav_parties, parent, false));
    }



    @Override
    public void onBindViewHolder(FavPartiesViewHolder holder, final int position) {

        holder.bindToParty(parties.get(position));
        Glide.with(activity).load(parties.get(position).getThumb()).into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, PartyActivity.class);
                intent.putExtra(PartyActivity.PARTY, parties.get(position));
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return parties != null ? parties.size() : 0;
    }

}
