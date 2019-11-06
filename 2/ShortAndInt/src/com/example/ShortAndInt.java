package com.example;

import java.util.Scanner;

public class ShortAndInt {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		var firstNumber = scanner.nextShort();
		var secondNumber = scanner.nextShort();
		
		var shortSum = (short)(firstNumber + secondNumber);
		var intSum = (int)(firstNumber + secondNumber);
		
		System.out.println("Сумма в short: " + shortSum);
		System.out.println("Сумма в int: " + shortSum);
	}

}
