package com.xsample.horizontalscroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout gallery  = findViewById(R.id.gallery);
        LayoutInflater Inflater = LayoutInflater.from(this);

        for (int i =0;i<26;i++){
            View view = Inflater.inflate(R.layout.item,gallery,false);
            TextView textView = view.findViewById(R.id.textView2);
            textView.setText("item"+1);

            ImageView imageView = view.findViewById(R.id.imageView2);
            imageView.setImageResource(R.mipmap.ic_launcher);

            gallery.addView(view);
        }
    }
}
