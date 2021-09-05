package section3.java;

public class BubbleSortArray {
	public static void main(String[] args) {
		int [] x = {12, 24, 11, 30, 15, 35, 22};
		
		for (int i = 0; i < x.length; i++)
		{
			for (int j = i + 1; j < x.length; j++)
			{
				if (x[i] > x[j])
				{
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		System.out.println("Lowest number in array: " + x[0]);
		System.out.println("Highest number in array: " + x[x.length - 1]);
	}
}
