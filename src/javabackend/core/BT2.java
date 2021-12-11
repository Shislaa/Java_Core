package javabackend.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List arrL = new ArrayList<Integer>();
		System.out.println("Type in an integer: ");
		int temp = sc.nextInt();
		System.out.print("Binary form: ");
		while(temp / 2 != 0) {
			int temp2 = temp % 2;
			temp = temp / 2;
			arrL.add(temp2);
		}
		arrL.add(temp);
		for(int i = arrL.size() - 1; i >= 0; i--) {
			System.out.print(arrL.get(i));
		}
		sc.close();
	}

}
