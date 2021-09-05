package section3.java;

public class SummationAndAverageOfArray {
	public static void main(String[] args) {
		int [] x = {12, 24, 11, 30, 15, 35, 22};
		int sum = 0;
		for (int i : x)
		{
			sum += i;
		}
		System.out.println("Summation of given array is: " + sum);
		double average = sum / x.length;
		System.out.println("Average of given array is: " + average);
	}
}
