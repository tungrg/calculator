package com.company;

public class math_expression {
    private
    double firstNumber;
    double secondNumber;
    String mathExpression;
    public void set_number(double firstNum, double secondNum, String mathExp){
        firstNumber = firstNum;
        secondNumber = secondNum;
        mathExpression = mathExp;
    }
    String calculate(){
        if (mathExpression.equals("+"))
        {
            return Double.toString(firstNumber + secondNumber);
        }
        else if(mathExpression.equals("-"))
        {
            return Double.toString(firstNumber + secondNumber);
        }
        else if (mathExpression.equals("*") )
        {
            return Double.toString(firstNumber * secondNumber);
        }
        else if (mathExpression.equals("/") && secondNumber !=0)
        {
            return Double.toString(firstNumber / secondNumber);
        }
        else if (mathExpression.equals("/") && secondNumber == 0)
        {
            return "Can't not divide 0!!!";
        }
        else
        {
            return "Can't not implement this!!!";
        }
    }
}

