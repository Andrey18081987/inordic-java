package com.example;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		var decNumber = 111;
		var binNumber = 0b1010;
		var octNumber = 0765;
		var hexNumber = 0xABC;
		
		System.out.println(decNumber + " " + binNumber + " " + octNumber + " " + hexNumber);

		System.out.println("Введите число в двоичной системе счисления");
		var string = scanner.nextLine();
		
		var dec = Integer.parseInt(string, 2);
		var hexString = Integer.toString(dec, 16);
		System.out.println("Число " + dec + "в 16-ной системе счисления" + hexString);
		
	}

}
