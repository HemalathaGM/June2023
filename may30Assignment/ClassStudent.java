package may30Assignment;

public class ClassStudent {
	
	String name;
	int roll_no;
	int phno;
	String addres;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassStudent s1=new ClassStudent();
		s1.name="john";
		s1.roll_no=3;
		s1.phno=235623;
		s1.addres="11th street";
		
		ClassStudent s2=new ClassStudent();
		s2.name="sam";
		s2.roll_no=5;
		s2.phno=1234567;
		s2.addres="12th street";
		
		System.out.println("Student name is :" +s1.name);
		System.out.println("Student roll number is :" +s1.roll_no);
		System.out.println("Student phone number is :" +s1.phno);
		System.out.println("Student Address is :" +s1.addres);
		System.out.println("Student name is :" +s2.name);
		System.out.println("Student roll number is :" +s2.roll_no);
		System.out.println("Student phone number is :" +s2.phno);
		System.out.println("Student Address is :" +s2.addres);
		
	}
	
	
}
