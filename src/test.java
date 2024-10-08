import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num_of_inputs = 0;
        double sum_of_inputs = 0;
        double inputValue;
        System.out.println("Enter a number and press y or any letter to quit");

        while (in.hasNextDouble()){
            inputValue = in.nextDouble();
            sum_of_inputs = sum_of_inputs + inputValue;
            num_of_inputs++;
            System.out.println("Enter a number/ press y to quit the program");
        }
        System.out.println("Sum of entries = " + sum_of_inputs);
        System.out.println("Number of entries = " + num_of_inputs);
    }
}