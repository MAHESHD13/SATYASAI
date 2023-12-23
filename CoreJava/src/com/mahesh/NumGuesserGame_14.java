package com.mahesh;
import java.util.Random;
import java.util.Scanner;
public class NumGuesserGame_14
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		int from=1;
		int to=10;
		int randomnumber=ran.nextInt(to-from+1)+from;
		int guessednumber=0;
		System.out.println("THE NUMBER IS BETWEEN "+from+" AND "+to);
		do
		{
			System.out.print("GUESS WHAT THE NUMBER IS : ");
			guessednumber=sc.nextInt();
			if(guessednumber>randomnumber)
			{
				System.out.println("INCORRECT GUESS ");
			}
			else if(guessednumber<randomnumber)
			{
				System.out.println("INCORRECT GUESS ");
			}
			else
			{
				System.out.println("CORRECT GUESS \n");
			}
		}
		while(guessednumber!=randomnumber);
	}

}
