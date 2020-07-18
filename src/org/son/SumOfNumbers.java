package org.son;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		int sum=0;
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		while(n>0) {
			int m = n%10;
			sum=sum+m;
			n=n/10;
			
		}
		
		System.out.println("Sum of numbers = "+sum);
		
	}
	
}
