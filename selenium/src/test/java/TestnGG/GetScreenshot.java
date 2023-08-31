package TestnGG;

		import java.io.File;  
		import java.io.IOException;

		import org.apache.commons.io.FileUtils;
		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
    
		public class GetScreenshot extends websites{
			
			
		public static String capture(String screenshotName) throws IOException {
		
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			//By user.dir command will give current directory in that create a file by name error screenshot with screenshotname in png format
			String dest=System.getProperty("user.dir")+"/ErrorScreenshot/"+screenshotName+".png";
			System.out.println(dest);
			//File destination=new File("./target/capture.png");
			File destination=new File(dest);
			FileUtils.copyFile(source, destination);
			return screenshotName;
			
	}
}



