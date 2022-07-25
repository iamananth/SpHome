package com.example.sphome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onHome(View v)
    {
        ed1 = (EditText) findViewById(R.id.et1);
        sp = getSharedPreferences("HD", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        ed.putString("uname",ed1.getText().toString());
        ed.commit();
        Intent in = new Intent(this, SecAct.class);
        startActivity(in);
    }
}