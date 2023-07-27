package juneAssignments;

public class Q7DiffStrgObj {

	public static void main(String[] args) {
		
		  //Assigning value to a string
		  String name1 = "Mary"; //as a String literal Way
		  
          String name2 = "My name is " + name1; //as a constant expression
          String name3 = new String(name2); //as a String Object way  using the constructor
		
         System.out.println("Print the String in Literal way  " +name1);
         System.out.println("Print the String as Constant expression  " +name2);
         System.out.println("Print the sting object using constructor  " +name3);
         name3.concat("Gorli");
         //String is immutable so original value still remains same 
         System.out.println("Print the sting object using concat  " +name3);
         //if we assign the concat string to new variable string will change
         String name4=name3.concat("Gorli");
         System.out.println("Print the sting object using concat  " +name4);
		
	}
	
	
}
