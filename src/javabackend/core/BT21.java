package javabackend.core;

import java.util.Scanner;

public class BT21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap kan1 :");
		while(!sc.hasNextInt()) {
			System.out.println("Hãy nhập số đi man: ");
			sc.next();
		}
		int kan1 = sc.nextInt();
		
		System.out.println("Nhap v1: ");
		while(!sc.hasNextInt()) {
			System.out.println("Hãy nhập số đi man: ");
			sc.next();
		}
		int v1 = sc.nextInt();
		
		System.out.println("Nhap kan2: ");
		while(!sc.hasNextInt()) {
			System.out.println("Hãy nhập số đi man: ");
			sc.next();
		}
		int kan2 = sc.nextInt();
		
		System.out.println("Nhap v2: ");
		while(!sc.hasNextInt()) {
			System.out.println("Hãy nhập số và đi man: ");
			sc.next();
		}
		int v2 = sc.nextInt();
		
		if(kan1 > kan2) {
			if(v2 > v1) {
				System.out.println("Kịp gặp nhau nha");
			}
			else {
				System.out.println("K kịp rùi :(");
			}
		}
		
		if(kan2 > kan1) {
			if(v1 > v2) {
				System.out.println("Kịp gặp nhau nha");
			}
			else {
				System.out.println("K kịp rùi :(");
			}
		}
		
		if (kan1 == kan2) {
			System.out.println("Chưa kịp chạy đã gặp rùi man");
		}
		
	}
	

}
