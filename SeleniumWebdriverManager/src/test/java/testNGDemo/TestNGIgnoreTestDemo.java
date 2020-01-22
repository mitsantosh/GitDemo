package testNGDemo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TestNGIgnoreTestDemo {
	
	
	@Test
	public void test1() {
		System.out.println("I am inside Test1");
	}

	@Test
	public void test2() {
		System.out.println("I am inside Test2");
	}
}
