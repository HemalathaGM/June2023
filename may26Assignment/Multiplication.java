package may26Assignment;

/*public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mul=10;
		System.out.println("Multiplication of 10");
		for(int i=1;i<=12;i++) {
			int val=mul*i;
			
			System.out.println("10 x " +i +"=" +val );
		
		}

	}

}*/


import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter the multiplication table upto :");
		int mul=reader.nextInt();
		System.out.println("Multiplication of " +mul);
		
		for(int i=1;i<=12;i++) {
			int val=mul*i;
			
			System.out.println(+mul +" x " +i +"=" +val );
		reader.close();

	}

}
}
	
