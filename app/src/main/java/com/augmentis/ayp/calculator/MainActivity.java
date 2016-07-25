package com.augmentis.ayp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button plusButton;
    private Button minusButton;
    private Button multiplyButton;
    private Button divineButton;
    private Button clearButton;
    private Button equalButton;
    private Button Button9;
    private Button Button8;
    private Button Button7;
    private Button Button6;
    private Button Button5;
    private Button Button4;
    private Button Button3;
    private Button Button2;
    private Button Button1;
    private Button Button0;

    int operator;

    String Num1, Num2, Operator;

    TextView mainView, subView;
    Calculaor calculaor = new Calculaor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Num1 = "";
        Operator = "";

        Button0 = (Button) findViewById(R.id.button0);
        Button1 = (Button) findViewById(R.id.button1);
        Button2 = (Button) findViewById(R.id.button2);
        Button3 = (Button) findViewById(R.id.button3);
        Button4 = (Button) findViewById(R.id.button4);
        Button5 = (Button) findViewById(R.id.button5);
        Button6 = (Button) findViewById(R.id.button6);
        Button7 = (Button) findViewById(R.id.button7);
        Button8 = (Button) findViewById(R.id.button8);
        Button9 = (Button) findViewById(R.id.button9);
        clearButton = (Button) findViewById(R.id.clear_button);
        plusButton = (Button) findViewById(R.id.plus_button);
        minusButton = (Button) findViewById(R.id.minus_button);
        multiplyButton = (Button) findViewById(R.id.multiply_button);
        divineButton = (Button) findViewById(R.id.divine_button);
        equalButton = (Button) findViewById(R.id.equal_button);
        mainView = (TextView) findViewById(R.id.main_text);
        subView = (TextView) findViewById(R.id.sub_text);
        mainView.setText("0");
        subView.setText("");

        Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("0");
                Screen();
            }
        });
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("1");
                Screen();
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("2");
                Screen();
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("3");
                Screen();
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("4");
                Screen();
            }
        });

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("5");
                Screen();
            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("6");
                Screen();
            }
        });

        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("7");
                Screen();
            }
        });

        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("8");
                Screen();
            }
        });
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("9");
                Screen();
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operator = "";
                Num1 = "";
                mainView.setText("0");
                subView.setText("");
                calculaor.pressClear(clearButton);
            }
        });
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operator = "+";
                calculaor.pressOperator(Operator);
                Screen();
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operator = "-";
                calculaor.pressOperator(Operator);
                Screen();
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operator = "x";
                calculaor.pressOperator(Operator);
                Screen();
            }
        });
        divineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operator = "/";
                calculaor.pressOperator(Operator);
                Screen();
            }
        });
        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculaor.pressEquals(equalButton);
                Screen();
            }
        });
    }


    public String setNum(String Num1) {
        calculaor.pressNumber(Num1);
        return Num1;
    }

    public void Screen(){
        mainView.setText(calculaor.mainScreen);
        subView.setText(calculaor.subScreen);
    }
}
