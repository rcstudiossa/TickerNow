package com.ticketnow.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ticketnow.top_dashboard_fragments.MyFeedFragment;
import com.ticketnow.top_dashboard_fragments.MyShowsFragment;
import com.ticketnow.top_dashboard_fragments.TopPartiesFragment;

public class DashboardTabsAdapter extends FragmentStatePagerAdapter {

    private String[] tabTitles;

    public DashboardTabsAdapter(FragmentManager fm, String[] tabTitles) {
        super(fm);
        this.tabTitles = tabTitles;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new MyFeedFragment();
            case 1:
                return new TopPartiesFragment();
            case 2:
                return new MyShowsFragment();
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
