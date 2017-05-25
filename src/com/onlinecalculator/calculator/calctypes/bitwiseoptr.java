package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class bitwiseoptr {
	
	public static void main(String args[])
	
	{

		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		
		System.out.println(" Bit wise AND is "+(a&b));
		System.out.println("Bit wise OR is "+(a|b));
				
		System.out.println(" Bit wise exclusiv OR is "+(a^b));
				
		
	}
}
