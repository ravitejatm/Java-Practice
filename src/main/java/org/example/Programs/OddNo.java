package org.example.Programs;


// which is not divided by 2 is odd
public class OddNo {
    public static void main(String[] args) {
        int num = 15;

        // Checking if not divisible by 2
        if (num % 2 != 0) {
            System.out.println(num + " is an odd number.");
        } else {
            System.out.println(num + " is an even number.");
        }
    }

//    for (int i = 1; i <= 20; i += 2) {
//        System.out.print(i + " ");
//        // Output: 1 3 5 7 9 11 13 15 17 19
//    }

//
//    public static void main(String[] args) {
//        int count = 0;
//        int number = 1;
//
//        System.out.println("The first 20 odd numbers are:");
//        while (count < 20) {
//            if (number % 2 != 0) {
//                System.out.print(number + " ");
//                count++;
//            }
//            number++;
//        }
//    }
}
