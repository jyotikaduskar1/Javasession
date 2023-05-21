package selenium49Version;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationPrograme {

	public static void main(String[] args) {
		
		//"E:\selenium\chromedriver_win32 (3)\chromedriver.exe"
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("8788061463");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("8788061463");
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();

}
}