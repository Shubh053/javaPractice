package interview.practice;

public class AverageAndSummationOFArray {
	public static void main(String[] args) {
		int [] x = {12, 24, 11, 30, 15, 35, 22};
		int count = 0;
		int sum = 0;
		for(int i = 0; i < x.length; i++)
		{
			sum = sum + x[i];
			count++;
		}
		System.out.println("Sum of array is: " + sum);
		System.out.println("Average of array is: " + sum / count);
	}
}
