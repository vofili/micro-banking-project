package com.nubeero.springwebmvc.calculator;

public class MyCalculator {

    public int doCalculation(int num1, int num2, char operator){
       int result=0;

        if(operator=='+')
        {
            result= num1+num2;
        }
        if(operator=='-'){
            result= num1-num2;
        }
        return result;
    }
}
