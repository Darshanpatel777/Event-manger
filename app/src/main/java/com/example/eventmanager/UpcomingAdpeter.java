package com.example.eventmanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class UpcomingAdpeter  extends BaseAdapter {
    Context context;
    public UpcomingAdpeter(Context context) {
        this.context = context;
    }

    private int imagearray[] = {R.drawable.yoga1,R.drawable.yoga2,R.drawable.yoga3,R.drawable.yoga4,
            R.drawable.yoga5,R.drawable.yoga6};

    private final String[] YogaName  = { "Yoga1",
            "Yoga2",
            "Yoga3",
            "Yoga4",
            "Yoga5",
            "Yoga6"

    };


    @Override
    public int getCount() {
        return YogaName.length;
    }

    @Override
    public Object getItem(int position) {
        return YogaName[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.itemUpcoming,parent,false);


        }
        return convertView;
    }
}
