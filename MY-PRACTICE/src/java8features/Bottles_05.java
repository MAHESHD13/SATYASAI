package java8features;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Bottles_05 {

	public static void main(String[] args) 
	{
		List<Bottle_05> bottles=List.of(new Bottle_05("OrangeJuice", "Orange", "Plastic", 125.45),
										new Bottle_05("RedWine", "Red", "Glass",1467.23),
										new Bottle_05("TeaFlask", "Silver", "Stainless Steel",1230.45),
										new Bottle_05("Spring Water", "Red", "Plastic",200.45 ),
										new Bottle_05("Lemon Soda", "Orange", "Plastic",239.34),
										new Bottle_05("Green Tea", "Silver", "Glass",678.34),
										new Bottle_05("Apple Cider", "Red", "Glass",899.23));
		
		//2.filter the bottles where color="red" store into list format
		List<Bottle_05> redColorB = bottles.stream().filter(b->b.getBottleColor().equalsIgnoreCase("red")).collect(Collectors.toList());
		redColorB.forEach(p->System.out.println(p));
		System.out.println("------------------------------------------------------");
		//3.collect the bottle price >500 store into set format
		Set<Bottle_05> bottlePrice =bottles.stream().filter(b->b.getBottlePrice()>500).collect(Collectors.toSet());
		bottlePrice.forEach(bottle->System.out.println(bottle));
		System.out.println("------------------------------------------------------");
		
		//4.count the number of glass bottle
		long bCount = bottles.stream().filter(b->b.getBottleType().equalsIgnoreCase("glass")).count();
		System.out.println("Glass Type Bottles Count....."+bCount);
		System.out.println("------------------------------------------------------");
		
		//5.print the sum of prices of all glass botttles
		 Double bSum = bottles.stream().filter(b->b.getBottleType().equalsIgnoreCase("glass")).map(b->b.getBottlePrice()).reduce((b1,b2)->b1+b2).get();
		 System.out.println("Sum of Price of All Glass Bottles..."+bSum);
		 System.out.println("------------------------------------------------------");
			
		 //6. check the bottle color = pink if present print the data other wise give the message
		 String pinkBotttle = bottles.stream().filter(b->b.getBottleColor().equalsIgnoreCase("Pink")).findFirst().of("Pink Color Bottle Data is not Available").get();
		 System.out.println(pinkBotttle);
		 System.out.println("------------------------------------------------------");
			
		 //7.filter the bottle price >1000 get the first bottle
		 Bottle_05 bottleF = bottles.stream().filter(b->b.getBottlePrice()>1000).findFirst().get();
		 System.out.println(bottleF);
	}

}
