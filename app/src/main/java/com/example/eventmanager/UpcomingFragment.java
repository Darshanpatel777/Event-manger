package com.example.eventmanager;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;


public class UpcomingFragment extends Fragment {



    public UpcomingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_upcoming, container, false);


        GridView gridView = view.findViewById(R.id.upcoming_grid);

        UpcomingAdpeter adpter = new UpcomingAdpeter(getContext());
        gridView.setAdapter(adpter);

        return view;
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//
//        ViewPager viewPager1;
//
//
//        viewPager1 = view.findViewById(R.id.viewPager1);
//
//
//        MyPageAdpter myPageAdpter;
//        myPageAdpter = new MyPageAdpter(getContext());
//        viewPager1.setAdapter(myPageAdpter);
//
//
//
//
//    }
}