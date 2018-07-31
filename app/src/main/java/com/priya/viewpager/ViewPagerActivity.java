package com.priya.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.priya.viewpager.adapter.ViewPagerAdapter;

public class ViewPagerActivity extends AppCompatActivity {

    public ViewPager viewPager;
    public ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        viewPagerAdapter= new ViewPagerAdapter(getSupportFragmentManager());


        viewPager=findViewById(R.id.viewpager);
        viewPager.setAdapter(viewPagerAdapter);
    }
}
