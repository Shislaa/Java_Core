package javabackend.core;

import java.util.Random;
import java.util.Scanner;

public class BT17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int max = 1000;
		int min = 1;
		int secretnum = rand.nextInt(max - min + 1) + min;
		System.out.println("Hay nhap so ban nghi la so bi mat tu 0 - 1000: ");
		while(true) {
			if(!sc.hasNextInt()) {
				System.out.println("Hay nhap lai 1 so tu nhien tu 0 - 1000");
				sc.next();
			}
			else {
				int temp = sc.nextInt();
				if(temp < secretnum) {
					System.out.println("So ban nhap nho hon so bi mat");
				}
				else if(temp > secretnum) {
					System.out.println("So ban nhap lon hon so bi mat");
				}
				else {
					System.out.println("Chuc mung ban da tim ra so bi mat");
					break;
				}
			}
		}
	}

}
