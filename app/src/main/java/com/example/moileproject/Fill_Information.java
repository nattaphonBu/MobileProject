package com.example.moileproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Fill_Information extends AppCompatActivity {
    EditText firstname, lastname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill__information);
        firstname = (EditText)findViewById(R.id.firstname);
        lastname = (EditText)findViewById(R.id.lastname);



    }

    public void gotochoosequestion(View view){
        Localstorage.firstnames = firstname.getText().toString();
        Localstorage.lastname = lastname.getText().toString();
        Intent intent = new Intent(this,TypeOfQuestion.class);
        startActivity(intent);

    }
}
