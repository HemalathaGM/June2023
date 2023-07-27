package Polymorphism;

public class Parent1 {
	
	void Print()
	{
		System.out.println("Print method of Parent class");
	}
}

class subclass1 extends Parent1{
	
	void Print()
	{
		System.out.println("Print method of subclass1");
		
	}
	
}

class subclass2 extends Parent1{
	void Print()
	{
		System.out.println("Print method of subclass2");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 a = new Parent1();
		a.Print();
		
		
		a=new subclass1();
		a.Print();
		
		a=new subclass2();
		a.Print();
	}

}
