/*
Q4.
Write a program that prompts the user to enter two integers.
Print the smaller of the two numbers entered.
You’ll need to use a Scanner and a Math method.*/

import java.util.Scanner;

public class ex4_Printing {
    public static void main(String[]args){
        // Create a scanner class
        Scanner scan = new Scanner(System.in);

        // Ask the user to enter two integers
        System.out.println("Enter two integers");
        int firstInt = scan.nextInt();
        int secondInt = scan.nextInt();

        // Print out the two numbers
        System.out.println("The first number entered is : " + firstInt);
        System.out.println("The second number entered is : " + secondInt);

        // Print the smaller od the two
        System.out.println("The smaller of the two numbers entered is : " + Math.min(firstInt, secondInt));

    }

}
