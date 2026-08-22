import java.util.*;
// this will print factorial of a number.

//public class factorial{
//    static int factorial(int n){
//            if(n == 0 || n == 1){
//                return 1;
//            }
//            return n * factorial(n-1);
//            }
//    public static void main(String args[]){
//        int n = 5;
//        System.out.print(factorial(n));
//    }
//}

// this will print factorial using bigint.
//
//import java.math.BigInteger;
//
//public class Factorial {
//
//    static BigInteger factorial(int n) {
//        if (n == 0 || n == 1) {
//            return BigInteger.ONE;
//        }
//
//        return BigInteger.valueOf(n).multiply(factorial(n - 1));
//    }
//
//    public static void main(String[] args) {
//        int n = 1000000;
//        System.out.println(factorial(n));
//    }
//}

//this is to find sum of n natural numbers.

class Recursion{
    static int sum(int n){
        if(n == 0) {
            return 0;
        }
        return (n+(sum(n-1)));
    }

    public static void main(String[] args){
        System.out.println(sum(5));
    }
}