package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity   {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Para  que sea vertical
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    double memory=0;
    // 0 suma, 1 resta, 2 mult, 3 div
    int operation;
    Boolean theIsADot=false;

    public void setNumber (View v){
        Button b = (Button) v;
        String numero = b.getText().toString();
        TextView textView = findViewById(R.id.display);
        String text = textView.getText().toString();
        textView.setText(text + numero);

    }

    public void setDot(View v){
        Button b = (Button) v;
        String numero = b.getText().toString();
        TextView textView = findViewById(R.id.display);
        if (!theIsADot) {
            textView.setText(textView.getText() + numero);
            theIsADot=true;
        }


    }

    public void clearAll (View v){
        TextView textView = findViewById(R.id.display);
        textView.setText("");
        theIsADot=false;
    }

    public void back (View v){
        TextView textView = findViewById(R.id.display);
        try {
            textView.setText(textView.getText().toString().substring(0, textView.getText().length() - 1));
        }
        catch (Throwable e){
            e.printStackTrace();
        }
    }

    public void sum(View v) {
        TextView textView = findViewById(R.id.display);
        try {
            memory = Double.valueOf(textView.getText().toString());
            textView.setText("");
            operation = 0;
            theIsADot=false;
        }
        catch (Throwable e){
            e.printStackTrace();
        }
    }
    public void subs(View v) {
        TextView textView = findViewById(R.id.display);
        try{
            memory = Double.valueOf(textView.getText().toString());
            textView.setText("");
            operation = 1;
            theIsADot=false;
        }
        catch (Throwable e){
            e.printStackTrace();
        }
    }
    public void mult(View v) {
        TextView textView = findViewById(R.id.display);
        try{
            memory = Double.valueOf(textView.getText().toString());
            textView.setText("");
            operation = 2;
            theIsADot=false;
        }
        catch (Throwable e){
            e.printStackTrace();
        }
    }
    public void div(View v) {
        TextView textView = findViewById(R.id.display);
        try {
            memory = Double.valueOf(textView.getText().toString());
            textView.setText("");
            operation = 3;
            theIsADot=false;
        }
        catch (Throwable e){
            e.printStackTrace();
        }
    }

    public void equals(View v) {
        try {
            TextView textView = findViewById(R.id.display);
            double actual = Double.valueOf(textView.getText().toString());
            if (operation == 0) {
                textView.setText(String.valueOf(memory + actual));
            } else if (operation == 1) {
                textView.setText(String.valueOf(memory - actual));
            } else if (operation == 2) {
                textView.setText(String.valueOf(memory * actual));
            } else {
                textView.setText(String.valueOf(memory / actual));
            }
        }
        catch (Throwable e){
            e.printStackTrace();
        }
    }

    public void sin (View v){
        TextView textView = findViewById(R.id.display);
        Switch sw = findViewById(R.id.switch1);
        try {
            Boolean rad = sw.isChecked();
            double num ;
            if (rad) {
                num = Math.sin(Double.valueOf(textView.getText().toString()));

            } else {
                num = Math.sin(Math.toRadians(Double.valueOf(textView.getText().toString())));
            }
            textView.setText(String.valueOf(num));
        }
        catch (Throwable e){
            e.printStackTrace();
        }
    }
    public void cos (View v){
        TextView textView = findViewById(R.id.display);
        Switch sw = findViewById(R.id.switch1);
        try {
            Boolean rad = sw.isChecked();
            double num;
            if (rad) {
                num = Math.cos(Double.valueOf(textView.getText().toString()));

            } else {
                num = Math.cos(Math.toRadians(Double.valueOf(textView.getText().toString())));
            }
            textView.setText(String.valueOf(num));
        }
        catch (Throwable e){
            e.printStackTrace();
        }
    }
    public void tan (View v){
        TextView textView = findViewById(R.id.display);
        Switch sw = findViewById(R.id.switch1);
        try{
            Boolean rad = sw.isChecked();
            double num ;
            if (rad) {
                num = Math.tan(Double.valueOf(textView.getText().toString()));

            } else {
                num = Math.tan(Math.toRadians(Double.valueOf(textView.getText().toString())));
            }
            textView.setText(String.valueOf(num));
        }
        catch (Throwable e){
            e.printStackTrace();
        }
    }
}
