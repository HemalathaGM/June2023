package may30Assignment;

import java.util.Scanner;

public class Personscnner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter Name, Gender, Address and Age, :");
		String name=reader.nextLine();
		String gender=reader.nextLine();
		String add1=reader.nextLine();
		int age=reader.nextInt();
		
		
		System.out.println("Name" +" "+name);
		System.out.println("Gender" +" "+gender);
		System.out.println("Address" +" " +add1);
		System.out.println("Age " +" "+age);
		
		
		reader.close();
	}

}
