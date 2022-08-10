package com.brz.logical;

import java.util.Scanner;

import static com.brz.logical.Logical.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("logical and functional");
        System.out.println("enter the choice");
        System.out.println("1.fibonacci series \n 2.perfect number \n 3.prime number \n 4.reverse number ");

        Scanner choice = new Scanner(System.in);
        int option = choice.nextInt();
        switch (option){
           case 1:
               fibonacciNumber();
               break;
           case 2:
               perfectNumber();
               break;
            case 3:
                primeNumber();
                break;
            case 4:
                reverseNumber();
       }
    }
}



