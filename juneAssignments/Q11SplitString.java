package juneAssignments;

public class Q11SplitString {
	public static void main(String[] args) {
		System.out.println("Regexp with small limit");
		String str = "mary@for@tekarch";
        String[] arrOfStr = str.split("@", 2);
 
        for (String a : arrOfStr)
            System.out.println(a);
        
        
        System.out.println("\nregexp  with high limit");
        
        String str1 = "mary@gorli@for@tekarch";
        String[] arrOfStr1 = str1.split("@", 5);
 
        for (String a : arrOfStr1)
            System.out.println(a);
        
        System.out.println("\nRegexp with Negative Index");
		String str2 = "mary@for@tekarch";
        String[] arrOfStr2 = str2.split("@", -2);
 
        for (String a : arrOfStr2)
            System.out.println(a);
        
        String str4 = "GeeksforGeeks:A Computer Science Portal";
        String[] arrOfStr4 = str4.split(":");

          for (String a : arrOfStr4)
             System.out.println(a);
          
          
          String str5 = "word1, word2 word3@word4?word5.word6";
          String[] arrOfStr5 = str5.split("[, ?.@]+");
   
          for (String a : arrOfStr5)
              System.out.println(a);
          
          
          System.out.println("\nSplit the String with 0 limit");
          String str6 = "geekss@for@geekss";
          String[] arrOfStr6 = str6.split("s", 0);
   
          for (String a : arrOfStr6)
              System.out.println(a);
          
	}

}
