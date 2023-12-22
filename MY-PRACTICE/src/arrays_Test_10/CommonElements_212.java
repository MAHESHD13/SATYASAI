package arrays_Test_10;
public class CommonElements_212 
{
    public static void main(String[] args) 
    {
        int[] a = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
        int[] b = {11,23,45,121,143,6,7};
        int maxLength = a.length;
        int[] c = new int[maxLength];
        int index = 0;
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < b.length; j++)
            {
                if (a[i] == b[j])
                {
                    c[index] = a[i];
                    index++;    
                }
            }
        } 
        System.out.print("Common elements  ");
        for (int i = 0; i < index; i++)
        {
            System.out.print(c[i] + " ");
        }
    }
}
