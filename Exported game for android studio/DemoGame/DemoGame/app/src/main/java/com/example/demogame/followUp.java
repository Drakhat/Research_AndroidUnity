package com.example.demogame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.Company.DemoGame.UnityPlayerActivity;

public class followUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_up);

        Intent intent = new Intent(this, UnityPlayerActivity.class);
        startActivity(intent);
    }
}
