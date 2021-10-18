package com.company;

public class math_expression {
    private
    double first_number;
    double second_number;
    String expression;
    public void set_number(double _1st, double _2nd, String _exp){
        first_number = _1st;
        second_number = _2nd;
        expression = _exp;
    }
    double calculate(){
        if (expression.equals("+"))
        {
            return first_number + second_number;
        }
        else if(expression.equals("-"))
        {
            return first_number + second_number;
        }
        else if (expression.equals("*") )
        {
            return first_number * second_number;
        }
        else if (expression.equals("/") && second_number !=0)
        {
            return first_number / second_number;
        }
        else if (expression.equals("/") && second_number ==0)
        {
            System.out.println("Can't not divide 0!!!");
            return Double.POSITIVE_INFINITY;
        }
        else
        {
            System.out.println("Can't not implement this!!!");
            return Double.POSITIVE_INFINITY;
        }
    }
}

