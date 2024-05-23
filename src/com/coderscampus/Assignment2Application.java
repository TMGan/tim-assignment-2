package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		Random random = new Random();
		int theRandomNumber = random.nextInt(100);
		int tries=5;
		
		Scanner scanner = new Scanner(System.in);
		
		while (tries > 0) {
			System.out.println("Pick a number between 1 and 100");
			int guess = scanner.nextInt();
			tries--;
			if (guess < 1 || guess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again.");
				continue;
			}
			else if (guess< theRandomNumber) {
				System.out.println("Please pick a higher number.");
			}
			else if (guess > theRandomNumber) {
				System.out.println("Please pick a lower number.");
			}
			else if (guess == theRandomNumber) {
				System.out.println("You win!");
				return;
			}
		}
		System.out.println("You lose, the number to guess was " +theRandomNumber);
	
		scanner.close();
		}
	
	
}
