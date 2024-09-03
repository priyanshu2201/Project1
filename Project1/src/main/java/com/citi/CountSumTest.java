package com.citi;

import java.util.Scanner;

public class CountSumTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CountSum s = new CountSum();
		System.out.println("Enter first num");
		int a = sc.nextInt();
		System.out.println("Enter Second num");
		int b = sc.nextInt();
		
		
		System.out.println("Enter your requirement");
		String data = sc.next();
		
		switch (data) {
		case "*" : 
			System.out.println( s.mul(a,b));
			break;
		case "-" :
			System.out.println( s.sub(a,b));
			break;
			
		case "+" :
			System.out.println( s.sum(a,b));
			break;
		
		default:
			
		}
	

	}

}
