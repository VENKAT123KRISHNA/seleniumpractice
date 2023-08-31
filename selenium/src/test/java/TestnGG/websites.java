package TestnGG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;





public class websites {
	public static WebDriver driver;
	
	@Test
	public void captureScreenshot() {
		WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	driver.get("https://automationtesting.in/");
	String title=driver.getTitle();
	Assert.assertEquals("Home-Automation Test", title);
	driver.close();
	}
	}

