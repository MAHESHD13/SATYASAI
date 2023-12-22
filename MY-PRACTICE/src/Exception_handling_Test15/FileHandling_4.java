package Exception_handling_Test15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling_4 
{
	public static void main(String[] args) 
	{
		FileReader  reader=null;
		try 
		{
		    reader=new FileReader("data.txt");
			int c;
			while((c=reader.read()) != -1)
			{
				System.out.println((char)(c));
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{	
			e.printStackTrace();
		} 
		finally
		{
			try
			{
				if(reader != null)
					reader.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("APPLICATION IS COMPLETED SUCCESSFULLY......");
	}

}
