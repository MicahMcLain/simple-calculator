package org.example;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //make a new scanner
        Scanner userInput = new Scanner(System.in);
        //ask the user for 2 numbers separated by spaces
        System.out.println("Please enter the two operands separated by spaces:");
        //return the entered data as a string
        String operands = userInput.nextLine();
        //turn the string into an array
        String numsArray[] = operands.split(" ");

        System.out.println("Please enter how you would like to calculate the two numbers ( + OR - OR  * OR /");
        //new String? and then check if newString == + or - or / or *
        String operationalValue = userInput.nextLine();
        //make some characters to hold places to compare the symbols to later
        char plus = '+';
        char minus = '-';
        char divide = '/';
        char multiply = '*';

        //make some doubles to convert to big decimals later
        double num1 = 0;
        double num2 = 0;
        //turn numbers into BigDecimals
        BigDecimal a = new BigDecimal(num1);
        BigDecimal b = new BigDecimal(num2);

        // make a for loop for the number array to turn them into integers
        for (int i = 0; i < numsArray.length - 1; i++) {
            //set number array[i] to num1
            num1 = Double.parseDouble(numsArray[i]);
            //set numberArray[i+1] to num2
            num2 = Double.parseDouble(numsArray[i + 1]);
            }

        //make 4 if statements, 1 for each character, and then do the math
        if (operationalValue.equals(plus)) {
            BigDecimal sum = a.add(b);
            System.out.println(num1 + " plus " + num2 + " equals " + sum);
        }
        if (operationalValue.equals(minus)) {
            BigDecimal diff = a.subtract(b);
            System.out.println(num1 + " minus " + num2 + " equals " + diff);
        }
        if (operationalValue.equals(multiply)) {
            BigDecimal prod = a.multiply(b);
            System.out.println(num1 + " multiplied by " + num2 + " equals " + prod);
        }
        if (operationalValue.equals(divide)) {
            BigDecimal quo = a.divide(b);
            System.out.println(num1 + " divided by " + num2 + " equals " + quo);
        }
    }
}