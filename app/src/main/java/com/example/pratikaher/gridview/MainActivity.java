package com.example.pratikaher.gridview;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    final ArrayList<String> list = new ArrayList<>(Arrays.asList("blue Sneakers", "Jacket", "Tshirt", "Shirt", "Cap"));

    final ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(100,150,200,250,300));

    final ArrayList<Integer> imageid = new ArrayList<>(Arrays.asList(R.drawable.pic_1pic_1,R.drawable.pic_2,R.drawable.pic_1pic_2,R.drawable.pic_1pic_3, R.drawable.pic_1pic_5));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView=(GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(new ImageAdapter(this,list,list1,imageid));
    }
    public void Clicked(View view)
    {
        final ImageButton like=(ImageButton)findViewById(R.id.imageButton);
        like.setImageResource(R.drawable.like2);

                Drawable d1=like.getDrawable();
                Drawable d2= ResourcesCompat.getDrawable(getResources(),R.drawable.like, null);
                Drawable d3= ResourcesCompat.getDrawable(getResources(),R.drawable.like2, null);

                if(d1.equals(d2))
                {
                    like.setImageResource(R.drawable.like2);
                    Toast.makeText(MainActivity.this,"ADDED TO WISHLIST",Toast.LENGTH_LONG).show();

                }
                else if(d1.equals(d3)) {
                    like.setImageResource(R.drawable.like);
                    Toast.makeText(MainActivity.this,"REMOVED FROM WISHLIST",Toast.LENGTH_LONG).show();

                }

    }

}



