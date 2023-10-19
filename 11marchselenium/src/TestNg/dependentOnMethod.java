package TestNg;

import org.testng.annotations.Test;

public class dependentOnMethod {

	@Test
	public void test() {
		System.out.println("hello");
	}
	
	@Test(dependsOnMethods = "test")	
	public void Test1() {
	
		System.out.println("hello1");
	}
	
	@Test(dependsOnMethods="test")	
	public void Test2() {
		System.out.println("hello2");
	}
}
