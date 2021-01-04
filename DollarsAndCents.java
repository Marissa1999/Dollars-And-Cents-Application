//Programmer: Marissa Gonçalves
//Date: August 28, 2017
//Purpose: This program should be able to turn an int value to a double variable, in order to input a price that recognizes dollar and cent values.

import java.util.Scanner;

public class DollarsAndCents

{
	public static void main (String[] args)

    {
	    Scanner keyboard = new Scanner(System.in);

        //enter the price, in order to determine the dollars and cents seperately;
	    System.out.print ("Enter a price: ");
        double price = keyboard.nextDouble();

        //make sure that the amount of dollars is converted from a double to an integer;
        int dollars;
        dollars = (int) price;

        //make sure that the amount of cents is subtracted from the price and dollars, and multipled by 100 to get an approximate answer in cents;
        int cents;
        cents = (int) ((price - dollars) * 100);

        //write out a conclusion, pertaining to the amount of dollars and cents being identified in the price;
        System.out.println ("The price is " +  dollars  + " dollars and " + cents + " cents.");

        System.out.println ();
    }

 }
