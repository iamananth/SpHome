package com.example.sphome;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecAct extends AppCompatActivity {

    EditText ed1;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec);
    }
    public void onShow(View v)
    {
        Intent in = new Intent(this, ThirdAct.class);
        startActivity(in);
    }
}