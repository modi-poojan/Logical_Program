package com.logical;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a numbe to make it reverse");
		int input = scan.nextInt();
		int temp = input;
		int rev = 0;
		while (temp > 0) {
		rev = rev * 10 + temp % 10;
		temp = temp / 10;
		
		}
		System.out.println("Reverse number is "+rev);
	}

}
