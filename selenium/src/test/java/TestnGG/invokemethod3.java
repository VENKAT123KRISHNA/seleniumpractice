package TestnGG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class invokemethod3 implements IInvokedMethodListener {

	 WebDriver driver;
	
	
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		
		WebDriverManager.chromedriver().setup();
		
		System.out.println("execute before method"+testResult.getTestClass().getName()+"-"+method.getTestMethod().getMethodName());
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		

		System.out.println("execute after method"+testResult.getTestClass().getName()+"-"+method.getTestMethod().getMethodName());
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File tgt=new File("./target/maven.png");
		try {
			FileUtils.copyFile(src, tgt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		        driver.close();
		
	}

}
