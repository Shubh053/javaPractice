package section3.java;

public class Student {
	String name;
	int rollNum;
	
	public Student(String name,int rollNum)
	{
		this.name = name;
		this.rollNum = rollNum;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("shubham", 12);
		Student s2 = new Student("sampath", 45);
		Student s3 = new Student("prashant", 63);
		
		System.out.println(s1);
		System.out.println("-------------------------------");
		System.out.println(s2);
		System.out.println("-------------------------------");
		System.out.println(s3);
	}
	
	@Override
	public String toString()
	{
		return "name: " + name + "\n" + "rollnumber: " + rollNum;
	}
	}
