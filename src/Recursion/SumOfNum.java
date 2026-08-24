package Recursion;

import java.util.Scanner;

public class SumOfNum {
    private static void sumNum(int i, int sum) {
        if(i==0){
            System.out.println(sum);
            return ;
        }
        sumNum(i-1,sum+i);


    }
//    public static int sumOfNum(int n){
//        if (n == 0) {
//
//            return 0;
//        }
//        return n+sumOfNum(n-1);
//
//
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
//        int i = sumOfNum(n);
//        System.out.println(i);
        int sum=0;
     sumNum(n, sum);
       // System.out.println(i);
    }


}
