package com.accenture;

public class UserDefinedException extends Exception
{
String message1;
String message2;
UserDefinedException(String message1, String message2)
{
	super(message2);
	this.message1=message1;
}
public void showrrorMessage()
{
System.out.println("Exception handled by user");	
}
@Override
public String toString() 
{
	return "UserDefinedException "+message1;
}

}
