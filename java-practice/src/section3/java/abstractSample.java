package section3.java;

public class abstractSample extends practiceAbstract {
	abstractSample()
	{
		System.out.println("child class constructor running");
	}
	public static void main(String[] args) {
		practiceAbstract t = new abstractSample();
		System.out.println(t.x);
		t.m1();
	}
}
