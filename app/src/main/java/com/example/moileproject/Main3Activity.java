package com.example.moileproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.moileproject.Questiontype1.Question1;

public class Main3Activity extends AppCompatActivity {
int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);





    }
    public void go(View view){
        Localstorage.score++;
        Intent intent = new Intent(this,Question1.class);
        startActivity(intent);
    }
}
