package com.arrays;

public class Arrays_29 
{
	public static void main(String[] args) 
	{
		int[] a1= {1,2,3,2,1};
		int[] a2= {1,2,3};
		int[] a3= {1,2,3,4};
		int[] a4= {1,2,3};
		int[] a5= {1,3,2};
		
		int l1=a1.length;
		int l2=a2.length;
		int l3=a3.length;
		int l4=a4.length;
		int l5=a5.length;
		int[] b1=new int[l2];
		if(l1==l2)
		{
			int count=0;
			for(int i=0;i<l1;i++)
			{
				if(a1[i]==a2[i])
				{
					b1[i]=a1[i];
				}
			}
			System.out.println("Arrays having same elements at each position : "+"a1"+" "+"a2");
		}
		if(l1==l3)
		{
			for(int i=0;i<l1;i++)
			{
				if(a1[i]==a3[i])
				{
					b1[i]=a1[i];
				}
			}
			System.out.println("Arrays having same elements at each position : "+"a1"+" "+"a3");
		}
		if(l1==l4)
		{
			for(int i=0;i<l1;i++)
			{
				if(a1[i]==a4[i])
				{
					b1[i]=a1[i];
				}
			}
			System.out.println("Arrays having same elements at each position : "+"a1"+" "+"a4");
		}
		if(l1==l5)
		{
			for(int i=0;i<l1;i++)
			{
				if(a1[i]==a5[i])
				{
					b1[i]=a1[i];
				}
			}
			System.out.println("Arrays having same elements at each position : "+"a1"+" "+"a5");
		}
		if(l2==l3)
		{
			for(int i=0;i<l2;i++)
			{
				if(a2[i]==a3[i])
				{
					b1[i]=a2[i];
				}
			}
			System.out.println("Arrays having same elements at each position : "+"a2"+" "+"a4");
		}
		if(l2==l4)
		{
			for(int i=0;i<l2;i++)
			{
				if(a2[i]==a4[i])
				{
					b1[i]=a2[i];
				}
			}
			System.out.println("Arrays having same elements at each position : "+"a2"+" "+"a4");
		}
		if(l2==l5)
		{
			for(int i=0;i<l2;i++)
			{
				if(a2[i]==a5[i])
				{
					b1[i]=a2[i];
				}
			}
			System.out.println("Arrays having same elements at each position : "+"a2"+" "+"a5");
		}
		if(l3==l4)
		{
			for(int i=0;i<l3;i++)
			{
				if(a3[i]==a4[i])
				{
					b1[i]=a3[i];
				}
			}
			System.out.println("Arrays having same elements at each position : "+"a3"+" "+"a4");
		}
		if(l3==l5)
		{
			for(int i=0;i<l3;i++)
			{
				if(a3[i]==a5[i])
				{
					b1[i]=a3[i];
				}
			}
			System.out.println("Arrays having same elements at each position : "+"a3"+" "+"a5");
		}
		if(l4==l5)
		{
			for(int i=0;i<l4;i++)
			{
				if(a4[i]==a5[i])
				{
					b1[i]=a4[i];
				}
			}
			System.out.println("Arrays having same elements at each position : "+"a4"+" "+"a5");
		}
	}
}

