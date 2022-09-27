package com.example.dorel01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;
    EditText et;
    Double num1;
    int op;
    Double lastanswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        et = findViewById(R.id.eT);
        num1 = 0.0;
        op = 0;
        lastanswer = 0.0;
    }



    public static boolean dorel6969(String doreli){
        if(doreli.equals("") || doreli.equals(".") || doreli.equals(".-") || doreli.equals("-")){
            return(false);
        }
        else{
            return (true);
        }
    }


    public void dorel69420(int op, double num2) {
        if (op == 0) {
            num1 = num2;
        } else {
            if (op == 1) {
                num1 = num1 + num2;

            } else {
                if (op == 2) {
                    num1 = num1 - num2;
                } else {
                    if (op == 3) {
                        num1 = num1 * num2;
                    } else {
                        if (op == 4) {
                            num1 = num1 / num2;
                        }
                    }
                }
            }
        }



    }

    public void bt1(View view) {
        String st = et.getText().toString();
        boolean doreloshy = dorel6969(st);
        if(doreloshy== true){
            double num2 = Double.parseDouble(st);
            dorel69420(op,num2);
            op = 1;
            et.setHint(num1+"+");
            et.setText("");
        }
        else{
            Toast.makeText(this,"you stupido!", Toast.LENGTH_LONG).show();
        }
    }

    public void bt2(View view) {
        String st = et.getText().toString();
        boolean doreloshy = dorel6969(st);
        if(doreloshy== true){
            double num2 = Double.parseDouble(st);
            dorel69420(op,num2);
            op = 2;
            et.setHint(num1+"-");
            et.setText("");
        }
        else{
            Toast.makeText(this,"you stupido!", Toast.LENGTH_LONG).show();
        }
    }

    public void bt3(View view) {
        String st = et.getText().toString();
        boolean doreloshy = dorel6969(st);
        if(doreloshy== true){
            double num2 = Double.parseDouble(st);
            dorel69420(op,num2);
            op = 3;
            et.setHint(num1+"*");
            et.setText("");
        }
        else{
            Toast.makeText(this,"you stupido!", Toast.LENGTH_LONG).show();
        }
    }

    public void bt4(View view) {
        String st = et.getText().toString();
        boolean doreloshy = dorel6969(st);
        if(doreloshy== true){
            double num2 = Double.parseDouble(st);
            dorel69420(op,num2);
            op = 4;
            et.setHint(num1+"/");
            et.setText("");
        }
        else{
            Toast.makeText(this,"you stupido!", Toast.LENGTH_LONG).show();
        }
    }

    public void bt5(View view) {
        et.setText("");
        op = 0;
        et.setHint("");
        num1 = 0.0;
    }

    public void bt6(View view) {
        String st = et.getText().toString();
        boolean doreloshy = dorel6969(st);
        if(doreloshy== true){
            double num2 = Double.parseDouble(st);
            dorel69420(op,num2);
            String d = Double.toString(num1);
            et.setText(d);
            op= 0;
            lastanswer = num1;
        }
        else{
            Toast.makeText(this,"you stupido!", Toast.LENGTH_LONG).show();
        }
    }

    public void bt7(View view) {
        Intent si = new Intent(this, SecondActivity.class);
        si.putExtra("n",lastanswer);
        startActivity(si);
    }
}