package com.example.newmobile.Question1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.newmobile.Localstorage;
import com.example.newmobile.R;

public class Kitchen18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen18);
    }
    public void btn1(View view){

        Intent intent = new  Intent(this, Kitchen19.class);
        startActivity(intent);
    }
    public void btn2(View view){
        Localstorage.score++;
        Intent intent = new  Intent(this,Kitchen19.class);
        startActivity(intent);
    }
    public void btn3(View view){

        Intent intent = new  Intent(this,Kitchen19.class);
        startActivity(intent);

    }
    public void btn4(View view){

        Intent intent = new  Intent(this,Kitchen19.class);
        startActivity(intent);
    }
}
