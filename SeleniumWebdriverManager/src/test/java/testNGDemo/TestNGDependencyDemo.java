package testNGDemo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {

	@Test (dependsOnGroups = {"smoke.*"})
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Test (groups= {"smoke1"})
	public void test2() {
		System.out.println("I am inside Test 2");
	}
	
	@Test (groups= {"smoke2"})
	public void test3() {
		System.out.println("I am inside Test 3");
	}
}
