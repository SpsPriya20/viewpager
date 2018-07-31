package com.priya.viewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.BaseAdapter;

import com.priya.viewpager.fragments.FragmentA;
import com.priya.viewpager.fragments.FragmentB;
import com.priya.viewpager.fragments.FragmentC;
import com.priya.viewpager.fragments.FragmentD;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public FragmentA fragmentA;
    public FragmentB fragmentB;
    public FragmentC fragmentC;
    public FragmentD fragmentD;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);

        fragmentA = new FragmentA();
        fragmentB = new FragmentB();
        fragmentC = new FragmentC();
        fragmentD = new FragmentD();
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return fragmentA;

            case 1:
                return fragmentB;

            case 2:
                return fragmentC;

            case 3:
                return fragmentD;


        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
