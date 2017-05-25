package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class logicaloptr {public static void main(String args[])
{

	boolean a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number");
	a=sc.nextBoolean();
	System.out.println("enter second number");
	b=sc.nextBoolean();
	
	System.out.println(" logical AND is"+(a&b));
	System.out.println("logical OR is "+(a|b));
			
	System.out.println(" NOT is"+(!(a&b)));
			
	
}
}


