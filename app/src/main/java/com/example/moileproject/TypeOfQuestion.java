package com.example.moileproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.moileproject.Questiontype1.Question1;

public class TypeOfQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_question);
    }
    public void type1(View view){
        Toast.makeText(this,"Hello"+" "+Localstorage.firstnames+" "+Localstorage.lastname,Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,Question1.class);
    }
}
