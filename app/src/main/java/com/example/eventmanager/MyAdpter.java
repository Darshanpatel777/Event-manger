package com.example.eventmanager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyAdpter extends FragmentPagerAdapter {

    ArrayList<Fragment> list;
    ArrayList<String> itemview;

    public MyAdpter(@NonNull FragmentManager fm, ArrayList<Fragment> list, ArrayList<String> itemview) {
        super(fm);

        this.list = list;
        this.itemview = itemview;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return itemview.get(position);
    }
}
