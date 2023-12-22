package java8features;
interface Greeting
{
	void greet(String name);
}
public class Greeting_01 
{
	public static void main(String[] args) 
	{
		Greeting  g=(String name)->System.out.println("Good Morning..."+name);
		g.greet("Mahesh");		
	}
}
