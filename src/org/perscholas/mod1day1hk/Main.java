package org.perscholas.mod1day1hk;

public class Main {
    public static void main(String[] args) {
//        reverse a string
//        String myString = "Abisola";
//        String reversedWord = new StringBuilder(myString).reverse().toString();
//        System.out.println(reversedWord);
//        primeNumChecker();
          getUp(8);

    }
//    }

    //prints all prime numbers from 1-20 using a while loop;

//    static void primeNumChecker() {
//        int primeCheckNumber;
//        int n = 1;
//        int divisibleCount;
//
//        while (n <= 20) {
//            divisibleCount = 0;
//            primeCheckNumber = 2;
//            while (primeCheckNumber <= n / 2) {
//                if (n % primeCheckNumber == 0) {
//                    divisibleCount++;
//                    break;
//                }
//                primeCheckNumber++;
//            }
//            if (divisibleCount == 0 && n != 1) {
//                System.out.print(n + " ");
//            }
//            n++;
//        }
//    }

//Get up for the squawking parrot
public static void getUp(int currentHour) {
        boolean squawking = false;
    while (currentHour <= 23){
    if(currentHour < 6 || currentHour > 22){
        squawking  = true;
        System.out.println( "Get up");
        break;
    }else{
        squawking  = false;
        System.out.println( "Go back to sleep");
    }   break;
}
}}
