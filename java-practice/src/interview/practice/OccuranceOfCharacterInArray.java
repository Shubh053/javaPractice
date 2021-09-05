package interview.practice;

public class OccuranceOfCharacterInArray {
	public static void main(String[] args)
	{
		int [] x = {12, 24, 11, 30, 15, 35, 22, 30, 11, 22, 22};
		for(int i = 0; i < x.length; i++)
		{
			int count = 0;
			int n1 = x[i];
			for(int j = 0; j < x.length; j++)
			{
				int n2 = x[j];
				if (n1 == n2 && i>j)
				{
					break;
				}
				if(n1 == n2)
				{
					count++;
				}
			}
			if(count > 0)
			{
				System.out.println(n1 + " ->" + count + " times");
			}
		}
	}
}
