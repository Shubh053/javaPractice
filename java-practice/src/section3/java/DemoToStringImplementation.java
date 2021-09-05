package section3.java;

public class DemoToStringImplementation {
	public static void main(String[] args) {
		DemoToStringImplementation dtsi = new DemoToStringImplementation();
		System.out.println(dtsi);
	}
	
	@Override
	public String toString() {
		System.out.println("My toString output");
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
}
