package may26Assignment;

public class MNCempsal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int exp=25;
			double oldsal=10000;
			double revsal;
			if(exp>=3 && exp<=5) {
				revsal=oldsal+(0.10)*oldsal;
				System.out.println("The Emplyee experience is" +" "+exp +" "+"years");
				

			}
			else if(exp>=6 && exp<=9) {
				revsal=oldsal+((0.15)*oldsal);
				System.out.println("The Emplyee experience is" +" "+exp +" "+"years");
			}
			else if(exp>=10 && exp<=20) {
				revsal=oldsal+((0.20)*oldsal);
				System.out.println("The Emplyee experience is" +" "+exp +" "+"years");
			}
			else
				revsal=oldsal+((0.25)*oldsal);
			
		System.out.println("The reversal salary before adding rewards is " +revsal);	
		int rew=2;
		System.out.println("The Emplyee has " +rew +" " +"rewards received from the company");
			
		revsal=(1000*rew)+revsal;
		System.out.println("The Final revsal salary for employee with rewards added is" +" "+revsal);
		
	}

}
