package com.accenture;
#File has been changed sucessfully...
import java.util.Scanner;

public class ExceptionExample1 
{
	public static void main(String[] args)
	{
		int x[]=new int [4];
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for n");
		n=sc.nextInt();
		int y=10;
		try
		{
		for(int i=0;i<n;i++)
		{
			x[i]=i+1;
			System.out.print(x[i]);
		}
		y=y/0;//ArithmeticException
		
		System.out.println("Hello");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Exception handled: "+e);
			e.printStackTrace();
	
		}
		catch(Exception e)
		{
			System.out.println("Exception handled: "+e);
			e.printStackTrace();
		}
		System.out.println("End of program");
	}
}
