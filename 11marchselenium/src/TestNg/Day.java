package TestNg;
import org.testng.annotations.Test;
public class Day {

	@Test
	public void Test() {
		System.out.println("Day----Test");
	}
	
	@Test(groups = "Regression")
	public void Test1() {
		System.out.println("Day---Test1");
	}
}
