package com.ticketnow.btm_fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ticketnow.R;
import com.ticketnow.adapters.DashboardTabsAdapter;
import com.ticketnow.adapters.SocialTabsAdapter;

public class SocialFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.btm_fragment_social, container, false);

        ViewPager pager = (ViewPager) view.findViewById(R.id.container);
        pager.setAdapter( new SocialTabsAdapter(getChildFragmentManager(), getResources().getStringArray(R.array.titles_social_tab)) );

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);



        return(view);
    }
}