package interview.practice;

public class RemoveSpaces {
	public static void main(String [] args)
	{
		String s = "Java is very easy programming language";
		System.out.println("Before removing spaces: " + s);
		s = s.replace(" ", "");
		System.out.println("After removing spaces: " + s);
	}
}
