package section3.java;

public class EqualsMethodDemo {
	int num;
	
	public EqualsMethodDemo(int num)
	{
		this.num = num;
	}
	
	public static void main(String[] args) {
		EqualsMethodDemo ed1 = new EqualsMethodDemo(10);
		EqualsMethodDemo ed2 = new EqualsMethodDemo(10);
		System.out.println(ed1.equals(ed2));
	}
	
	@Override
	public boolean equals(Object obj)
	{
//		int n1 = this.num;
//		EqualsMethodDemo ed2 = (EqualsMethodDemo)obj;
//		int n2 = ed2.num;
//		return n1 == n2;
		return this.num == ((EqualsMethodDemo)obj).num;
	}
}
