package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class methods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("http://hr.marolix.com/");
	   System.out.println(driver.getCurrentUrl());
	   System.out.println(driver.getTitle());
	   System.out.println(driver.getWindowHandle());
	  
	   //driver.close();
	   
	
		

	}

}
