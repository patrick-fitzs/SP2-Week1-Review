/*
Q.16. (*) Write a program that prompts the user to enter three strings. Compare the String
objects lexicographically (similar to the order in a lexicon) and print the middle-valued
string. To compare two String objects lexicographically, you can write s1.compareTo(s2)
and get an int value as a result.
• If the result is negative, then s1 is smaller.
• If the result is positive, then s2 is smaller.
• If the result is 0, then s1 and s2 are equal.
For example, if the three strings were "ab", "xy", and "pq", the program would print
"pq".
Limit yourself to simple, nested if statements that don’t use the boolean opera-
tors && or ||. Be sure to test your code by providing input data that tests every path
through your code.
Make a list of values for str1, str2, and str3 that would thoroughly test the code.
*/

import java.util.Scanner;

public class ex16_moreStrings {
    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = scan.next();
        String str2 = scan.next();
        String str3 = scan.next();
        String middleStr = "";

        if (str1.compareTo(str2)<0){ // str1<str2
            if (str2.compareTo(str3)<0){ //str2<str3
                middleStr = str2;  //str1<str2<str3

            } else if (str1.compareTo(str3)<0) { // ELSE IF str2 NOT < str3 and if str1<str3
                middleStr = str3; // str1<str3<str2
            } else {
                middleStr = str1; // str3<str1<str2
            }
        } else { // ELSE str2 >= str1
            if (str1.compareTo(str3)<0){
                middleStr = str1; // str2<str1<str3
            } else if (str2.compareTo(str3)<0) { // and if str1 is not < than str3, check if str 2<str3
                middleStr = str3; ///str2<str3<str1
            } else {
                middleStr = str2; // str3<str2<str1
            }
        }
        System.out.println("The middle string is : " + middleStr);
    }
}