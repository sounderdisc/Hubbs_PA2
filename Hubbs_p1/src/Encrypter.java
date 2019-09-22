// Assignment 2 OOP, Matthew Hubbs ma024264
import java.util.Scanner;

public class Encrypter
{
	public static void main(String[] args)
	{
		// first, use the scanner class to get a number from the user
		Scanner scanlan = new Scanner(System.in);
		System.out.println("please enter the 4 digit integer you wish to encrypt, then press enter");
		int unencrypted = scanlan.nextInt();
		//System.out.println("Thank you, you entered " + unencrypted);

		/*
		System.out.printf("\tLet's try manipulating 1234\n");
		int testInt = 1234;
		System.out.println("\t1234 %% 10 is " + testInt % 10);
		System.out.println("\t1234 / 10 %% 10 is " + testInt / 10 % 10);
		System.out.println("\t1234 /100 %% 10 is " + testInt /100 % 10);
		System.out.println("\t1234 /1000 %% 10 is " + testInt /1000 % 10);
		*/

		// now, lets encrypt it
		int ones = (unencrypted % 10);
		int tens = (unencrypted / 10 % 10);
		int hundreds = (unencrypted / 100 % 10);
		int thousands = (unencrypted / 1000 % 10);

		ones = (ones + 7) % 10;
		tens = (tens + 7) % 10;
		hundreds = (hundreds + 7) % 10;
		thousands = (thousands + 7) %10;
		//System.out.printf("\t**CHECKUP:** \n\tthousands(1->8) %d\n\thundreds(2->9) %d\n\ttens(3->0) %d\n\tones(4->1) %d\n", thousands, hundreds, tens, ones);
		
		// right here, im about to use some cheeky string back to int conersions and
		// concatinations since java has good support for that
			//NEVERMIND, PRINTF() SAVES THE DAY
		//String fourthDigit = Integer.toString(ones);
		//String thirdDigit = Integer.toString(tens); //PROBLEM HERE: ZERO IS THE EMPTY STRING
		//String secondDigit = Integer.toString(hundreds);
		//String firstDigit = Integer.toString(thousands);
		//String almostDone = thirdDigit + fourthDigit + firstDigit + secondDigit;

		// now, print the result, 1234 --> 3412
		System.out.printf("The encrypted number is %d%d%d%d\n", tens, ones, thousands, hundreds);
		
		//close system.in
		scanlan.close();
		
	}
}