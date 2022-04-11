package week3.day1;

public class Student extends Department{

	public void studentName() {
		System.out.println("Radhika");
	}
	public void studentDepartment() {
		System.out.println("BME");
	}
	public void studentID() {
		System.out.println("709090");
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.departmentName();
		obj.studentName();
		obj.studentID();
		obj.studentDepartment();
	}
}
