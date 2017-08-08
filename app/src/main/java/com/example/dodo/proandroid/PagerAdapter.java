package com.example.dodo.proandroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by روند حمادة on 07/22/2017.
 */


public class PagerAdapter extends FragmentStatePagerAdapter {
    int tabCount;

    public PagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Tab_fragment1  tab1 = new Tab_fragment1();
                return tab1;
            case 1:
                TabFragment2 tab2 = new TabFragment2();
                return tab2;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
