package com.practice;

import java.util.Scanner;

public class FahrenheitToCelsius_05 {

	public static void main(String[] args) {
		float temperature;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit : ");
		temperature = sc.nextFloat();
		float cTemperature;
		cTemperature = (((temperature - 32) * 5 ) / 9) ;
		System.out.println("TEMPERATURE IN FAHRENHEIT SCALE : "+temperature);
		System.out.println("TEMPERATURE IN CELSIUS SCALE : "+cTemperature);
		
	}

}
