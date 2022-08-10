package com.brz.logical;

import java.util.Scanner;

import static com.brz.logical.Logical.fibonacciNumber;
import static com.brz.logical.Logical.perfectNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println("logical and functional");
        System.out.println("enter the choice");
        System.out.println("1.fibonacci series ");
        Scanner choice = new Scanner(System.in);
       int option =choice.nextInt();
       switch (option){
           case 1:
               fibonacciNumber();
               break;

       }
    }
}



