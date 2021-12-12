package javabackend.core;

import java.util.Scanner;

public class BT16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap nam: ");
		while(!sc.hasNextInt()) {
			System.out.println("Hay nhap lai nam");
		}
		int year = sc.nextInt();
		boolean isLeap = leapYCheck(year);
		if(isLeap) {
			System.out.println(year + " la nam nhuan");
		}
		else {
			System.out.println(year + " khong phai la nam nhuan");
		}
	}
	
	public static boolean leapYCheck(int year) {
		boolean isLeap = false;
		if (year % 4 == 0) {
			// is century
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				}
				else {
					return false;
				}
			}
			// if not then its leap
			else {
				return true;
			}
		}
		// not divisible by 4
		else {
			return false;
		}
		
	}

}
