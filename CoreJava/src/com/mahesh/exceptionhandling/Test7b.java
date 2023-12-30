package com.mahesh.exceptionhandling;

public class Test7b
{
	static int cnt=0;
	Test7b() throws NotMoreException7a
	{
		if(cnt==0)
			cnt++;
		else
			throw new NotMoreException7a();
		
	}

}
