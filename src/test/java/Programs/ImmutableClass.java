package Programs;




final class Student 
{ 
	final String name; 
	final int regNo; 

	public Student(String name, int regNo) 
	{ 
		this.name = name; 
		this.regNo = regNo; 
	} 
	public String getName() 
	{ 
		return name; 
	} 
	public int getRegNo() 
	{ 
		return regNo; 
	} 
} 

// Driver class 
public class ImmutableClass { 
	public static void main(String args[]) 
	{ 
		Student s = new Student("ABC", 101); 
		System.out.println(s.getName()); 
		System.out.println(s.getRegNo()); 

		// Uncommenting below line causes error 
		// s.regNo = 102; 
	} 
} 

