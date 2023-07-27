package jun1Assignment;
class MultiplyFun1{
	
	static int Multiply(int a,int b)
	{
		return a*b;
	}
	static int Multiply(int a,int b,int c)
	{
		return  a*b*c;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Print Method with 2 Parameters");
		System.out.println(MultiplyFun1.Multiply(2, 4));
		System.out.println("Print Method with 3 Parameters");
		System.out.print(MultiplyFun1.Multiply(2, 7));
		
	}

}
