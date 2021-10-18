package com.company;
import com.company.math_expression;
import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
    }
    public static void menu(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        double _1st = myObj.nextDouble();
        System.out.println("Enter the mathematical expression (+,-,*,/): ");
        String exp = myObj.nextLine();
        System.out.println("Enter the 2nd number: ");
        double _2nd = myObj.nextDouble();
        math_expression calculate = new math_expression();
        calculate.set_number(_1st,_2nd, exp);

    }
}
