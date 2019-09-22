// Assignment 2 OOP, Matthew Hubbs ma024264
import java.util.Scanner;
import java.lang.Math;

public class BMICalculator
{

	public static void main(String[] args)
	{
		int choice;
		double weight, height, bmi;
		Scanner scnr = new Scanner(System.in);
		System.out.printf("Welcome to BMI Caclulator! Enter 1 for metric or 2 for imperial units");
		
		choice = scnr.nextInt();
		
		// let's assume something besides 1 or 2 wants imperial, cause stupid people use
		// imperial... unless its the slug and youre and engineer
		if(choice == 1)
		{
			// USING METRIC
			System.out.println("Please enter your weight in kilograms");
			weight = scnr.nextDouble();
			System.out.println("Please enter your height in meters");
			height = scnr.nextDouble();
			bmi = weight / Math.pow(height, 2);
			System.out.println("Your BMI is " + bmi);
			
		}
		else
		{
			// USING IMPERIAL
			System.out.println("Please enter your weight in pounds");
			weight = scnr.nextDouble();
			System.out.println("Please enter your height in inches");
			height = scnr.nextDouble();
			bmi = 703 * weight / Math.pow(height, 2);
			System.out.println("Your BMI is " + bmi);
		}
		System.out.println("Here are the categories of BMI from the National Heart Lung and Blood Institute\n");
		System.out.println( "Underweight = <18.5\r\n" + 
							"Normal weight = 18.5–24.9\r\n" + 
							"Overweight = 25–29.9\r\n" + 
							"Obesity = BMI of 30 or greater");
		
		
		scnr.close();
	}

}
