package com.example.eventmanager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class MyPageAdpter  extends PagerAdapter {

     private int imagearray[] = {R.drawable.trikonasan,R.drawable.gomuk,R.drawable.yoga3,R.drawable.yoga4,
            R.drawable.yoga5,R.drawable.yoga6};

     private final String[] YogaName  = { "Yoga1",
             "Yoga2",
             "Yoga3",
             "Yoga4",
             "Yoga5",
             "Yoga6"

    };

    Context context;


    public MyPageAdpter(Context context) {
        this.context = context;

    }


    @Override
    public int getCount() {
        return imagearray.length;
    }

    @SuppressLint("MissingInflatedId")
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {



        View view = LayoutInflater.from(context).inflate(R.layout.upnew, container, false);


        ImageView image1 = view.findViewById(R.id.image1);
        TextView text1 = view.findViewById(R.id.text1);

       image1.setImageResource(imagearray[position]);

        text1.setText(YogaName[position]);
        container.addView(view);

        return view;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View) object);

    }


}
