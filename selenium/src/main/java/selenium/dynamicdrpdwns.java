package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicdrpdwns {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("bikes");
		
	 List<WebElement> car=driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	 
	 for(WebElement cr:car) {
		 Thread.sleep(3000);
		 if(cr.getText().equals("bikes for sale")) {
			 cr.click();
		 }
	 }
	}

}
