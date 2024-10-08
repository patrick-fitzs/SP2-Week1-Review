/*
Q6. (*) What is the output of the following program and why?*/

public class ex6and7_AverageCalculator {
    public static void main(String[] args) {
        int age1 = 18;
        int age2 = 35;
        int age3 = 50;
        int age4 = 44;
        double averageAge = (age1 + age2 + age3 + age4) / 4;
        System.out.println(averageAge);
    }
}

// This programme outputs 36.0, this is because the double divided is byt 4, not 4.0 which rounds to 36, as opposed to the correct result which is
// 36.75. To achieve this result, fix the 4 to a floating point number.
