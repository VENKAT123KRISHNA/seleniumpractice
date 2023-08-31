package TestnGG;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;



@Listeners(invokemethod3.class)
public class invokemethod4 {
	WebDriver driver;

@Test
	public void listn1() throws Throwable  {
		
		WebDriverManager.chromedriver().setup();
		
		
		
		
		 driver=new ChromeDriver();
//		//driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[@href='/account/login?ret=/']")).click();
//		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("99893406111");
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
//		
//		Thread.sleep(1000);
//		assertEquals(", false);
		 
//		
		 driver.get("http://hospiol.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[@class='theme_btn theme_btn_bg'][1]")).click();
			driver.findElement(By.id("email")).sendKeys("abhishek@marolix.com");
			
			driver.findElement(By.id("password")).sendKeys("Reset@123");
			
			driver.findElement(By.tagName("button")).click();
			Thread.sleep(2000);
			String url=driver.getCurrentUrl();
			assertEquals("http://admin.hospiol", url);
			Thread.sleep(1000);
	}
	@Test
	public void listn2() throws Throwable  {
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		
	}

}
