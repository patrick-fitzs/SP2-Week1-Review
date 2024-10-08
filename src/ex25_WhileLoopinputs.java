import java.util.Scanner;

/***
 Q25.(*) Write a program that uses a while loop. During each iteration of the loop, prompt
 the user to enter a number –– positive, negative, or zero. Keep a running total of the
 numbers the user enters and also keep a count of the number of entries the user makes.
 The program should stop whenever the user enters "q" (or any other input that cannot
 be read as a number) to quit.
 When the user has finished, print the grand total and the number of entries the user
 typed.
 Hint: The following instance methods of class Scanner can be very useful for this ques-
 tion: public boolean hasNextDouble() to check whether the user has entered a
 number and public double nextDouble() to read a number.
 ***/

public class ex25_WhileLoopinputs {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int num_of_entries = 0;
        double sum_of_entries = 0;
        double inputValue;
        System.out.println("Enter a number/y to quit");

        while(scan.hasNextDouble()){
              inputValue = scan.nextDouble();
              sum_of_entries = sum_of_entries+ inputValue;
              num_of_entries++;
              System.out.println("Enter a number/y to quit");

            }
            System.out.println("Number of entries:  "+num_of_entries);
            System.out.println("Total sum of entries= "+ sum_of_entries);
    }
}
