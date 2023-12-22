package Exception_handling_Test15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources_6 
{
	public static void main(String[] args) throws  IOException 
	{
		try(FileInputStream inputStream = new FileInputStream("RRR in 4 days-Ramaraju copy.jpg");
			FileOutputStream outputStream = new FileOutputStream("ratan.jpg"))
		{
			int b;
			while((b = inputStream.read()) != -1)
			{
				outputStream.write(b);
			}
		}
		finally
		{
			System.out.println("Application is completed Successfully.....");
		}
		

	}

}
