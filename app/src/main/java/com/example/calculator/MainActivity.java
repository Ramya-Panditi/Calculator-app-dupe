package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity{
    MaterialButton add,sub,div,mul,ob,cb,ac,c,eq,dec,n0,n1,n2,n3,n4,n5,n6,n7,n8,n9;
    TextView display,result;
    double temp;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        ob = findViewById(R.id.ob);
        cb = findViewById(R.id.cb);
        ac = findViewById(R.id.ac);
        c = findViewById(R.id.clear);
        eq = findViewById(R.id.equal);
        dec = findViewById(R.id.decimal);
        n0 = findViewById(R.id.n0);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        display = findViewById(R.id.display);
        result = findViewById(R.id.result);

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + '0');
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + '1');
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + '2');
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + '3');
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + '4');
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + '5');
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + '6');
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + '7');
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + '8');
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + '9');
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + ".");

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Double.parseDouble(result.getText().toString());
                result.setText("");
                operator = add.getText().toString();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Double.parseDouble(result.getText().toString());
                result.setText("");
                operator = sub.getText().toString();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Double.parseDouble(result.getText().toString());
                result.setText("");
                operator = mul.getText().toString();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Double.parseDouble(result.getText().toString());
                result.setText("");
                operator = div.getText().toString();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().substring(0,result.getText().toString().length()-1));
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator.equals("+")){
                    double ans = temp + Double.parseDouble(result.getText().toString());
                    result.setText(String.valueOf(ans));
                }
                if(operator.equals("-")){
                    double ans = temp - Double.parseDouble(result.getText().toString());
                    result.setText(String.valueOf(ans));
                }
                if(operator.equals("x")){
                    double ans = temp * Double.parseDouble(result.getText().toString());
                    result.setText(String.valueOf(ans));
                }
                if(operator.equals("/")){
                    double ans = temp / Double.parseDouble(result.getText().toString());
                    result.setText(String.valueOf(ans));
                }
            }
        });

    }

}