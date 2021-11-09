package com.logical;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers should be printed"); 
		int input = scan.nextInt();
		int first = 0;
		int second = 1;
		int next = 0;
		int i = 0;
		for (i = 0; i < input ; i++) {
			
			if(input < 2) {
				System.out.print(first+ second);
			}
			else {
			next = first;
			first += second;
			second = next;
			System.out.println(" "+next);
			}
		}
		scan.close();
	}
		
}
