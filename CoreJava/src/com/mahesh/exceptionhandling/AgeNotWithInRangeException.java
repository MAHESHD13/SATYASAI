package com.mahesh.exceptionhandling;

public class AgeNotWithInRangeException extends Exception
{
	public String tostring()
	{
		return("Age is not between 15 and 21 .Please Renter Age : ");
	}

}
