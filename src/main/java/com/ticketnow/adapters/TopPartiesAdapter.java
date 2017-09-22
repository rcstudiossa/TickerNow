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
import com.ticketnow.viewholder.TopPartiesViewHolder;

import java.util.ArrayList;
import java.util.List;

public class TopPartiesAdapter extends RecyclerView.Adapter<TopPartiesViewHolder> {

    private Activity activity;
    List<PartyModel> parties;

    public TopPartiesAdapter(Activity activity) {

        this.activity = activity;
        parties = new ArrayList<PartyModel>();

        parties.add(new PartyModel(R.drawable.emicida_128, R.drawable.banner_emicida, "Emicida", "Parque de Exposições", "12/08 21h", "R$60-200", "342"));
        parties.add(new PartyModel(R.drawable.o_rappa_128, R.drawable.banner_emicida, "O Rappa", "Barra Hall", "26/08 20h", "R$30-120", "160"));
        parties.add(new PartyModel(R.drawable.marcelo_d2_128, R.drawable.banner_emicida, "Marcelo D2", "Arena Music Hall", "09/10 18h", "R$80-250", "658"));
        parties.add(new PartyModel(R.drawable.annita_128, R.drawable.banner_emicida, "Anitta", "Parque de Exposições", "15/10 21h", "R$120-800", "1680"));
        parties.add(new PartyModel(R.drawable.villamix_128, R.drawable.banner_emicida, "VillaMix", "Jardim dos Namorados", "22/08 16h", "R$80-400", "954"));
        parties.add(new PartyModel(R.drawable.emicida_128, R.drawable.banner_emicida, "Emicida", "Parque de Exposições", "12/08 21h", "R$60-200", "342"));
        parties.add(new PartyModel(R.drawable.o_rappa_128, R.drawable.banner_emicida, "O Rappa", "Barra Hall", "26/08 20h", "R$30-120", "160"));
        parties.add(new PartyModel(R.drawable.marcelo_d2_128, R.drawable.banner_emicida, "Marcelo D2", "Arena Music Hall", "09/10 18h", "R$80-250", "658"));
        parties.add(new PartyModel(R.drawable.annita_128, R.drawable.banner_emicida, "Anitta", "Parque de Exposições", "15/10 21h", "R$120-800", "1680"));
        parties.add(new PartyModel(R.drawable.villamix_128, R.drawable.banner_emicida, "VillaMix", "Jardim dos Namorados", "22/08 16h", "R$80-400", "954"));


    }

    @Override
    public TopPartiesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TopPartiesViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rv_top_parties, parent, false));
    }



    @Override
    public void onBindViewHolder(TopPartiesViewHolder holder, final int position) {

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


