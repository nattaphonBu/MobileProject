package com.example.newmobile.Question3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.newmobile.Localstorage;
import com.example.newmobile.R;

public class Movie12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie12);
    }
    public void btn1(View view){
        Intent intent = new  Intent(this, Movie13.class);
        startActivity(intent);

    }
    public void btn2(View view){
        Intent intent = new  Intent(this,Movie13.class);
        startActivity(intent);
    }
    public void btn3(View view){
        Localstorage.score++;
        Intent intent = new  Intent(this,Movie13.class);
        startActivity(intent);
    }
    public void btn4(View view){
        Intent intent = new  Intent(this,Movie13.class);
        startActivity(intent);
    }
}
