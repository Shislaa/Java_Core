package javabackend.OOP.SinhVien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class SinhVien {
	private String name;
	private Date dOB;
	private String Sex;
	private String address;
	private String studentID;
	private String major;
	private double sub_1;
	private double sub_2;
	private double sub_3;
	
	public SinhVien() {
		this.name = "";
		this.dOB = new Date(01,01,1990);
		this.address = "";
		this.studentID = "";
		this.major = "";
		this.sub_1 = -1;
		this.sub_2 = -1;
		this.sub_3 = -1;		
				
	}
/**
 * Input an ArrayList of SinhVien, print out a ranked list of SinhVien based on their Average score
 * @param svRank
 */
	public void ranking(ArrayList<SinhVien> svRank) {
		svRank.sort(new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				return sv1.getAVG() > sv2.getAVG() ? 1 : -1;
			}
		});
		
		for(SinhVien sv : svRank) {
			System.out.println("Student: " + sv.name + " ID: " + sv.studentID + " Average: " + sv.getAVG());
		}
	}
	
	public String getSex() {
		return Sex;
	}



	public void setSex(String sex) {
		Sex = sex;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null) {
			System.out.println("null value");
			return;
		}
		if(name.equals("")) {
			System.out.println("Name cannot be empty");
			return;
		}
		this.name = name;
	}
	
	public Date getdOB() {
		return dOB;
	}
	
	public void setdOB(Date dOB) {
		if(dOB == null) {
			System.out.println("null value");
			return;
		}
		this.dOB = dOB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address == null) {
			System.out.println("null value");
			return;
		}
		if(address.equals("")) {
			System.out.println("Address cannot be empty");
			return;
		}
		this.address = address;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		if(studentID == null) {
			System.out.println("null value");
			return;
		}
		if(studentID.equals("")) {
			System.out.println("Address cannot be empty");
			return;
		}
		this.studentID = studentID;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		if(major == null) {
			System.out.println("null value");
			return;
		}
		if(major.equals("")) {
			System.out.println("Address cannot be empty");
			return;
		}
		this.major = major;
	}
	
	public double getSub_1() {
		return sub_1;
	}
	public void setSub_1(double sub_1) {
		if(sub_1 < 0) {
			System.out.println("Mark cannot be smaller than 0");
			return;
		}
		this.sub_1 = sub_1;
	}
	public double getSub_2() {
		return sub_2;
	}
	public void setSub_2(double sub_2) {
		if(sub_2 < 0) {
			System.out.println("Mark cannot be smaller than 0");
			return;
		}
		this.sub_2 = sub_2;
	}
	public double getSub_3() {
		return sub_3;
	}
	public void setSub_3(double sub_3) {
		if(sub_3 < 0) {
			System.out.println("Mark cannot be smaller than 0");
			return;
		}
		this.sub_3 = sub_3;
	}
	
	public double getAVG() {
		double avgTemp = (this.sub_1 + this.sub_2 + this.sub_3)/3;
		return avgTemp;
	}

	
}
