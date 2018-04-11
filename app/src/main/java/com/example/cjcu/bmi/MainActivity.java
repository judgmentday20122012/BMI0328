package com.example.cjcu.bmi;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed_Weight;
    private EditText ed_Height;
    private Button b_Help;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
    }

    private void findViews() {
        ed_Weight = findViewById(R.id.ed_Weight);
        ed_Height = findViewById(R.id.ed_Height);
        b_Help = findViewById(R.id.b_Help);
    }
    public void bmi(View v){
        String w = ed_Weight.getText().toString();
        String h = ed_Height.getText().toString();
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight/(height*height);
        Log.d("BMI",String.valueOf(bmi));

        Toast.makeText(this,String.valueOf(bmi),Toast.LENGTH_LONG).show();

        new AlertDialog.Builder(this)
                .setMessage("BMI="+bmi)
                .setTitle("BMI運算")
                .setPositiveButton("OK",null)
                .setNegativeButton("Cancel",null)
                .show();

        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
    }
}
