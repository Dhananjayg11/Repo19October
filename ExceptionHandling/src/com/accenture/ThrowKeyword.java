package com.accenture;

import java.util.Scanner;

public class ThrowKeyword {

	public static void main(String[] args)
	{
		int salary=0;
		int bonus=0;
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary and Bonus: ");
		salary=sc.nextInt();
		bonus=sc.nextInt();
		total=salary+bonus;
		try
		{
		if(total>100000)
		{
			//throw new ArithmeticException("Limit exceeds");
			throw new UserDefinedException("USER EXCEPTION","PARENT MESSAGE");
		}
		}
		catch(UserDefinedException e)
		{
			System.out.println(e);
			//e.showrrorMessage();
			//e.printStackTrace();
		}
		System.out.println("Total is: "+total);
		System.out.println("End of program");
		
	}

}
