package selenium49Version;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Downs {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32 (3)\\chromedriver.exe" );

WebDriver driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
Thread.sleep(2000);

WebElement product= driver.findElement(By.xpath("//select[@id=\"first\"]"));
Select s = new Select(product);
s.selectByIndex(2);

WebElement animal = driver.findElement(By.xpath("//select[@id=\"first\"]"));
Select s1 = new Select(animal);
s.selectByIndex(0);

WebElement drop = driver.findElement(By.xpath("//select[@id=\"first\"]"));
Select s2 = new Select(drop);
s.selectByIndex(3);

driver.close();


	}

}

