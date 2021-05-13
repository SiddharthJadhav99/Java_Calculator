package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double p,n,r,si;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the Principal Amount ");
	p=sc.nextFloat();

	System.out.println("Enter the time period ");
	n=sc.nextFloat();

	System.out.println("Enter the Rate of Interest ");
	r=sc.nextFloat();

	si=(p*n*r)/100;

	System.out.println("The Simple Interest will be " + si);
    }
}

