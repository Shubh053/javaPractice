package interview.practice;

public class SearchNumberInArray {
	public static void main(String[] args) {
		int [] x = {12, 24, 11, 30, 15, 35, 22};
		int number = 5;
		boolean searchResult = false;
		for(int i = 0; i < x.length; i++)
		{
			if(number == x[i])
			{
				searchResult = true;
			}
		}
		System.out.println(searchResult ? "Number is present in array" : "Number is not present in array");
	}
}
