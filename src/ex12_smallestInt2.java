import java.util.*;

import java.util.Scanner;

public class ex12_smallestInt2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a vallue for w:");
        int w = scan.nextInt();
        int smallest = w;

        System.out.println("Enter a value for x:");
        int x = scan.nextInt();
        if (x < smallest){
            smallest = x;
        }

        System.out.println("Enter a value for y:");
        int y = scan.nextInt();
        if (y < smallest) {
            smallest = y; // Update smallest if necessary
        }

        System.out.println("Enter a value for z:");
        int z = scan.nextInt();
        if (z < smallest) {
            smallest = z; // Update smallest if necessary
        }

        System.out.println("The smallest value was " + smallest);
    }
}
//Modify the code so that it prompts the user for four integers (w, x, y, and z) and prints
//the smallest value contained in those variables. How hard would it be to modify the
//version of the program you wrote in the previous question to solve the four-variable
//problem?
