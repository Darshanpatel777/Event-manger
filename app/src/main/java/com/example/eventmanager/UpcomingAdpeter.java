package com.example.eventmanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class UpcomingAdpeter  extends BaseAdapter {
    Context context;
    public UpcomingAdpeter(Context context) {
        this.context = context;
    }

    private int imagearray[] = {R.drawable.trikonasan,R.drawable.gomuk,R.drawable.yoga3,R.drawable.yoga4,
            R.drawable.yoga5,R.drawable.yoga6};

    private final String[] YogaName  = { "TRIKONASANA",
            "GOMUKHASANA",
            "ARDHMATSYENDRASHANA",
            "BHUJANGASANA",
            "VIRABHADRASANAA",
            "JANUSHIRSHAASANA"

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
            convertView = LayoutInflater.from(context).inflate(R.layout.itemupcoming,parent,false);

        }
        ImageView imageView = convertView.findViewById(R.id.upimage1);
        TextView textView = convertView.findViewById(R.id.uptxt1);

        imageView.setImageResource(imagearray[position]);
        textView.setText(YogaName[position]);


        return convertView;
    }
}
