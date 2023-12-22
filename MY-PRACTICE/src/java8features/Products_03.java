package java8features;

import java.util.List;
import java.util.Set;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;

public class Products_03 
{
	public static void main(String[] args) 
	{
		List<Product_03> 
		
			products =	List.of(new Product_03("Apple13","Pink",78000),
						new Product_03("OnePlus","Aurora Green",75000),
						new Product_03("Apple10", "Silver", 90000),
						new Product_03("OppoF19", "Cosmic Black", 8500),
						new Product_03("OppoF17", "Gold", 9000),
						new Product_03("Redmi", "Red", 15000),
						new Product_03("Realme", "Blue", 12000),
						new Product_03("Vivo", "Blue", 22000));
		//printing all the data
		products.stream().forEach(product->System.out.println(product));
		System.out.println("---------------------------------------------------");
		//filter the Apple mobiles print the data
		products.stream().filter(product1->product1.getMobileName().startsWith("Apple")).forEach(product->System.out.println(product));
		System.out.println("---------------------------------------------------");
		products.stream().filter(product->product.getMobilePrice()>10000).forEach(product->System.out.println(product));
		System.out.println("---------------------------------------------------");
		products.stream().filter(product->product.getMobileName().equals("Apple")&&product.getMobileColor().equals("red") && product.getMobilePrice()>50000).forEach(product->System.out.println(product));
		System.out.println("---------------------------------------------------");
		Set<Product_03> prod = products.stream().filter(product->product.getMobileColor().equalsIgnoreCase("blue") && product.getMobilePrice()<10000).collect(Collectors.toSet());
		System.out.println(prod);
		System.out.println("---------------------------------------------------");
		List<Product_03> prod1 = products.stream().filter(product->product.getMobileColor().equalsIgnoreCase("red")).collect(Collectors.toList());
		System.out.println(prod1);
		System.out.println("---------------------------------------------------");
		
//		Product_03 p1 = products.stream().filter(product->product.getMobileName().equalsIgnoreCase("Samsung")).findFirst().get();
//		System.out.println(p1);
//		System.out.println("---------------------------------------------------");
		
		Product_03 p1 = products.stream().filter(product->product.getMobileName().startsWith("Oppo")).skip(1).findFirst().get();
		System.out.println(p1);
		System.out.println("---------------------------------------------------");
		
		Product_03 p2=products.stream().filter(product->product.getMobileName().equalsIgnoreCase("realme")).findFirst().orElse(null);
		System.out.println("element is...."+p2);
		System.out.println("---------------------------------------------------");
		
		long count1 = products.stream().filter(product->product.getMobileName().startsWith("Apple")).count();
		System.out.println("Apple mobiles count are...."+count1);
		
		
	}
}
