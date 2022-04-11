package week3.day1;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("My Desktop Size is 15 inches");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop object = new Desktop();
		object.computerModel();
		object.desktopSize();
	}

}
