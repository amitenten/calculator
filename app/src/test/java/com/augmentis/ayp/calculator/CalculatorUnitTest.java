package com.augmentis.ayp.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class CalculatorUnitTest {
    @Test
    public void Test_1_plus_1_equal_2 (){
        Calculaor calculaor = new Calculaor();

        calculaor.pressNumber("1");
        calculaor.pressOperator("+");
        calculaor.pressNumber("1");
        calculaor.pressEquals(equalButton);
        int Result = calculaor.getResult();

        assertEquals(2, Result);
    }
    @Test
    public void Test_1_minus_1_equal_0 (){
        Calculaor calculaor = new Calculaor();

        calculaor.pressNumber("1");
        calculaor.pressOperator("-");
        calculaor.pressNumber("1");
        calculaor.pressEquals(equalButton);
        int Result = calculaor.getResult();

        assertEquals(0, Result);
    }
    @Test
    public void Test_2_multiply_4_equal_8 (){
        Calculaor calculaor = new Calculaor();

        calculaor.pressNumber("2");
        calculaor.pressOperator("x");
        calculaor.pressNumber("4");
        calculaor.pressEquals(equalButton);
        int Result = calculaor.getResult();

        assertEquals(8, Result);
    }
    @Test
    public void Test_120_divide_12_equal_10 (){
        Calculaor calculaor = new Calculaor();

        calculaor.pressNumber("1");
        calculaor.pressNumber("2");
        calculaor.pressNumber("0");
        calculaor.pressOperator("/");
        calculaor.pressNumber("1");
        calculaor.pressNumber("2");
        calculaor.pressEquals(equalButton);
        int Result = calculaor.getResult();

        assertEquals(10, Result);
    }
    @Test
    public void Test_22_plus_9_plus_11_equal_42 (){
        Calculaor calculaor = new Calculaor();

        calculaor.pressNumber("2");
        calculaor.pressNumber("2");
        calculaor.pressOperator("+");
        calculaor.pressNumber("9");
        calculaor.pressOperator("+");
        calculaor.pressNumber("1");
        calculaor.pressNumber("1");

        calculaor.pressEquals(equalButton);
        int Result = calculaor.getResult();

        assertEquals(42, Result);
    }
    @Test
    public void Test_1_plus_4_multiply_2_divide_5_equal_2 (){
        Calculaor calculaor = new Calculaor();

        calculaor.pressNumber("1");
        calculaor.pressOperator("+");
        calculaor.pressNumber("4");
        calculaor.pressOperator("x");
        calculaor.pressNumber("2");
        calculaor.pressOperator("/");
        calculaor.pressNumber("5");

        calculaor.pressEquals(equalButton);
        int Result = calculaor.getResult();

        assertEquals(2, Result);
    }

    @Test
    public void Test_Screen (){
        Calculaor calculaor = new Calculaor();

        calculaor.pressNumber("1");
        calculaor.pressOperator("+");
        calculaor.pressNumber("4");
        calculaor.pressOperator("x");
        calculaor.pressNumber("2");
        calculaor.pressOperator("/");
        calculaor.pressNumber("5");

        calculaor.pressEquals(equalButton);
        int Result = calculaor.getResult();
        String mainScreen;

        assertEquals(2, Result);
    }
}
