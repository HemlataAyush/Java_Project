package TestNg;

import org.testng.annotations.Test;

public class Day2 {

@Test(groups = "{Sanity}")	
public void Test2() {
	System.out.println("Day2----Test2");
}

@Test(groups = "Regression")
public void Test3() {
	System.out.println("Day2-----Test3");
}
}
