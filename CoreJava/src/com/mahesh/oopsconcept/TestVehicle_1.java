package com.mahesh.oopsconcept;

public class TestVehicle_1 
{

	public static void main(String[] args) 
	{
		Bike_1b bike=new Bike_1b();
		Vehicle_1a car=new Car_1c();
		int bikespeed =bike.getSpeed();
		int carspeed =car.getSpeed();
		System.out.println("SPEED OF BIKE IS : "+bikespeed+"KM/HR");
		System.out.println("SPEED OF CAR IS : "+carspeed+"KM/HR");


	}

}
