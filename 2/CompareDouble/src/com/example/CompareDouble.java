package com.example;

import java.util.Random;
import java.util.Scanner;

public class CompareDouble {

	public static void main(String[] args) {
		var input = new Scanner(System.in);
		var n = input.nextInt();
		var res = 1;
		for (var i = 1; i <= n; i+=1) {
			res *= i;
		}
		System.out.println(res);
	}

}
