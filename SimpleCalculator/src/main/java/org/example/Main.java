package org.example;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //make a new scanner
        Scanner userInput = new Scanner (System.in);
        //ask the user for 2 numbers separated by spaces
        System.out.println("Please enter the two operands separated by spaces:");
        //return the entered data as a string
        String operands = userInput.nextLine();
        //turn the string into an array
        String numsArray[] = operands.split(" ");

        System.out.println("Please enter the arithmetical symbol you would like to use ( + OR - OR  * OR /");
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

        // make a for loop for the number array to turn them into integers
        for (int i = 0; i < numsArray.length-1; i++) {
            //set number array[i] to BigNumber1
            num1 = BigDecimal.valueOf(numsArray[i]);
            //make BigNumber2 = number array[i+1]
            num2 = BigDecimal.valueOf(numsArray[i+1]);
            //

        }


        //make 4 if statements, 1 for each character, and then do the math
        if(operationalValue.equals(plus)){
            System.out.println(num1 + " plus " + num2 + " equals " + (num1+num2));
        }
        if (operationalValue.equals(minus)){
            System.out.println(num1 + " minus " + num2 + " equals " + (num1-num2));
        }
        if(operationalValue.equals(multiply)) {
            System.out.println(num1 + " multiplied by " + num2 + " equals " + (num1*num2));
        }
        if(operationalValue.equals(divide)){
            System.out.println(num1 + " divided by " + num2 + " equals " + (num1/num2));
        }



    }
}