package arrays_Test_10;

public class ArraysComparison_229 
{
	public static void main(String[] args) 
	{
		Integer[] a1= {1,2,3,2,1};
		Integer[] a2= {1,2,3};
		Integer[] a3= {1,2,3,4};
		Integer[] a4= {1,2,3};
		Integer[] a5= {1,3,2};
		int l1=a1.length;
		int l2=a2.length;
		int l3=a3.length;
		int l4=a4.length;
		int l5=a5.length;
		for(int i=0;i<=a1.length;i++)
		{
		if(l1==l2)
		{
			System.out.print(a1[i]+"  "+a2[i]+" ");
		}
		if(l1==l3)
		{
			System.out.print(a1[i]+" "+a2[i]+" ");
		}
		if(l1==l4)
		{
			System.out.print(a1[i]+" "+a2[i]+" ");
		}
		if(l1==l5)
		{
			System.out.print(a1[i]+" "+a2[i]+" ");
		}
		if(l2==l3)
		{
			System.out.print(a2[i]+" "+a3[i]+" ");
		}
		if(l2==l4)
		{
			System.out.print(a2[i]+" "+a4[i]+" ");
		}
		if(l2==l5)
		{
			System.out.print(a2[i]+" "+a5[i]+" ");
		}
	}
	}
}
