public class ex2_variables {
    public static void main(String[]args) {

        // (a) Create seven variables, one for each of the primitive number types in Java.
        // (b) Initialise each variable with any appropriate value.
        byte tinydigits = 1;
        int regularnumbers = 2;
        short smalldigits = 12;
        long biggerdigits = 122121;
        float smalldig = 0.1f;
        double bigdigits = 1.555;
        char character = 'a';

        // (c) Print out the name of each variable and its value.
        System.out.println("byte is : " + tinydigits);
        System.out.println("int is : " + regularnumbers);
        System.out.println("short is : " + smalldigits);
        System.out.println("long is : " + biggerdigits);
        System.out.println("float is : " + smalldig);
        System.out.println("double is : " + bigdigits);
        System.out.println("char is : " + character);

        // (d) Modify the value of each variable with an assignment statement and print out the names of the variables and their new values.
        tinydigits = 2;
        regularnumbers = 4;
        smalldigits = 24;
        biggerdigits = 221221;
        smalldig = 0.2f;
        bigdigits = 3.555;
        character = 'g';

        System.out.println();
        System.out.println("new byte is : " + tinydigits);
        System.out.println("new int is : " + regularnumbers);
        System.out.println("new short is : " + smalldigits);
        System.out.println("new long is : " + biggerdigits);
        System.out.println("new float is : " + smalldig);
        System.out.println("new double is : " + bigdigits);
        System.out.println("new char is : " + character);

        // (e) Create seven constants, one for each of the primitive number types in Java.
        final byte finalByte = 1;
        final int finalInt = 2;
        final short finalShort = 12;
        final long finalLong = 122121;
        final float finalFloat = 0.1f;
        final double finalDouble = 1.555;
        final char finalChar = 'a';

        // (f) Print the name of the constant and its value.

        System.out.println("final byte : " + finalByte);
        System.out.println("final int : " + finalInt);
        System.out.println("final short : " + finalShort);
        System.out.println("final long : " + finalLong);
        System.out.println("final float : "+ finalFloat);
        System.out.println("final double : " + finalDouble);
        System.out.println("final char : " + finalChar);

        // (g) What happens if you try to assign a value to a constant?

        // finalByte = 3; ----- This does not allow a change and gives an error as this variable is has a final constraint which does not allow a change
    }

}
