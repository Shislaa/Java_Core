package javabackend.core;

import java.util.Scanner;

public class BT19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type 1 for chuong trinh bac 1: ");
		System.out.println("Type 2 for chuong trinh bac 2: ");
		System.out.println("Type exit de thoat");
		while(!sc.hasNext("exit")) {
			if(!sc.hasNextInt()) {
				System.out.println("Hay chon lai chuc nang");
				sc.next();
			}
			else {
				int function = sc.nextInt();
				switch (function) {
					case 1: {
						System.out.println("Chương trình bậc 1 có dạng ax + b = 0 ( a khác 0) : ");
						System.out.println("Hay nhap a: ");
						double a = sc.nextInt();
						System.out.println("Hãy nhập b: ");
						double b = sc.nextInt();
						double x = (-b)/a;
						System.out.println("Nghiem cua pt la x = " + x);
						break;
					}
					case 2:{
						System.out.println("Chương trình bậc 2 có dạng a(x^2) + bx + c = 0 ( a khác 0) : ");
						System.out.println("Hay nhap a khác 0: ");
						double a = sc.nextDouble();
						System.out.println("Hay nhap b: ");
						double b = sc.nextDouble();
						System.out.println("Hay nhap c: ");
						double c = sc.nextDouble();
						
						double delta = (b*b) - (4*a*c);
						
						if(delta < 0.0) {
							System.out.println("Phuong trinh vo nghiem");
						}
						else if(delta == 0.0) {
							double x = -b/(2*a);
							System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x);
						}
						else {
							double x1 = (-b + Math.sqrt(delta)) / (2*a);
							double x2 = (-b - Math.sqrt(delta)) / (2*a);
							System.out.println("Phương trình có 2 nghiệm riêng biệt");
							System.out.println("x1 = " + x1);
							System.out.println("x2 = " + x2);
						}
						break;
					}
					default:{
						System.out.println("Hãy chọn lại chức năng");
					}
				}
			System.out.println("Hãy chọn lại chức năng, hoặc nhấn exit để thoát");
			}
		}
	}

}
