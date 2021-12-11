package javabackend.core;

import java.util.ArrayList;
import java.util.Scanner;

public class BT8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList str = new ArrayList<String>();
		System.out.println("Input a String: ");
		Scanner sc2 = new Scanner(sc.nextLine());
		
		while(sc2.hasNext()) {
			String strTemp = sc2.next();
			str.add(strTemp);
		}
		
		for(int i = 0; i < str.size(); i ++) {
			String strTemp = (String) str.get(i);
			char[] cArr = strTemp.toCharArray();
			if(!Character.isUpperCase(cArr[0])) {
				cArr[0] = Character.toUpperCase(cArr[0]);
			}
			String strTemp2 = new String(cArr);
			System.out.print(strTemp2 + " ");
		}
		sc.close();
		sc2.close();
		
	}

}
