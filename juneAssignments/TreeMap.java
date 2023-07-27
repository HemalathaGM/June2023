package juneAssignments;

public class TreeMap {
	public static void main(String[] args) {
	
	TreeMap<Integer,String> tm= new TreeMap<Integer,String>();
	tm.put(101,"JNanesh");
	tm.put(102,"Kishore");
	tm.put(300,"Ramya");
	tm.put(140,"Satya");
	
	System.out.println(tm.entrySet());
	}
	

}
