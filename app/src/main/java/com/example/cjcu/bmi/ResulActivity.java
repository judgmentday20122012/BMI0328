package com.example.cjcu.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resul);

        Intent intent = getIntent();
    }
}
