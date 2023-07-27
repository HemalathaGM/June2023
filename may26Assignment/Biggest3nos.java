package may26Assignment;

public class Biggest3nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=550,n2=550,n3=199;
		
		if(n1>=n2 && n1>=n3) {
			System.out.println("n1 is biggest number" +n1);
		}else if(n2>=n1 && n2>=n3)
		    System.out.println("n2 is biggest number" +n2);
		
		if(n1==n2)
			System.out.println("Both n1 and n2 are equal" +n1 +n2);
		else
			System.out.println("n3 is biggest number" +n3);

	}

}
