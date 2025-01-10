package com.example.eventmanager;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TabLayout tablayout;
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tablayout =findViewById(R.id.tablayout);
        viewpager =findViewById(R.id.viewpager);

        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new UpcomingFragment());
        list.add(new AddFragment());
        list.add(new PastFragment());


        ArrayList<String> itemview = new ArrayList<>();
        itemview.add("Upcoming");
        itemview.add("Add");
        itemview.add("Past");

        MyAdpter myadper = new MyAdpter(getSupportFragmentManager(),list,itemview);
        viewpager.setAdapter(myadper);

        tablayout.setupWithViewPager(viewpager);







    }
}