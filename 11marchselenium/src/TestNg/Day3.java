package TestNg;

import org.testng.annotations.Test;

public class Day3 {

@Test(groups= "{sanity}")
public void Test4() {
	System.out.println("Day3----Test4");
}

@Test(groups = "Regression")
public void Test5() {
	System.out.println("Day3---Test5");
}
}
