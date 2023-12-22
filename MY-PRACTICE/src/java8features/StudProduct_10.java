package java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudProduct_10 
{
	public static void main(String[] args) 
	{
		List<Product_10> products = new ArrayList<>();
	
		products.add(new Product_10(1, "Pen", 100));
		products.add(new Product_10(2, "Car", 30000));
		products.add(new Product_10(4, "Fan", 900));
		products.add(new Product_10(3, "Chair", 400));
		products.add(new Product_10(3, "Laptop", 40000));
		products.add(new Product_10(3, "Laptop", 400));
		products.add(new Product_10(3, "Laptop", 30000));
		products.add(new Product_10(2, "Mobile", 10000));
		products.add(new Product_10(2, "Charger", 300));
		
		products.sort(Comparator.comparing(Product_10::getProId).thenComparing(Product_10::getProname).thenComparing(Product_10::getProPrice));
		products.forEach(System.out::println);

	}

}
