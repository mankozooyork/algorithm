package ScalaPractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt(), 1));
        sc.close();
    }
    public static int factorial(int n, int res) {
        if(n == 0) return res;
        return factorial(n-1, n*res);
    }
}