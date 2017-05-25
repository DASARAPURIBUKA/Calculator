package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

public class assignoptr {
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		
		System.out.println(" a+=b"+(a+=b));
		System.out.println(" a-=b"+(a-=b));
				
		System.out.println(" a*=b="+(a*=b));
		System.out.println(" a/=b="+(a/=b));		
	
		
	}

}
