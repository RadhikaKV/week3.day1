package week3.day1;

public class StudentsInfo {

		public void getStudentsInfo(int id)
		{
			System.out.println("Student ID = "+id);
		}
		
		public void getStudentsInfo(int id,String name)
		{
			System.out.println("Student ID and Name = " +id +" "+  name);
		}
		public void getStudentsInfo(String email, long phonenumber)
		{
			System.out.println("Student email ID and mobile number = " +email +" " + phonenumber );
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StudentsInfo info =new StudentsInfo();
			info.getStudentsInfo(89098);
			info.getStudentsInfo(89098, "Radhika");
			info.getStudentsInfo("radhi06@gmail.com", 9098989090L);
		}


}
