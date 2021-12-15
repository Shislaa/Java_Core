package javabackend.OOP.SinhVien.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javabackend.OOP.SinhVien.SinhVien;

public class MainProgram {

	public static void main(String[] args) throws ParseException {
		
		ArrayList svRank = new ArrayList<SinhVien>();
		
		for(int i = 0 ; i < 3 ; i++) {
			Scanner sc = new Scanner(System.in);
			SinhVien sV = new SinhVien();
			System.out.println("Type in student name: ");
			String name = sc.nextLine();
			System.out.println("Type in student date of birth (dd/MM/yyy): ");
			SimpleDateFormat formatter  = new SimpleDateFormat("dd/MM/yyy");
			String DobStr = sc.nextLine();
			Date DOB = formatter.parse(DobStr);
			System.out.println("Type in student gender: ");
			String Sex = sc.nextLine();
			System.out.println("Type in student address: ");
			String Address = sc.nextLine();
			System.out.println("Type in student ID: ");
			String studentID = sc.nextLine();
			System.out.println("Type in student major: ");
			String Major = sc.nextLine();
			System.out.println("Type in subject 1 mark: ");
			double sub_1 = sc.nextDouble();
			System.out.println("Type in subject 2 mark: ");
			double sub_2 = sc.nextDouble();
			System.out.println("Type in subject 3 mark: ");
			double sub_3 = sc.nextDouble();
			
			sV.setName(name);
			sV.setdOB(DOB);
			sV.setSex(Sex);
			sV.setAddress(Address);
			sV.setStudentID(studentID);
			sV.setMajor(Major);
			sV.setSub_1(sub_1);
			sV.setSub_2(sub_2);
			sV.setSub_3(sub_3);
			svRank.add(sV);
		}
		
		SinhVien sV = new SinhVien();
		sV.ranking(svRank);
	}
	
	
	

}
