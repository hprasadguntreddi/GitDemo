import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hpras\\eclipse-workspace\\DemoTest\\Webdrivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("hari");
        driver.findElement(By.xpath("//*[@type='text'][2]")).sendKeys("hari.guntreddi@gmail.com");
        driver.findElement(By.xpath("//div[contains(@class,'pwd')]/button[1]")).click();
	}

}
