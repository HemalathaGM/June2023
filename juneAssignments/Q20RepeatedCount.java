package juneAssignments;
import java.util.Scanner;
public class Q20RepeatedCount {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=s.nextLine();
		int len=str.length();	
		int cInt=0;
		int cUpp=0;
		int cLow=0;
		int[] cIntarr=new int[10];
		int[] cUpparr=new int[26];
		int[] cLowarr=new int[26];
		for(int i=0;i<len;i++){
				char ch=str.charAt(i);
				if(ch>='0' && ch<='9')
			{
					cInt++;
					cIntarr[ch-'0']++;
			}else if(ch >= 'A' && ch<='Z') {
					cUpp++;
					cUpparr[ch-'A']++;
			}else if(ch>='a' && ch<='z') {
					cLow++;
					cLowarr[ch-'a']++;
			}
		}				
		 
   System.out.println("Number of Upper case Char in a given string " +cUpp);
   System.out.println("Number of Lower cae Char in a given String " +cLow);
   System.out.println("Number of Integer in a given String " +cInt);
   System.out.println();
   System.out.println("Repeated Integer Count is : ");
   		for(int i=0;i<10;i++) {
   			if(cIntarr[i]>1) {
   				System.out.println(i+ ": " +cIntarr[i]);   				
   			}
   		}
   		System.out.println("Repeated Uppercase Count is : ");
   		for(int i=0;i<26;i++) {
   			if(cUpparr[i]>1) {
   				System.out.println((char)('A'+i) + ": " +cUpparr[i]);
   			}
   		}
   		System.out.println("Repeated Lower Count is : ");
   		for(int i=0;i<26;i++) {
   			if(cLowarr[i]>1) {
   				System.out.println((char)('a'+i) + ": " +cLowarr[i]);
   				
   			}
   		}
   
   s.close();
   
	}	
}
