package TestnGG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestnGG.invokemethod.class)

public class invokemethod2 {
	@Test
	public void Listener1() {
		System.out.println("Test true");
		
	}
	@Test
	public void Listener2() {
		System.out.println("Test false");
		
	}
	

}
