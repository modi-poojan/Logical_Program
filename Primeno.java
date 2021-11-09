package com.logical;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number to check");
	int input = scan.nextInt();
	
	if(input < 2 ) {
		System.out.println(input+" Not a prime number");
	}
	
	for(int i = 1; i < input; i++) {
		
			if(input % i == 0) {
				System.out.println(input+" Number is not a prime number");
				break;
			}
		
			else {
			System.out.println(input+" Number is prime");
			}
	}
	
	
}
	
}