import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class CosminMunteanWeek3Homework {

    public static void week2() {
        // 1. Given two strings, check if the strings are equal. After that, concatenate them into one single string
        String string1 = "FirstString";
        String string2 = "SecondString";

        if (string1 == string2) {
            System.out.println("The strings are equals");
        } else
            System.out.println("The strings are NOT equals");
        System.out.println("-----------------------");
        String stringConcatenat = "";
        stringConcatenat = string1.concat(string2);
        System.out.println("The is the concatened string: " + stringConcatenat);
        System.out.println("-----------------------");
//2. Given a one word string, return true if the string is a palindrome (word that reads the same forwards or backwards - e.g. madam, mom, abba )

        String palindrome = "zmadaam";
        if (isPalindrome(palindrome))
            System.out.println("The word is a palindrome ");
        else
            System.out.println("The word is NOT a palindrome");


        System.out.println("-----------------------");
//3. Create an empty string, an empty array of strings, and a list of strings with random upper and lowercase letters

        String emptyString = "";
        String[] emptyArray = {""};
        ArrayList<String> list = new ArrayList<String>();
        list.add("cars");
        list.add("aTest");
        list.add("CxxX");
        list.add("ab");
// 3.a. Iterate the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-----------------------");
//3.a.i If the word starts with a vowel, make it all lowercase and append it to the empty string

        for (int i = 0; i < list.size(); i++) {
            if (startWithVowel(list.get(i))) {
                emptyString = list.get(i).toLowerCase();
                System.out.println("The word starts with a vowel, all lowervase: " + emptyString);
            }


        }

//3.a.ii If the word starts with a consonant, make it all uppercase and add it to the empty array
        System.out.println("-----------------------");
        for (int i = 0; i < list.size(); i++) {
            if (!startWithVowel(list.get(i))) {
                for (int j = 0; j < emptyArray.length; j++) {
                    emptyArray[j] = list.get(i).toUpperCase();
                    System.out.println("The word starts with a consonant, all uppercase: " + emptyArray[j]);
                }
            }
        }

        System.out.println("-----------------------");
//3.a.iii. If the word contains letter x or X or has less than 3 letters, replace the word with "skipped" and print into the console the current word and the replaced word
        System.out.println("---------------");
        for (int i = 0; i < list.size(); i++) {
            if (hasX(list.get(i))) {
                System.out.println("This word matches the requiremed: " + list.get(i));
                // String sk = list.get(i);
                String sk = list.get(i).replace(list.get(i), "skipped");
                System.out.println("The " +list.get(i) + " is replaced with:" + sk);
            }


        }

        System.out.println("-----------------------");



//4.Create an empty map that will contain Name and Email as key-value pairs
        HashMap<String,String> map=new HashMap<String,String>();
        //4.a. Add a couple of K-V entries
        map.put("Cosmin","test@test.com");
        map.put("George","test2@test.com");
        map.put("El","test3@test.com");
        map.put("Alt","test4@test.com");
        map.put("El3","test5@test.com");
        //4.b. Get the size of the map
        System.out.println("The size of the map is= " + map.size());
        System.out.println("-----------------------");
        //4.c. Check that map contains a specific name

        System.out.println("The map contains Cosmin name? " + map.containsKey("Cosmin"));
        System.out.println("-----------------------");
        //4.d. Get the email that contains a specific name

        String name = (String)map.get("Cosmin");
        System.out.println("The Cosmin's email isL " + name);
        System.out.println("-----------------------");
        //4.e. Remove an entry
        String remove_value = (String)map.remove("El");
        System.out.println("Here is the map with one item removed " + map);


        //4.f. Sort the map by key
        System.out.println("-----------------------");
        System.out.println("Sorted map:");
        TreeMap<String, String> sorted = new TreeMap<>();
        sorted.putAll(map);
        for (Map.Entry<String, String> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

    }

    public static void week1() {

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


    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean startWithVowel(String word) {
        switch (word.charAt(0)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    static boolean hasX(String word) {

        if (word.contains("x") || word.contains("X") || word.length()<3)  {
            return true;


        } return false;
    }



    public static void main(String[] args) {
        System.out.println("######Homework week 1: ######");
        week1();

        System.out.println("######Homework week 2: ######");
        week2();




    }
}



