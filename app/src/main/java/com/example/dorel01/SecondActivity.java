package com.example.dorel01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv;
    Button btn8;
    double x1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = findViewById(R.id.tv);
        btn8 = findViewById(R.id.btn8);
        Intent gi = getIntent();
        x1 = gi.getDoubleExtra("n",-999999);
        String s = Double.toString(x1);
        tv.setText(s);
    }

    public void bt8(View view) {

        finish();
    }
}
