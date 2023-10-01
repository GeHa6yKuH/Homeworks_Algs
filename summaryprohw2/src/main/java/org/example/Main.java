package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().countFactorial(6));
    }

    public long countFactorial(int n) {
        long fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
            countFactorial(n);
        }
        return fact;
    }

    // Tasks Time Complexity:

    /*
    a) O(n^2)
    b) O(n^2)
    c) O(n*log(3-ей степени)n)
    d) O(n^2)
    e) O(n^2)
    */
}