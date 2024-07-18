package DataType;

public class Student {
	int studentId;
	String name;
	String phone;
	
	void fun() {
		System.out.println("Student is having fun");
		System.out.println("Student is in park");
	}


public static void main(String[] args) {
	Student sai = new Student();
	sai.fun();
	System.out.println(sai.name);
	System.out.println(sai.studentId);
	System.out.println(sai.phone);
}
	
	
}
