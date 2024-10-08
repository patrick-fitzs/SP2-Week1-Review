/*  Q3. Execute the program shown below.
Each invocation of println outputs the result of an arithmetic expression.
The first two println commands are followed by comments that describe the operations that occur in each expression.
Complete the program by adding a comment after each println statement that describes all the arithmetic operations
that occur when evaluating the expression that is printed.*/


public class ex3_Expressions {
    public static void main(String[]args){

        int a = 3;
        int b = 4;
        int c = 5;
        int d = 17;
        System.out.println((a + b) / c);
        // 3 and 4 are added with sum 7
        // 7 is divided by 5 with quotient 1

        System.out.println(a + b / c);
        // 4 is divided by 5 with quotient 0
        // 3 is added to 0 with sum 3

        System.out.println(a + 1);
        // 3(a) is added with 1

        System.out.println(d % c);
        // 17 modulo 5 and this prints a remainder of 2

        System.out.println(d / c);
        // 17 div by 5 equals 3 as this is an int division

        System.out.println(d % b);
        //17 modulo 4 is equal to 1 (4 times remainder 1)

        System.out.println(d / b);
        // 17 div by 4 is equal to 4 as this is int division

        System.out.println(d + a / d + b);
        // this adds d + (a/d) + b == 17 + 0 + 4 = 21. (3/17 is 0 in int division)

        System.out.println((d + a) / (d + b));
        // 17 + 3 / 17 + 4 . this prints 0 as 20/21 in int division is 0

        System.out.println(Math.sqrt(b));
        // prints square root of 4 which is 2

        System.out.println(Math.pow(a, b));
        // prints 3 to the power of 4 which is 82 (3x3=9, x3=27, x3=81)

        System.out.println(Math.abs(-a));
        // returns the absolute value of a which is 3

        System.out.println(Math.max(a, b));
        //prints the larger of the two which is 4
    }


}
