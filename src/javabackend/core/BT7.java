package javabackend.core;

import java.util.Scanner;

public class BT7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an Integer: ");
		int temp = sc.nextInt();
		
		System.out.println("Number that " + temp +" can divided by: ");
		for( int i = 1; i <= temp ; i++) {
			int temp2 = temp % i;
			if(temp2 == 0) {
				System.out.println(i + " ");
			}
		}
		sc.close();
	}

}
