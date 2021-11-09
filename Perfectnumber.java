package com.logical;

import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		Perfectnumber obj = new Perfectnumber();
		obj.perfect();
	}
	public void perfect() {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		System.out.print(" Please enter the number: ");
		int input = scan.nextInt();
		
		for (int i = 1; i <= input / 2; i++) {
			if (input % i == 0) {
				sum += i;
				System.out.println(i + " " + sum);
			}
		}
		
		if (sum == input) 
			System.out.println(" It is a perfect number");
		else
			System.out.println(" It is not a perfect number");
		scan.close();
	}
}

