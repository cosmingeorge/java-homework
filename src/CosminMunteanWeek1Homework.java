
import java.util.Random;
public class CosminMunteanWeek1Homework {

    public static void main(String[] args) {


    //Define and print on separate lines the following data types, using random values:
    // Primitive: boolean, char, int, long, double
    // Non primitive: String, array;

        Boolean test1 = true;
        System.out.println("The boolean value is:" + test1);

        char firstLetter = 'C';
        System.out.println("The First Letter is: " + firstLetter);

        int IntNumber = 999;
        System.out.println("The Int number is: " + IntNumber);

        long LongNumber = 100000L;
        System.out.println("The Long number is: " + LongNumber);

        double DoubleNumber = 10.10;
        System.out.println("The double number is: " + DoubleNumber);

        int array[]={1,2,3,4};
        System.out.println("The array is:");
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }

        String s="My String";
        System.out.println("The string is: " + s);

    //Define some integer variables. Perform the operations below and print the result
    // increment it using the unary operator

        int x = 50;
        System.out.println("The incremented number is: " + ++x);

    // perform some random arithmetic operations using the arithmetic operators

        int a1 = 5;
        int a2 = 6;
        System.out.println("The result of the radom arithmetic operation is: " + a1*a2);

        int a3 = 7;
        int a4 = 10;
        System.out.println("Is a3 biggher then a4? " + (a3>a4));


    // Define two integer variables, a and b
    //Using an if-else statement, compare the values, and
     //if a is larger, print "<value of a> is larger than <value of b>"
     //if b is larger, print "<value of b> is larger than <value of a>"
     //if numbers are equal, print "<value of a> is equal to <value of b>"

        int a = 50;
        int b = 100;

        if (a>b){
        System.out.println(a + " Is larger than " + b);
        }
        else if (a<b){
            System.out.println(b + " Is larger than " + a );}
        else if (a==b) { System.out.println(a + " Is egual to " + b ); }




       // Define a number array of 10 elements, using random values from range 1 to 100, which needs to include number 15;
       // Using a for loop, print the values of every element on separate lines. If an element has value 15, skip printing this value.

        int arr[]={14, 22, 15, 33, 71, 72, 3, 51, 3};
        for(int i=0;i<arr.length;i++) {
            if (arr[i] != 15)
            System.out.println(arr[i]);
        }




    }



    }



