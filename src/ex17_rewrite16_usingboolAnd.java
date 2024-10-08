import java.util.Scanner;

public class ex17_rewrite16_usingboolAnd {
    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Type in three strings");
        String str1 = scan.next();
        String str2 = scan.next();
        String str3 = scan.next();
        
        String middleStr = "";

        if ((str1.compareTo(str2)>0) && (str1.compareTo(str3)<0) || (str1.compareTo(str3)>0) &&(str1.compareTo(str2)<0)){
            middleStr = str1;
        } else if ((str2.compareTo(str1)>0) && (str2.compareTo(str3)<0) || (str3.compareTo(str2)<0) && (str2.compareTo(str1)<0)) {
            middleStr = str2;
        } else {
            middleStr = str3;
        }
        System.out.println(middleStr);
    }
}
