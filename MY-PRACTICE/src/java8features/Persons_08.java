package java8features;

import java.util.Comparator;
import java.util.List;

public class Persons_08 
{
	public static void main(String[] args) 
	{
		List<Person_08> persons = List.of(new Person_08("Ratan", 25),
										  new Person_08("Kb", 27),
										  new Person_08("Sathya", 29),
										  new Person_08("Rahul", 30));
		
		//print the min name in User
		Person_08 person=persons.stream().min(Comparator.comparing(String ::valueOf)).get();
		System.out.println(person.getPersonName());
		System.out.println("------------------------------------------");
		
		//print the max name in User
		Person_08 person1=persons.stream().max(Comparator.comparing(String ::valueOf)).get();
		System.out.println(person1.getPersonName());
		System.out.println("------------------------------------------");
		
		//print the max age in User
		Person_08 person2=persons.stream().max(Comparator.comparing(Person_08::getPersonAge)).get();
		System.out.println(person2.getPersonAge());
		System.out.println("------------------------------------------");
		
		//print the min age in User
		Person_08 person3=persons.stream().min(Comparator.comparing(Person_08::getPersonAge)).get();
		System.out.println(person3.getPersonAge());
		System.out.println("------------------------------------------");
				
	}

}
