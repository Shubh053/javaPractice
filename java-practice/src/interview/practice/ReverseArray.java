package interview.practice;

public class ReverseArray {
	public static void main(String [] args)
	{
		int [] x = {12, 24, 11, 30};
		int [] reverse = new int [x.length];
		int count = 0;
		for(int i = x.length -1; i >= 0; i--)
		{
			reverse[count] = x[i];
			count++;
		}
		System.out.print("Reverse array is: ");
		for (int k : reverse)
		{
			System.out.print(k + " ");
		}
	}
}
