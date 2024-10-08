/*
Q8. What is the output of the following program and why?*/

public class ex8and9_PercentagePrinter {
    public static void main(String[]args){
        // double rate = 8.70;
        //int percentage = (int) (100 * rate);
        //System.out.println(percentage);

        double rate = 8.70;
        double multiplier = 100;
        System.out.println(rate*multiplier);

        System.out.println('\n' + "Q.9, fixed with Math.round below");

        System.out.println(Math.round(rate*multiplier));

    }
}

// The output is 869.9999999999999. This is because double is not entirely accurate in java due to it being an approximation.

/*
Q9. Fix the program from the previous question so that it displays the correct result.
Remember that you can use Math.round to convert a floating-point value to its closest
integer.*/

