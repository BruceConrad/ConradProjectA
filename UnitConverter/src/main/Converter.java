package main;

import java.util.Scanner;

public class Converter
{
	static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		boolean running = true;
		int input = 0;
		Converter functionCaller = new Converter();
		
		input = Converter.menuOptions();
		
		while(running)
		{
				switch(input)
				{
					case 1:
						{
							functionCaller.milesToKilometers();
							running = true;
							break;
						}
					case 2:
						{
							functionCaller.yardsToFeet();
							running = true;
							break;
						}
					case 3:
						{
							functionCaller.gallonsToLitres();
							running = true;
							break;
						}
					case 4:
						{
							running = false;
							break;
						}
					default:
						{
							System.out.println("Invalid menu choice- enter in a valid menu option");
							running = true;
							break;
						}
			}
			if(input != 4)
			{
				input = Converter.menuOptions();
			}
		}
		
		myScanner.close();
	}
	
	public void milesToKilometers()
	{
		double miles = 0.0;
		double kilometers = 0.0;
		System.out.println("Enter the miles (double):");
		miles = myScanner.nextDouble();
		kilometers = miles * 1.609;
		
		System.out.println(miles + " miles to " + kilometers + " kilometers");
	}
	
	public void yardsToFeet()
	{
		int yards = 0;
		int feet = 0;
		System.out.println("Enter the yards (integer):");
		yards = myScanner.nextInt();
		feet = yards * 3;
		
		System.out.println(yards + " yards to " + feet + " feet");
	}
	
	public void gallonsToLitres()
	{
		double gallons = 0.0;
		double litres = 0.0;
		System.out.println("Enter the gallons (double):");
		gallons = myScanner.nextDouble();
		litres = gallons * 3.785;
		
		System.out.println(gallons + " gallons to " + litres + " litres");
	}
	
	public static int menuOptions()
	{
		int input = 0;
		
		System.out.println("Please enter the number of the conversion you wish to perform:");
		System.out.println("1. Miles to Kilometers");
		System.out.println("2. Yards to Feet");
		System.out.println("3. Gallons to Litres");
		System.out.println("4. Quit");
		input = myScanner.nextInt();
		return(input);
	}
}
