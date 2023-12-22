package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Person_09 
{
	public static void main(String[] args) 
	{
		List<Person_09A> persons = new ArrayList<>();
		persons.add(new Person_09A("Alice",List.of("Reading","Painting")));
		persons.add(new Person_09A("Bob",List.of("Hiking","Gardening")));
		persons.add(new Person_09A("Charlie",List.of("Cooking","Hiking")));
		persons.add(new Person_09A("David",List.of("Painting","Swimming")));
		
		//use stream API to collect uniques hobbies from all persons
		Set<String> uniqueHobbies = persons.stream()
                .flatMap(person -> person.getHobbies().stream())
                .collect(Collectors.toSet());
		System.out.println(uniqueHobbies);
	}

}
