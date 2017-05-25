package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class incrementdecrement {
	public static void main(String args[])
	
	{

		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		
		System.out.println(" a++ is  "+(a++));
		System.out.println("a-- is "+(a--));
				
		System.out.println(" ++b is "+(++b));
		System.out.println(" --b is "+(--b));
						
		
	}
	}





