package javabackend.core;

import java.util.Scanner;

public class BT4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in an Integer: ");
		int temp = sc.nextInt();
		
		String tempstr = Integer.toString(temp);
		int total = 0;
		for(int i = 0 ; i < tempstr.length(); i ++) {
			int digit = Character.getNumericValue(tempstr.charAt(i));
			total += digit;
		}
		System.out.println("Total of the digits: " + total);
		sc.close();
	}
}
