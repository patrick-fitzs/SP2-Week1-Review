/**
Q23
 (*) There is a famous story about a primary school teacher who wanted to occupy his
 students’ time by making the children compute the sum of 1 + 2 + 3 + ... + 100 by
 hand. As the story goes, the teacher was astounded when one of the children immedi-
 ately produced the correct answer: 5050. The student, a child prodigy, was Carl Gauss,
 who grew up to be one of the most famous mathematicians of the eighteenth century.
 Write a program that computes the above sum in a while loop and then prints the
 sum. After you have the program working, rewrite it so you can compute 1 + 2 + ... + n
 where n is any positive integer.

 */
public class ex23_CarlGauss {
    public static void main(String[]args){
        int i = 0;
        int n = 1;

        while(n<=100){
            i+=n;
            n++;
        }
        System.out.println(i);
    }
}
