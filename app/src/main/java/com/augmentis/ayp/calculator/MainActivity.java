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

    int num1, num2, operator,sum;

    String Num1, Num2, Operator;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = "";
        Num2 = "";
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
        textView = (TextView) findViewById(R.id.show_text);
        textView.setText("0");

        Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == 0) {
                    if (Num1.equals("")) {
                        textView.setText("0");
                    } else {
                        setNum("0");
                        textView.setText(Num1);
                    }
                } else if (operator == 1) {
                    if (Num1.equals("")) {
                        textView.setText("0");
                    } else {
                        setNumOperation("0");
                        textView.setText(Num2);
                    }
                }
            }
        });

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == 0) {
                    if (Num1.equals("")) {
                        setNum("");
                        setNum("1");
                        textView.setText(Num1);
                    } else {
                        setNum("1");
                        textView.setText(Num1);
                    }
                } else if (operator == 1) {
                    if (Num1.equals("")) {
                        setNumOperation("");
                        setNumOperation("1");
                        textView.setText(Num2);
                    } else {
                        setNumOperation("1");
                        textView.setText(Num2);
                    }
                }
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == 0) {
                    if (Num1.equals("")) {
                        setNum("");
                        setNum("2");
                        textView.setText(Num1);
                    } else {
                        setNum("2");
                        textView.setText(Num1);
                    }
                } else if (operator == 1) {
                    if (Num1.equals("")) {
                        setNumOperation("");
                        setNumOperation("2");
                        textView.setText(Num2);
                    } else {
                        setNumOperation("2");
                        textView.setText(Num2);
                    }
                }
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == 0) {
                    if (Num1.equals("")) {
                        setNum("");
                        setNum("3");
                        textView.setText(Num1);
                    } else {
                        setNum("3");
                        textView.setText(Num1);
                    }
                } else if (operator == 1) {
                    if (Num1.equals("")) {
                        setNumOperation("");
                        setNumOperation("3");
                        textView.setText(Num2);
                    } else {
                        setNumOperation("3");
                        textView.setText(Num2);
                    }
                }
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == 0) {
                    if (Num1.equals("")) {
                        setNum("");
                        setNum("4");
                        textView.setText(Num1);
                    } else {
                        setNum("4");
                        textView.setText(Num1);
                    }
                } else if (operator == 1) {
                    if (Num1.equals("")) {
                        setNumOperation("");
                        setNumOperation("4");
                        textView.setText(Num2);
                    } else {
                        setNumOperation("4");
                        textView.setText(Num2);
                    }
                }
            }
        });

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == 0) {
                    if (Num1.equals("")) {
                        setNum("");
                        setNum("5");
                        textView.setText(Num1);
                    } else {
                        setNum("5");
                        textView.setText(Num1);
                    }
                } else if (operator == 1) {
                    if (Num1.equals("")) {
                        setNumOperation("");
                        setNumOperation("5");
                        textView.setText(Num2);
                    } else {
                        setNumOperation("5");
                        textView.setText(Num2);
                    }
                }
            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == 0) {
                    if (Num1.equals("")) {
                        setNum("");
                        setNum("6");
                        textView.setText(Num1);
                    } else {
                        setNum("6");
                        textView.setText(Num1);
                    }
                } else if (operator == 1) {
                    if (Num1.equals("")) {
                        setNumOperation("");
                        setNumOperation("6");
                        textView.setText(Num2);
                    } else {
                        setNumOperation("6");
                        textView.setText(Num2);
                    }
                }
            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == 0) {
                    if (Num1.equals("")) {
                        setNum("");
                        setNum("7");
                        textView.setText(Num1);
                    } else {
                        setNum("7");
                        textView.setText(Num1);
                    }
                } else if (operator == 1) {
                    if (Num1.equals("")) {
                        setNumOperation("");
                        setNumOperation("7");
                        textView.setText(Num2);
                    } else {
                        setNumOperation("7");
                        textView.setText(Num2);
                    }
                }
            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == 0) {
                    if (Num1.equals("")) {
                        setNum("");
                        setNum("8");
                        textView.setText(Num1);
                    } else {
                        setNum("8");
                        textView.setText(Num1);
                    }
                } else if (operator == 1) {
                    if (Num1.equals("")) {
                        setNumOperation("");
                        setNumOperation("8");
                        textView.setText(Num2);
                    } else {
                        setNumOperation("8");
                        textView.setText(Num2);
                    }
                }
            }
        });
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == 0) {
                    if (Num1.equals("")) {
                        setNum("");
                        setNum("9");
                        textView.setText(Num1);
                    } else {
                        setNum("9");
                        textView.setText(Num1);
                    }
                } else if (operator == 1) {
                    if (Num1.equals("")) {
                        setNumOperation("");
                        setNumOperation("9");
                        textView.setText(Num2);
                    } else {
                        setNumOperation("9");
                        textView.setText(Num2);
                    }
                }
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 = "";
                setNum("");
                textView.setText("0");
                Num2 = "";
                setNumOperation("");
                textView.setText("0");
            }
        });
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Num1.equals("")) {
                    textView.setText("0");
                    operator = 0;
                } else {
                    if (Num2 != "") {
                        num1 = Integer.parseInt(Num1);
                        num2 = Integer.parseInt(Num2);
                        sum = num1 + num2;
                        String ssum = Integer.toString(sum);
                        textView.setText(ssum);
                        operator = 0;
                        Num2 = "";
                        Num1 = ssum;
                        textView.setText(Num1 + "+");
                        operator = 1;
                        Operator = "+";
                    } else {
                        textView.setText(Num1 + "+");
                        operator = 1;
                        Operator = "+";
                    }
                }
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Num1.equals("")) {
                    textView.setText("0");
                    operator = 0;
                } else {
                    if (Num2 != "") {
                        num1 = Integer.parseInt(Num1);
                        num2 = Integer.parseInt(Num2);
                        sum = num1 - num2;
                        String ssum = Integer.toString(sum);
                        textView.setText(ssum);
                        operator = 0;
                        Num2 = "";
                        Num1 = ssum;
                        textView.setText(Num1 + "-");
                        operator = 1;
                        Operator = "-";
                    } else {
                        textView.setText(Num1 + "-");
                        operator = 1;
                        Operator = "-";
                    }
                }
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Num1.equals("")) {
                    textView.setText("0");
                    operator = 0;
                } else {
                    if (Num2 != "") {
                        num1 = Integer.parseInt(Num1);
                        num2 = Integer.parseInt(Num2);
                        sum = num1 * num2;
                        String ssum = Integer.toString(sum);
                        textView.setText(ssum);
                        operator = 0;
                        Num2 = "";
                        Num1 = ssum;
                        textView.setText(Num1 + "x");
                        operator = 1;
                        Operator = "x";
                    } else {
                        textView.setText(Num1 + "x");
                        operator = 1;
                        Operator = "x";
                    }
                }
            }
        });
        divineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Num1.equals("")) {
                    textView.setText("0");
                    operator = 0;
                } else {
                    if (Num2 != "") {
                        num1 = Integer.parseInt(Num1);
                        num2 = Integer.parseInt(Num2);
                        sum = num1 / num2;
                        String ssum = Integer.toString(sum);
                        textView.setText(ssum);
                        operator = 0;
                        Num2 = "";
                        Num1 = ssum;
                        textView.setText(Num1 + "/");
                        operator = 1;
                        Operator = "/";
                    } else {
                        textView.setText(Num1 + "/");
                        operator = 1;
                        Operator = "/";
                    }
                }
            }
        });
        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == 1) {
                    if (Operator.equals("+")) {
                        num1 = Integer.parseInt(Num1);
                        num2 = Integer.parseInt(Num2);
                        sum = num1 + num2;
                        String ssum = Integer.toString(sum);
                        textView.setText(ssum);
                        operator = 0;
                        Num2 = "";
                        Num1 = ssum;
                    }

                    else if (Operator.equals("-")) {
                        num1 = Integer.parseInt(Num1);
                        num2 = Integer.parseInt(Num2);
                        sum = num1 - num2;
                        String ssum = Integer.toString(sum);
                        textView.setText(ssum);
                        operator = 0;
                        Num2 = "";
                        Num1 = ssum;
                    }
                    else if (Operator.equals("x")) {
                        num1 = Integer.parseInt(Num1);
                        num2 = Integer.parseInt(Num2);
                        sum = num1 * num2;
                        String ssum = Integer.toString(sum);
                        textView.setText(ssum);
                        operator = 0;
                        Num2 = "";
                        Num1 = ssum;
                    }
                    else if (Operator.equals("/")) {
                        num1 = Integer.parseInt(Num1);
                        num2 = Integer.parseInt(Num2);
                        sum = num1 / num2;
                        String ssum = Integer.toString(sum);
                        textView.setText(ssum);
                        operator = 0;
                        Num2 = "";
                        Num1 = ssum;
                    }
                } else {
                    textView.setText("0");
                    operator = 0;
                }
            }
        });

    }

    public String setNum(String Num1) {
        this.Num1 = this.Num1 + Num1;
        return Num1;
    }

    public String setNumOperation(String Num2) {
        this.Num2 = this.Num2 + Num2;
        return Num2;
    }
}
