package com.example.sphome;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdAct extends AppCompatActivity {

    TextView tv;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        tv = (TextView) findViewById(R.id.tv1);
        sp = getSharedPreferences("HD", Context.MODE_PRIVATE);
        tv.setText(sp.getString("uname","").toString());
    }
}