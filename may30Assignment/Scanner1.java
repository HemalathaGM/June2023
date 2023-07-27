package may30Assignment;
import java.util.Scanner;
public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter 1st number:");
		int a=reader.nextInt();
		System.out.println("Enter 2nd number:");
		int b=reader.nextInt();
		int sum=a+b;
		System.out.println("The sum of 2 nums :" +sum);
		
		reader.close();

	}

}
