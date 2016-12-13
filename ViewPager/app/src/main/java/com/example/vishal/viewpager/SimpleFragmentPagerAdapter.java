package com.example.vishal.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by vishal on 14/12/16.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MondayFragment();
        }
        else if (position == 1) {
            return new TuesdayFragment();
        }
        else  {
            return new WednesdayFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
