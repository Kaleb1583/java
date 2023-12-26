package w3;

// Useful Java Imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//----------------------

import java.io.*; // import  input / output
import java.util.*; // import  all utils
import java.text.*;
//-----------------------

// i made this using https://w3schools.com/java/ 

@SuppressWarnings("unused")
public class Main {
	
	// (this is from https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places)
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	//--------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		Color bg = Color.red;
		System.out.println(bg + "A test");
		
		// Variables / Data Types
		//-----------------------------------------------------
		String var1 = "a string";
		System.out.println("String: " + var1);
		
		int var2 = 1;
		System.out.println("Intenger: " + var2);
		
		float var3 = 0.5f;
		System.out.println("Float: " + var3);
		
		char var4 = 'a';
		System.out.println("Character: " + var4);
		
		boolean var5 = true;
		System.out.println("Boolean: " + var5);
		
		int int1 = 34, int2 = 256, int3 = 14, int4 = 0;
		System.out.println(int1 + " " + int2 + " " + int3  + " " + int4);
		
		//-----------------------------------------------------

		System.out.println("-----------------------------------------");
		
		// Operators
		//-----------------------------------------------------
		
		double FiftyOne = 51.0;
		double ThirtyThree = 33.0;
		int TwentyTwo = 22;
		
		int inc = TwentyTwo; // i realized that doing ++variable actually changes the variables value so the next increment or decrement would get messed up.
		int dec = TwentyTwo; // ^^^
		
		double percent = round(ThirtyThree / FiftyOne, 2)*100;
		
		// ++TwentyTwo = 23, then when --TwentyTwo it would return 22 since the first one set it to equal
		System.out.println("51 + 33 = " + (FiftyOne + ThirtyThree));
		System.out.println("---");
		
		System.out.println("51 - 33 = " + (FiftyOne - ThirtyThree));
		System.out.println("---");
		
		System.out.println("51 / 33 = " + round((FiftyOne / ThirtyThree), 2));
		System.out.println("---");
		
		System.out.println("51 * 33 = " + (FiftyOne * ThirtyThree));
		System.out.println("---");
		
		System.out.println("33 is about " + percent + "% of 51.");
		System.out.println("---");
		
		System.out.println("31 % 3 (remainder) = " + 31 % 3);
		System.out.println("Explained: 31/3 = 10 (3*10=30) 30-31 = Remainder 1");
		System.out.println("---");
		
		System.out.println("++22 OR 22+1 = " + ++inc);
		System.out.println("--22 OR 22-1 = " + --dec);
		
		System.out.println("-----------------------------------------");
		//-----------------------------------------------------
		
		// Strings
		//-----------------------------------------------------
		
		String helloWorld = "Using Strings In Java";
		System.out.println("Normal: " + helloWorld);
		System.out.println("Lower: " + helloWorld.toLowerCase());
		System.out.println("Upper: " + helloWorld.toUpperCase());
		System.out.println("The String: {Strings} starts at index: " + helloWorld.indexOf("Strings"));
		System.out.println("---");
		
		String abcsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("the abcs is " + abcsCaps.length() + " characters long.");
		System.out.println("---");
		
		String firstName = "John";
		String lastName = "Doe";
		
		System.out.println(firstName + " " + lastName);
		System.out.println(firstName.concat(lastName));
		System.out.println(firstName.concat(" " + lastName)); // (do this to add space in-between)
		System.out.println("---");
		//-----------------------------------------------------
		
		String numberInString = "4";
		int aNumber = 15;
		String allTogether = numberInString + aNumber;
		System.out.println("\"4\" + 15 = " + allTogether);
		//^^ string + int and ^ how to have double quotes in double quotes
		System.out.println("---");
		
		System.out.println(" 'im in single quotes' (but also in double on the very outside) ");
		System.out.println(" \" im in double quotes \" (double quotes in doubles quotes) ");
		System.out.println("Heres a backslash: \\");
		System.out.println("New Line: \\n , used here: \n");
		System.out.println("Carriage Return: \\r , used here: \r");
		System.out.println("Backspace: \\b , used here: \b");
		System.out.println("Form Feed: \\f , used here: \f");
		System.out.println("---");
		
		System.out.println("Minimum in the numbers 5 to 10: " + Math.min(5, 10));
		System.out.println("Maximum in the numbers 5 to 10: " + Math.max(5, 10));
		System.out.println("64 Squared: " + Math.sqrt(64));
		System.out.println("Math.abs(-7) (absolute value) = " + Math.abs(-7));
		System.out.println("Random Number between 0 and 1: " + Math.random());
		System.out.println("Random Number between 0 and 100: " + (int)(Math.random() * 101));
		System.out.println("---");
		boolean canDrink = 20 >= 21;
		System.out.println("can 20yr old drink (= or more than 21) = " + canDrink);
		boolean canDrink2 = 21 >= 21;
		System.out.println("can 21yr old drink (= or more than 21) = " + canDrink2);
		boolean canDrink3 = 22 >= 21;
		System.out.println("can 22yr old drink (= or more than 21) = " + canDrink3);
		System.out.println("---");
		boolean isAdult = 17 >= 18;
		System.out.println("is 17yr an adult / can vote = " + isAdult);
		boolean isAdult2 = 18 >= 18;
		System.out.println("is 18yr an adult / can vote = " + isAdult2);
		boolean isAdult3 = 19 >= 19;
		System.out.println("is 19yr an adult / can vote = " + isAdult3);
		System.out.println("---");
		System.out.println("Less than: a < b");
		System.out.println("Less than or equal to: a <= b");
		System.out.println("Greater than: a > b");
		System.out.println("Greater than or equal to: a >= b");
		System.out.println("Equal to: a == b");
		System.out.println("Not Equal to: a != b (! means not or opposite)");
		
		int x = 153;
		int y = 12741;
		
		if(x < y) {
			System.out.println("x < y is true / (153 < 12741)");
			
		} else {
			System.out.println("x < y is false");
		}
		
		
		
	}
}



