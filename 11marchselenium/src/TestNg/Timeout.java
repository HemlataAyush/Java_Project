package TestNg;
import org.testng.annotations.Test;

public class Timeout {

	@Test(timeOut =5)
	public void Test() {
		for(;;) {
			System.out.println("hello");
		}
	}
}
