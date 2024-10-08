/**
 * Convert this for loop to a while loop
 *
 * public static void main(String[] args) {
 for (int i = 1; i <= 10; i++)
 System.out.println(i + " squared equals " + i * i);
 }*/

public class ex29_convert_for_to_while_loop {
    public static void main(String[] args) {
        int i =1;
        while (i<=10){
            System.out.println(i + " squared equals " + i * i);
            i++;

        }
    }
}
