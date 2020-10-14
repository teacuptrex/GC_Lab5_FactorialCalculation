package gcLab5;

import java.util.*;

public class FactorialCalculation {
	
	public static void main(String[] args) {
		//User inputInt from 1 to 10
		//Continue while
		//calculate factorial using for loop
		//validate that inputInt is between 1 & 10
		//factorial must be stored in long type
		
		int inputInt = 1;
		long factorInt;
		String cont = "y";
		Scanner scn = new Scanner(System.in);
		
		while (cont.equals("y")) {
		factorInt = 1;
		System.out.println("Enter an integer between 1 and 20: ");
		inputInt = scn.nextInt();
		if (inputInt < 21 && inputInt >= 1) {
			for (int i = 1; i <= inputInt; i++) {
				factorInt *= i;
			}
			System.out.println(factorInt);
		} else {
			System.out.println("That number was invalid.");
		}
		

		
		System.out.println("Continue? (y/n) ");
		cont = scn.next();
		}
		scn.close();
	}
}