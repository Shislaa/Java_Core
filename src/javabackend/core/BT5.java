package javabackend.core;

import java.util.Scanner;

public class BT5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x1 = ");
		int x1 = sc.nextInt();
		System.out.println("y1 = ");
		int y1 = sc.nextInt();
		System.out.println("x2 = ");
		int x2 = sc.nextInt();
		System.out.println("y2 = ");
		int y2 = sc.nextInt();
		
		double veclen = Math.pow((x1-x2),2) + Math.pow((y1-y2),2);
		veclen = Math.sqrt(veclen);
		System.out.println("Length of vector AB : " + veclen);
		sc.close();
	}

}
