package Recursion;

import java.util.Scanner;

public class fibonacchiNum {
    public static int printNthFibonacci(int n){
        if(n<=1){
            return n;
        }
        int last=printNthFibonacci(n-1);
        int slast=printNthFibonacci(n-2);
        return last+slast;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");

    }
}
