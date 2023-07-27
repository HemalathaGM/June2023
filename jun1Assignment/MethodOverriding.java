package jun1Assignment;

//Polymorphism with MethodOverriding


public class Parent {
	
	void Print()
	{
		System.out.println("Print method of Parent class");
	}
}

class subclass1 extends Parent{
	
	void Print()
	{
		System.out.println("Print method of subclass1");
		
	}
	
}

class subclass2 extends Parent{
	void Print()
	{
		System.out.println("Print method of subclass2");
	}
}
public class MethodOverriding {
	
	public static void main(String[] args) {
		//Parent a;
		//a=new Parent;
		
		Parent a = new Parent();
		a.Print();
		
		
		a=new subclass1();
		a.Print();
		
		a=new subclass2();
		a.Print();
				
		
	}
	
}