package com.ticketnow.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ticketnow.model.PartyModel;
import com.ticketnow.top_dashboard_fragments.PurchasedFragment;

import java.util.List;

public class PurchasedAdapter extends FragmentPagerAdapter {

    List<PartyModel> parties;

    public PurchasedAdapter(FragmentManager fm, List<PartyModel> parties) {

        super(fm);

        this.parties = parties;

    }

    @Override
    public Fragment getItem(int position) {

        PurchasedFragment purchasedFragment = new PurchasedFragment();

        Bundle bundle = new Bundle();
        bundle.putSerializable("party", parties.get(position));

        purchasedFragment.setArguments(bundle);

        return purchasedFragment;

    }

    @Override
    public int getCount() {
        return parties.size();
    }

}
