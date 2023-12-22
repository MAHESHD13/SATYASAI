package java8features;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge_06
{
	public static void main(String[] args) 
	{
		List<Challenge_06A> products=List.of(
											new Challenge_06A(1001, "Sugar", 120),
											new Challenge_06A(8974, "Salt", 87),
											new Challenge_06A(3546, "Pepper", 789),
											new Challenge_06A(4566, "Rice", 1800),
											new Challenge_06A(1003, "Coffee", 567),
											new Challenge_06A(1878, "Cooking Oil", 1768),
											new Challenge_06A(1008, "Chocolate", 90));
		//2.print the Ascending order of ProductId
		products.stream().sorted((p1,p2)->p1.getProId().compareTo(p2.getProId())).forEach(prod->System.out.println(prod));				
		
		System.out.println("--------------------------------------------------------");
		
		//3.print the descending order of Product Name
		products.stream().sorted((p1,p2)->-p1.getProName().compareTo(p2.getProName())).forEach(prod->System.out.println(prod));				
		System.out.println("--------------------------------------------------------");
		
		//4.filter the product price>100 print the data in descending order
		products.stream().filter(p->p.getProPrice()>100).sorted((p1,p2)->-p1.getProPrice().compareTo(p2.getProPrice())).forEach(prod->System.out.println(prod));
	
		System.out.println("--------------------------------------------------------");
		
		//5.filter the prducts start with s and print the data in ascending order
		products.stream().filter(p->p.getProName().startsWith("S")).sorted((p1,p2)->p1.getProName().compareTo(p2.getProName())).forEach(prod->System.out.println(prod));
		
		System.out.println("--------------------------------------------------------");
		
		//6.filter the prducts price range 100-200 print the data in descending order
		products.stream().filter(p->p.getProPrice()>=100 && p.getProPrice()<200).sorted((p1,p2)->-p1.getProPrice().compareTo(p2.getProPrice())).forEach(prod->System.out.println(prod));
	
		System.out.println("--------------------------------------------------------");
		
		//7.filter the product price > 1000 reduce the amount %20 print the data in ascending order
		
//		List<Challenge_06A> updatedProducts = products.stream().filter(p->p.getProPrice()>1000).peek(product -> product.setProPrice(product.getProPrice() * 0.8)).sorted((p1, p2) -> Double.compare(p1.getProPrice(), p2.getProPrice())).collect(Collectors.toList());
//	
		//8.filter the products names starts with 'c' increase the amount 5% print the data in descending order
		
		
		
		System.out.println("--------------------------------------------------------");
		
		//9.print the maximum price product
		Challenge_06A prod = products.stream().max(Comparator.comparing(Challenge_06A::getProPrice)).get();
		System.out.println(prod);
		
		System.out.println("--------------------------------------------------------");
		
		//10.print the minimu price product
		Challenge_06A prod1 = products.stream().min(Comparator.comparing(Challenge_06A::getProPrice)).get();
		System.out.println(prod1);
	}

}
