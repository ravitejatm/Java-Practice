package practice;


// to store text all. is a seuecnce of characters and it is a class in java
// literal because uniue behaviour work like a data type
public class Stringss {

    static void main(String[] args) {

        String s1 = "hello world"; //stringpool
        String s2 = new String("hello"); //heap memory
        String s3 = new String("hello");
        String s4 = new String("HELLO");
        //concatination means adding two strings.
        System.out.println(s1 + s2);
        System.out.println(s1 == s2);// FALSE BECAUSE BOTH ARE NOT SAME
        System.out.println(s1 == s3); //TRUE

        System.out.println(s1.equals(s2));//TRUE BECAUSE DATA CAMPARISION
        //startsWith, endsWith, contains, euals, eualsIgnoreCase
        System.out.println(s1.contains("h")); //checks
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.startsWith("h"));
        System.out.println(s1.endsWith("h"));
        //length, trim, toCharArray, toLowerCase, toUpperCase.
        // trim used to remove space starting and ending
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toCharArray()); //character array will be printed
        //indexof , lastIndexOf, subString, split, charAt
        System.out.println(s1.indexOf("h"));
        System.out.println(s1.lastIndexOf("h"));
        System.out.println(s1.indexOf(s1.substring(2));
        System.out.println(s1.substring(2,4));
        System.out.println(s1.split(" "));
        System.out.println(s1.charAt(3));

        System.out.println(s1.replace("o" ,"z"));
        System.out.println(Integer.valueOf(s3));//converting to integer
        System.out.println(String.valueOf(s3)); //value to string


        System.out.println(s3.length());
        System.out.println(s3.isEmpty()); // SPACE IS CALCULATED
        System.out.println(s3.isBlank()); // WHERE WE ARE HAVING SPACE WANT TO AVOID IT.



    }
}
