package com.company;
import com.company.math_expression;
import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Main {

    public static void main(String[] args) throws Exception {
        menu();
    }
    public static void menu(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Calculator can only take number from -20 -> 20!!!");
        System.out.println("Enter the 1st number: ");
        double first_num = myScanner.nextDouble();
        if (first_num > - 20 && first_num <20) {
            System.out.println("Ok!!");
        }
        else {
            System.out.println("Error!!");
            return;
        }
        System.out.println("Enter the mathematical expression (+,-,*,/): ");
        String mathExpress = myScanner.nextLine();
        if (!mathExpress.equals("+") || !mathExpress.equals("-") || !mathExpress.equals("*")  || !mathExpress.equals("/"))
        {
            System.out.println("Ok!!");
        }
        else {
            System.out.println("Error!!");
            return;
        }
        System.out.println("Enter the 2nd number: ");
        double second_num = myScanner.nextDouble();
        if(second_num >-20 && second_num <20){
            System.out.println("Ok!!");
        }
        else {
        System.out.println("Error!!");
        return;
        }
        math_expression calculate = new math_expression();
        calculate.set_number(first_num,second_num, mathExpress);
        System.out.println("Result: " + calculate.calculate());

    }
}
