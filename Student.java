
class Student {
	String name;
	int rollNumber;
	static int studentCount=0;
	Student(String name, int rollNumber){                     //a constructor
		this.name=name;
		this.rollNumber=rollNumber;
		studentCount++;
	}
	public static void displayStudentCount() {
		System.out.println("Count of students: "+studentCount);
	}
public static void main(String[] args) {
	Student student1=new Student("Sreya",70);
	Student student2=new Student("Krishna",46);
	Student student3=new Student("Nayana",13);
	Student.displayStudentCount();
}

}
