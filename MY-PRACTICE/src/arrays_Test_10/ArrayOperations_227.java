package arrays_Test_10;

public class ArrayOperations_227 
{
	public static void main(String[] args) 
	{
		char a[] = {'s','@','t','h','y','a','t','e','c','h','2','5','Y','E','A','R','$'};
		/*
		 * 
		 * 
		 * for(int i=0;i<a.length;i++)
		   {
			for(int j=0;j<a.length;j++)
			{
				if((a[j] >= 65 && a[j] <=90 )|| (a[j] >=97 && a[j]<=122))
				{
					if(a[j] != 'a' && a[j] != 'e' && a[j] != 'i' && a[j] != 'o' && a[j] != 'u' &&a[j] != 'A' && a[j] != 'E' && a[j] != 'I' && a[j] != 'O' && a[j] != 'U')
					{
						a[j]=(char)(a[j]+1);
					}
				}
				
			}
		}
		for(char a1 : a)
		{
			System.out.print(a1+" ");
		}
		 */
		
		/*
		for(int i=0;i<a.length;i++)
		{
			System.out.println((int)a[i]);
		}
		*/
		
		/*
		for(int i=0;i<a.length;i++)
		   {
			for(int j=0;j<a.length;j++)
			{
				if (a[j] >=97 && a[j]<=122)
				{
					a[j]=(char)(a[j]-32);
				}
			}
		   }
		for(char c1 : a)
		{
			System.out.print(c1+" ");
		}
		*/
		/*
		char m[] =new char[a.length];
		for(int i=0;i<a.length;i++)
		   {
			for(int j=0;j<a.length;j++)
			{
				int k=0;
				if((a[j] >= 32 && a[j] <=47 )|| (a[j] >=58 && a[j]<=64) || (a[j] >= 91 && a[j] <=96 )|| (a[j] >=123 && a[j]<=126) )
				{	
					m[j] = a[j];
				
				}
			}
		   }
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]+" ");
		}
		
		*/
		/*
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if((a[i] >=65 && a[i] <=90)||(a[i] >=97&&a[i]<=122))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("ALPHABETS ARE PRESENT....");
		}
		else
		{
			System.out.println("ALPHABETS ARE NOT PRESENT....");
		}
		*/
		int sum =0;
		for(char c:a)
		{
			if(c>='0'&& c<='9')
			{
				int digit=c-'0';
				sum=sum+digit;
			}
		}
		System.out.print("SUM OF INTEGERS IN AN ARRAY ="+sum);
	}

}
