package com.ticketnow.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ticketnow.top_social_fragments.FriendsFragment;
import com.ticketnow.top_social_fragments.ProfileFragment;


public class SocialTabsAdapter extends FragmentStatePagerAdapter {

    private String[] tabTitles;

    public SocialTabsAdapter(FragmentManager fm, String[] tabTitles) {
        super(fm);
        this.tabTitles = tabTitles;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new FriendsFragment();
            case 1:
                return new ProfileFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return this.tabTitles.length;
    }

    @Override
    public CharSequence getPageTitle (int position){
        return this.tabTitles[position];
    }

}