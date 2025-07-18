package sreya;
import java.util.Scanner;
class Student{
	String name;
	int rollNumber;
	String department;
	Student(String name, int rollNumber, String department){     //constructor
		this.name = name;
		this.rollNumber = rollNumber;
		this.department = department;
	}

public void printStudentInfo() {
	System.out.println("name: "+name);
	System.out.println("rollNumber: "+rollNumber);
	System.out.println("department: "+department);
}
}
public class ConstructDemo2 {
	public static void main(String[] args) {
		Student student = new Student ("Sreya", 70, "CSE");
		student.printStudentInfo();
	}
}


