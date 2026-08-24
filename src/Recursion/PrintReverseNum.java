package Recursion;

import java.util.Scanner;

public class PrintReverseNum {
//    public static void printReverse(int n,int i){
//        if(i<1){
//            return;
//        }
//        System.out.println(i);
//        printReverse(n,i-1);
//
//
//    }
    public static void printNumBacktracking(int i,int n){
        if(i<1){
            return;
        }
        printNumBacktracking(i-1,n);
        System.out.println(i);
    }
    public static void printReverseBacktracking(int i,int n){
       if(i>n){
           return;
       }
       printReverseBacktracking(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        printReverseBacktracking(1,n);

    }
}
