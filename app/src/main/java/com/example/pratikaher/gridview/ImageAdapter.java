package com.example.pratikaher.gridview;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static android.R.id.list;

public class ImageAdapter extends BaseAdapter {

    private Context context;
    private final List<String> prodnm;
    private final List<Integer> price;
    private final List<Integer> imgid;

    public ImageAdapter(Context context, List<String> prodnm, List<Integer> price , List<Integer> imgid) {
        this.context = context;
        this.prodnm = prodnm;
        this.price=price;
        this.imgid = imgid;

    }

    @Override
    public int getCount() {
        return price.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }



    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            Log.e("dewfwe", String.valueOf(position));

            gridView = inflater.inflate(R.layout.customgridview, null);
            TextView textView = (TextView) gridView.findViewById(R.id.productname);
            textView.setText(prodnm.get(position));
            TextView textView1 = (TextView) gridView.findViewById(R.id.price);
            textView1.setText(String.valueOf(price.get(position)));
            ImageView imageView = (ImageView) gridView.findViewById(R.id.leo);
            imageView.setImageResource(this.imgid.get(position));

            return gridView;
        }
        return convertView;

    }


}
