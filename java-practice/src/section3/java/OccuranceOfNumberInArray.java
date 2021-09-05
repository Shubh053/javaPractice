package section3.java;

public class OccuranceOfNumberInArray {
	public static void main(String[] args) {
		int [] x = {12, 56, 12, 78, 89, 78, 56, 95, 75};
		for(int i = 0; i < x.length; i++)
		{
			int count = 0;
			int x1 = x[i];
			for(int j = 0; j < x.length; j++)
			{
				int x2 = x[j];
				if (x1 == x2 && i > j)
				{
					break;
				}	
				if(x1 == x2)
				{
					count++;
				}
			}
			if (count > 0)
			{
			System.out.println(x1 + " present " + count + " times");
			}
		}
	}
}
