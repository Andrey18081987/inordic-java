package com.example;

public class CompareDouble {

	public static void main(String[] args) {
		var a = 1.000_001d - 0.000_001d;
		var b = 1.0d;
		var eps = 1e-12;
		
//		| a - b | < ε
		System.out.println(Math.abs(a - b) < eps);
	}

}
