package com.example;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		var input = new Scanner(System.in);
	    System.out.println("Input the FirstNumber:");
	      var F_Number = input.nextInt();
	    System.out.println( "Input the SecondNumber:");
	      var S_Number = input.nextDouble();
	      
	      
	      System.out.println( "Show the final results with 2 numbers :=)");
	      System.out.println(F_Number + S_Number);
	      System.out.println(F_Number - S_Number);
	      System.out.println(F_Number * S_Number);
	      
	      System.out.println(F_Number / S_Number);
	      System.out.println((double)F_Number / S_Number);
	      System.out.println(F_Number % S_Number);

	}

}
