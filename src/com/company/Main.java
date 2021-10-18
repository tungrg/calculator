package com.company;
import com.company.math_expression;
import java.util.Scanner; // using scanner
import java.time.format.DateTimeFormatter;// import data time format
import java.time.LocalDateTime; //import local time
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Main {

    public static void main(String[] args) throws Exception {
        menu();
    }
    public static void menu() {
        double firstNum, secondNum; // two number to handle
        Scanner myScanner = new Scanner(System.in); //use a scanner to scan input
        System.out.println("Calculator can only take number from -20 -> 20!!!");
        System.out.println("Enter the 1st number: ");
        String firstStrNum = myScanner.nextLine(); //get the 1st number

        try {
            firstNum = Double.valueOf(firstStrNum); //convert string to double
        } catch (Exception e) {
            System.out.println(e); // if java couldn't convert, print the reason why
            return;
        }
        if (firstNum < -20 || firstNum > 20) {
            System.out.println("Out of range to handle!"); //check if the number entered in handle range
            return;
        }
        //Scanner myScanner2 = new Scanner(System.in);
        System.out.println("Enter the mathematical expression (+,-,*,/): ");
        String mathExpress = myScanner.nextLine(); //get the math expression
        // check if user enter the right expression
        if (!mathExpress.equals("+") && !mathExpress.equals("-") && !mathExpress.equals("*") && !mathExpress.equals("/")) {
            System.out.println("Can't handle this type of expression");
            return;
        }
        System.out.println("Enter the 2nd number: ");
        String secondStrNum = myScanner.nextLine();//get the 2nd number
        try {
            secondNum = Double.valueOf(secondStrNum); //convert string to double
        } catch (Exception e) {
            System.out.println(e);// if java couldn't convert, print the reason why
            return;
        }
        if (secondNum < -20 || secondNum > 20) {
            System.out.println("Out of range to handle!"); //check if the number entered in handle range
            return;
        }
        math_expression calculate = new math_expression(); //create an object to calculate
        calculate.set_number(firstNum, secondNum, mathExpress); //set the variable of object
        String result = calculate.calculate(); // calculate the result
        System.out.println("Result: " + result); // Print the result

        // Get the time of local system
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        // define variable to write to file
        FileWriter fileWrite = null;
        BufferedWriter bufferWrite = null;
        PrintWriter outWrite = null;
        try {
            fileWrite = new FileWriter("myfile.txt", true);
            bufferWrite = new BufferedWriter(fileWrite);
            outWrite = new PrintWriter(bufferWrite);
            outWrite.println(dtf.format(now) + " " + firstStrNum + mathExpress + secondStrNum + "=" + result);
            outWrite.close();

        } catch (IOException e) {
            System.err.println(e); //if err happen, print it
        } finally { //print the result of write file process
            if (outWrite != null) {
                System.out.println("Write to file successfully");
            }
            else System.out.println("Failed to Write File");
        }
    }
}
