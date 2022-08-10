package com.brz.logical;

import java.util.Scanner;

public class Logical {
public static void fibonacciNumber(){
    int n1=0,n2=1,n3,i,count=10;
    System.out.print(n1+" "+n2);    //printing 0 and 1

    for(i=2;i<count;i++){           //loop starts from 2 because 0 and 1 are already printed
        n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
    }
}
public static void perfectNumber(){
    int num, sum = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter any number:");
    num = scanner.nextInt();
    for(int i = 1; i < num; i++) {
        if(num % i == 0) {
            sum = sum + i;
        }
    }
    if(sum == num) {
        System.out.println("Given number is Perfect");
    }
    else {
        System.out.println("Given number is not Perfect");
    }
}
public static void primeNumber(){
    int num, i, count=0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    num = scanner.nextInt();

    for(i=2; i<num; i++)
    {
        if(num%i == 0)
        {
            count++;
            break;
        }
    }

    if(count==0)
        System.out.println("\nIt is a Prime Number.");
    else
        System.out.println("\nIt is not a Prime Number.");
    }
    public static void reverseNumber(){

        int num, rem, rev=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num = scanner.nextInt();

        while(num!=0) {
            rem = num%10;
            rev = (rev*10) + rem;
            num = num/10;
        }

        System.out.println("\nReverse = " +rev);
    }
}




