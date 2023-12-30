package com.mahesh.Array;
import java.util.Scanner;
public class BubbleSort
{

	public static void main(String[] args)
	{
		int num,swap;
		Scanner sc=new Scanner(System.in);
		System.out.println("HOW MANY NUMBERS ARE TO BE SORTED : ");
		num=sc.nextInt();
		int array[]=new int[num];
		System.out.println("ENTER "+num+" INTEGERS : ");
		for(int i=0;i<num;i++)
		{
			array[i]=sc.nextInt();
			for(int i1=0;i1<num-1;i1++)
			{
				for(int j=0;j<num-i1-1;j++)
				{
					if(array[j]>array[j+1])
					{
						swap=array[j];
						array[j]=array[j+1];
						array[j+1]=swap;
					}
				}
			}
		}
			System.out.println("AFTER SORTING : ");
			for(int i=0;i<num;i++)
				System.out.println(array[i]);
		

	}

}

