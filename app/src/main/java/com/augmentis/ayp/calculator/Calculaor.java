package com.augmentis.ayp.calculator;

import android.graphics.Path;
import android.widget.Button;

/**
 * Created by Amita on 7/22/2016.
 */
public class Calculaor {
    int Num1 = 0, Result = 0, operatorIndex = 0, equalIndex = 0;
    String tempNumber = "", Operator = "";
    String mainScreen = "0" ,subScreen = "";


    public void pressNumber(String textNumber) {
            tempNumber += textNumber;
            mainScreen = String.valueOf(Integer.valueOf(tempNumber));
    }

    public void pressOperator(String currentOperator) {
        if (!tempNumber.equals("")) {
            if (operatorIndex == 0) {
                Operator = currentOperator;
                Num1 = Integer.valueOf(tempNumber);
                subScreen = String.valueOf(Num1 + Operator);
                tempNumber = "";
            } else {
                calResault();
                subScreen = String.valueOf(Result);
                tempNumber = "";
                Operator = currentOperator;
                Num1 = Integer.valueOf(Result);
            }
            operatorIndex++;
        } else {
            operatorIndex = 0;
        }
    }

    public void pressEquals(Button equalButton) {
            calResault();
            subScreen = "";
            mainScreen = String.valueOf(Result);
            tempNumber = "";
            equalIndex++;
    }

    public void pressClear(Button clearButton){
        Num1 = 0;
        Result = 0;
        operatorIndex = 0;
        tempNumber = "";
        Operator = "";
        mainScreen = "0";
        subScreen = "";
    }

    public void calResault(){
        if (Operator.equals("+")) {
            Result = Num1 + Integer.valueOf(tempNumber);
        } else if (Operator.equals("-")) {
            Result = Num1 - Integer.valueOf(tempNumber);
        } else if (Operator.equals("x")) {
            Result = Num1 * Integer.valueOf(tempNumber);
        } else if (Operator.equals("/")) {
            Result = Num1 / Integer.valueOf(tempNumber);
        }
    }

    public int getResult() {
        return Result;
    }
}