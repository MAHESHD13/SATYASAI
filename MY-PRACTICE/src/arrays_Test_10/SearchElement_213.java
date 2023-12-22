package arrays_Test_10;

import java.util.Scanner;

public class SearchElement_213 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		 int[] a = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		 for(int a1:a)
		 {
			 System.out.print(a1+" ");
		 }
		 System.out.println();
		 System.out.println("Enter element to check whether the element is present or not.....");
		 int n=s.nextInt();
		 int flag=0;
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]==n)
			 {
				 flag++;
				 break;
			 }
		 }
		 if(flag==1)
		 {
			 System.out.println("ELEMENT IS PRESENT....."+n);
		 }
		 else
		 {
			 System.out.println("ELEMENT IS NOT PRESENT....."+n);
		 }

	}

}
