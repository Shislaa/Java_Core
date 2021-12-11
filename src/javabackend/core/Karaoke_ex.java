package javabackend.core;

import java.util.Scanner;

public class Karaoke_ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap gio bat dau (24hr): ");
		int start = sc.nextInt();
		System.out.println("Hay nhap gio ket thuc (24hr): ");
		int end = sc.nextInt();
		System.out.println("Nhap so chai nuoc : ");
		int bottle = sc.nextInt();
		int rate = 30000;
		int water = 10000;
		
		int duration = end - start;
		double total = 0;
		
		if(duration < 4) {
			total = (duration * rate) + (bottle * water);
		}
		else {
			total = 3*rate + (duration - 3) * rate * 0.3 + (bottle * water);
		}
		
		if(start >= 9 && start <= 17) {
			total = total - total*0.2;
		}
		
		System.out.println("Tong Bill: " + total);
		sc.close();
		
	}
}
