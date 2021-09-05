package section3.java;

public class OccuranceOfVowels {
	public static void main(String[] args) {
		String s1 = "aeiou";
		String s2 = "Elephant";
		s2 = s2.toLowerCase();
		for(int i = 0; i < s1.length(); i++)
		{
			int count = 0;
			char ch1 = s1.charAt(i);
			for(int j = 0; j < s2.length(); j++)
			{
				char ch2 = s2.charAt(j);
				if(ch1 == ch2)
				{
					count++;
				}
			}
			if(count > 0)
			{
				System.out.println(ch1 + "present" + count + "times");
			}
		}
	}
}
