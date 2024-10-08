/*
Q.15
Copy and run the following program. Explain how the program compares the two
strings. How can you modify the program so that str2 and str3 are equal when they
are compared?*/

public class ex15StringEqual {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcdefg";

        // stores string 1 + efg at the end
        String str3 = str1 + "efg";

        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        if (str2 == str3)
            System.out.println("The strings are equal");
        else
            System.out.println("The strings are not equal");
    }
}

// str2 == str3 is not equal as str2 and str3 are memory references and are different as they point to different spots in memory.
// by adding str1 and "efg" , this creates a new string object but is stored in a new memory spot "str3"

// By changing str2.isequal(str3) compares the string literals which would mean the program now outputs "The strings are equal"
