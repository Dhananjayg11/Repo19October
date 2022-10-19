package com.accenture;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrows {
	public static void m1() throws FileNotFoundException
	{
		FileReader r=new FileReader("data.txt");//sensitive code
		System.out.println("inside m1 method");
	}
	public static void m2() throws FileNotFoundException
	{
		m1();
		System.out.println("Inside m2 method");
	}
	public static void main(String[] args)
	{
		try
		{
		m2();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Exception handled in main: "+e);
		}
		System.out.println("Inside main");
	}

}
