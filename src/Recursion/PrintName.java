package Recursion;

import java.util.Scanner;



public class PrintName {

    public static void printName(String name,int n){
        if(n==0){
            return;
        }
        System.out.println(name);
        printName(name,n-1);

    }
    public static void printNum(int n,int i){
        if(i>n){
            return;
        }
        System.out.println(i);
        printNum(n,i+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter name: ");
//        String name = sc.nextLine();

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int i=1;

        //printName(name, n);
        printNum(n,i);

        sc.close();


    }
}
