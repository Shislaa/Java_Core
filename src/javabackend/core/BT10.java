package javabackend.core;

import java.util.Scanner;

public class BT10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in N: ");
		int n = sc.nextInt();
		int total = 0;
		
		for(int i = 1; i <= n; i++) {
			if(isPrine(i)) {
				System.out.println("Prime is : " + i);
				total += i;
			}
		}
		
		System.out.println("Total sum of prime number from 0 to N: " + total);
	}
	
	public static boolean isPrine(int j) {
		for (int i = 2; i <= j / 2; ++i) {
		      // condition for nonprime number
		      if (j % i == 0) {
		        return false;
		        
		      }
		    }
		return true;
	}
	

}
