package arrays_Test_10;

public class SortingArray_214 
{
	public static void main(String[] args) 
	{
		 int[] a = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		 int length=a.length;
		 for(int i=0;i<length-1;i++)
		 {
			 for(int j=0;j<length-i-1;j++)
			 {
				 if(a[j]>a[j+1])
				 {
					 int temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 } 
			 }
		 }
		 for(int a1:a)
		 {
			 System.out.print(a1+" ");
		 }

	}

}
