package selenium49Version;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
   System.setProperty("Webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32 (3)\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.manage().deleteAllCookies();
   driver.manage().window().maximize();
   driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
//File src = (TakesScreenshot)driver.getScreenshotAs(OutputType.FILE);
 //"E:\selenium"  
  File src=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  File des = new File("\"E:\\selenium\\ab.png");
  FileHandler.copy(src, des);
driver.quit();
	}

}
