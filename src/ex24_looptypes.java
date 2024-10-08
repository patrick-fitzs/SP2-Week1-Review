/**
 * Q24. (*) Java provides three types of loops: while, for, and do (also called do-while).
 * Theoretically, they are interchangeable — any program you write with one kind of loop
 * could be rewritten using any of the other types of loops. As a practical matter, though,
 * it is often the case that choosing the right kind of loop will make your code easier to
 * produce, debug, and read.
 * It takes time and experience to learn to make the best loop choice, so this exercise
 * gives you some of that experience. Rewrite the program from Question 23 using a for
 * loop. Repeat the exercise again but this time use a do-while loop.
 * Which form of loop seems to work best and why?
**/

public class ex24_looptypes {
    public static void main(String[] args) {

        // Below is a do while loop
        int i = 1;
        int n = 100;
        int sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= n);
        System.out.println(sum);
    }
}


/*Below is a for loop*/
//int sum = 0;
//    int limit = 100;
//
//    for (int i = 1; i<=limit; i++){
//        sum+=i;
//    }
//        System.out.println(sum);
//
//

//*Below is a while loop

//int i = 0;
//        int n = 100;
//        int sum = 0;
//
//        while(i<=n){
//            sum+=i;
//            i++;
//        }
//        System.out.println(sum);