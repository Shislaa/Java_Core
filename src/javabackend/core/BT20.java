package javabackend.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap mot mang so tu nhien, moi so cach nhau bang 1 dau cach: ");
		Scanner sc2 = new Scanner(sc.nextLine());
		List Odd = new ArrayList<Integer>();
		List Even = new ArrayList<Integer>();
		
		while(sc2.hasNext()) {
			if(!sc2.hasNextInt()) {
				String str = sc2.next();
				System.out.println(str + " is not an Integer");
			}
			else {
				int tempInt = sc2.nextInt();
				if(tempInt % 2 == 0 ) {
					Even.add(tempInt);
				}
				else {
					Odd.add(tempInt);
				}
			}
		}
		
		System.out.println("Mang so chan : ");
		toStr(Even);
		System.out.println("Mang so le: ");
		toStr(Odd);
		
	}
	
	public static void toStr(List array) {
		for(int i = 0; i < array.size(); i ++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.println();
	}

}
