package DMS.asigment1;

import java.util.Scanner;

/**
 * Laboratory Work 1: Functions and Recursion
 * This program contains various recursive functions to solve mathematical problems.
 * Each function is well-documented and analyzed for time complexity.
 */

public class asigment1_1 {

    /**
     * Finds the minimum element in the array using recursion.
     * Time Complexity: O(n) - We traverse the array once.
     */

    public static int findMin(int[] arr, int index, int min) {
        if (index == arr.length) return min;
        return findMin(arr, index + 1, Math.min(min, arr[index]));
    }

    /**
     * Calculates the average of array elements using recursion.
     * Time Complexity: O(n) - We sum all elements recursively.
     */

    public static double findAverage(int[] arr, int index, int sum) {
        if (index == arr.length) return (double) sum / arr.length;
        return findAverage(arr, index + 1, sum + arr[index]);
    }

    /**
     * Checks whether a number is prime using recursion.
     * Time Complexity: O(√n) - We check divisibility up to sqrt(n).
     */

    public static boolean isPrime(int n, int i) {
        if (n < 2) return false;
        if (i * i > n) return true;
        if (n % i == 0) return false;
        return isPrime(n, i + 1);
    }

    /**
     * Calculates factorial of a number using recursion.
     * Time Complexity: O(n) - Recursive calls up to n.
     */

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    /**
     * Finds the nth Fibonacci number using recursion.
     * Time Complexity: O(2^n) - Exponential complexity due to repeated calls.
     */

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Computes power (a^n) using recursion.
     * Time Complexity: O(n) - n recursive calls.
     */

    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    /**
     * Prints an array in reverse order using recursion.
     * Time Complexity: O(n) - One pass through the array.
     */

    public static void printReverse(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        printReverse(arr, index - 1);
    }

    /**
     * Checks if a string consists of only digits using recursion.
     * Time Complexity: O(n) - We check each character.
     */

    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }

    /**
     * Computes the binomial coefficient C(n, k) using recursion.
     * Time Complexity: O(2^n) - Exponential complexity.
     */

    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }

    /**
     * Finds the greatest common divisor (GCD) using recursion.
     * Time Complexity: O(log(min(a, b))) - Efficient Euclidean Algorithm.
     */

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 1, 32, 3, 45};
        System.out.println("Min: " + findMin(arr, 1, arr[0]));
        System.out.println("Average: " + findAverage(arr, 0, 0));
        System.out.println("Prime check (7): " + isPrime(7, 2));
        System.out.println("Factorial (5): " + factorial(5));
        System.out.println("Fibonacci (5): " + fibonacci(5));
        System.out.println("Power (2^10): " + power(2, 10));

        System.out.print("Reversed array: ");
        printReverse(arr, arr.length - 1);
        System.out.println();

        System.out.println("All digits check (\"123456\"): " + isAllDigits("123456", 0));
        System.out.println("Binomial Coefficient (7,3): " + binomialCoeff(7, 3));
        System.out.println("GCD (32, 48): " + gcd(32, 48));
    }
}
