package may30Assignment;

import java.util.Scanner;

public class ClassStudScanner {
	

	String name;
	String gender;
	String add1;
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter Name, Gender, Address and Age, :");
		
		ClassStudScanner s1=new ClassStudScanner();
		s1.name=reader.nextLine();
		s1.gender=reader.nextLine();
		s1.add1=reader.nextLine();
		s1.age=reader.nextInt();
		reader.nextLine();

		ClassStudScanner s2=new ClassStudScanner();
		s2.name=reader.nextLine();
		s2.gender=reader.nextLine();
		s2.add1=reader.nextLine();
		s2.age=reader.nextInt();
		reader.nextLine();
		
		System.out.println("Name" +" "+s1.name);
		System.out.println("Gender" +" "+s1.gender);
		System.out.println("Address" +" " +s1.add1);
		System.out.println("Age " +" "+s1.age);
		
		System.out.println();
//		
		System.out.println("Name" +" "+s2.name);
		System.out.println("Gender" +" "+s2.gender);
		System.out.println("Address" +" " +s2.add1);
		System.out.println("Age " +" "+s2.age);
//		
//		
		reader.close();
	}

}
