package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isEarth=true;
    public void change(View view){
        ImageView iv =findViewById(R.id.imageView3);
        if (isEarth) {
            iv.setImageResource(R.drawable.bharat);
            isEarth=false;
        }
        else{
            iv.setImageResource(R.drawable.dharti);
            isEarth=true;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}