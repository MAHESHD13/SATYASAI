package com.mahesh;

public class ProductBean 
{
	private int pId;
	private String pName;
	private double price;
	private int quantity;
	
	//PDC
	
	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	//PPC
	
	public ProductBean(int pId, String pName, double price, int quantity) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void printProducts()
	{
		System.out.println("PRODUCT ID : "+pId);
		System.out.println("PRODUCT NAME  : "+pName);
		System.out.println("PRODUCT PRICE : "+price);
		System.out.println("PRODUCT QUANTITY : "+quantity);
		double total=0.0,discount=0.0,gst=0.0,invoice=0.0;
		//calculating the total
		total=price * quantity;
		//Discount based on total price
		if(total<2500)
		{
			discount=(total *15)/100;
		}
		else if(total>=2500 && total <10000)
		{
			discount=(total * 25)/100;
		}
		else if(total>=10000)
		{
			discount=(total*31)/100;
		}
		gst=(total*18)/100;
		invoice=(total-discount)+gst;
		System.out.println("TOTAL PRODUCTS PRICE : "+total);
		System.out.println("DISCOUNT AMOUNT : "+discount);
		System.out.println("GST AMOUNT : "+gst);
		System.out.println("PRODUCT INVOICE BILL : "+invoice);
	}
	
	

}
