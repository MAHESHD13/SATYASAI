package collectionsframework;

import java.util.ArrayList;

public class ArrayList_04 {

	public static void main(String[] args) 
	{
		ArrayList<Products_02> products=new ArrayList<Products_02>();
	
		Products_02 product1=new Products_02();
		product1.setProductId(101);
		product1.setProductName("laptop");
		product1.setProductPrice(12000);
	
		Products_02 product2=new Products_02();
		product2.setProductId(102);
		product2.setProductName("mobile");
		product2.setProductPrice(7000);
		
		Products_02 product3=new Products_02();
		product3.setProductId(103);
		product3.setProductName("tab");
		product3.setProductPrice(22000);
	
		Products_02 product4=new Products_02();
		product4.setProductId(104);
		product4.setProductName("speakers");
		product4.setProductPrice(2500);
	
		Products_02 product5=new Products_02();
		product5.setProductId(105);
		product5.setProductName("tv");
		product5.setProductPrice(11000);
	
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		
		for(Products_02 product : products)
		{
			if(product.getProductName().contains("tv"))
			{
				product.setProductPrice(20000);
			}
		}
		System.out.println("*******************");
		for(Products_02 product : products)
		{
			if(product.getProductPrice()>10000)
			{
				System.out.println(product);
			}
		}
		System.out.println("***************************");
		
		Products_02 maxprice=products.get(0);
		for(Products_02 product :products) 
		{
			if(maxprice.getProductPrice() < product.getProductPrice())
			{
				maxprice=product;
			}
		}
		System.out.println(maxprice);
		System.out.println("****************");
		Products_02 minprice=products.get(0);
		for(Products_02 product:products) 
		{
			if(product.getProductPrice() < minprice.getProductPrice())
			{
				minprice=product;
			}
		}
		products.remove(minprice);
		System.out.println("****************");
		
		for(Products_02 product : products)
		{
			if(product.getProductName().startsWith("t"))
			{
				System.out.println(product);
			}
		}
		System.out.println("**********************");
		
		for(Products_02 product : products)
		{
			System.out.println(product);
		}
		System.out.println("**********************");
		
		System.out.println(products.get(products.size()-1));
	}
}
