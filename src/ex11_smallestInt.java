/*
Q11. An alternate form for an if statement has multiple parts: a condition that evaluates to
true or false, a statement that is executed if the condition is true, the word else, and
finally a statement that is executed when the condition is false.
Each statement can be a simple statement consisting of a single Java instruction, a “complex” statement (such
as another if statement), or a compound (or block) statement (matching braces {}
that surround one or more Java statements).
We suggest using the brace notation in every case. Consider the code below that prompts the user to input a value for x and
for y.
It then prints the smallest value contained in the variables x and y. */

import java.util.Scanner;

public class ex11_smallestInt {
    public static void main(String[] args) {
        // Creates a new scanner class
        Scanner scan = new Scanner(System.in);
        // Print line prompting for a value
        System.out.println("Enter a value for x:");

        // Store this value
        int x = scan.nextInt();
        System.out.println("Enter a value for y:");
        int y = scan.nextInt();
        System.out.println("Enter a value for z:");
        int z = scan.nextInt();

        // If x is less or equal to y, print x being the smallest value,
        if (x <= y && x <= z) {
            System.out.println("The smallest value was " + x);
            // Else print y as it is the smallest value
        } else if (y<=z) {
            System.out.println("The smallest value was " + y);
        }
        else {
            System.out.println("The smallest value was " + z);
        }
    }
}

// Modify the code above so that it prompts the user to enter a third value for a variable z.
// Rewrite the logic so that the program prints out the smallest value contained in
// x, y, and z.
