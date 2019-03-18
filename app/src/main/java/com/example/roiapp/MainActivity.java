package com.example.roiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tw0;
    EditText et0;
    TextView tw1;
    EditText et1;
    TextView tw2;
    EditText et2;
    Button bt;
    TextView total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tw0 = findViewById(R.id.tw0);
        et0 = findViewById(R.id.et0);
        tw1 = findViewById(R.id.tw1);
        et1 = findViewById(R.id.et1);
        tw2 = findViewById(R.id.tw2);
        et2 = findViewById(R.id.et2);
        bt = findViewById(R.id.bt0);
        total = findViewById(R.id.total);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int  num1 = Integer.parseInt(et0.getText().toString());
                int  num2 = Integer.parseInt(et1.getText().toString());
                int num3 = Integer.parseInt(et2.getText().toString());
                float result = (float) num3/num1;
                float result2 = result * 100;
                float result3 = result2 / num2;
                total.setText(Float.toString(result3) + "%");
            }
        });
    }
}
