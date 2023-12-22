package java8features;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Countries_04 
{

	public static void main(String[] args) 
	{
		List<Country_04> countries = List.of(new Country_04("India",1380004385,"INR","Delhi",28),
											new Country_04("United States", 331002651, "USD", "Washington", 50),
											new Country_04("China",1444216107,"CNY","Beijing",23),
											new Country_04("Brazil",212559417, "BRL", "Braslia", 26),
											new Country_04("Australia",25499884,"AUD","Canberra",8),
											new Country_04("SouthAfrica",59308690,"ZAR","Pretoria",9));
		
		countries.stream().forEach(country->System.out.println(country));
		System.out.println("--------------------------------------------------------------");
		
		//2.get all TheCountry names and print it
		
		countries.stream().map(Country_04::getName).forEach(System.out::println);
		System.out.println("--------------------------------------------------------------");
		
		//3.Get all the country name and population
		
		countries.stream().map(Country_04::getName).forEach(System.out::println);
		List<String> names=countries.stream().map(Country_04::getName).collect(Collectors.toList());
		List<Integer> numbers = countries.stream().map(Country_04::getPopulation).collect(Collectors.toList());
		Map<String,Integer> cities = countries.stream().collect(Collectors.toMap(Country_04::getName, Country_04::getPopulation));
		System.out.println(cities);
		System.out.println("--------------------------------------------------------------");
		
	
		//4.filter the data population >10000000 and increase by 6 % print the updated population objects
		
		countries.stream()
				 .filter(p->p.getPopulation()>10000000)
				 .map(p->{
							p.setPopulation(p.getPopulation()+p.getPopulation()*0.06);
							return p;
						 })
				 .forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------");
				
		//5.filter the countries where states <10 and increase the states +5
		
		countries.stream()
				 .filter(c->c.getStates()<10)
				 .map(c->{
				 c.setStates(c.getStates()+5);
					 return c;
				 }).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------");
		
		//6.print the highest and lowest population country names
		System.out.println("Lowest Population coountry names"); 
		Country_04 minPopulation = countries.stream().min(Comparator.comparing(Country_04::getPopulation)).get();
		System.out.println(minPopulation.getName());
		System.out.println("Highest Population country names");
		Country_04 maxPopulation = countries.stream().max(Comparator.comparing(Country_04::getPopulation)).get();
		System.out.println(maxPopulation.getName());
		System.out.println("--------------------------------------------------------------");
		
		//7.filter the US country increase the states by +3
		countries.stream()
				 .filter(c->c.getName().equalsIgnoreCase("United States"))
				 .map(c->{c.setStates(c.getStates()+3);return c;}).forEach(s->System.out.println(s));
		System.out.println("--------------------------------------------------------------");
		
		//8.update the indian currency with rupee
//		 List<Country_04> country1 = countries.stream().filter(c->c.getName().equalsIgnoreCase("India")).map(c->c.setCurrency("Rupee")).get;
//		
//		 Double double1 = countries.stream().map(p->p.getPopulation()).reduce((p1,p2)->p1+p2).get();
//		System.out.println(double1);
//		System.out.println("--------------------------------------------------------------");
//		
		//10.print the world states
		
		Integer statesCount = countries.stream().map(p->p.getStates()).reduce((p1,p2)->p1+p2).get();
		System.out.println(statesCount);
	}

}