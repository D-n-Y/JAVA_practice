package com.sion.test;

import java.util.Scanner;

import com.sion.test2.Bicycle;

public class Main {
	public static void main(String args[]) {
		
		
		
		Grandeur myCar = new Grandeur();
		myCar.color = "red";
		myCar.gear = "auto";
		myCar.price = 3000000;
		
		myCar.info();
		
		
		Bicycle myBike = new Bicycle();
		myBike.color = "blue";
		myBike.price = 1000000;
		
		myBike.info();

		

	}
}
