package javabackend.core;

import java.util.Scanner;

public class BT18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tien gui: ");
		while(!sc.hasNextInt()) {
			System.out.println("Hãy nhập số tiền đi man: ");
			sc.next();
		}
		double saving = sc.nextDouble();
		System.out.println("Nhap số tiền mong muốn: ");
		while(!sc.hasNextInt()) {
			System.out.println("Hãy nhập số tiền đi man: ");
			sc.next();
		}
		double goal = sc.nextDouble();
		System.out.println("Nhập số tiền lãi năm đầu tiên: ");
		while(!sc.hasNextInt()) {
			System.out.println("Hãy nhập số tiền đi man: ");
			sc.next();
		}
		double interest = sc.nextDouble();
		
		double rate = interest/saving;
		int year = 0;
		
		while(saving < goal) {
			saving += saving*rate;
			System.out.println(Double.toString(saving));
			year++;
		}
		
		System.out.println("Can tiet kiem " + year +" nam");
	}

}
