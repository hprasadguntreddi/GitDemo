import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
      System.setProperty("webdriver.chrome.driver", "../DemoTest/Webdrivers/chromedriver.exe");
      ChromeDriver webdriver = new ChromeDriver();
      webdriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      webdriver.get("https://www.makemytrip.com/");
      webdriver.findElement(By.xpath("//li[@data-cy='account']")).click();
      //Thread.sleep(2000);
      webdriver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).click();
      webdriver.findElement(By.xpath("//input[@id='fromCity']")).click();
      //Thread.sleep(2000);
      webdriver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyd");
      //Thread.sleep(2000);
      webdriver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
      //webdriver.findElement(By.xpath("//input[@placeholder='From']")).click();
	}

}


