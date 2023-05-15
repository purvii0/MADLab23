package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isharry=true;
    public void change(View view){
        ImageView imageView=findViewById(R.id.hogwarts);
        ImageView imageView1=findViewById(R.id.harry);
        if(isharry){
            imageView.animate().alpha(1).setDuration(1000).rotationY(7200);
            imageView1.animate().alpha(0).setDuration(1000);
            isharry =false;
        }
        else{
            imageView.animate().alpha(0).setDuration(1000).rotationY(7200);
            imageView1.animate().alpha(1).setDuration(1000);
            isharry =true;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}