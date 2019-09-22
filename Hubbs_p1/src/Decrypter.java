// Assignment 2 OOP, Matthew Hubbs ma024264
import java.util.Scanner;

public class Decrypter
{

	public static void main(String[] args)
	{
		// so, in order to decrypt something we would normally just encrypt it but backwards there
		// is no inverse function for modulo, but since we know each digit is an integer from zero
		// to nine, we know only to add ten if not adding ten would make the result less than 7.
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter the encrypted number");
		int cypher = scnr.nextInt();

		int ones = (cypher % 10);
		int tens = (cypher / 10 % 10);
		int hundreds = (cypher / 100 % 10);
		int thousands = (cypher / 1000 % 10);

		if(ones - 7 < 0)
		{
			ones += 10;
		}
		if(tens - 7 < 0)
		{
			tens += 10;
		}
		if(hundreds - 7 < 0)
		{
			hundreds += 10;
		}
		if(thousands - 7 < 0)
		{
			thousands += 10;
		}

		ones -= 7;
		tens -= 7;
		hundreds -=7;
		thousands -= 7;

		// now, print the result, 1234 --> 3412
		System.out.printf("The decrypted number is %d%d%d%d", tens, ones, thousands, hundreds);
		
		scnr.close();
	}

}
