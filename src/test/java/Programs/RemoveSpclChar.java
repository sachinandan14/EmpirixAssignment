package Programs;

public class RemoveSpclChar {
	
	
	public static void main(String[] args) {
		
		String s="Sachin!#$s#am*)an@n%t^a";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
		
		
	}

}
