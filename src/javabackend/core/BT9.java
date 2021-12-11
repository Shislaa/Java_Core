package javabackend.core;

import java.util.Scanner;

public class BT9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in 2 Integer from 10 to 99: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String aStr = Integer.toString(a);
		String bStr = Integer.toString(b);
		boolean isSame = false;
		
		for(int  i = 0; i < aStr.length(); i ++) {
			if(bStr.contains(Character.toString(aStr.charAt(i)) )) {
				isSame = true;
				System.out.println("True");
				break;
			}
		}
		
		if(!isSame) {
			System.out.println("False");
		}
	}

}
