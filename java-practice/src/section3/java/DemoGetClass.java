package section3.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DemoGetClass {
	int x = 100;
	String name = "Shubham";
	
	public void m1() { }
	public static void m2() { }
	
	public DemoGetClass() { }
	public DemoGetClass(int x) { }
	
	public static void main(String[] args) {
		DemoGetClass dgc = new DemoGetClass();
		Class c = dgc.getClass();
		
		// fully qualified name of class
		System.out.println(c.getName());
		System.out.println("------------------------------------------------------");
		
		// total number of methods
		Method [] m = c.getDeclaredMethods();
		for (Method m1 : m) 
		{
			System.out.println(m1);
		}
		System.out.println("------------------------------------------------------");
		
		// total number of constructors
		Constructor [] con = c.getDeclaredConstructors();
		for(Constructor c1 : con)
		{
			System.out.println(c1);
		}
		System.out.println("------------------------------------------------------");
		
		// total number of variables
		Field [] f = c.getDeclaredFields();
		for(Field f1: f)
		{
			System.out.println(f1);
		}
	}
}
