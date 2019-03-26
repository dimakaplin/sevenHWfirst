package com.dimakaplin143.newcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button point;

    Button clear;
    Button dev;
    Button mul;
    Button plus;
    Button minus;
    Button prec;
    Button res;
    TextView result;

    String first = "";
    String two = "";
    String man = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

    }

    private void initViews() {
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);

        clear = findViewById(R.id.clear);
        dev = findViewById(R.id.dev);
        mul = findViewById(R.id.mul);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        prec = findViewById(R.id.prec);
        res = findViewById(R.id.res);
        point = findViewById(R.id.point);
        result = findViewById(R.id.result);

        clear.setOnClickListener(v-> {
            //Button b = (Button) v;
            result.setText("0");
        });
        dev.setOnClickListener(v-> {
            Button b = (Button) v;
            if(!result.getText().toString().contains(b.getText().toString())) {
                first = result.getText().toString();
                man = b.getText().toString();
                buttonClick(b);
            }
        });
        mul.setOnClickListener(v-> {
            Button b = (Button) v;
            if(!result.getText().toString().contains(b.getText().toString())) {
                first = result.getText().toString();
                man = b.getText().toString();
                buttonClick(b);
            }
        });
        plus.setOnClickListener(v-> {
            Button b = (Button) v;
            if(!result.getText().toString().contains(b.getText().toString())) {
                first = result.getText().toString();
                man = b.getText().toString();
                buttonClick(b);
            }
        });
        minus.setOnClickListener(v-> {
            Button b = (Button) v;
            if(!result.getText().toString().contains(b.getText().toString())) {
                first = result.getText().toString();
                man = b.getText().toString();
                buttonClick(b);
            }
        });
        prec.setOnClickListener(v-> {
            Button b = (Button) v;
            if(!result.getText().toString().contains(b.getText().toString())) {
                first = result.getText().toString();
                man = b.getText().toString();
                buttonClick(b);
            }
        });
        res.setOnClickListener(v-> {

            if(!"".equals(first) && !"".equals(man)) {
                double res;
                two = result.getText().toString().substring(result.getText().toString().indexOf(man)+1);
                Button b = (Button) v;
                switch (man) {
                    case "/":
                        res = Double.parseDouble(first) / Double.parseDouble(two);
                        result.setText(Double.toString(res));
                        break;
                    case "*":
                        res = Double.parseDouble(first) * Double.parseDouble(two);
                        result.setText(Double.toString(res));
                        break;
                    case "-":
                        System.out.println(first);
                        System.out.println(two);
                        res = Double.parseDouble(first) - Double.parseDouble(two);
                        result.setText(Double.toString(res));
                        break;
                    case "+":
                        res = Double.parseDouble(first) + Double.parseDouble(two);
                        result.setText(Double.toString(res));
                        break;
                    case "%":
                        res = (Double.parseDouble(first) * 100) / Double.parseDouble(two);
                        result.setText(Double.toString(res));
                        break;
                }
            }
        });

        b1.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b2.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b3.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b4.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b5.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b6.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b7.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b8.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b9.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b0.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        point.setOnClickListener(v-> {
            Button b = (Button) v;

            if(!result.getText().toString().contains(".") && "".equals(first)) {
                buttonClick(b);
            }
            else if (!result.getText().toString().substring(result.getText().toString().indexOf(man)+1).contains(".")) {
                buttonClick(b);
            }


        });
    }

    private void buttonClick(Button b) {
        if("0".equals(result.getText().toString())) {
            result.setText(b.getText().toString());
        }
        else {
            result.setText(result.getText().toString() + b.getText().toString());
        }
    }
}

