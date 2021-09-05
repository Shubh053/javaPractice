package interview.practice;

public class OccuranceOfVowels {
	public static void main(String[] args) {
		String s = "Shubham Srivastava";
		s = s.toLowerCase();
		String vowel = "aeiou";
		for(int i = 0; i < vowel.length(); i++)
		{
			int count = 0;
			char ch = vowel.charAt(i);
			for(int j = 0; j < s.length(); j++)
			{
				char ch1 = s.charAt(j);
				if(ch == ch1)
				{
					count++;
				}
			}
			if(count > 0)
			{
				System.out.println(ch + " -> " + count + " times");
			}
		}
	}
}
