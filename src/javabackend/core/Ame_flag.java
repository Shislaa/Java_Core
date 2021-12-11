package javabackend.core;

public class Ame_flag {

	public static void main(String[] args) {
		char c = ' ';
		for(int i =0 ; i < 15; i++) {
			for(int j = 0; j < 46 ; j++) {
				if( i < 9) {
					if(i % 2 == 0) {
						if(j < 13) {
							if (j % 2 == 0) {
								c = '*';
								System.out.print(c);
							}
							else {
								c = ' ';
								System.out.print(c);
							}
						}
						else {
							if(j == 13) {
								c = ' ';
								System.out.print(c);
							}
							c = '=';
							if(j == 45) {
								c = ' ';
							}
							System.out.print(c);
						}
					
					}
					else {
						if(j < 13) {
							if (j % 2 == 0) {
								c = ' ';
								System.out.print(c);
							}
							else {
								c = '*';
								System.out.print(c);
							}
						}
						else {
							if(j == 13) {
								c = ' ';
								System.out.print(c);
							}
							c = '=';
							if(j == 45) {
								c = ' ';
							}
							System.out.print(c);
						}
					}
				}
				else {
					c = '=';
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}

}
