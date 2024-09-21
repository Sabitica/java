class Hello 
{

    // on command line, run "java Hello" to run the below code
    public static void main(String a[]) 
    {
        // int num1 = 3;
        // int num2 = 2;
        // int result = num1 + num2;
        // System.out.println("Hello World"); // println new line, print is on the same line
        // System.out.println(num1);
        // System.out.println(num1 + num2);
        // System.out.println(result);

        // // data types
        // byte by = 127;
        // short sh = 558;
        // long l = 5854l; // have to add l at the end to show it's a long number 
        // float f = 5.8f; // have to add an f at the end 
        // double d = 5.8; // 5.8 is a double, adding an f at the end makes it a float

        // char c = 's'; // cannot use double quotes, only single quotes 
        // char e = '8'; // you can put a number

        // boolean b = true;

        // // literals 
        // System.out.println("Literals:");
        // int num3 = 0b101;
        // System.out.println(num3); // prints 5
        // int num4 = 0x7e;
        // System.out.println(num4); // prints 126
        // int num5 = 10_0_00_000_0;
        // System.out.println(num5); // prints 100000000
        // double double1 = 12;
        // System.out.println(double1); // prints 12.0

        // char char1 = 'a';
        // char1++;
        // System.out.println(char1); // prints b

        // type conversion 
        // byte b = 127;
        // // int a = b; // this will error 
        // int c = 50;
        // // byte k = c; // this will error, you can't assign an integer to a byte
        // byte k = (byte) c; // type casting will then work 
        // float f = 1.2f;
        // int t = (int) f;
        // System.out.println(b);
        // System.out.println(k); 
        // System.out.println(t); // will show 1, rounds down 

        //arithmetic 
        int num1 = 7;
        int num2 = 5;
        int result = num1 + num2;
        int resultDivide = num1 / num2;
        int resultRemainder = num1 % num2; // shows remainder of division
        System.out.println(result);
        System.out.println(resultDivide);
        System.out.println(resultRemainder);

        num1 += 3;
        System.out.println(num1);
        int result2 = num2++;
        System.out.println(result2);

    }

}




