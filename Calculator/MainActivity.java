package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b5,b4,b6,b7,b8,b9,b0,mul,bc,dot,plus,minus,div,equal;
    EditText result;
    float mv1,mv2;
    boolean add,sub,pro,quo;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        bc=findViewById(R.id.bc);
        mul=findViewById(R.id.mul);
        dot=findViewById(R.id.dot);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        div=findViewById(R.id.div);
        equal=findViewById(R.id.eq);
        result=findViewById(R.id.ed1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText("");
                }
                else{
                    mv1=Float.parseFloat(result.getText()+"");
                    add=true;
                    result.setText(null);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText("");
                }
                else{
                    mv1=Float.parseFloat(result.getText()+"");
                    sub=true;
                    result.setText(null);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText("");
                }
                else{
                    mv1=Float.parseFloat(result.getText()+"");
                    pro=true;
                    result.setText(null);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText("");
                }
                else{
                    mv1=Float.parseFloat(result.getText()+"");
                    quo=true;
                    result.setText(null);
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mv2=Float.parseFloat(result.getText()+ " ");
                if (add==true){
                    result.setText(mv1+mv2 + "");
                    add=false;
                }
                if (sub==true){
                    result.setText(mv1-mv2 + "");
                    sub=false;
                }
                if (pro==true){
                    result.setText(mv1*mv2 + "");
                    pro=false;
                }
                if (quo==true){
                    result.setText(mv1/mv2 + "");
                    quo=false;
                }
            }
        });
    }
}
