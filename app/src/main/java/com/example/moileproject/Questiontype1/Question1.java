package com.example.moileproject.Queestiontype1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.moileproject.Localstorage;
import com.example.moileproject.R;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        Toast.makeText(this,"Hello"+" "+Localstorage.score,Toast.LENGTH_LONG).show();
    }
}
