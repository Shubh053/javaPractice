package interview.practice;

public class ReverseString {
	  public static void main(String [] args)
	  {
	    String s = "Mahabharat";
	    String reverse = "";
	    for(int i = s.length()-1; i >= 0; i--)
	    {
	      reverse += s.charAt(i);
	    }
	    System.out.println(reverse); 
	  }
}
