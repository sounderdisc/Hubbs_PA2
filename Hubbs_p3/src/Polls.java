// Assignment 2 OOP, Matthew Hubbs ma024264
import java.util.Scanner;
//import java.util.String;

public class Polls
{

	public static void main(String[] args)
	{
		final int maxResponses = 10, numTopics = 5;
		int numResponses = 0, i = 0, j = 0;
		int sum = 0, greatestValue, greatestIndex, leastValue, leastIndex;
		int[][] responses = new int[numTopics][maxResponses];
		int[] totals = new int[numTopics];
		double[] averages = new double[numTopics];
		boolean done = false;
		// Alternative way to declare an array of strings: String[] arr = new String[5];
		String[] topics = {"Rocket League", "FTL", "XCOM", "RimWorld", "Battletech"};
		Scanner scnr = new Scanner(System.in);
		
		// use a while loop with counter to make sure we get as many responses as we want without going over
		while(!done && numResponses < maxResponses)
		{
			System.out.println("Hello responedent number " + (j + 1));
			
			for(i = 0; i < numTopics; i++)
			{
				System.out.println("On a scale of one to ten, how much do you like the game " + topics[i] + "?");
				responses[i][j] = scnr.nextInt();
			}
			
			System.out.println("Is there another person to be polled? ['Y'/'N']");
			if(!(scnr.next().compareToIgnoreCase("Y") == 0))
			{
				done = true;
			}
			numResponses++;
			j++;
			System.out.println(); // just to make it pretty
		}
		
		// get total for each topic and divide for the averages
		for(i = 0; i < numTopics; i++)
		{
			sum = 0;
			for(j = 0; j < numResponses; j++)
			{
				sum += responses[i][j];
			}
			totals[i] = sum;
			averages[i] = (double)sum / numResponses;
		}
		
		//now, print the table
		System.out.printf("\n\t\t"); // blank column for the topic names
		for(int counter = 0; counter < numResponses; counter++)
		{
			System.out.printf("\t%d", counter);
		}
		System.out.printf("\tAverages\n");
		System.out.println(); // gotta keep things in line
		for(i = 0; i < numTopics; i++)
		{
			System.out.printf("%10s\t", topics[i]);
			for(j = 0; j < numResponses; j++)
			{
				System.out.printf("\t%d", responses[i][j]);
			}
			System.out.printf("\t%.1f\n", averages[i]);
		}
		// figure out which topics got the most and least points
		greatestValue = totals[0]; greatestIndex = 0; leastValue = totals[0]; leastIndex = 0;
		for(i = 1; i < numTopics; i++)
		{
			if(greatestValue < totals[i])
			{
				greatestValue = totals[i];
				greatestIndex = i;
			}
			if(leastValue > totals[i])
			{
				leastValue = totals[i];
				leastIndex = i;
			}
		}
		
		// now print what got the most and least points
		System.out.printf("\n%s got the most points with %d points.\n%s got the least points with %d points.\n", topics[greatestIndex], greatestValue, topics[leastIndex], leastValue);
	
		// shut up eclipse, fine, I'll close the input stream
		scnr.close();
	}

}
