package Exception_handling_Test15;

import java.io.*;

public class FileAppend_10 
{
    public static void main(String[] args) 
    {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try 
        {
            inputStream = new FileInputStream("ratan.txt");
            
            outputStream = new FileOutputStream("ram.txt");

            int data;
            while ((data = inputStream.read()) != -1) 
            {
                outputStream.write(data);
                System.out.print((char)data);
            }
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: ");
        } 
        catch (IOException e)
        {
            System.out.println("Error reading/writing the file: ");
        } 
        finally 
        {
            try 
            {
                if (inputStream != null)
                {
                    inputStream.close();
                }
                if (outputStream != null) 
                {
                    outputStream.close();
                }
            }
            catch (IOException e) 
            {
                System.out.println("Error closing the streams ");
            }
        }
    }
}

