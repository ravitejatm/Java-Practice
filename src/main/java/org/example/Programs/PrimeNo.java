package org.example.Programs;


//Prime numbers: 2,3,5,7,11,13,17,23,29
//the numbers divisible by itself and 1


public class PrimeNo {

    static void main(String[] args) {
        int n = 5;
        int count = 0;

        for (int i = 1; i<= n; i++) {
              if (n % i == 0) {
                  count++;
              }
            }
            if(count == 2){
                System.out.println(n + " is prime number");
            }
            else {
                System.out.println(n + " is not prime number");
            }
        }
    }

//    int num = 29; // The number to check
//    boolean isPrime = true;
//
//    if (num <= 1) {
//        isPrime = false; // Numbers less than or equal to 1 are not prime
//    } else {
//        // Check for divisors up to the square root of num
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                isPrime = false; // Found a divisor, so it's not prime
//                break; // Exit the loop immediately
//            }
//        }
//    }
//
//    if (isPrime) {
//        System.out.println(num + " is a prime number.");
//    } else {
//        System.out.println(num + " is not a prime number.");
//    }
//    /// ///////////////////////////////////////////////////////////////////////
//
//    for (int n = 2; n <= 100; n++) {
//        boolean isPrime = true;
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime) System.out.print(n + " ");
//    }
//}


