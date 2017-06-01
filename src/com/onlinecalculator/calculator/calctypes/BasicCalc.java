package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;



public class   BasicCalc
{
	public int a,b,c,result, ch;
	public   BasicCalc()
        {
		a=0;
		b=0;
		c=0;
		result=0;
		ch=0;
	}
	
	public int menu()
        {
		System.out.println("..select option..");
		System.out.println("1.addition..");
		System.out.println("2.subtraction..");
		System.out.println("3.multiplication..");
		System.out.println("4.division..");
		System.out.println("..enter your choice..");
		Scanner x=new Scanner(System.in);
		ch=x.nextInt();
		return 0;
		
			
	}

    public void userInputs()
    {
    	
    	Scanner x=new Scanner(System.in);
    	
    	System.out.println("enter first number");
    	a=x.nextInt();
    	System.out.println("enter second number");
    	b=x.nextInt();
    }

    public void performOperation()
{
		switch (ch)
		{
		case 1:
			System.out.println("..addition..");
			result=add();
			System.out.println("..result.."+result);
			break;
		case 2:
			System.out.println("..subtracion..");
			result=subtract();
			System.out.println("..result.."+result);
			break;
		case 3:
			System.out.println("..multiplication..");
			result=multiply();
			System.out.println("..result.."+result);
			break;
		case 4:
			System.out.println(".division..");
			result=divide();
			System.out.println("..result.."+result);
			break;
		
			
		}    	
        }
       
    
    
	int add()
	{	
		c=a+b;
		return c;
	
		
}
	
	int subtract()
	{
	c=a-b;
	return c;
	}
	
	int multiply()
	{
		c=a*b;
		return c;
	}
	
	int divide()
	{
		c=a/b;
		return c;
	}
	
}
