package section3.java;

public class StudentUniqueNumberHashCode {
	String name;
	int rollNum;
	String gender;
	static int count = 10;
	
	public StudentUniqueNumberHashCode(String name, String gender)
	{
		this.name = name;
		this.rollNum = hashCode();
		this.gender = gender;
	}
	
	public static void main(String[] args) {
		StudentUniqueNumberHashCode s1 = new StudentUniqueNumberHashCode("Shubham", "male");
		StudentUniqueNumberHashCode s2 = new StudentUniqueNumberHashCode("Sampath","male");
		StudentUniqueNumberHashCode s3 = new StudentUniqueNumberHashCode("Prashant","male");
		
		System.out.println(s1);
		System.out.println("----------------------------------");
		System.out.println(s2);
		System.out.println("-----------------------------------");
		System.out.println(s3);
	}
	
	@Override
	public String toString()
	{
		return "name: " + name + "\n" + "rollnumber: " + rollNum + "\n" + "gender: " + gender;
	}
	
	@Override
	public int hashCode()
	{
		return ++count;
	}
}
