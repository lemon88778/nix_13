//package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter:");
        Scanner textString= new Scanner(System.in);
        int n= textString.nextInt();
        int k;
        k= n*45 + (n/2)*5 + ((n+1)/2-1)*15;
        System.out.print(k/60+9);
        System.out.print(":");
        System.out.print(k%60);

    }
}
