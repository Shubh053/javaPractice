package section3.java;

public class OccuranceOfCharacters {
	public static void main(String[] args) {
	int count = 0;
	String s = "Mahabharat";
	for(int i = 0; i < s.length(); i++)
	{
		char ch =  s.charAt(i);
		for(int j = 0; j < s.length(); j++)
		{
			char ch1 =  s.charAt(j);
			if(ch == ch1)
			{
				count++;
			}
		}
		System.out.println(ch + "->" + count);	
		count = 0;
	}
	}
}
